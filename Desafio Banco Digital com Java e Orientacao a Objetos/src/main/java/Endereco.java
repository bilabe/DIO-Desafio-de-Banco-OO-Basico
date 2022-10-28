import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Endereco {
        private String numero;
        private String cep;
        private String cidade;
        private String estado;
        private String pais;
        private String rua;
}
