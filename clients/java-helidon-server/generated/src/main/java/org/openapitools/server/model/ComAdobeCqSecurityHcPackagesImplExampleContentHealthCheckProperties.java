package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties   {

    private ConfigNodePropertyArray hcTags;

    /**
     * Default constructor.
     */
    public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties.
     *
     * @param hcTags hcTags
     */
    public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties(
        ConfigNodePropertyArray hcTags
    ) {
        this.hcTags = hcTags;
    }



    /**
     * Get hcTags
     * @return hcTags
     */
    public ConfigNodePropertyArray getHcTags() {
        return hcTags;
    }

    public void setHcTags(ConfigNodePropertyArray hcTags) {
        this.hcTags = hcTags;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties {\n");
        
        sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
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

