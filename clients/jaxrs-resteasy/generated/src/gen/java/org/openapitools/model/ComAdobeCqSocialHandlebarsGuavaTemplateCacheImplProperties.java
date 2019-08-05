package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties   {
  
  private ConfigNodePropertyBoolean parameterGuavaCacheEnabled = null;
  private ConfigNodePropertyString parameterGuavaCacheParams = null;
  private ConfigNodePropertyBoolean parameterGuavaCacheReload = null;
  private ConfigNodePropertyInteger serviceRanking = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parameter.guava.cache.enabled")
  public ConfigNodePropertyBoolean getParameterGuavaCacheEnabled() {
    return parameterGuavaCacheEnabled;
  }
  public void setParameterGuavaCacheEnabled(ConfigNodePropertyBoolean parameterGuavaCacheEnabled) {
    this.parameterGuavaCacheEnabled = parameterGuavaCacheEnabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parameter.guava.cache.params")
  public ConfigNodePropertyString getParameterGuavaCacheParams() {
    return parameterGuavaCacheParams;
  }
  public void setParameterGuavaCacheParams(ConfigNodePropertyString parameterGuavaCacheParams) {
    this.parameterGuavaCacheParams = parameterGuavaCacheParams;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parameter.guava.cache.reload")
  public ConfigNodePropertyBoolean getParameterGuavaCacheReload() {
    return parameterGuavaCacheReload;
  }
  public void setParameterGuavaCacheReload(ConfigNodePropertyBoolean parameterGuavaCacheReload) {
    this.parameterGuavaCacheReload = parameterGuavaCacheReload;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties = (ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties) o;
    return Objects.equals(parameterGuavaCacheEnabled, comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.parameterGuavaCacheEnabled) &&
        Objects.equals(parameterGuavaCacheParams, comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.parameterGuavaCacheParams) &&
        Objects.equals(parameterGuavaCacheReload, comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.parameterGuavaCacheReload) &&
        Objects.equals(serviceRanking, comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.serviceRanking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterGuavaCacheEnabled, parameterGuavaCacheParams, parameterGuavaCacheReload, serviceRanking);
  }

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

