package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties   {

    private ConfigNodePropertyArray cqSocialConsoleAnalyticsComponents;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties.
     *
     * @param cqSocialConsoleAnalyticsComponents cqSocialConsoleAnalyticsComponents
     */
    public ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties(
        ConfigNodePropertyArray cqSocialConsoleAnalyticsComponents
    ) {
        this.cqSocialConsoleAnalyticsComponents = cqSocialConsoleAnalyticsComponents;
    }



    /**
     * Get cqSocialConsoleAnalyticsComponents
     * @return cqSocialConsoleAnalyticsComponents
     */
    public ConfigNodePropertyArray getCqSocialConsoleAnalyticsComponents() {
        return cqSocialConsoleAnalyticsComponents;
    }

    public void setCqSocialConsoleAnalyticsComponents(ConfigNodePropertyArray cqSocialConsoleAnalyticsComponents) {
        this.cqSocialConsoleAnalyticsComponents = cqSocialConsoleAnalyticsComponents;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties {\n");
        
        sb.append("    cqSocialConsoleAnalyticsComponents: ").append(toIndentedString(cqSocialConsoleAnalyticsComponents)).append("\n");
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

