package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqAccountApiAccountManagementServiceProperties   {

    private ConfigNodePropertyInteger cqAccountmanagerTokenValidityPeriod;
    private ConfigNodePropertyString cqAccountmanagerConfigRequestnewaccountMail;
    private ConfigNodePropertyString cqAccountmanagerConfigRequestnewpwdMail;

    /**
     * Default constructor.
     */
    public ComAdobeCqAccountApiAccountManagementServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqAccountApiAccountManagementServiceProperties.
     *
     * @param cqAccountmanagerTokenValidityPeriod cqAccountmanagerTokenValidityPeriod
     * @param cqAccountmanagerConfigRequestnewaccountMail cqAccountmanagerConfigRequestnewaccountMail
     * @param cqAccountmanagerConfigRequestnewpwdMail cqAccountmanagerConfigRequestnewpwdMail
     */
    public ComAdobeCqAccountApiAccountManagementServiceProperties(
        ConfigNodePropertyInteger cqAccountmanagerTokenValidityPeriod, 
        ConfigNodePropertyString cqAccountmanagerConfigRequestnewaccountMail, 
        ConfigNodePropertyString cqAccountmanagerConfigRequestnewpwdMail
    ) {
        this.cqAccountmanagerTokenValidityPeriod = cqAccountmanagerTokenValidityPeriod;
        this.cqAccountmanagerConfigRequestnewaccountMail = cqAccountmanagerConfigRequestnewaccountMail;
        this.cqAccountmanagerConfigRequestnewpwdMail = cqAccountmanagerConfigRequestnewpwdMail;
    }



    /**
     * Get cqAccountmanagerTokenValidityPeriod
     * @return cqAccountmanagerTokenValidityPeriod
     */
    public ConfigNodePropertyInteger getCqAccountmanagerTokenValidityPeriod() {
        return cqAccountmanagerTokenValidityPeriod;
    }

    public void setCqAccountmanagerTokenValidityPeriod(ConfigNodePropertyInteger cqAccountmanagerTokenValidityPeriod) {
        this.cqAccountmanagerTokenValidityPeriod = cqAccountmanagerTokenValidityPeriod;
    }

    /**
     * Get cqAccountmanagerConfigRequestnewaccountMail
     * @return cqAccountmanagerConfigRequestnewaccountMail
     */
    public ConfigNodePropertyString getCqAccountmanagerConfigRequestnewaccountMail() {
        return cqAccountmanagerConfigRequestnewaccountMail;
    }

    public void setCqAccountmanagerConfigRequestnewaccountMail(ConfigNodePropertyString cqAccountmanagerConfigRequestnewaccountMail) {
        this.cqAccountmanagerConfigRequestnewaccountMail = cqAccountmanagerConfigRequestnewaccountMail;
    }

    /**
     * Get cqAccountmanagerConfigRequestnewpwdMail
     * @return cqAccountmanagerConfigRequestnewpwdMail
     */
    public ConfigNodePropertyString getCqAccountmanagerConfigRequestnewpwdMail() {
        return cqAccountmanagerConfigRequestnewpwdMail;
    }

    public void setCqAccountmanagerConfigRequestnewpwdMail(ConfigNodePropertyString cqAccountmanagerConfigRequestnewpwdMail) {
        this.cqAccountmanagerConfigRequestnewpwdMail = cqAccountmanagerConfigRequestnewpwdMail;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqAccountApiAccountManagementServiceProperties {\n");
        
        sb.append("    cqAccountmanagerTokenValidityPeriod: ").append(toIndentedString(cqAccountmanagerTokenValidityPeriod)).append("\n");
        sb.append("    cqAccountmanagerConfigRequestnewaccountMail: ").append(toIndentedString(cqAccountmanagerConfigRequestnewaccountMail)).append("\n");
        sb.append("    cqAccountmanagerConfigRequestnewpwdMail: ").append(toIndentedString(cqAccountmanagerConfigRequestnewpwdMail)).append("\n");
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

