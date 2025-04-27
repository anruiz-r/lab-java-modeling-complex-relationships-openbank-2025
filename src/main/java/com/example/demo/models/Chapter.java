package com.example.demo.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "chapters")
public class Chapter {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    private String name;
    private String district;

    @OneToOne
    private Chapter president;

    @OneToMany
    @Column(name = "members_list")
    private List <Chapter> membersList;

    public Chapter() {

    }

    public Chapter(String name, String district, Chapter president, List<Chapter> list) {
        this.name = name;
        this.district = district;
        this.president = president;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Chapter getPresident() {
        return president;
    }

    public void setPresident(Chapter president) {
        this.president = president;
    }

    public List<Chapter> getMembersList() {
        return membersList;
    }

    public void setMembersList(List<Chapter> membersList) {
        this.membersList = membersList;
    }
    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", district='" + district + '\'' +
                ", president=" + president +
                ", memebersList=" + membersList+
                '}';
    }


}
