package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties   {
  
  private ConfigNodePropertyInteger serviceRanking;
  private ConfigNodePropertyString pathPrefix;
  private ConfigNodePropertyBoolean createVersion;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("service.ranking")
  @Valid
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pathPrefix")
  @Valid
  public ConfigNodePropertyString getPathPrefix() {
    return pathPrefix;
  }
  public void setPathPrefix(ConfigNodePropertyString pathPrefix) {
    this.pathPrefix = pathPrefix;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createVersion")
  @Valid
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

