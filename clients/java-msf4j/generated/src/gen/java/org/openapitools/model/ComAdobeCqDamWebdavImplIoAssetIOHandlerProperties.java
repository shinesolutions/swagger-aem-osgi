package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties   {
  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking = null;

  @JsonProperty("pathPrefix")
  private ConfigNodePropertyString pathPrefix = null;

  @JsonProperty("createVersion")
  private ConfigNodePropertyBoolean createVersion = null;

  public ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

   /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties pathPrefix(ConfigNodePropertyString pathPrefix) {
    this.pathPrefix = pathPrefix;
    return this;
  }

   /**
   * Get pathPrefix
   * @return pathPrefix
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPathPrefix() {
    return pathPrefix;
  }

  public void setPathPrefix(ConfigNodePropertyString pathPrefix) {
    this.pathPrefix = pathPrefix;
  }

  public ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties createVersion(ConfigNodePropertyBoolean createVersion) {
    this.createVersion = createVersion;
    return this;
  }

   /**
   * Get createVersion
   * @return createVersion
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCreateVersion() {
    return createVersion;
  }

  public void setCreateVersion(ConfigNodePropertyBoolean createVersion) {
    this.createVersion = createVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties comAdobeCqDamWebdavImplIoAssetIOHandlerProperties = (ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties) o;
    return Objects.equals(this.serviceRanking, comAdobeCqDamWebdavImplIoAssetIOHandlerProperties.serviceRanking) &&
        Objects.equals(this.pathPrefix, comAdobeCqDamWebdavImplIoAssetIOHandlerProperties.pathPrefix) &&
        Objects.equals(this.createVersion, comAdobeCqDamWebdavImplIoAssetIOHandlerProperties.createVersion);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

