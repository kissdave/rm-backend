package hu.bme.simonyi.dave.rmbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Objects;

/**
 * Card
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-05T06:41:06.636Z")
@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("cardID")
    private Long cardID = null;

    @JsonProperty("cardNum")
    private String cardNum = null;

    @JsonProperty("cardDescription")
    private String cardDescription = null;

    @ManyToOne
    @JsonProperty("user")
    private User user = null;

    public Card() {
        // Default constructor for JPA
    }

    public Card cardID(Long cardID) {
        this.cardID = cardID;
        return this;
    }

    /**
     * Get cardID
     *
     * @return cardID
     **/
    @ApiModelProperty(value = "")
    public Long getCardID() {
        return cardID;
    }

    public void setCardID(Long cardID) {
        this.cardID = cardID;
    }

    public Card cardNum(String cardNum) {
        this.cardNum = cardNum;
        return this;
    }

    /**
     * Get cardNum
     *
     * @return cardNum
     **/
    @ApiModelProperty(value = "")
    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public Card cardDescription(String cardDescription) {
        this.cardDescription = cardDescription;
        return this;
    }

    /**
     * Get cardDescription
     *
     * @return cardDescription
     **/
    @ApiModelProperty(value = "")
    public String getCardDescription() {
        return cardDescription;
    }

    public void setCardDescription(String cardDescription) {
        this.cardDescription = cardDescription;
    }

    public Card user(User user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     *
     * @return user
     **/
    @ApiModelProperty(value = "")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Card card = (Card) o;
        return Objects.equals(this.cardID, card.cardID) &&
                Objects.equals(this.cardNum, card.cardNum) &&
                Objects.equals(this.cardDescription, card.cardDescription) &&
                Objects.equals(this.user, card.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardID, cardNum, cardDescription, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Card {\n");

        sb.append("    cardID: ").append(toIndentedString(cardID)).append("\n");
        sb.append("    cardNum: ").append(toIndentedString(cardNum)).append("\n");
        sb.append("    cardDescription: ").append(toIndentedString(cardDescription)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

