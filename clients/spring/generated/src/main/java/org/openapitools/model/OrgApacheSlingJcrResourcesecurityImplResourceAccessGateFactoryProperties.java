package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties   {
  @JsonProperty("path")
  private ConfigNodePropertyString path = null;

  @JsonProperty("checkpath.prefix")
  private ConfigNodePropertyString checkpathPrefix = null;

  @JsonProperty("jcrPath")
  private ConfigNodePropertyString jcrPath = null;

  public OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties checkpathPrefix(ConfigNodePropertyString checkpathPrefix) {
    this.checkpathPrefix = checkpathPrefix;
    return this;
  }

  /**
   * Get checkpathPrefix
   * @return checkpathPrefix
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getCheckpathPrefix() {
    return checkpathPrefix;
  }

  public void setCheckpathPrefix(ConfigNodePropertyString checkpathPrefix) {
    this.checkpathPrefix = checkpathPrefix;
  }

  public OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties jcrPath(ConfigNodePropertyString jcrPath) {
    this.jcrPath = jcrPath;
    return this;
  }

  /**
   * Get jcrPath
   * @return jcrPath
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getJcrPath() {
    return jcrPath;
  }

  public void setJcrPath(ConfigNodePropertyString jcrPath) {
    this.jcrPath = jcrPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

