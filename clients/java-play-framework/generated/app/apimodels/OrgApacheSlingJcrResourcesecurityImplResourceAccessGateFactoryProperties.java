package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties   {
  @JsonProperty("path")
  @Valid

  private ConfigNodePropertyString path;

  @JsonProperty("checkpath.prefix")
  @Valid

  private ConfigNodePropertyString checkpathPrefix;

  @JsonProperty("jcrPath")
  @Valid

  private ConfigNodePropertyString jcrPath;

  public OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
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
    return Objects.equals(path, orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.path) &&
        Objects.equals(checkpathPrefix, orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.checkpathPrefix) &&
        Objects.equals(jcrPath, orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.jcrPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, checkpathPrefix, jcrPath);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

