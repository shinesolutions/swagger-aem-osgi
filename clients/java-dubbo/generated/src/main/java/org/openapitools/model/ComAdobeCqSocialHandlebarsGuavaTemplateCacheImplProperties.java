package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("parameter.guava.cache.enabled")
  private ConfigNodePropertyBoolean parameterGuavaCacheEnabled;

  @JsonProperty("parameter.guava.cache.params")
  private ConfigNodePropertyString parameterGuavaCacheParams;

  @JsonProperty("parameter.guava.cache.reload")
  private ConfigNodePropertyBoolean parameterGuavaCacheReload;

  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking;

  /**
   * 
   * @return parameterGuavaCacheEnabled
   */
  public ConfigNodePropertyBoolean getParameterGuavaCacheEnabled() {
    return parameterGuavaCacheEnabled;
  }

  public void setParameterGuavaCacheEnabled(ConfigNodePropertyBoolean parameterGuavaCacheEnabled) {
    this.parameterGuavaCacheEnabled = parameterGuavaCacheEnabled;
  }

  /**
   * 
   * @return parameterGuavaCacheParams
   */
  public ConfigNodePropertyString getParameterGuavaCacheParams() {
    return parameterGuavaCacheParams;
  }

  public void setParameterGuavaCacheParams(ConfigNodePropertyString parameterGuavaCacheParams) {
    this.parameterGuavaCacheParams = parameterGuavaCacheParams;
  }

  /**
   * 
   * @return parameterGuavaCacheReload
   */
  public ConfigNodePropertyBoolean getParameterGuavaCacheReload() {
    return parameterGuavaCacheReload;
  }

  public void setParameterGuavaCacheReload(ConfigNodePropertyBoolean parameterGuavaCacheReload) {
    this.parameterGuavaCacheReload = parameterGuavaCacheReload;
  }

  /**
   * 
   * @return serviceRanking
   */
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
