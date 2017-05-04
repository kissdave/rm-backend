package hu.bme.simonyi.dave.rmbackend.service;

import hu.bme.simonyi.dave.rmbackend.model.Card;
import hu.bme.simonyi.dave.rmbackend.model.User;
import hu.bme.simonyi.dave.rmbackend.repository.CardRepository;
import hu.bme.simonyi.dave.rmbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by dkiss on 2017. 05. 03..
 */
@Service
public class CardService {

    @PersistenceContext
    EntityManager em;

    @Autowired
    CardRepository cardRepository;

    @Autowired
    UserRepository userRepository;

    @Transactional
    public Integer createCard(Card card) {
        if (card != null) {
            if (card.getCardID() != null) {
                card.setCardID(null);
            }

            if (card.getUser() != null) {
                final User user = userRepository.findOne(card.getUser().getUserID());
                if (user != null) {
                    user.addCardsItem(card);
                }
            }

            em.persist(card);
            em.flush();
            return card.getCardID().intValue();
        } else {
            return null;
        }
    }

    public Card getCardById(Integer cardId) {
        if (cardId != null) {
            return cardRepository.findOne(cardId.longValue());
        } else {
            return null;
        }
    }

    public User getUserByCard(String cardNum) {
        if(cardNum != null) {
            final List<Card> cards = cardRepository.findAll();
            for(Card c : cards) {
                if( c.getCardNum().equals(cardNum)) {
                    return c.getUser();
                }
            }
            return null;
        } else {
            return null;
        }
    }
}
