package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialSrpImplSocialSolrConnectorProperties   {

    private ConfigNodePropertyString srpType;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialSrpImplSocialSolrConnectorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialSrpImplSocialSolrConnectorProperties.
     *
     * @param srpType srpType
     */
    public ComAdobeCqSocialSrpImplSocialSolrConnectorProperties(
        ConfigNodePropertyString srpType
    ) {
        this.srpType = srpType;
    }



    /**
     * Get srpType
     * @return srpType
     */
    public ConfigNodePropertyString getSrpType() {
        return srpType;
    }

    public void setSrpType(ConfigNodePropertyString srpType) {
        this.srpType = srpType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialSrpImplSocialSolrConnectorProperties {\n");
        
        sb.append("    srpType: ").append(toIndentedString(srpType)).append("\n");
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

