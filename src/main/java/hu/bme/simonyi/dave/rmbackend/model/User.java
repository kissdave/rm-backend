package hu.bme.simonyi.dave.rmbackend.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * User
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-09T21:23:32.762Z")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "userID")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("userID")
    private Long userID = null;

    @JsonProperty("fullName")
    private String fullName = null;

    @JsonProperty("email")
    private String email = null;

    @JsonProperty("mobile")
    private String mobile = null;

    @JsonProperty("enabled")
    private Boolean enabled = null;

    @JsonProperty("requests")
    @OneToMany(mappedBy = "user", cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    private List<Request> requests = null;

    @JsonProperty("userRole")
    @ManyToOne
    private UserRole userRole = null;

    @JsonProperty("cards")
    @OneToMany(mappedBy = "user", cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    private List<Card> cards = null;

    @JsonProperty("adminOfIssue")
    @OneToMany(mappedBy = "adminOfIssue", cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    private List<Loan> adminOfIssue = null;

    @JsonProperty("clientOfIssue")
    @OneToMany(mappedBy = "clientOfIssue", cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    private List<Loan> clientOfIssue = null;

    @JsonProperty("adminOfWithdraw")
    @OneToMany(mappedBy = "adminOfWithdraw", cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    private List<Loan> adminOfWithdraw = null;

    @JsonProperty("clientOfWithdraw")
    @OneToMany(mappedBy = "clientOfWithdraw", cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    private List<Loan> clientOfWithdraw = null;

    public User() {
        // Default constructor for JPA
    }

    public User userID(Long userID) {
        this.userID = userID;
        return this;
    }

    /**
     * Get userID
     *
     * @return userID
     **/
    @ApiModelProperty(value = "")
    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public User fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Get fullName
     *
     * @return fullName
     **/
    @ApiModelProperty(value = "")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public User email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     **/
    @ApiModelProperty(value = "")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User mobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     * Get mobile
     *
     * @return mobile
     **/
    @ApiModelProperty(value = "")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public User enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     *
     * @return enabled
     **/
    @ApiModelProperty(value = "")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public User requests(List<Request> requests) {
        this.requests = requests;
        return this;
    }

    public User addRequestsItem(Request requestsItem) {
        if(this.requests == null) {
            this.requests = new ArrayList<>();
        }

        this.requests.add(requestsItem);
        requestsItem.setUser(this);
        return this;
    }

    public User removeRequestItem(Request requestItem) {
        if(this.requests == null) {
            this.requests = new ArrayList<>();
        }
        this.requests.remove(requestItem);
        return this;
    }

    /**
     * Get requests
     *
     * @return requests
     **/
    @ApiModelProperty(value = "")
    public List<Request> getRequests() {
        if(this.requests == null) {
            this.requests = new ArrayList<>();
        }

        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }


    public User cards(List<Card> cards) {
        if(this.cards == null) {
            this.cards = new ArrayList<>();
        }
        this.cards = cards;
        return this;
    }

    public User addCardsItem(Card cardsItem) {
        if(this.cards == null) {
            this.cards = new ArrayList<>();
        }
        this.cards.add(cardsItem);
        cardsItem.setUser(this);
        return this;
    }

    public User removeCardsItem(Card cardsItem) {
        if(this.cards == null) {
            this.cards = new ArrayList<>();
            return this;
        }
        this.cards.remove(cardsItem);
        cardsItem.setUser(null);
        return this;
    }

    /**
     * Get cards
     *
     * @return cards
     **/
    @ApiModelProperty(value = "")
    public List<Card> getCards() {
        if(this.cards == null) {
            this.cards = new ArrayList<>();
        }
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }


    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public User adminOfIssue(List<Loan> adminOfIssue) {
        this.adminOfIssue = adminOfIssue;
        return this;
    }

    public User addAdminOfIssueItem(Loan adminOfIssueItem) {
        if(this.adminOfIssue == null) {
            this.adminOfIssue = new ArrayList<>();
        }
        this.adminOfIssue.add(adminOfIssueItem);
        adminOfIssueItem.setAdminOfIssue(this);
        return this;
    }

    public User removeAdminOfIssueItem(Loan adminOfIssueItem) {
        if(this.adminOfIssue == null) {
            this.adminOfIssue = new ArrayList<>();
            return this;
        }
        this.adminOfIssue.remove(adminOfIssueItem);
        adminOfIssueItem.setAdminOfIssue(null);
        return this;
    }

    /**
     * Get adminOfIssue
     * @return adminOfIssue
     **/
    @ApiModelProperty(value = "")
    public List<Loan> getAdminOfIssue() {
        if(this.adminOfIssue == null) {
            this.adminOfIssue = new ArrayList<>();
        }
        return adminOfIssue;
    }

    public void setAdminOfIssue(List<Loan> adminOfIssue) {
        if(this.adminOfIssue == null) {
            this.adminOfIssue = new ArrayList<>();
        }
        this.adminOfIssue = adminOfIssue;
    }

    public User clientOfIssue(List<Loan> clientOfIssue) {
        if(this.clientOfIssue == null) {
            this.clientOfIssue = new ArrayList<>();
        }
        this.clientOfIssue = clientOfIssue;
        return this;
    }

    public User addClientOfIssueItem(Loan clientOfIssueItem) {
        if(this.clientOfIssue == null) {
            this.clientOfIssue = new ArrayList<>();
        }
        this.clientOfIssue.add(clientOfIssueItem);
        clientOfIssueItem.setClientOfIssue(this);
        return this;
    }

    public User removeClientOfIssueItem(Loan clientOfIssueItem) {
        if(this.clientOfIssue == null) {
            this.clientOfIssue = new ArrayList<>();
            return this;
        }
        this.clientOfIssue.remove(clientOfIssueItem);
        clientOfIssueItem.setClientOfIssue(null);
        return this;
    }

    /**
     * Get clientOfIssue
     * @return clientOfIssue
     **/
    @ApiModelProperty(value = "")
    public List<Loan> getClientOfIssue() {
        if(this.clientOfIssue == null) {
            this.clientOfIssue = new ArrayList<>();
        }
        return clientOfIssue;
    }

    public void setClientOfIssue(List<Loan> clientOfIssue) {
        if(this.clientOfIssue == null) {
            this.clientOfIssue = new ArrayList<>();
        }
        this.clientOfIssue = clientOfIssue;
    }

    public User adminOfWithdraw(List<Loan> adminOfWithdraw) {
        if(this.adminOfWithdraw == null) {
            this.adminOfWithdraw = new ArrayList<>();
        }
        this.adminOfWithdraw = adminOfWithdraw;
        return this;
    }

    public User addAdminOfWithdrawItem(Loan adminOfWithdrawItem) {
        if(this.adminOfWithdraw == null) {
            this.adminOfWithdraw = new ArrayList<>();
        }
        this.adminOfWithdraw.add(adminOfWithdrawItem);
        adminOfWithdrawItem.setAdminOfWithdraw(this);
        return this;
    }

    public User removeAdminOfWithdrawItem(Loan adminOfWithdrawItem) {
        if(this.adminOfWithdraw == null) {
            this.adminOfWithdraw = new ArrayList<>();
            return this;
        }
        this.adminOfWithdraw.remove(adminOfWithdrawItem);
        adminOfWithdrawItem.setAdminOfWithdraw(null);
        return this;
    }

    /**
     * Get adminOfWithdraw
     * @return adminOfWithdraw
     **/
    @ApiModelProperty(value = "")
    public List<Loan> getAdminOfWithdraw() {
        if(this.adminOfWithdraw == null) {
            this.adminOfWithdraw = new ArrayList<>();
        }
        return adminOfWithdraw;
    }

    public void setAdminOfWithdraw(List<Loan> adminOfWithdraw) {
        if(this.adminOfWithdraw == null) {
            this.adminOfWithdraw = new ArrayList<>();
        }
        this.adminOfWithdraw = adminOfWithdraw;
    }

    public User clientOfWithdraw(List<Loan> clientOfWithdraw) {
        if(this.clientOfWithdraw == null) {
            this.clientOfWithdraw = new ArrayList<>();
        }
        this.clientOfWithdraw = clientOfWithdraw;
        return this;
    }

    public User addClientOfWithdrawItem(Loan clientOfWithdrawItem) {
        if(this.clientOfWithdraw == null) {
            this.clientOfWithdraw = new ArrayList<>();
        }
        this.clientOfWithdraw.add(clientOfWithdrawItem);
        clientOfWithdrawItem.setClientOfWithdraw(this);
        return this;
    }

    public User removeClientOfWithdrawItem(Loan clientOfWithdrawItem) {
        if(this.clientOfWithdraw == null) {
            this.clientOfWithdraw = new ArrayList<>();
            return this;
        }
        this.clientOfWithdraw.remove(clientOfWithdrawItem);
        clientOfWithdrawItem.setClientOfWithdraw(null);
        return this;
    }

    /**
     * Get clientOfWithdraw
     * @return clientOfWithdraw
     **/
    @ApiModelProperty(value = "")
    public List<Loan> getClientOfWithdraw() {
        if(this.clientOfWithdraw == null) {
            this.clientOfWithdraw = new ArrayList<>();
        }
        return clientOfWithdraw;
    }

    public void setClientOfWithdraw(List<Loan> clientOfWithdraw) {
        this.clientOfWithdraw = clientOfWithdraw;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(this.userID, user.userID) &&
                Objects.equals(this.fullName, user.fullName) &&
                Objects.equals(this.email, user.email) &&
                Objects.equals(this.mobile, user.mobile) &&
                Objects.equals(this.enabled, user.enabled) &&
                Objects.equals(this.requests, user.requests) &&
                Objects.equals(this.userRole, user.userRole) &&
                Objects.equals(this.cards, user.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, fullName, email, mobile, enabled, requests, userRole, cards);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class User {\n");

        sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
        sb.append("    userRoles: ").append(toIndentedString(userRole)).append("\n");
        sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

