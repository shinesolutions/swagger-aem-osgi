package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties   {

    private ConfigNodePropertyInteger priority;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties.
     *
     * @param priority priority
     */
    public ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties(
        ConfigNodePropertyInteger priority
    ) {
        this.priority = priority;
    }



    /**
     * Get priority
     * @return priority
     */
    public ConfigNodePropertyInteger getPriority() {
        return priority;
    }

    public void setPriority(ConfigNodePropertyInteger priority) {
        this.priority = priority;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties {\n");
        
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

