package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("maxItems")
  private ConfigNodePropertyInteger maxItems;

  @JsonProperty("maxPathDepth")
  private ConfigNodePropertyInteger maxPathDepth;

  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled;

  /**
   * 
   * @return maxItems
   */
  public ConfigNodePropertyInteger getMaxItems() {
    return maxItems;
  }

  public void setMaxItems(ConfigNodePropertyInteger maxItems) {
    this.maxItems = maxItems;
  }

  /**
   * 
   * @return maxPathDepth
   */
  public ConfigNodePropertyInteger getMaxPathDepth() {
    return maxPathDepth;
  }

  public void setMaxPathDepth(ConfigNodePropertyInteger maxPathDepth) {
    this.maxPathDepth = maxPathDepth;
  }

  /**
   * 
   * @return enabled
   */
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
    return Objects.equals(this.maxItems, orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.maxItems) &&
        Objects.equals(this.maxPathDepth, orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.maxPathDepth) &&
        Objects.equals(this.enabled, orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.enabled);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
