package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
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

public class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString rootPath = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean fixInconsistencies = null;
 /**
   * Get rootPath
   * @return rootPath
  **/
  @JsonProperty("root.path")
  public ConfigNodePropertyString getRootPath() {
    return rootPath;
  }

  public void setRootPath(ConfigNodePropertyString rootPath) {
    this.rootPath = rootPath;
  }

  public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties rootPath(ConfigNodePropertyString rootPath) {
    this.rootPath = rootPath;
    return this;
  }

 /**
   * Get fixInconsistencies
   * @return fixInconsistencies
  **/
  @JsonProperty("fix.inconsistencies")
  public ConfigNodePropertyBoolean getFixInconsistencies() {
    return fixInconsistencies;
  }

  public void setFixInconsistencies(ConfigNodePropertyBoolean fixInconsistencies) {
    this.fixInconsistencies = fixInconsistencies;
  }

  public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties fixInconsistencies(ConfigNodePropertyBoolean fixInconsistencies) {
    this.fixInconsistencies = fixInconsistencies;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties {\n");
    
    sb.append("    rootPath: ").append(toIndentedString(rootPath)).append("\n");
    sb.append("    fixInconsistencies: ").append(toIndentedString(fixInconsistencies)).append("\n");
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

