package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString rootPath;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean fixInconsistencies;
 /**
  * Get rootPath
  * @return rootPath
  */
  @JsonProperty("root.path")
  public ConfigNodePropertyString getRootPath() {
    return rootPath;
  }

  /**
   * Sets the <code>rootPath</code> property.
   */
 public void setRootPath(ConfigNodePropertyString rootPath) {
    this.rootPath = rootPath;
  }

  /**
   * Sets the <code>rootPath</code> property.
   */
  public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties rootPath(ConfigNodePropertyString rootPath) {
    this.rootPath = rootPath;
    return this;
  }

 /**
  * Get fixInconsistencies
  * @return fixInconsistencies
  */
  @JsonProperty("fix.inconsistencies")
  public ConfigNodePropertyBoolean getFixInconsistencies() {
    return fixInconsistencies;
  }

  /**
   * Sets the <code>fixInconsistencies</code> property.
   */
 public void setFixInconsistencies(ConfigNodePropertyBoolean fixInconsistencies) {
    this.fixInconsistencies = fixInconsistencies;
  }

  /**
   * Sets the <code>fixInconsistencies</code> property.
   */
  public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties fixInconsistencies(ConfigNodePropertyBoolean fixInconsistencies) {
    this.fixInconsistencies = fixInconsistencies;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

