package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqAccountImplAccountManagementServletProperties   {

    private ConfigNodePropertyString cqAccountmanagerConfigInformnewaccountMail;
    private ConfigNodePropertyString cqAccountmanagerConfigInformnewpwdMail;

    /**
     * Default constructor.
     */
    public ComAdobeCqAccountImplAccountManagementServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqAccountImplAccountManagementServletProperties.
     *
     * @param cqAccountmanagerConfigInformnewaccountMail cqAccountmanagerConfigInformnewaccountMail
     * @param cqAccountmanagerConfigInformnewpwdMail cqAccountmanagerConfigInformnewpwdMail
     */
    public ComAdobeCqAccountImplAccountManagementServletProperties(
        ConfigNodePropertyString cqAccountmanagerConfigInformnewaccountMail, 
        ConfigNodePropertyString cqAccountmanagerConfigInformnewpwdMail
    ) {
        this.cqAccountmanagerConfigInformnewaccountMail = cqAccountmanagerConfigInformnewaccountMail;
        this.cqAccountmanagerConfigInformnewpwdMail = cqAccountmanagerConfigInformnewpwdMail;
    }



    /**
     * Get cqAccountmanagerConfigInformnewaccountMail
     * @return cqAccountmanagerConfigInformnewaccountMail
     */
    public ConfigNodePropertyString getCqAccountmanagerConfigInformnewaccountMail() {
        return cqAccountmanagerConfigInformnewaccountMail;
    }

    public void setCqAccountmanagerConfigInformnewaccountMail(ConfigNodePropertyString cqAccountmanagerConfigInformnewaccountMail) {
        this.cqAccountmanagerConfigInformnewaccountMail = cqAccountmanagerConfigInformnewaccountMail;
    }

    /**
     * Get cqAccountmanagerConfigInformnewpwdMail
     * @return cqAccountmanagerConfigInformnewpwdMail
     */
    public ConfigNodePropertyString getCqAccountmanagerConfigInformnewpwdMail() {
        return cqAccountmanagerConfigInformnewpwdMail;
    }

    public void setCqAccountmanagerConfigInformnewpwdMail(ConfigNodePropertyString cqAccountmanagerConfigInformnewpwdMail) {
        this.cqAccountmanagerConfigInformnewpwdMail = cqAccountmanagerConfigInformnewpwdMail;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqAccountImplAccountManagementServletProperties {\n");
        
        sb.append("    cqAccountmanagerConfigInformnewaccountMail: ").append(toIndentedString(cqAccountmanagerConfigInformnewaccountMail)).append("\n");
        sb.append("    cqAccountmanagerConfigInformnewpwdMail: ").append(toIndentedString(cqAccountmanagerConfigInformnewpwdMail)).append("\n");
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

