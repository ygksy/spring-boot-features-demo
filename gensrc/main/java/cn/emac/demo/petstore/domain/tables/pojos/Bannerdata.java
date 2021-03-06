/*
 * This file is generated by jOOQ.
*/
package cn.emac.demo.petstore.domain.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * Banner Data
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Bannerdata implements Serializable {

    private static final long serialVersionUID = 1735375011;

    private String favcategory;
    private String bannername;

    public Bannerdata() {}

    public Bannerdata(Bannerdata value) {
        this.favcategory = value.favcategory;
        this.bannername = value.bannername;
    }

    public Bannerdata(
        String favcategory,
        String bannername
    ) {
        this.favcategory = favcategory;
        this.bannername = bannername;
    }

    public String getFavcategory() {
        return this.favcategory;
    }

    public Bannerdata setFavcategory(String favcategory) {
        this.favcategory = favcategory;
        return this;
    }

    public String getBannername() {
        return this.bannername;
    }

    public Bannerdata setBannername(String bannername) {
        this.bannername = bannername;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Bannerdata (");

        sb.append(favcategory);
        sb.append(", ").append(bannername);

        sb.append(")");
        return sb.toString();
    }
}
