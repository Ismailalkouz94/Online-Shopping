package net.kzn.shoppingbackend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "CATEGORY")
public class Category implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + ", description=" + description + ", imageURL=" + imageURL
                + ", active=" + active + "]";
    }

    /*
	 * Private fields
	 * */
    @Id
    @SequenceGenerator(name = "CategorySeq", sequenceName = "CATEGORY_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "CategorySeq", strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String description;

    @Column(name = "image_url")
    private String imageURL;

    @Column(name = "is_active")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean active = true;

}
