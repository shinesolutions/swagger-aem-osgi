package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties   {
  @JsonProperty("root.path")
  private ConfigNodePropertyString rootPath = null;

  @JsonProperty("fix.inconsistencies")
  private ConfigNodePropertyBoolean fixInconsistencies = null;

  public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties rootPath(ConfigNodePropertyString rootPath) {
    this.rootPath = rootPath;
    return this;
  }

  /**
   * Get rootPath
   * @return rootPath
  **/
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getFixInconsistencies() {
    return fixInconsistencies;
  }

  public void setFixInconsistencies(ConfigNodePropertyBoolean fixInconsistencies) {
    this.fixInconsistencies = fixInconsistencies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties = (ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties) o;
    return Objects.equals(this.rootPath, comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.rootPath) &&
        Objects.equals(this.fixInconsistencies, comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.fixInconsistencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootPath, fixInconsistencies);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

