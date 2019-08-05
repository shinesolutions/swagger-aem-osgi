package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties   {
  @JsonProperty("nuiEnabled")
  private ConfigNodePropertyBoolean nuiEnabled = null;

  @JsonProperty("nuiServiceUrl")
  private ConfigNodePropertyString nuiServiceUrl = null;

  @JsonProperty("nuiApiKey")
  private ConfigNodePropertyString nuiApiKey = null;

  public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties nuiEnabled(ConfigNodePropertyBoolean nuiEnabled) {
    this.nuiEnabled = nuiEnabled;
    return this;
  }

  /**
   * Get nuiEnabled
   * @return nuiEnabled
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getNuiEnabled() {
    return nuiEnabled;
  }

  public void setNuiEnabled(ConfigNodePropertyBoolean nuiEnabled) {
    this.nuiEnabled = nuiEnabled;
  }

  public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties nuiServiceUrl(ConfigNodePropertyString nuiServiceUrl) {
    this.nuiServiceUrl = nuiServiceUrl;
    return this;
  }

  /**
   * Get nuiServiceUrl
   * @return nuiServiceUrl
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getNuiServiceUrl() {
    return nuiServiceUrl;
  }

  public void setNuiServiceUrl(ConfigNodePropertyString nuiServiceUrl) {
    this.nuiServiceUrl = nuiServiceUrl;
  }

  public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties nuiApiKey(ConfigNodePropertyString nuiApiKey) {
    this.nuiApiKey = nuiApiKey;
    return this;
  }

  /**
   * Get nuiApiKey
   * @return nuiApiKey
  **/
  @ApiModelProperty(value = "")

  @Valid

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

