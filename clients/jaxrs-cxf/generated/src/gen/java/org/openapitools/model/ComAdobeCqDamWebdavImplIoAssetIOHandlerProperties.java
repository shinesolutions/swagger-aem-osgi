package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger serviceRanking = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString pathPrefix = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean createVersion = null;
 /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

 /**
   * Get pathPrefix
   * @return pathPrefix
  **/
  @JsonProperty("pathPrefix")
  public ConfigNodePropertyString getPathPrefix() {
    return pathPrefix;
  }

  public void setPathPrefix(ConfigNodePropertyString pathPrefix) {
    this.pathPrefix = pathPrefix;
  }

  public ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties pathPrefix(ConfigNodePropertyString pathPrefix) {
    this.pathPrefix = pathPrefix;
    return this;
  }

 /**
   * Get createVersion
   * @return createVersion
  **/
  @JsonProperty("createVersion")
  public ConfigNodePropertyBoolean getCreateVersion() {
    return createVersion;
  }

  public void setCreateVersion(ConfigNodePropertyBoolean createVersion) {
    this.createVersion = createVersion;
  }

  public ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties createVersion(ConfigNodePropertyBoolean createVersion) {
    this.createVersion = createVersion;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

