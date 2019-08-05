package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties   {
  @JsonProperty("paths")
  private ConfigNodePropertyArray paths = null;

  @JsonProperty("excludedPaths")
  private ConfigNodePropertyArray excludedPaths = null;

  public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties paths(ConfigNodePropertyArray paths) {
    this.paths = paths;
    return this;
  }

   /**
   * Get paths
   * @return paths
  **/
  @Valid
  public ConfigNodePropertyArray getPaths() {
    return paths;
  }

  public void setPaths(ConfigNodePropertyArray paths) {
    this.paths = paths;
  }

  public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties excludedPaths(ConfigNodePropertyArray excludedPaths) {
    this.excludedPaths = excludedPaths;
    return this;
  }

   /**
   * Get excludedPaths
   * @return excludedPaths
  **/
  @Valid
  public ConfigNodePropertyArray getExcludedPaths() {
    return excludedPaths;
  }

  public void setExcludedPaths(ConfigNodePropertyArray excludedPaths) {
    this.excludedPaths = excludedPaths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties = (ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties) o;
    return Objects.equals(paths, comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.paths) &&
        Objects.equals(excludedPaths, comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.excludedPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paths, excludedPaths);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties {\n");
    
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
    sb.append("    excludedPaths: ").append(toIndentedString(excludedPaths)).append("\n");
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

