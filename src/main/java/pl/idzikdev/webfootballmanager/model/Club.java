package pl.idzikdev.webfootballmanager.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "clubs")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name",nullable = false, unique = true)
    private String name;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "club",cascade = CascadeType.ALL)
    private Set<Player> players=new HashSet<>();

}
