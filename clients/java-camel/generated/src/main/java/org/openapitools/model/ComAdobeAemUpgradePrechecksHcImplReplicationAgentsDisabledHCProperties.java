package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties
 */

@JsonTypeName("comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties {

  private ConfigNodePropertyString hcName;

  private ConfigNodePropertyArray hcTags;

  private ConfigNodePropertyString hcMbeanName;

  public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties hcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
    return this;
  }

  /**
   * Get hcName
   * @return hcName
   */
  @Valid 
  @Schema(name = "hc.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hc.name")
  public ConfigNodePropertyString getHcName() {
    return hcName;
  }

  public void setHcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

  public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

  /**
   * Get hcTags
   * @return hcTags
   */
  @Valid 
  @Schema(name = "hc.tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties hcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
    return this;
  }

  /**
   * Get hcMbeanName
   * @return hcMbeanName
   */
  @Valid 
  @Schema(name = "hc.mbean.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hc.mbean.name")
  public ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }

  public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties = (ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties) o;
    return Objects.equals(this.hcName, comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.hcName) &&
        Objects.equals(this.hcTags, comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.hcTags) &&
        Objects.equals(this.hcMbeanName, comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.hcMbeanName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcName, hcTags, hcMbeanName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties {\n");
    sb.append("    hcName: ").append(toIndentedString(hcName)).append("\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    hcMbeanName: ").append(toIndentedString(hcMbeanName)).append("\n");
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

