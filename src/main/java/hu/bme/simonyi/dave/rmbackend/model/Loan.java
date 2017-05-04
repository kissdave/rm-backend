package hu.bme.simonyi.dave.rmbackend.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.*;
import hu.bme.simonyi.dave.rmbackend.model.User;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.persistence.*;

/**
 * Loan
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-03T09:13:05.654Z")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "cardID")
@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("loanID")
    private Long loanID = null;

    @JsonProperty("dateOfLoan")
    private DateTime dateOfLoan = null;

    @JsonProperty("expectedReturn")
    private DateTime expectedReturn = null;

    @JsonProperty("dateOfReturn")
    private DateTime dateOfReturn = null;

    /**
     * Gets or Sets loanStatus
     */
    public enum LoanStatusEnum {
        ACTIVE("ACTIVE"),

        CLOSED("CLOSED"),

        MISSING("MISSING");

        private String value;

        LoanStatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LoanStatusEnum fromValue(String text) {
            for (LoanStatusEnum b : LoanStatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("loanStatus")
    private LoanStatusEnum loanStatus = LoanStatusEnum.ACTIVE;

    @ManyToOne
    @JsonProperty("resource")
    private Resource resource = null;

    @ManyToOne
    @JsonProperty("adminOfIssue")
    private User adminOfIssue = null;

    @ManyToOne
    @JsonProperty("clientOfIssue")
    private User clientOfIssue = null;

    @ManyToOne
    @JsonProperty("adminOfWithdraw")
    private User adminOfWithdraw = null;

    @ManyToOne
    @JsonProperty("clientOfWithdraw")
    private User clientOfWithdraw = null;

    public Loan() {
    }

    public Loan loanID(Long loanID) {
        this.loanID = loanID;
        return this;
    }

    /**
     * Get loanID
     *
     * @return loanID
     **/
    @ApiModelProperty(value = "")
    public Long getLoanID() {
        return loanID;
    }

    public void setLoanID(Long loanID) {
        this.loanID = loanID;
    }

    public Loan dateOfLoan(DateTime dateOfLoan) {
        this.dateOfLoan = dateOfLoan;
        return this;
    }

    /**
     * Get dateOfLoan
     *
     * @return dateOfLoan
     **/
    @ApiModelProperty(value = "")
    public DateTime getDateOfLoan() {
        return dateOfLoan;
    }

    public void setDateOfLoan(DateTime dateOfLoan) {
        this.dateOfLoan = dateOfLoan;
    }

    public Loan expectedReturn(DateTime expectedReturn) {
        this.expectedReturn = expectedReturn;
        return this;
    }

    /**
     * Get expectedReturn
     *
     * @return expectedReturn
     **/
    @ApiModelProperty(value = "")
    public DateTime getExpectedReturn() {
        return expectedReturn;
    }

    public void setExpectedReturn(DateTime expectedReturn) {
        this.expectedReturn = expectedReturn;
    }

    public Loan dateOfReturn(DateTime dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
        return this;
    }

    /**
     * Get dateOfReturn
     *
     * @return dateOfReturn
     **/
    @ApiModelProperty(value = "")
    public DateTime getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(DateTime dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public Loan loanStatus(LoanStatusEnum loanStatus) {
        this.loanStatus = loanStatus;
        return this;
    }

    /**
     * Get loanStatus
     *
     * @return loanStatus
     **/
    @ApiModelProperty(value = "")
    public LoanStatusEnum getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(LoanStatusEnum loanStatus) {
        this.loanStatus = loanStatus;
    }

    public Loan adminOfIssue(User adminOfIssue) {
        this.adminOfIssue = adminOfIssue;
        return this;
    }

    /**
     * Get adminOfIssue
     *
     * @return adminOfIssue
     **/
    @ApiModelProperty(value = "")
    public User getAdminOfIssue() {
        return adminOfIssue;
    }

    public void setAdminOfIssue(User adminOfIssue) {
        this.adminOfIssue = adminOfIssue;
    }

    public Loan clientOfIssue(User clientOfIssue) {
        this.clientOfIssue = clientOfIssue;
        return this;
    }

    /**
     * Get clientOfIssue
     *
     * @return clientOfIssue
     **/
    @ApiModelProperty(value = "")
    public User getClientOfIssue() {
        return clientOfIssue;
    }

    public void setClientOfIssue(User clientOfIssue) {
        this.clientOfIssue = clientOfIssue;
    }

    public Loan adminOfWithdraw(User adminOfWithdraw) {
        this.adminOfWithdraw = adminOfWithdraw;
        return this;
    }

    /**
     * Get adminOfWithdraw
     *
     * @return adminOfWithdraw
     **/
    @ApiModelProperty(value = "")
    public User getAdminOfWithdraw() {
        return adminOfWithdraw;
    }

    public void setAdminOfWithdraw(User adminOfWithdraw) {
        this.adminOfWithdraw = adminOfWithdraw;
    }

    public Loan clientOfWithdraw(User clientOfWithdraw) {
        this.clientOfWithdraw = clientOfWithdraw;
        return this;
    }

    /**
     * Get clientOfWithdraw
     *
     * @return clientOfWithdraw
     **/
    @ApiModelProperty(value = "")
    public User getClientOfWithdraw() {
        return clientOfWithdraw;
    }

    public void setClientOfWithdraw(User clientOfWithdraw) {
        this.clientOfWithdraw = clientOfWithdraw;
    }


    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Loan loan = (Loan) o;
        return Objects.equals(this.loanID, loan.loanID) &&
                Objects.equals(this.dateOfLoan, loan.dateOfLoan) &&
                Objects.equals(this.expectedReturn, loan.expectedReturn) &&
                Objects.equals(this.dateOfReturn, loan.dateOfReturn) &&
                Objects.equals(this.loanStatus, loan.loanStatus) &&
                Objects.equals(this.adminOfIssue, loan.adminOfIssue) &&
                Objects.equals(this.clientOfIssue, loan.clientOfIssue) &&
                Objects.equals(this.adminOfWithdraw, loan.adminOfWithdraw) &&
                Objects.equals(this.clientOfWithdraw, loan.clientOfWithdraw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loanID, dateOfLoan, expectedReturn, dateOfReturn, loanStatus, adminOfIssue, clientOfIssue, adminOfWithdraw, clientOfWithdraw);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Loan {\n");

        sb.append("    loanID: ").append(toIndentedString(loanID)).append("\n");
        sb.append("    dateOfLoan: ").append(toIndentedString(dateOfLoan)).append("\n");
        sb.append("    expectedReturn: ").append(toIndentedString(expectedReturn)).append("\n");
        sb.append("    dateOfReturn: ").append(toIndentedString(dateOfReturn)).append("\n");
        sb.append("    loanStatus: ").append(toIndentedString(loanStatus)).append("\n");
        sb.append("    adminOfIssue: ").append(toIndentedString(adminOfIssue)).append("\n");
        sb.append("    clientOfIssue: ").append(toIndentedString(clientOfIssue)).append("\n");
        sb.append("    adminOfWithdraw: ").append(toIndentedString(adminOfWithdraw)).append("\n");
        sb.append("    clientOfWithdraw: ").append(toIndentedString(clientOfWithdraw)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

