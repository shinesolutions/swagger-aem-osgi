package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray upgradeTaskIgnoreList = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

