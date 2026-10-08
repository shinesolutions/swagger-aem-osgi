package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties   {
  @JsonProperty("root.path")
  @Valid

  private ConfigNodePropertyString rootPath;

  @JsonProperty("fix.inconsistencies")
  @Valid

  private ConfigNodePropertyBoolean fixInconsistencies;

  public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties rootPath(ConfigNodePropertyString rootPath) {
    this.rootPath = rootPath;
    return this;
  }

   /**
   * Get rootPath
   * @return rootPath
  **/
  public ConfigNodePropertyString getRootPath() {
    return rootPath;
  }

  public void setRootPath(ConfigNodePropertyString rootPath) {
    this.rootPath = rootPath;
  }

  public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties fixInconsistencies(ConfigNodePropertyBoolean fixInconsistencies) {
    this.fixInconsistencies = fixInconsistencies;
    return this;
  }

   /**
   * Get fixInconsistencies
   * @return fixInconsistencies
  **/
  public ConfigNodePropertyBoolean getFixInconsistencies() {
    return fixInconsistencies;
  }

  public void setFixInconsistencies(ConfigNodePropertyBoolean fixInconsistencies) {
    this.fixInconsistencies = fixInconsistencies;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties = (ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties) o;
    return Objects.equals(rootPath, comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.rootPath) &&
        Objects.equals(fixInconsistencies, comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.fixInconsistencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootPath, fixInconsistencies);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

