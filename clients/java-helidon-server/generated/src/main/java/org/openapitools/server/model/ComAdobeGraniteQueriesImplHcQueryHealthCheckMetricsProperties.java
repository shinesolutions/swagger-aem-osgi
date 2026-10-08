package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties   {

    private ConfigNodePropertyInteger getPeriod;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties.
     *
     * @param getPeriod getPeriod
     */
    public ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties(
        ConfigNodePropertyInteger getPeriod
    ) {
        this.getPeriod = getPeriod;
    }



    /**
     * Get getPeriod
     * @return getPeriod
     */
    public ConfigNodePropertyInteger getGetPeriod() {
        return getPeriod;
    }

    public void setGetPeriod(ConfigNodePropertyInteger getPeriod) {
        this.getPeriod = getPeriod;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties {\n");
        
        sb.append("    getPeriod: ").append(toIndentedString(getPeriod)).append("\n");
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

