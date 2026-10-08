package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties   {

    private ConfigNodePropertyArray reportingservicesProxyWhitelist;

    /**
     * Default constructor.
     */
    public ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties.
     *
     * @param reportingservicesProxyWhitelist reportingservicesProxyWhitelist
     */
    public ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties(
        ConfigNodePropertyArray reportingservicesProxyWhitelist
    ) {
        this.reportingservicesProxyWhitelist = reportingservicesProxyWhitelist;
    }



    /**
     * Get reportingservicesProxyWhitelist
     * @return reportingservicesProxyWhitelist
     */
    public ConfigNodePropertyArray getReportingservicesProxyWhitelist() {
        return reportingservicesProxyWhitelist;
    }

    public void setReportingservicesProxyWhitelist(ConfigNodePropertyArray reportingservicesProxyWhitelist) {
        this.reportingservicesProxyWhitelist = reportingservicesProxyWhitelist;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties {\n");
        
        sb.append("    reportingservicesProxyWhitelist: ").append(toIndentedString(reportingservicesProxyWhitelist)).append("\n");
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

