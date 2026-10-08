package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties
 */

@JsonTypeName("comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray preUpgradeMaintenanceTasks;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray preUpgradeHcTags;

  public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties preUpgradeMaintenanceTasks(@Nullable ConfigNodePropertyArray preUpgradeMaintenanceTasks) {
    this.preUpgradeMaintenanceTasks = preUpgradeMaintenanceTasks;
    return this;
  }

  /**
   * Get preUpgradeMaintenanceTasks
   * @return preUpgradeMaintenanceTasks
   */
  @Valid 
  @Schema(name = "pre-upgrade.maintenance.tasks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pre-upgrade.maintenance.tasks")
  public @Nullable ConfigNodePropertyArray getPreUpgradeMaintenanceTasks() {
    return preUpgradeMaintenanceTasks;
  }

  @JsonProperty("pre-upgrade.maintenance.tasks")
  public void setPreUpgradeMaintenanceTasks(@Nullable ConfigNodePropertyArray preUpgradeMaintenanceTasks) {
    this.preUpgradeMaintenanceTasks = preUpgradeMaintenanceTasks;
  }

  public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties preUpgradeHcTags(@Nullable ConfigNodePropertyArray preUpgradeHcTags) {
    this.preUpgradeHcTags = preUpgradeHcTags;
    return this;
  }

  /**
   * Get preUpgradeHcTags
   * @return preUpgradeHcTags
   */
  @Valid 
  @Schema(name = "pre-upgrade.hc.tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pre-upgrade.hc.tags")
  public @Nullable ConfigNodePropertyArray getPreUpgradeHcTags() {
    return preUpgradeHcTags;
  }

  @JsonProperty("pre-upgrade.hc.tags")
  public void setPreUpgradeHcTags(@Nullable ConfigNodePropertyArray preUpgradeHcTags) {
    this.preUpgradeHcTags = preUpgradeHcTags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties = (ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties) o;
    return Objects.equals(this.preUpgradeMaintenanceTasks, comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties.preUpgradeMaintenanceTasks) &&
        Objects.equals(this.preUpgradeHcTags, comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties.preUpgradeHcTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preUpgradeMaintenanceTasks, preUpgradeHcTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties {\n");
    sb.append("    preUpgradeMaintenanceTasks: ").append(toIndentedString(preUpgradeMaintenanceTasks)).append("\n");
    sb.append("    preUpgradeHcTags: ").append(toIndentedString(preUpgradeHcTags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

