package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger serviceRanking;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString pathPrefix;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean createVersion;
 /**
  * Get serviceRanking
  * @return serviceRanking
  */
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  /**
   * Sets the <code>serviceRanking</code> property.
   */
 public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  /**
   * Sets the <code>serviceRanking</code> property.
   */
  public ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

 /**
  * Get pathPrefix
  * @return pathPrefix
  */
  @JsonProperty("pathPrefix")
  public ConfigNodePropertyString getPathPrefix() {
    return pathPrefix;
  }

  /**
   * Sets the <code>pathPrefix</code> property.
   */
 public void setPathPrefix(ConfigNodePropertyString pathPrefix) {
    this.pathPrefix = pathPrefix;
  }

  /**
   * Sets the <code>pathPrefix</code> property.
   */
  public ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties pathPrefix(ConfigNodePropertyString pathPrefix) {
    this.pathPrefix = pathPrefix;
    return this;
  }

 /**
  * Get createVersion
  * @return createVersion
  */
  @JsonProperty("createVersion")
  public ConfigNodePropertyBoolean getCreateVersion() {
    return createVersion;
  }

  /**
   * Sets the <code>createVersion</code> property.
   */
 public void setCreateVersion(ConfigNodePropertyBoolean createVersion) {
    this.createVersion = createVersion;
  }

  /**
   * Sets the <code>createVersion</code> property.
   */
  public ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties createVersion(ConfigNodePropertyBoolean createVersion) {
    this.createVersion = createVersion;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

