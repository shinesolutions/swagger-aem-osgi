package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyArray;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties   {
  
  private ConfigNodePropertyBoolean enabled;
  private ConfigNodePropertyArray fallbackPaths;

  public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties () {

  }

  public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties (ConfigNodePropertyBoolean enabled, ConfigNodePropertyArray fallbackPaths) {
    this.enabled = enabled;
    this.fallbackPaths = fallbackPaths;
  }

    
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

    
  @JsonProperty("fallbackPaths")
  public ConfigNodePropertyArray getFallbackPaths() {
    return fallbackPaths;
  }
  public void setFallbackPaths(ConfigNodePropertyArray fallbackPaths) {
    this.fallbackPaths = fallbackPaths;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties = (ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties) o;
    return Objects.equals(enabled, comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.enabled) &&
        Objects.equals(fallbackPaths, comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.fallbackPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, fallbackPaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    fallbackPaths: ").append(toIndentedString(fallbackPaths)).append("\n");
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
