package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray deletePathRegexps = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString deleteSql2Query = null;
 /**
   * Get deletePathRegexps
   * @return deletePathRegexps
  **/
  @JsonProperty("delete.path.regexps")
  public ConfigNodePropertyArray getDeletePathRegexps() {
    return deletePathRegexps;
  }

  public void setDeletePathRegexps(ConfigNodePropertyArray deletePathRegexps) {
    this.deletePathRegexps = deletePathRegexps;
  }

  public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties deletePathRegexps(ConfigNodePropertyArray deletePathRegexps) {
    this.deletePathRegexps = deletePathRegexps;
    return this;
  }

 /**
   * Get deleteSql2Query
   * @return deleteSql2Query
  **/
  @JsonProperty("delete.sql2.query")
  public ConfigNodePropertyString getDeleteSql2Query() {
    return deleteSql2Query;
  }

  public void setDeleteSql2Query(ConfigNodePropertyString deleteSql2Query) {
    this.deleteSql2Query = deleteSql2Query;
  }

  public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties deleteSql2Query(ConfigNodePropertyString deleteSql2Query) {
    this.deleteSql2Query = deleteSql2Query;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties {\n");
    
    sb.append("    deletePathRegexps: ").append(toIndentedString(deletePathRegexps)).append("\n");
    sb.append("    deleteSql2Query: ").append(toIndentedString(deleteSql2Query)).append("\n");
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

