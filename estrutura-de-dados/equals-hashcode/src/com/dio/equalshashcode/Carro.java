package src.com.dio.equalshashcode;

import java.util.Objects;

public class Carro {
    
    private String marca;

    

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Carro carro = (Carro) obj;
        return Objects.equals(marca, carro.marca);
    }

    

}
