package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties   {

    private ConfigNodePropertyString contextPath;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties.
     *
     * @param contextPath contextPath
     */
    public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties(
        ConfigNodePropertyString contextPath
    ) {
        this.contextPath = contextPath;
    }



    /**
     * Get contextPath
     * @return contextPath
     */
    public ConfigNodePropertyString getContextPath() {
        return contextPath;
    }

    public void setContextPath(ConfigNodePropertyString contextPath) {
        this.contextPath = contextPath;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties {\n");
        
        sb.append("    contextPath: ").append(toIndentedString(contextPath)).append("\n");
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

