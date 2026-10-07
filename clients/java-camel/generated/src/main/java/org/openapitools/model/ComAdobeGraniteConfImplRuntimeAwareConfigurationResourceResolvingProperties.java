package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties
 */

@JsonTypeName("comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties {

  private ConfigNodePropertyBoolean enabled;

  private ConfigNodePropertyArray fallbackPaths;

  public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @Valid 
  @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties fallbackPaths(ConfigNodePropertyArray fallbackPaths) {
    this.fallbackPaths = fallbackPaths;
    return this;
  }

  /**
   * Get fallbackPaths
   * @return fallbackPaths
   */
  @Valid 
  @Schema(name = "fallbackPaths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.enabled, comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.enabled) &&
        Objects.equals(this.fallbackPaths, comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties.fallbackPaths);
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

