package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties   {

    private ConfigNodePropertyBoolean parameterGuavaCacheEnabled;
    private ConfigNodePropertyString parameterGuavaCacheParams;
    private ConfigNodePropertyBoolean parameterGuavaCacheReload;
    private ConfigNodePropertyInteger serviceRanking;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.
     *
     * @param parameterGuavaCacheEnabled parameterGuavaCacheEnabled
     * @param parameterGuavaCacheParams parameterGuavaCacheParams
     * @param parameterGuavaCacheReload parameterGuavaCacheReload
     * @param serviceRanking serviceRanking
     */
    public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties(
        ConfigNodePropertyBoolean parameterGuavaCacheEnabled, 
        ConfigNodePropertyString parameterGuavaCacheParams, 
        ConfigNodePropertyBoolean parameterGuavaCacheReload, 
        ConfigNodePropertyInteger serviceRanking
    ) {
        this.parameterGuavaCacheEnabled = parameterGuavaCacheEnabled;
        this.parameterGuavaCacheParams = parameterGuavaCacheParams;
        this.parameterGuavaCacheReload = parameterGuavaCacheReload;
        this.serviceRanking = serviceRanking;
    }



    /**
     * Get parameterGuavaCacheEnabled
     * @return parameterGuavaCacheEnabled
     */
    public ConfigNodePropertyBoolean getParameterGuavaCacheEnabled() {
        return parameterGuavaCacheEnabled;
    }

    public void setParameterGuavaCacheEnabled(ConfigNodePropertyBoolean parameterGuavaCacheEnabled) {
        this.parameterGuavaCacheEnabled = parameterGuavaCacheEnabled;
    }

    /**
     * Get parameterGuavaCacheParams
     * @return parameterGuavaCacheParams
     */
    public ConfigNodePropertyString getParameterGuavaCacheParams() {
        return parameterGuavaCacheParams;
    }

    public void setParameterGuavaCacheParams(ConfigNodePropertyString parameterGuavaCacheParams) {
        this.parameterGuavaCacheParams = parameterGuavaCacheParams;
    }

    /**
     * Get parameterGuavaCacheReload
     * @return parameterGuavaCacheReload
     */
    public ConfigNodePropertyBoolean getParameterGuavaCacheReload() {
        return parameterGuavaCacheReload;
    }

    public void setParameterGuavaCacheReload(ConfigNodePropertyBoolean parameterGuavaCacheReload) {
        this.parameterGuavaCacheReload = parameterGuavaCacheReload;
    }

    /**
     * Get serviceRanking
     * @return serviceRanking
     */
    public ConfigNodePropertyInteger getServiceRanking() {
        return serviceRanking;
    }

    public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
        this.serviceRanking = serviceRanking;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties {\n");
        
        sb.append("    parameterGuavaCacheEnabled: ").append(toIndentedString(parameterGuavaCacheEnabled)).append("\n");
        sb.append("    parameterGuavaCacheParams: ").append(toIndentedString(parameterGuavaCacheParams)).append("\n");
        sb.append("    parameterGuavaCacheReload: ").append(toIndentedString(parameterGuavaCacheReload)).append("\n");
        sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
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

