package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties   {

    private ConfigNodePropertyString reportingservicesUrl;

    /**
     * Default constructor.
     */
    public ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties.
     *
     * @param reportingservicesUrl reportingservicesUrl
     */
    public ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties(
        ConfigNodePropertyString reportingservicesUrl
    ) {
        this.reportingservicesUrl = reportingservicesUrl;
    }



    /**
     * Get reportingservicesUrl
     * @return reportingservicesUrl
     */
    public ConfigNodePropertyString getReportingservicesUrl() {
        return reportingservicesUrl;
    }

    public void setReportingservicesUrl(ConfigNodePropertyString reportingservicesUrl) {
        this.reportingservicesUrl = reportingservicesUrl;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties {\n");
        
        sb.append("    reportingservicesUrl: ").append(toIndentedString(reportingservicesUrl)).append("\n");
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

