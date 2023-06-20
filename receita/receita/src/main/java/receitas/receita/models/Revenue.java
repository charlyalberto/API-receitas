package receitas.receita.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import receitas.receita.DTOS.DTORevenue;

@Table(name = "receita")
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Revenue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String text;

    public Revenue(DTORevenue data) {
        this.nome = data.nome();
        this.text = data.text();
    }
}
