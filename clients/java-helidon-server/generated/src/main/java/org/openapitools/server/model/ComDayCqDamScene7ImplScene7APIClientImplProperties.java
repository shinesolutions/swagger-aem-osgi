package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamScene7ImplScene7APIClientImplProperties   {

    private ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageNofilterName;
    private ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageWithfilterName;

    /**
     * Default constructor.
     */
    public ComDayCqDamScene7ImplScene7APIClientImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamScene7ImplScene7APIClientImplProperties.
     *
     * @param cqDamScene7ApiclientRecordsperpageNofilterName cqDamScene7ApiclientRecordsperpageNofilterName
     * @param cqDamScene7ApiclientRecordsperpageWithfilterName cqDamScene7ApiclientRecordsperpageWithfilterName
     */
    public ComDayCqDamScene7ImplScene7APIClientImplProperties(
        ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageNofilterName, 
        ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageWithfilterName
    ) {
        this.cqDamScene7ApiclientRecordsperpageNofilterName = cqDamScene7ApiclientRecordsperpageNofilterName;
        this.cqDamScene7ApiclientRecordsperpageWithfilterName = cqDamScene7ApiclientRecordsperpageWithfilterName;
    }



    /**
     * Get cqDamScene7ApiclientRecordsperpageNofilterName
     * @return cqDamScene7ApiclientRecordsperpageNofilterName
     */
    public ConfigNodePropertyInteger getCqDamScene7ApiclientRecordsperpageNofilterName() {
        return cqDamScene7ApiclientRecordsperpageNofilterName;
    }

    public void setCqDamScene7ApiclientRecordsperpageNofilterName(ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageNofilterName) {
        this.cqDamScene7ApiclientRecordsperpageNofilterName = cqDamScene7ApiclientRecordsperpageNofilterName;
    }

    /**
     * Get cqDamScene7ApiclientRecordsperpageWithfilterName
     * @return cqDamScene7ApiclientRecordsperpageWithfilterName
     */
    public ConfigNodePropertyInteger getCqDamScene7ApiclientRecordsperpageWithfilterName() {
        return cqDamScene7ApiclientRecordsperpageWithfilterName;
    }

    public void setCqDamScene7ApiclientRecordsperpageWithfilterName(ConfigNodePropertyInteger cqDamScene7ApiclientRecordsperpageWithfilterName) {
        this.cqDamScene7ApiclientRecordsperpageWithfilterName = cqDamScene7ApiclientRecordsperpageWithfilterName;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamScene7ImplScene7APIClientImplProperties {\n");
        
        sb.append("    cqDamScene7ApiclientRecordsperpageNofilterName: ").append(toIndentedString(cqDamScene7ApiclientRecordsperpageNofilterName)).append("\n");
        sb.append("    cqDamScene7ApiclientRecordsperpageWithfilterName: ").append(toIndentedString(cqDamScene7ApiclientRecordsperpageWithfilterName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

