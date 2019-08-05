package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;

/**
 * ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties   {
  @JsonProperty("pre-upgrade.maintenance.tasks")
  private ConfigNodePropertyArray preUpgradeMaintenanceTasks = null;

  @JsonProperty("pre-upgrade.hc.tags")
  private ConfigNodePropertyArray preUpgradeHcTags = null;

  public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties preUpgradeMaintenanceTasks(ConfigNodePropertyArray preUpgradeMaintenanceTasks) {
    this.preUpgradeMaintenanceTasks = preUpgradeMaintenanceTasks;
    return this;
  }

   /**
   * Get preUpgradeMaintenanceTasks
   * @return preUpgradeMaintenanceTasks
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getPreUpgradeMaintenanceTasks() {
    return preUpgradeMaintenanceTasks;
  }

  public void setPreUpgradeMaintenanceTasks(ConfigNodePropertyArray preUpgradeMaintenanceTasks) {
    this.preUpgradeMaintenanceTasks = preUpgradeMaintenanceTasks;
  }

  public ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties preUpgradeHcTags(ConfigNodePropertyArray preUpgradeHcTags) {
    this.preUpgradeHcTags = preUpgradeHcTags;
    return this;
  }

   /**
   * Get preUpgradeHcTags
   * @return preUpgradeHcTags
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getPreUpgradeHcTags() {
    return preUpgradeHcTags;
  }

  public void setPreUpgradeHcTags(ConfigNodePropertyArray preUpgradeHcTags) {
    this.preUpgradeHcTags = preUpgradeHcTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

