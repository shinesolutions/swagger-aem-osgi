package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties   {
  
  private @Valid ConfigNodePropertyArray upgradeTaskIgnoreList = null;

  /**
   **/
  public ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties upgradeTaskIgnoreList(ConfigNodePropertyArray upgradeTaskIgnoreList) {
    this.upgradeTaskIgnoreList = upgradeTaskIgnoreList;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("upgradeTaskIgnoreList")
  public ConfigNodePropertyArray getUpgradeTaskIgnoreList() {
    return upgradeTaskIgnoreList;
  }
  public void setUpgradeTaskIgnoreList(ConfigNodePropertyArray upgradeTaskIgnoreList) {
    this.upgradeTaskIgnoreList = upgradeTaskIgnoreList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties = (ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties) o;
    return Objects.equals(upgradeTaskIgnoreList, comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties.upgradeTaskIgnoreList);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

