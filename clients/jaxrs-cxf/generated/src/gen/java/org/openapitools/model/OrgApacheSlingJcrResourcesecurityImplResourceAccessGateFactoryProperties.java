package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString path = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString checkpathPrefix = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jcrPath = null;
 /**
   * Get path
   * @return path
  **/
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

 /**
   * Get checkpathPrefix
   * @return checkpathPrefix
  **/
  @JsonProperty("checkpath.prefix")
  public ConfigNodePropertyString getCheckpathPrefix() {
    return checkpathPrefix;
  }

  public void setCheckpathPrefix(ConfigNodePropertyString checkpathPrefix) {
    this.checkpathPrefix = checkpathPrefix;
  }

  public OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties checkpathPrefix(ConfigNodePropertyString checkpathPrefix) {
    this.checkpathPrefix = checkpathPrefix;
    return this;
  }

 /**
   * Get jcrPath
   * @return jcrPath
  **/
  @JsonProperty("jcrPath")
  public ConfigNodePropertyString getJcrPath() {
    return jcrPath;
  }

  public void setJcrPath(ConfigNodePropertyString jcrPath) {
    this.jcrPath = jcrPath;
  }

  public OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties jcrPath(ConfigNodePropertyString jcrPath) {
    this.jcrPath = jcrPath;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    checkpathPrefix: ").append(toIndentedString(checkpathPrefix)).append("\n");
    sb.append("    jcrPath: ").append(toIndentedString(jcrPath)).append("\n");
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

