package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties   {

    private ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterInterval;
    private ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterPageSize;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.
     *
     * @param cqSocialReportingAnalyticsPollingImporterInterval cqSocialReportingAnalyticsPollingImporterInterval
     * @param cqSocialReportingAnalyticsPollingImporterPageSize cqSocialReportingAnalyticsPollingImporterPageSize
     */
    public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties(
        ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterInterval, 
        ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterPageSize
    ) {
        this.cqSocialReportingAnalyticsPollingImporterInterval = cqSocialReportingAnalyticsPollingImporterInterval;
        this.cqSocialReportingAnalyticsPollingImporterPageSize = cqSocialReportingAnalyticsPollingImporterPageSize;
    }



    /**
     * Get cqSocialReportingAnalyticsPollingImporterInterval
     * @return cqSocialReportingAnalyticsPollingImporterInterval
     */
    public ConfigNodePropertyInteger getCqSocialReportingAnalyticsPollingImporterInterval() {
        return cqSocialReportingAnalyticsPollingImporterInterval;
    }

    public void setCqSocialReportingAnalyticsPollingImporterInterval(ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterInterval) {
        this.cqSocialReportingAnalyticsPollingImporterInterval = cqSocialReportingAnalyticsPollingImporterInterval;
    }

    /**
     * Get cqSocialReportingAnalyticsPollingImporterPageSize
     * @return cqSocialReportingAnalyticsPollingImporterPageSize
     */
    public ConfigNodePropertyInteger getCqSocialReportingAnalyticsPollingImporterPageSize() {
        return cqSocialReportingAnalyticsPollingImporterPageSize;
    }

    public void setCqSocialReportingAnalyticsPollingImporterPageSize(ConfigNodePropertyInteger cqSocialReportingAnalyticsPollingImporterPageSize) {
        this.cqSocialReportingAnalyticsPollingImporterPageSize = cqSocialReportingAnalyticsPollingImporterPageSize;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties {\n");
        
        sb.append("    cqSocialReportingAnalyticsPollingImporterInterval: ").append(toIndentedString(cqSocialReportingAnalyticsPollingImporterInterval)).append("\n");
        sb.append("    cqSocialReportingAnalyticsPollingImporterPageSize: ").append(toIndentedString(cqSocialReportingAnalyticsPollingImporterPageSize)).append("\n");
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

