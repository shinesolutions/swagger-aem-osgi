package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties   {

    private ConfigNodePropertyBoolean cqSocialContentFragmentsServicesEnabled;
    private ConfigNodePropertyInteger cqSocialContentFragmentsServicesWaitTimeSeconds;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.
     *
     * @param cqSocialContentFragmentsServicesEnabled cqSocialContentFragmentsServicesEnabled
     * @param cqSocialContentFragmentsServicesWaitTimeSeconds cqSocialContentFragmentsServicesWaitTimeSeconds
     */
    public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties(
        ConfigNodePropertyBoolean cqSocialContentFragmentsServicesEnabled, 
        ConfigNodePropertyInteger cqSocialContentFragmentsServicesWaitTimeSeconds
    ) {
        this.cqSocialContentFragmentsServicesEnabled = cqSocialContentFragmentsServicesEnabled;
        this.cqSocialContentFragmentsServicesWaitTimeSeconds = cqSocialContentFragmentsServicesWaitTimeSeconds;
    }



    /**
     * Get cqSocialContentFragmentsServicesEnabled
     * @return cqSocialContentFragmentsServicesEnabled
     */
    public ConfigNodePropertyBoolean getCqSocialContentFragmentsServicesEnabled() {
        return cqSocialContentFragmentsServicesEnabled;
    }

    public void setCqSocialContentFragmentsServicesEnabled(ConfigNodePropertyBoolean cqSocialContentFragmentsServicesEnabled) {
        this.cqSocialContentFragmentsServicesEnabled = cqSocialContentFragmentsServicesEnabled;
    }

    /**
     * Get cqSocialContentFragmentsServicesWaitTimeSeconds
     * @return cqSocialContentFragmentsServicesWaitTimeSeconds
     */
    public ConfigNodePropertyInteger getCqSocialContentFragmentsServicesWaitTimeSeconds() {
        return cqSocialContentFragmentsServicesWaitTimeSeconds;
    }

    public void setCqSocialContentFragmentsServicesWaitTimeSeconds(ConfigNodePropertyInteger cqSocialContentFragmentsServicesWaitTimeSeconds) {
        this.cqSocialContentFragmentsServicesWaitTimeSeconds = cqSocialContentFragmentsServicesWaitTimeSeconds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties {\n");
        
        sb.append("    cqSocialContentFragmentsServicesEnabled: ").append(toIndentedString(cqSocialContentFragmentsServicesEnabled)).append("\n");
        sb.append("    cqSocialContentFragmentsServicesWaitTimeSeconds: ").append(toIndentedString(cqSocialContentFragmentsServicesWaitTimeSeconds)).append("\n");
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

