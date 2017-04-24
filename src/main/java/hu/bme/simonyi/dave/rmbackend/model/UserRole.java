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
 * UserRole
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-09T21:23:32.762Z")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "userRoleID")
@Entity
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("userRoleID")
    private Long userRoleID = null;

    @JsonProperty("roleName")
    private String roleName = null;

    @JsonProperty("users")
    @OneToMany(mappedBy = "userRole", cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    private List<User> users = null;

    public UserRole userRoleID(Long userRoleID) {
        this.userRoleID = userRoleID;
        return this;
    }

    /**
     * Get userRoleID
     *
     * @return userRoleID
     **/
    @ApiModelProperty(value = "")
    public Long getUserRoleID() {
        return userRoleID;
    }

    public void setUserRoleID(Long userRoleID) {
        this.userRoleID = userRoleID;
    }

    public UserRole roleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * Get roleName
     *
     * @return roleName
     **/
    @ApiModelProperty(value = "")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public UserRole users(List<User> users) {
        this.users = users;
        return this;
    }

    public UserRole addUsersItem(User usersItem) {
        this.users.add(usersItem);
        return this;
    }

    /**
     * Get users
     *
     * @return users
     **/
    @ApiModelProperty(value = "")
    public List<User> getUsers() {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserRole userRole = (UserRole) o;
        return Objects.equals(this.userRoleID, userRole.userRoleID) &&
                Objects.equals(this.roleName, userRole.roleName) &&
                Objects.equals(this.users, userRole.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userRoleID, roleName, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserRole {\n");

        sb.append("    userRoleID: ").append(toIndentedString(userRoleID)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

