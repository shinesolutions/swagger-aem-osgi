package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties   {
  
  private ConfigNodePropertyInteger maxItems = null;
  private ConfigNodePropertyInteger maxPathDepth = null;
  private ConfigNodePropertyBoolean enabled = null;

  /**
   **/
  public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties maxItems(ConfigNodePropertyInteger maxItems) {
    this.maxItems = maxItems;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxItems")
  public ConfigNodePropertyInteger getMaxItems() {
    return maxItems;
  }
  public void setMaxItems(ConfigNodePropertyInteger maxItems) {
    this.maxItems = maxItems;
  }

  /**
   **/
  public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties maxPathDepth(ConfigNodePropertyInteger maxPathDepth) {
    this.maxPathDepth = maxPathDepth;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxPathDepth")
  public ConfigNodePropertyInteger getMaxPathDepth() {
    return maxPathDepth;
  }
  public void setMaxPathDepth(ConfigNodePropertyInteger maxPathDepth) {
    this.maxPathDepth = maxPathDepth;
  }

  /**
   **/
  public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties = (OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties) o;
    return Objects.equals(maxItems, orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.maxItems) &&
        Objects.equals(maxPathDepth, orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.maxPathDepth) &&
        Objects.equals(enabled, orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxItems, maxPathDepth, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties {\n");
    
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
    sb.append("    maxPathDepth: ").append(toIndentedString(maxPathDepth)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

