/*
 * SPDX-License-Identifier: Apache-2.0
 */

package org.example;

//import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.hyperledger.fabric.contract.annotation.DataType;
import org.hyperledger.fabric.contract.annotation.Property;
//import com.google.gson.JsonObject;
//import com.owlike.genson.Genson;
import org.json.JSONObject; // <<<ss

@DataType()
public class Patient {

    //private final static Genson genson = new Genson();

    @Property()
    private String name; // <<<

    @Property()
    private String surname; // <<<

    @Property()
    private String sex; // <<<

    @Property()
    private int age; // <<<
    
    @Property()
    private String hospital; // <<<



    public Patient(){
    }

    public String getName() { // <<<
        return name;
    }

    public String getSurname() { // <<<
        return surname;
    }
    
    public String getSex() { // <<<
        return sex;
    }

    public int getAge() { // <<<
        return age;
    }

    public String getH() { // <<<
        return hospital;
    }

    public void setName(String value) { // <<<
        this.name = value;
    }

    public void setSurname(String value) { // <<<
        this.surname = value;
    }

    public void setSex(String value) { // <<<
        this.sex = value;
    }

    public void setAge(int value) { // <<<
        this.age = value;
    }

    public void setH(String value) { // <<<
        this.hospital = value;
    }



    public String toJSONString() {
        return new JSONObject(this).toString(); // <<<
        //return genson.serialize(this).toString();
    }

    public static Patient fromJSONString(String json) {
        String name = new JSONObject(json).getString("name"); // <<<
        String surname = new JSONObject(json).getString("surname"); // <<<
        String sex = new JSONObject(json).getString("sex"); // <<<
        int age = new JSONObject(json).getInt("age"); // <<<
        String hospital = new JSONObject(json).getString("hospital"); // <<<

        Patient asset = new Patient(); // <<<
        asset.setName(name); // <<<
        asset.setSurname(surname); // <<<
        asset.setSex(sex); // <<<
        asset.setAge(age); // <<<
        asset.setH(hospital); // <<<
        //Patient asset = genson.deserialize(json, Patient.class);
        return asset;
    }
}
