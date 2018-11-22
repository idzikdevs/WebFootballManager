package pl.idzikdev.webfootballmanager.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name",nullable = false, unique = false)
    private String name;
    @Column(name = "surname",nullable = false, unique = false)
    private String surname;
    @Column(name = "skill",nullable = false, unique = false)
    private byte skill;
    @Column(name="hash")
    private String hash;
    @ManyToOne(targetEntity = Player.class,cascade = {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "fk_club")
    private String club;
}
