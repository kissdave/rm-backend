package hu.bme.simonyi.dave.rmbackend.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

/**
 * Card
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-09T21:23:32.762Z")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "cardID")
@Entity
public class Card {
    @Id
    @JsonProperty("cardID")
    private Long cardID = null;

    @JsonProperty("cardNum")
    private String cardNum = null;

    @JsonProperty("cardDescription")
    private String cardDescription = null;

    @JsonProperty("user")
    @ManyToOne
    private User user = null;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Card card = (Card) o;
        return Objects.equals(this.cardID, card.cardID) &&
                Objects.equals(this.cardNum, card.cardNum) &&
                Objects.equals(this.cardDescription, card.cardDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardID, cardNum, cardDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Card {\n");

        sb.append("    cardID: ").append(toIndentedString(cardID)).append("\n");
        sb.append("    cardNum: ").append(toIndentedString(cardNum)).append("\n");
        sb.append("    cardDescription: ").append(toIndentedString(cardDescription)).append("\n");
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

