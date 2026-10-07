package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreMvtMVTStatisticsImplProperties   {

    private ConfigNodePropertyString mvtstatisticsTrackingurl;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreMvtMVTStatisticsImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreMvtMVTStatisticsImplProperties.
     *
     * @param mvtstatisticsTrackingurl mvtstatisticsTrackingurl
     */
    public ComDayCqWcmCoreMvtMVTStatisticsImplProperties(
        ConfigNodePropertyString mvtstatisticsTrackingurl
    ) {
        this.mvtstatisticsTrackingurl = mvtstatisticsTrackingurl;
    }



    /**
     * Get mvtstatisticsTrackingurl
     * @return mvtstatisticsTrackingurl
     */
    public ConfigNodePropertyString getMvtstatisticsTrackingurl() {
        return mvtstatisticsTrackingurl;
    }

    public void setMvtstatisticsTrackingurl(ConfigNodePropertyString mvtstatisticsTrackingurl) {
        this.mvtstatisticsTrackingurl = mvtstatisticsTrackingurl;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreMvtMVTStatisticsImplProperties {\n");
        
        sb.append("    mvtstatisticsTrackingurl: ").append(toIndentedString(mvtstatisticsTrackingurl)).append("\n");
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

