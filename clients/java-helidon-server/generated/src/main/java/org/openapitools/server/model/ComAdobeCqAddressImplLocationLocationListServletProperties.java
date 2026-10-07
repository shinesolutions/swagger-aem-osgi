package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqAddressImplLocationLocationListServletProperties   {

    private ConfigNodePropertyInteger cqAddressLocationDefaultMaxResults;

    /**
     * Default constructor.
     */
    public ComAdobeCqAddressImplLocationLocationListServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqAddressImplLocationLocationListServletProperties.
     *
     * @param cqAddressLocationDefaultMaxResults cqAddressLocationDefaultMaxResults
     */
    public ComAdobeCqAddressImplLocationLocationListServletProperties(
        ConfigNodePropertyInteger cqAddressLocationDefaultMaxResults
    ) {
        this.cqAddressLocationDefaultMaxResults = cqAddressLocationDefaultMaxResults;
    }



    /**
     * Get cqAddressLocationDefaultMaxResults
     * @return cqAddressLocationDefaultMaxResults
     */
    public ConfigNodePropertyInteger getCqAddressLocationDefaultMaxResults() {
        return cqAddressLocationDefaultMaxResults;
    }

    public void setCqAddressLocationDefaultMaxResults(ConfigNodePropertyInteger cqAddressLocationDefaultMaxResults) {
        this.cqAddressLocationDefaultMaxResults = cqAddressLocationDefaultMaxResults;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqAddressImplLocationLocationListServletProperties {\n");
        
        sb.append("    cqAddressLocationDefaultMaxResults: ").append(toIndentedString(cqAddressLocationDefaultMaxResults)).append("\n");
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

