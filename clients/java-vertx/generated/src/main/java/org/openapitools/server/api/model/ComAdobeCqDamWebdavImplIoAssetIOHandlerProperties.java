package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties   {
  
  private ConfigNodePropertyInteger serviceRanking = null;
  private ConfigNodePropertyString pathPrefix = null;
  private ConfigNodePropertyBoolean createVersion = null;

  public ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties () {

  }

  public ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties (ConfigNodePropertyInteger serviceRanking, ConfigNodePropertyString pathPrefix, ConfigNodePropertyBoolean createVersion) {
    this.serviceRanking = serviceRanking;
    this.pathPrefix = pathPrefix;
    this.createVersion = createVersion;
  }

    
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

    
  @JsonProperty("pathPrefix")
  public ConfigNodePropertyString getPathPrefix() {
    return pathPrefix;
  }
  public void setPathPrefix(ConfigNodePropertyString pathPrefix) {
    this.pathPrefix = pathPrefix;
  }

    
  @JsonProperty("createVersion")
  public ConfigNodePropertyBoolean getCreateVersion() {
    return createVersion;
  }
  public void setCreateVersion(ConfigNodePropertyBoolean createVersion) {
    this.createVersion = createVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties comAdobeCqDamWebdavImplIoAssetIOHandlerProperties = (ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties) o;
    return Objects.equals(serviceRanking, comAdobeCqDamWebdavImplIoAssetIOHandlerProperties.serviceRanking) &&
        Objects.equals(pathPrefix, comAdobeCqDamWebdavImplIoAssetIOHandlerProperties.pathPrefix) &&
        Objects.equals(createVersion, comAdobeCqDamWebdavImplIoAssetIOHandlerProperties.createVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, pathPrefix, createVersion);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
