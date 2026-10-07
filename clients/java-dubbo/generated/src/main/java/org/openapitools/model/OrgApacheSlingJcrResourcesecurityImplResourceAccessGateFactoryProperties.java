package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("path")
  private ConfigNodePropertyString path;

  @JsonProperty("checkpath.prefix")
  private ConfigNodePropertyString checkpathPrefix;

  @JsonProperty("jcrPath")
  private ConfigNodePropertyString jcrPath;

  /**
   * 
   * @return path
   */
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  /**
   * 
   * @return checkpathPrefix
   */
  public ConfigNodePropertyString getCheckpathPrefix() {
    return checkpathPrefix;
  }

  public void setCheckpathPrefix(ConfigNodePropertyString checkpathPrefix) {
    this.checkpathPrefix = checkpathPrefix;
  }

  /**
   * 
   * @return jcrPath
   */
  public ConfigNodePropertyString getJcrPath() {
    return jcrPath;
  }

  public void setJcrPath(ConfigNodePropertyString jcrPath) {
    this.jcrPath = jcrPath;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
