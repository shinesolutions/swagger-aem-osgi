package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties   {

    private ConfigNodePropertyBoolean enable;
    private ConfigNodePropertyInteger ttl1;
    private ConfigNodePropertyInteger ttl2;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.
     *
     * @param enable enable
     * @param ttl1 ttl1
     * @param ttl2 ttl2
     */
    public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties(
        ConfigNodePropertyBoolean enable, 
        ConfigNodePropertyInteger ttl1, 
        ConfigNodePropertyInteger ttl2
    ) {
        this.enable = enable;
        this.ttl1 = ttl1;
        this.ttl2 = ttl2;
    }



    /**
     * Get enable
     * @return enable
     */
    public ConfigNodePropertyBoolean getEnable() {
        return enable;
    }

    public void setEnable(ConfigNodePropertyBoolean enable) {
        this.enable = enable;
    }

    /**
     * Get ttl1
     * @return ttl1
     */
    public ConfigNodePropertyInteger getTtl1() {
        return ttl1;
    }

    public void setTtl1(ConfigNodePropertyInteger ttl1) {
        this.ttl1 = ttl1;
    }

    /**
     * Get ttl2
     * @return ttl2
     */
    public ConfigNodePropertyInteger getTtl2() {
        return ttl2;
    }

    public void setTtl2(ConfigNodePropertyInteger ttl2) {
        this.ttl2 = ttl2;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties {\n");
        
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    ttl1: ").append(toIndentedString(ttl1)).append("\n");
        sb.append("    ttl2: ").append(toIndentedString(ttl2)).append("\n");
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

