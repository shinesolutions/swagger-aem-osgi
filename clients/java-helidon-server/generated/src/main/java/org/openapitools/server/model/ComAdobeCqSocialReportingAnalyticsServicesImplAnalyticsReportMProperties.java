package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties   {

    private ConfigNodePropertyInteger reportFetchDelay;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties.
     *
     * @param reportFetchDelay reportFetchDelay
     */
    public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties(
        ConfigNodePropertyInteger reportFetchDelay
    ) {
        this.reportFetchDelay = reportFetchDelay;
    }



    /**
     * Get reportFetchDelay
     * @return reportFetchDelay
     */
    public ConfigNodePropertyInteger getReportFetchDelay() {
        return reportFetchDelay;
    }

    public void setReportFetchDelay(ConfigNodePropertyInteger reportFetchDelay) {
        this.reportFetchDelay = reportFetchDelay;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties {\n");
        
        sb.append("    reportFetchDelay: ").append(toIndentedString(reportFetchDelay)).append("\n");
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

