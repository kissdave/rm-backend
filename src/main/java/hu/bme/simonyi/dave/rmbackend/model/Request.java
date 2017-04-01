package hu.bme.simonyi.dave.rmbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * Created by dkiss on 2017. 03. 28..
 */
@Entity
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("requestID")
    private Long requestID = null;

    @ManyToOne
    private Resource resource;
}
