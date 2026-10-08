package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties   {
  private ConfigNodePropertyArray preUpgradeMaintenanceTasks;
  private ConfigNodePropertyArray preUpgradeHcTags;

  public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties() {
  }

  /**
   **/
  public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties preUpgradeMaintenanceTasks(ConfigNodePropertyArray preUpgradeMaintenanceTasks) {
    this.preUpgradeMaintenanceTasks = preUpgradeMaintenanceTasks;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pre-upgrade.maintenance.tasks")
  @Valid public ConfigNodePropertyArray getPreUpgradeMaintenanceTasks() {
    return preUpgradeMaintenanceTasks;
  }

  @JsonProperty("pre-upgrade.maintenance.tasks")
  public void setPreUpgradeMaintenanceTasks(ConfigNodePropertyArray preUpgradeMaintenanceTasks) {
    this.preUpgradeMaintenanceTasks = preUpgradeMaintenanceTasks;
  }

  /**
   **/
  public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties preUpgradeHcTags(ConfigNodePropertyArray preUpgradeHcTags) {
    this.preUpgradeHcTags = preUpgradeHcTags;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pre-upgrade.hc.tags")
  @Valid public ConfigNodePropertyArray getPreUpgradeHcTags() {
    return preUpgradeHcTags;
  }

  @JsonProperty("pre-upgrade.hc.tags")
  public void setPreUpgradeHcTags(ConfigNodePropertyArray preUpgradeHcTags) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
