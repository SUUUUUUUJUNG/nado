package com.nado.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@Entity
public class Exhibition {

    @Id
    private Long id;

    @Column(nullable = false)
    private String codename;

    @Column(nullable = false)
    private String guName;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    @Column(length = 500)
    private String place;

    @Column(nullable = false)
    private String orgName;

    @Column(nullable = false)
    private String useTarget;

    private String useFee;

    private String program;

    private String etcDesc;

    private String orgLink;

    private String mainImg;

    private LocalDate regDate;

    private String ticket;

    private String themeCode;

    private Double longitude;

    private Double latitude;

    private Boolean isFree;

    private String homepageAddr;
}
