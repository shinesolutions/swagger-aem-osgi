package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
    return Objects.equals(nuiEnabled, comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.nuiEnabled) &&
        Objects.equals(nuiServiceUrl, comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.nuiServiceUrl) &&
        Objects.equals(nuiApiKey, comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties.nuiApiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nuiEnabled, nuiServiceUrl, nuiApiKey);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

