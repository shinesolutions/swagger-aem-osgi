package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray preUpgradeMaintenanceTasks;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray preUpgradeHcTags;
 /**
   * Get preUpgradeMaintenanceTasks
   * @return preUpgradeMaintenanceTasks
  **/
  @JsonProperty("pre-upgrade.maintenance.tasks")
  public ConfigNodePropertyArray getPreUpgradeMaintenanceTasks() {
    return preUpgradeMaintenanceTasks;
  }

  public void setPreUpgradeMaintenanceTasks(ConfigNodePropertyArray preUpgradeMaintenanceTasks) {
    this.preUpgradeMaintenanceTasks = preUpgradeMaintenanceTasks;
  }

  public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties preUpgradeMaintenanceTasks(ConfigNodePropertyArray preUpgradeMaintenanceTasks) {
    this.preUpgradeMaintenanceTasks = preUpgradeMaintenanceTasks;
    return this;
  }

 /**
   * Get preUpgradeHcTags
   * @return preUpgradeHcTags
  **/
  @JsonProperty("pre-upgrade.hc.tags")
  public ConfigNodePropertyArray getPreUpgradeHcTags() {
    return preUpgradeHcTags;
  }

  public void setPreUpgradeHcTags(ConfigNodePropertyArray preUpgradeHcTags) {
    this.preUpgradeHcTags = preUpgradeHcTags;
  }

  public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties preUpgradeHcTags(ConfigNodePropertyArray preUpgradeHcTags) {
    this.preUpgradeHcTags = preUpgradeHcTags;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

