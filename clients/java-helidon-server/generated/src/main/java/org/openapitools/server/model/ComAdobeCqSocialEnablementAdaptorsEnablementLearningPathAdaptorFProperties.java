package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties   {

    private ConfigNodePropertyBoolean isMemberCheck;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties.
     *
     * @param isMemberCheck isMemberCheck
     */
    public ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties(
        ConfigNodePropertyBoolean isMemberCheck
    ) {
        this.isMemberCheck = isMemberCheck;
    }



    /**
     * Get isMemberCheck
     * @return isMemberCheck
     */
    public ConfigNodePropertyBoolean getIsMemberCheck() {
        return isMemberCheck;
    }

    public void setIsMemberCheck(ConfigNodePropertyBoolean isMemberCheck) {
        this.isMemberCheck = isMemberCheck;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties {\n");
        
        sb.append("    isMemberCheck: ").append(toIndentedString(isMemberCheck)).append("\n");
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

