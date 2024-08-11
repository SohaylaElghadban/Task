package Main.Manager.Entity;

import jakarta.persistence.*;

@Entity
public class itemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String Code_;
    private String Name_;

    public itemEntity() {}

    public itemEntity(String Code_, String Name_) {
        this.Code_ = Code_;
        this.Name_ = Name_;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode_() {
        return Code_;
    }

    public void setCode_(String itemCode) {
        this.Code_ = itemCode;
    }

    public String getName_() {
        return Name_;
    }

    public void setName_(String itemName) {
        this.Name_ = itemName;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", itemCode='" + Code_ + '\'' + ", itemName='" + Name_ + '\'' + '}';
    }
}
