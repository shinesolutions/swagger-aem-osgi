package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties   {
  
  private ConfigNodePropertyBoolean nuiEnabled = null;
  private ConfigNodePropertyString nuiServiceUrl = null;
  private ConfigNodePropertyString nuiApiKey = null;

  /**
   **/
  public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties nuiEnabled(ConfigNodePropertyBoolean nuiEnabled) {
    this.nuiEnabled = nuiEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nuiEnabled")
  public ConfigNodePropertyBoolean getNuiEnabled() {
    return nuiEnabled;
  }
  public void setNuiEnabled(ConfigNodePropertyBoolean nuiEnabled) {
    this.nuiEnabled = nuiEnabled;
  }

  /**
   **/
  public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties nuiServiceUrl(ConfigNodePropertyString nuiServiceUrl) {
    this.nuiServiceUrl = nuiServiceUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nuiServiceUrl")
  public ConfigNodePropertyString getNuiServiceUrl() {
    return nuiServiceUrl;
  }
  public void setNuiServiceUrl(ConfigNodePropertyString nuiServiceUrl) {
    this.nuiServiceUrl = nuiServiceUrl;
  }

  /**
   **/
  public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties nuiApiKey(ConfigNodePropertyString nuiApiKey) {
    this.nuiApiKey = nuiApiKey;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nuiApiKey")
  public ConfigNodePropertyString getNuiApiKey() {
    return nuiApiKey;
  }
  public void setNuiApiKey(ConfigNodePropertyString nuiApiKey) {
    this.nuiApiKey = nuiApiKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties = (ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties) o;
    return Objects.equals(nuiEnabled, comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.nuiEnabled) &&
        Objects.equals(nuiServiceUrl, comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.nuiServiceUrl) &&
        Objects.equals(nuiApiKey, comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.nuiApiKey);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

