package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties   {
  @JsonProperty("parameter.guava.cache.enabled")
  private ConfigNodePropertyBoolean parameterGuavaCacheEnabled = null;

  @JsonProperty("parameter.guava.cache.params")
  private ConfigNodePropertyString parameterGuavaCacheParams = null;

  @JsonProperty("parameter.guava.cache.reload")
  private ConfigNodePropertyBoolean parameterGuavaCacheReload = null;

  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking = null;

  public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties parameterGuavaCacheEnabled(ConfigNodePropertyBoolean parameterGuavaCacheEnabled) {
    this.parameterGuavaCacheEnabled = parameterGuavaCacheEnabled;
    return this;
  }

  /**
   * Get parameterGuavaCacheEnabled
   * @return parameterGuavaCacheEnabled
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getParameterGuavaCacheEnabled() {
    return parameterGuavaCacheEnabled;
  }

  public void setParameterGuavaCacheEnabled(ConfigNodePropertyBoolean parameterGuavaCacheEnabled) {
    this.parameterGuavaCacheEnabled = parameterGuavaCacheEnabled;
  }

  public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties parameterGuavaCacheParams(ConfigNodePropertyString parameterGuavaCacheParams) {
    this.parameterGuavaCacheParams = parameterGuavaCacheParams;
    return this;
  }

  /**
   * Get parameterGuavaCacheParams
   * @return parameterGuavaCacheParams
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getParameterGuavaCacheParams() {
    return parameterGuavaCacheParams;
  }

  public void setParameterGuavaCacheParams(ConfigNodePropertyString parameterGuavaCacheParams) {
    this.parameterGuavaCacheParams = parameterGuavaCacheParams;
  }

  public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties parameterGuavaCacheReload(ConfigNodePropertyBoolean parameterGuavaCacheReload) {
    this.parameterGuavaCacheReload = parameterGuavaCacheReload;
    return this;
  }

  /**
   * Get parameterGuavaCacheReload
   * @return parameterGuavaCacheReload
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getParameterGuavaCacheReload() {
    return parameterGuavaCacheReload;
  }

  public void setParameterGuavaCacheReload(ConfigNodePropertyBoolean parameterGuavaCacheReload) {
    this.parameterGuavaCacheReload = parameterGuavaCacheReload;
  }

  public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @ApiModelProperty(value = "")

  @Valid

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
    return Objects.equals(this.parameterGuavaCacheEnabled, comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.parameterGuavaCacheEnabled) &&
        Objects.equals(this.parameterGuavaCacheParams, comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.parameterGuavaCacheParams) &&
        Objects.equals(this.parameterGuavaCacheReload, comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.parameterGuavaCacheReload) &&
        Objects.equals(this.serviceRanking, comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.serviceRanking);
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

