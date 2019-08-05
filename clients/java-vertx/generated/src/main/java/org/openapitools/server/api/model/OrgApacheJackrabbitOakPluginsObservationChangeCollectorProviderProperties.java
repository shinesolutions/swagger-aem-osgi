package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties   {
  
  private ConfigNodePropertyInteger maxItems = null;
  private ConfigNodePropertyInteger maxPathDepth = null;
  private ConfigNodePropertyBoolean enabled = null;

  public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties () {

  }

  public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties (ConfigNodePropertyInteger maxItems, ConfigNodePropertyInteger maxPathDepth, ConfigNodePropertyBoolean enabled) {
    this.maxItems = maxItems;
    this.maxPathDepth = maxPathDepth;
    this.enabled = enabled;
  }

    
  @JsonProperty("maxItems")
  public ConfigNodePropertyInteger getMaxItems() {
    return maxItems;
  }
  public void setMaxItems(ConfigNodePropertyInteger maxItems) {
    this.maxItems = maxItems;
  }

    
  @JsonProperty("maxPathDepth")
  public ConfigNodePropertyInteger getMaxPathDepth() {
    return maxPathDepth;
  }
  public void setMaxPathDepth(ConfigNodePropertyInteger maxPathDepth) {
    this.maxPathDepth = maxPathDepth;
  }

    
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
