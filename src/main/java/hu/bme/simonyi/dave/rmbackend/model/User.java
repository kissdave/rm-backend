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
        this.cards = cards;
        return this;
    }

    public User addCardsItem(Card cardsItem) {
        this.cards.add(cardsItem);
        return this;
    }

    /**
     * Get cards
     *
     * @return cards
     **/
    @ApiModelProperty(value = "")
    public List<Card> getCards() {
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

