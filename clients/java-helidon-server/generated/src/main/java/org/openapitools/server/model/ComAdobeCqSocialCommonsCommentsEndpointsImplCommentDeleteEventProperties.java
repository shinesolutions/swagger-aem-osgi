package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties   {

    private ConfigNodePropertyInteger ranking;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties.
     *
     * @param ranking ranking
     */
    public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties(
        ConfigNodePropertyInteger ranking
    ) {
        this.ranking = ranking;
    }



    /**
     * Get ranking
     * @return ranking
     */
    public ConfigNodePropertyInteger getRanking() {
        return ranking;
    }

    public void setRanking(ConfigNodePropertyInteger ranking) {
        this.ranking = ranking;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties {\n");
        
        sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
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

