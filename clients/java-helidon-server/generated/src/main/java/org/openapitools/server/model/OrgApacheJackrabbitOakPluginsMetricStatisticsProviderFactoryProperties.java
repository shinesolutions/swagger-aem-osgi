package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties   {

    private ConfigNodePropertyDropDown providerType;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties.
     *
     * @param providerType providerType
     */
    public OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties(
        ConfigNodePropertyDropDown providerType
    ) {
        this.providerType = providerType;
    }



    /**
     * Get providerType
     * @return providerType
     */
    public ConfigNodePropertyDropDown getProviderType() {
        return providerType;
    }

    public void setProviderType(ConfigNodePropertyDropDown providerType) {
        this.providerType = providerType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties {\n");
        
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
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

