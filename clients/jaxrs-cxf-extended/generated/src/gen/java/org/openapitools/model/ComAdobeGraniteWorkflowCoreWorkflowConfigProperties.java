package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray cqWorkflowConfigWorkflowPackagesRootPath;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean cqWorkflowConfigWorkflowProcessLegacyMode;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean cqWorkflowConfigAllowLocking;
 /**
  * Get cqWorkflowConfigWorkflowPackagesRootPath
  * @return cqWorkflowConfigWorkflowPackagesRootPath
  */
  @JsonProperty("cq.workflow.config.workflow.packages.root.path")
  public ConfigNodePropertyArray getCqWorkflowConfigWorkflowPackagesRootPath() {
    return cqWorkflowConfigWorkflowPackagesRootPath;
  }

  /**
   * Sets the <code>cqWorkflowConfigWorkflowPackagesRootPath</code> property.
   */
 public void setCqWorkflowConfigWorkflowPackagesRootPath(ConfigNodePropertyArray cqWorkflowConfigWorkflowPackagesRootPath) {
    this.cqWorkflowConfigWorkflowPackagesRootPath = cqWorkflowConfigWorkflowPackagesRootPath;
  }

  /**
   * Sets the <code>cqWorkflowConfigWorkflowPackagesRootPath</code> property.
   */
  public ComAdobeGraniteWorkflowCoreWorkflowConfigProperties cqWorkflowConfigWorkflowPackagesRootPath(ConfigNodePropertyArray cqWorkflowConfigWorkflowPackagesRootPath) {
    this.cqWorkflowConfigWorkflowPackagesRootPath = cqWorkflowConfigWorkflowPackagesRootPath;
    return this;
  }

 /**
  * Get cqWorkflowConfigWorkflowProcessLegacyMode
  * @return cqWorkflowConfigWorkflowProcessLegacyMode
  */
  @JsonProperty("cq.workflow.config.workflow.process.legacy.mode")
  public ConfigNodePropertyBoolean getCqWorkflowConfigWorkflowProcessLegacyMode() {
    return cqWorkflowConfigWorkflowProcessLegacyMode;
  }

  /**
   * Sets the <code>cqWorkflowConfigWorkflowProcessLegacyMode</code> property.
   */
 public void setCqWorkflowConfigWorkflowProcessLegacyMode(ConfigNodePropertyBoolean cqWorkflowConfigWorkflowProcessLegacyMode) {
    this.cqWorkflowConfigWorkflowProcessLegacyMode = cqWorkflowConfigWorkflowProcessLegacyMode;
  }

  /**
   * Sets the <code>cqWorkflowConfigWorkflowProcessLegacyMode</code> property.
   */
  public ComAdobeGraniteWorkflowCoreWorkflowConfigProperties cqWorkflowConfigWorkflowProcessLegacyMode(ConfigNodePropertyBoolean cqWorkflowConfigWorkflowProcessLegacyMode) {
    this.cqWorkflowConfigWorkflowProcessLegacyMode = cqWorkflowConfigWorkflowProcessLegacyMode;
    return this;
  }

 /**
  * Get cqWorkflowConfigAllowLocking
  * @return cqWorkflowConfigAllowLocking
  */
  @JsonProperty("cq.workflow.config.allow.locking")
  public ConfigNodePropertyBoolean getCqWorkflowConfigAllowLocking() {
    return cqWorkflowConfigAllowLocking;
  }

  /**
   * Sets the <code>cqWorkflowConfigAllowLocking</code> property.
   */
 public void setCqWorkflowConfigAllowLocking(ConfigNodePropertyBoolean cqWorkflowConfigAllowLocking) {
    this.cqWorkflowConfigAllowLocking = cqWorkflowConfigAllowLocking;
  }

  /**
   * Sets the <code>cqWorkflowConfigAllowLocking</code> property.
   */
  public ComAdobeGraniteWorkflowCoreWorkflowConfigProperties cqWorkflowConfigAllowLocking(ConfigNodePropertyBoolean cqWorkflowConfigAllowLocking) {
    this.cqWorkflowConfigAllowLocking = cqWorkflowConfigAllowLocking;
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
    ComAdobeGraniteWorkflowCoreWorkflowConfigProperties comAdobeGraniteWorkflowCoreWorkflowConfigProperties = (ComAdobeGraniteWorkflowCoreWorkflowConfigProperties) o;
    return Objects.equals(this.cqWorkflowConfigWorkflowPackagesRootPath, comAdobeGraniteWorkflowCoreWorkflowConfigProperties.cqWorkflowConfigWorkflowPackagesRootPath) &&
        Objects.equals(this.cqWorkflowConfigWorkflowProcessLegacyMode, comAdobeGraniteWorkflowCoreWorkflowConfigProperties.cqWorkflowConfigWorkflowProcessLegacyMode) &&
        Objects.equals(this.cqWorkflowConfigAllowLocking, comAdobeGraniteWorkflowCoreWorkflowConfigProperties.cqWorkflowConfigAllowLocking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqWorkflowConfigWorkflowPackagesRootPath, cqWorkflowConfigWorkflowProcessLegacyMode, cqWorkflowConfigAllowLocking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties {\n");
    
    sb.append("    cqWorkflowConfigWorkflowPackagesRootPath: ").append(toIndentedString(cqWorkflowConfigWorkflowPackagesRootPath)).append("\n");
    sb.append("    cqWorkflowConfigWorkflowProcessLegacyMode: ").append(toIndentedString(cqWorkflowConfigWorkflowProcessLegacyMode)).append("\n");
    sb.append("    cqWorkflowConfigAllowLocking: ").append(toIndentedString(cqWorkflowConfigAllowLocking)).append("\n");
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

