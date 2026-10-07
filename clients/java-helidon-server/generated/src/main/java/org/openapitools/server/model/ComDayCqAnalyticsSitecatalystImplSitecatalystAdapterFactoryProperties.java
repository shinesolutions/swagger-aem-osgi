package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties   {

    private ConfigNodePropertyArray cqAnalyticsAdapterfactoryContextstores;

    /**
     * Default constructor.
     */
    public ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties.
     *
     * @param cqAnalyticsAdapterfactoryContextstores cqAnalyticsAdapterfactoryContextstores
     */
    public ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties(
        ConfigNodePropertyArray cqAnalyticsAdapterfactoryContextstores
    ) {
        this.cqAnalyticsAdapterfactoryContextstores = cqAnalyticsAdapterfactoryContextstores;
    }



    /**
     * Get cqAnalyticsAdapterfactoryContextstores
     * @return cqAnalyticsAdapterfactoryContextstores
     */
    public ConfigNodePropertyArray getCqAnalyticsAdapterfactoryContextstores() {
        return cqAnalyticsAdapterfactoryContextstores;
    }

    public void setCqAnalyticsAdapterfactoryContextstores(ConfigNodePropertyArray cqAnalyticsAdapterfactoryContextstores) {
        this.cqAnalyticsAdapterfactoryContextstores = cqAnalyticsAdapterfactoryContextstores;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties {\n");
        
        sb.append("    cqAnalyticsAdapterfactoryContextstores: ").append(toIndentedString(cqAnalyticsAdapterfactoryContextstores)).append("\n");
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

