package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties   {

    private ConfigNodePropertyInteger ranking;
    private ConfigNodePropertyBoolean enable;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.
     *
     * @param ranking ranking
     * @param enable enable
     */
    public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties(
        ConfigNodePropertyInteger ranking, 
        ConfigNodePropertyBoolean enable
    ) {
        this.ranking = ranking;
        this.enable = enable;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties {\n");
        
        sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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

