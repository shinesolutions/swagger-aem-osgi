package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties   {

    private ConfigNodePropertyArray cqSocialConsoleAnalyticsSitesMapping;
    private ConfigNodePropertyInteger priority;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties.
     *
     * @param cqSocialConsoleAnalyticsSitesMapping cqSocialConsoleAnalyticsSitesMapping
     * @param priority priority
     */
    public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties(
        ConfigNodePropertyArray cqSocialConsoleAnalyticsSitesMapping, 
        ConfigNodePropertyInteger priority
    ) {
        this.cqSocialConsoleAnalyticsSitesMapping = cqSocialConsoleAnalyticsSitesMapping;
        this.priority = priority;
    }



    /**
     * Get cqSocialConsoleAnalyticsSitesMapping
     * @return cqSocialConsoleAnalyticsSitesMapping
     */
    public ConfigNodePropertyArray getCqSocialConsoleAnalyticsSitesMapping() {
        return cqSocialConsoleAnalyticsSitesMapping;
    }

    public void setCqSocialConsoleAnalyticsSitesMapping(ConfigNodePropertyArray cqSocialConsoleAnalyticsSitesMapping) {
        this.cqSocialConsoleAnalyticsSitesMapping = cqSocialConsoleAnalyticsSitesMapping;
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
        sb.append("class ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties {\n");
        
        sb.append("    cqSocialConsoleAnalyticsSitesMapping: ").append(toIndentedString(cqSocialConsoleAnalyticsSitesMapping)).append("\n");
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

