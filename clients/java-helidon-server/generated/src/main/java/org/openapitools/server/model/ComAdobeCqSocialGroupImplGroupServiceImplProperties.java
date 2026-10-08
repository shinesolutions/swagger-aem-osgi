package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialGroupImplGroupServiceImplProperties   {

    private ConfigNodePropertyInteger maxWaitTime;
    private ConfigNodePropertyInteger minWaitBetweenRetries;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialGroupImplGroupServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialGroupImplGroupServiceImplProperties.
     *
     * @param maxWaitTime maxWaitTime
     * @param minWaitBetweenRetries minWaitBetweenRetries
     */
    public ComAdobeCqSocialGroupImplGroupServiceImplProperties(
        ConfigNodePropertyInteger maxWaitTime, 
        ConfigNodePropertyInteger minWaitBetweenRetries
    ) {
        this.maxWaitTime = maxWaitTime;
        this.minWaitBetweenRetries = minWaitBetweenRetries;
    }



    /**
     * Get maxWaitTime
     * @return maxWaitTime
     */
    public ConfigNodePropertyInteger getMaxWaitTime() {
        return maxWaitTime;
    }

    public void setMaxWaitTime(ConfigNodePropertyInteger maxWaitTime) {
        this.maxWaitTime = maxWaitTime;
    }

    /**
     * Get minWaitBetweenRetries
     * @return minWaitBetweenRetries
     */
    public ConfigNodePropertyInteger getMinWaitBetweenRetries() {
        return minWaitBetweenRetries;
    }

    public void setMinWaitBetweenRetries(ConfigNodePropertyInteger minWaitBetweenRetries) {
        this.minWaitBetweenRetries = minWaitBetweenRetries;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialGroupImplGroupServiceImplProperties {\n");
        
        sb.append("    maxWaitTime: ").append(toIndentedString(maxWaitTime)).append("\n");
        sb.append("    minWaitBetweenRetries: ").append(toIndentedString(minWaitBetweenRetries)).append("\n");
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

