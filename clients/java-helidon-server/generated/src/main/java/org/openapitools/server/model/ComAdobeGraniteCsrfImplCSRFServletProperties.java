package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteCsrfImplCSRFServletProperties   {

    private ConfigNodePropertyInteger csrfTokenExpiresIn;
    private ConfigNodePropertyString slingAuthRequirements;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteCsrfImplCSRFServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteCsrfImplCSRFServletProperties.
     *
     * @param csrfTokenExpiresIn csrfTokenExpiresIn
     * @param slingAuthRequirements slingAuthRequirements
     */
    public ComAdobeGraniteCsrfImplCSRFServletProperties(
        ConfigNodePropertyInteger csrfTokenExpiresIn, 
        ConfigNodePropertyString slingAuthRequirements
    ) {
        this.csrfTokenExpiresIn = csrfTokenExpiresIn;
        this.slingAuthRequirements = slingAuthRequirements;
    }



    /**
     * Get csrfTokenExpiresIn
     * @return csrfTokenExpiresIn
     */
    public ConfigNodePropertyInteger getCsrfTokenExpiresIn() {
        return csrfTokenExpiresIn;
    }

    public void setCsrfTokenExpiresIn(ConfigNodePropertyInteger csrfTokenExpiresIn) {
        this.csrfTokenExpiresIn = csrfTokenExpiresIn;
    }

    /**
     * Get slingAuthRequirements
     * @return slingAuthRequirements
     */
    public ConfigNodePropertyString getSlingAuthRequirements() {
        return slingAuthRequirements;
    }

    public void setSlingAuthRequirements(ConfigNodePropertyString slingAuthRequirements) {
        this.slingAuthRequirements = slingAuthRequirements;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteCsrfImplCSRFServletProperties {\n");
        
        sb.append("    csrfTokenExpiresIn: ").append(toIndentedString(csrfTokenExpiresIn)).append("\n");
        sb.append("    slingAuthRequirements: ").append(toIndentedString(slingAuthRequirements)).append("\n");
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

