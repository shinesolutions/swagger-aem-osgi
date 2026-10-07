package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString path;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString checkpathPrefix;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString jcrPath;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties = (OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties) o;
    return Objects.equals(this.path, orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.path) &&
        Objects.equals(this.checkpathPrefix, orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.checkpathPrefix) &&
        Objects.equals(this.jcrPath, orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.jcrPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, checkpathPrefix, jcrPath);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

