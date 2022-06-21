package pe.com.ciberelectrik.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Cliente") 
@Table(name ="t_cliente")
public class Cliente implements Serializable{
    
private static final long SerialVersionUID=1L;   
@Id
@Column(name="codcli")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long codigo;

@Column(name="nomcli")
private String nombre;

@Column(name="apepcli")
private String apellidopaterno;

@Column(name="apemcli")
private String apellidomaterno;

@Column(name="dnicli")
private int DNI;

@Column(name="dircli")
private String dirección;

@Column(name="telcli")
private int teléfono;

@Column(name="celcli")
private int celular;

@Column(name="corcli")
private String correo;

@Column(name="sexcli")
private String sexo;

@Column(name="estcli")
private boolean estado;

@ManyToOne
@JoinColumn(name="coddis", nullable=false)
private Distrito distrito;
}