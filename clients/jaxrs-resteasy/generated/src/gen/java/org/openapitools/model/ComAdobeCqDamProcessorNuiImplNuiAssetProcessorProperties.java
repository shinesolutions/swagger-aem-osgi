package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties   {
  
  private ConfigNodePropertyBoolean nuiEnabled;
  private ConfigNodePropertyString nuiServiceUrl;
  private ConfigNodePropertyString nuiApiKey;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nuiEnabled")
  @Valid
  public ConfigNodePropertyBoolean getNuiEnabled() {
    return nuiEnabled;
  }
  public void setNuiEnabled(ConfigNodePropertyBoolean nuiEnabled) {
    this.nuiEnabled = nuiEnabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nuiServiceUrl")
  @Valid
  public ConfigNodePropertyString getNuiServiceUrl() {
    return nuiServiceUrl;
  }
  public void setNuiServiceUrl(ConfigNodePropertyString nuiServiceUrl) {
    this.nuiServiceUrl = nuiServiceUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nuiApiKey")
  @Valid
  public ConfigNodePropertyString getNuiApiKey() {
    return nuiApiKey;
  }
  public void setNuiApiKey(ConfigNodePropertyString nuiApiKey) {
    this.nuiApiKey = nuiApiKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties = (ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties) o;
    return Objects.equals(this.nuiEnabled, comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.nuiEnabled) &&
        Objects.equals(this.nuiServiceUrl, comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.nuiServiceUrl) &&
        Objects.equals(this.nuiApiKey, comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.nuiApiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nuiEnabled, nuiServiceUrl, nuiApiKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties {\n");
    
    sb.append("    nuiEnabled: ").append(toIndentedString(nuiEnabled)).append("\n");
    sb.append("    nuiServiceUrl: ").append(toIndentedString(nuiServiceUrl)).append("\n");
    sb.append("    nuiApiKey: ").append(toIndentedString(nuiApiKey)).append("\n");
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

