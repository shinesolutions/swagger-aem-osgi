package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;

/**
 * ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties   {
  @JsonProperty("upgradeTaskIgnoreList")
  private ConfigNodePropertyArray upgradeTaskIgnoreList;

  public ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties upgradeTaskIgnoreList(ConfigNodePropertyArray upgradeTaskIgnoreList) {
    this.upgradeTaskIgnoreList = upgradeTaskIgnoreList;
    return this;
  }

   /**
   * Get upgradeTaskIgnoreList
   * @return upgradeTaskIgnoreList
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getUpgradeTaskIgnoreList() {
    return upgradeTaskIgnoreList;
  }

  public void setUpgradeTaskIgnoreList(ConfigNodePropertyArray upgradeTaskIgnoreList) {
    this.upgradeTaskIgnoreList = upgradeTaskIgnoreList;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

