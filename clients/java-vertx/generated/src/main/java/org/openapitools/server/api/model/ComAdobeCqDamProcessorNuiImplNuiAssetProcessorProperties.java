package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties   {
  
  private ConfigNodePropertyBoolean nuiEnabled = null;
  private ConfigNodePropertyString nuiServiceUrl = null;
  private ConfigNodePropertyString nuiApiKey = null;

  public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties () {

  }

  public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties (ConfigNodePropertyBoolean nuiEnabled, ConfigNodePropertyString nuiServiceUrl, ConfigNodePropertyString nuiApiKey) {
    this.nuiEnabled = nuiEnabled;
    this.nuiServiceUrl = nuiServiceUrl;
    this.nuiApiKey = nuiApiKey;
  }

    
  @JsonProperty("nuiEnabled")
  public ConfigNodePropertyBoolean getNuiEnabled() {
    return nuiEnabled;
  }
  public void setNuiEnabled(ConfigNodePropertyBoolean nuiEnabled) {
    this.nuiEnabled = nuiEnabled;
  }

    
  @JsonProperty("nuiServiceUrl")
  public ConfigNodePropertyString getNuiServiceUrl() {
    return nuiServiceUrl;
  }
  public void setNuiServiceUrl(ConfigNodePropertyString nuiServiceUrl) {
    this.nuiServiceUrl = nuiServiceUrl;
  }

    
  @JsonProperty("nuiApiKey")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
