package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties   {

    private ConfigNodePropertyInteger serviceRanking;
    private ConfigNodePropertyString pathPrefix;
    private ConfigNodePropertyBoolean createVersion;

    /**
     * Default constructor.
     */
    public ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties.
     *
     * @param serviceRanking serviceRanking
     * @param pathPrefix pathPrefix
     * @param createVersion createVersion
     */
    public ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties(
        ConfigNodePropertyInteger serviceRanking, 
        ConfigNodePropertyString pathPrefix, 
        ConfigNodePropertyBoolean createVersion
    ) {
        this.serviceRanking = serviceRanking;
        this.pathPrefix = pathPrefix;
        this.createVersion = createVersion;
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
     * Get pathPrefix
     * @return pathPrefix
     */
    public ConfigNodePropertyString getPathPrefix() {
        return pathPrefix;
    }

    public void setPathPrefix(ConfigNodePropertyString pathPrefix) {
        this.pathPrefix = pathPrefix;
    }

    /**
     * Get createVersion
     * @return createVersion
     */
    public ConfigNodePropertyBoolean getCreateVersion() {
        return createVersion;
    }

    public void setCreateVersion(ConfigNodePropertyBoolean createVersion) {
        this.createVersion = createVersion;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties {\n");
        
        sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
        sb.append("    pathPrefix: ").append(toIndentedString(pathPrefix)).append("\n");
        sb.append("    createVersion: ").append(toIndentedString(createVersion)).append("\n");
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

