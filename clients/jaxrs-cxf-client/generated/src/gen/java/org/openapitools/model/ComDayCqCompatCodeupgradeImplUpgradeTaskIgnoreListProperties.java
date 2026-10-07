package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray upgradeTaskIgnoreList;
 /**
   * Get upgradeTaskIgnoreList
   * @return upgradeTaskIgnoreList
  **/
  @JsonProperty("upgradeTaskIgnoreList")
  public ConfigNodePropertyArray getUpgradeTaskIgnoreList() {
    return upgradeTaskIgnoreList;
  }

  public void setUpgradeTaskIgnoreList(ConfigNodePropertyArray upgradeTaskIgnoreList) {
    this.upgradeTaskIgnoreList = upgradeTaskIgnoreList;
  }

  public ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties upgradeTaskIgnoreList(ConfigNodePropertyArray upgradeTaskIgnoreList) {
    this.upgradeTaskIgnoreList = upgradeTaskIgnoreList;
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
    ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties = (ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties) o;
    return Objects.equals(this.upgradeTaskIgnoreList, comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties.upgradeTaskIgnoreList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upgradeTaskIgnoreList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties {\n");
    
    sb.append("    upgradeTaskIgnoreList: ").append(toIndentedString(upgradeTaskIgnoreList)).append("\n");
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

