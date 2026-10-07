package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties   {

    private ConfigNodePropertyDropDown feedGeneratorAlgorithm;

    /**
     * Default constructor.
     */
    public ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties.
     *
     * @param feedGeneratorAlgorithm feedGeneratorAlgorithm
     */
    public ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties(
        ConfigNodePropertyDropDown feedGeneratorAlgorithm
    ) {
        this.feedGeneratorAlgorithm = feedGeneratorAlgorithm;
    }



    /**
     * Get feedGeneratorAlgorithm
     * @return feedGeneratorAlgorithm
     */
    public ConfigNodePropertyDropDown getFeedGeneratorAlgorithm() {
        return feedGeneratorAlgorithm;
    }

    public void setFeedGeneratorAlgorithm(ConfigNodePropertyDropDown feedGeneratorAlgorithm) {
        this.feedGeneratorAlgorithm = feedGeneratorAlgorithm;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties {\n");
        
        sb.append("    feedGeneratorAlgorithm: ").append(toIndentedString(feedGeneratorAlgorithm)).append("\n");
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

