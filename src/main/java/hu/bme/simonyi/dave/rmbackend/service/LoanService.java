package hu.bme.simonyi.dave.rmbackend.service;

import hu.bme.simonyi.dave.rmbackend.model.Loan;
import hu.bme.simonyi.dave.rmbackend.model.Resource;
import hu.bme.simonyi.dave.rmbackend.model.User;
import hu.bme.simonyi.dave.rmbackend.repository.LoanRepository;
import hu.bme.simonyi.dave.rmbackend.repository.ResourceRepository;
import hu.bme.simonyi.dave.rmbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by dkiss on 2017. 05. 03..
 */
@Service
public class LoanService {
    @PersistenceContext
    EntityManager em;

    @Autowired
    LoanRepository loanRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ResourceRepository resourceRepository;

    @Transactional
    public Integer createLoan(Loan loan) {
        if (loan != null) {
            if (loan.getLoanID() != null) {
                loan.setLoanID(null);
            }

            if (loan.getResource() != null && loan.getResource().getResourceID() != null) {
                final Resource resource = resourceRepository.findOne(loan.getResource().getResourceID());
                resource.addLoanItem(loan);
            }

            if (loan.getAdminOfIssue() != null && loan.getAdminOfIssue().getUserID() != null) {
                final User user = userRepository.findOne(loan.getAdminOfIssue().getUserID());
                user.addAdminOfIssueItem(loan);
            } else {
                loan.setAdminOfIssue(null);
            }
            if (loan.getClientOfIssue() != null && loan.getClientOfIssue().getUserID() != null) {
                final User user = userRepository.findOne(loan.getClientOfIssue().getUserID());
                user.addClientOfIssueItem(loan);
            } else {
                loan.setClientOfIssue(null);
            }
            if (loan.getAdminOfWithdraw() != null && loan.getAdminOfWithdraw().getUserID() != null) {
                final User user = userRepository.findOne(loan.getAdminOfWithdraw().getUserID());
                user.addAdminOfWithdrawItem(loan);
            } else {
                loan.setAdminOfWithdraw(null);
            }
            if (loan.getClientOfWithdraw() != null && loan.getClientOfWithdraw().getUserID() != null) {
                final User user = userRepository.findOne(loan.getClientOfWithdraw().getUserID());
                user.addClientOfWithdrawItem(loan);
            } else {
                loan.setClientOfWithdraw(null);
            }

            em.persist(loan);
            em.flush();
            return loan.getLoanID().intValue();
        } else {
            return null;
        }
    }

    public Loan getLoanById(Integer loanId) {
        if (loanId != null) {
            return loanRepository.findOne(loanId.longValue());
        } else {
            return null;
        }
    }

    @Transactional
    public Integer updateLoanById(Integer loanId, Loan loan) {
        if (loan != null) {
            loan.setLoanID(loanId.longValue());

            final Loan loanOld = loanRepository.findOne(loanId.longValue());

            // TODO Update Resource

            // TODO Update Issuer users

            if (loan.getAdminOfWithdraw() != null && !loan.getAdminOfWithdraw().equals(loanOld.getAdminOfWithdraw())) {
                User adminOfWithdrawOld = loanOld.getAdminOfWithdraw();
                final User adminOfWithdrawNew = userRepository.findOne(loan.getAdminOfWithdraw().getUserID());

                if (adminOfWithdrawOld != null || adminOfWithdrawNew != null) {
                    adminOfWithdrawOld.removeAdminOfWithdrawItem(loanOld);
                    adminOfWithdrawNew.addAdminOfWithdrawItem(loan);
                }
            }

            if (loan.getClientOfWithdraw() != null && !loan.getClientOfWithdraw().equals(loanOld.getClientOfWithdraw())) {
                User clientOfWithdrawOld = loanOld.getClientOfWithdraw();
                final User clientOfWithdrawNew = userRepository.findOne(loan.getClientOfWithdraw().getUserID());

                if (clientOfWithdrawOld != null || clientOfWithdrawNew != null) {
                    clientOfWithdrawOld.removeClientOfWithdrawItem(loanOld);
                    clientOfWithdrawNew.addClientOfWithdrawItem(loan);
                }
            }

            em.merge(loan);
            em.flush();
            return loan.getLoanID().intValue();

        } else {
            return null;
        }
    }
}
