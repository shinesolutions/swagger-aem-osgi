package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteWorkflowCoreWorkflowConfigProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties   {
  @JsonProperty("cq.workflow.config.workflow.packages.root.path")
  private ConfigNodePropertyArray cqWorkflowConfigWorkflowPackagesRootPath = null;

  @JsonProperty("cq.workflow.config.workflow.process.legacy.mode")
  private ConfigNodePropertyBoolean cqWorkflowConfigWorkflowProcessLegacyMode = null;

  @JsonProperty("cq.workflow.config.allow.locking")
  private ConfigNodePropertyBoolean cqWorkflowConfigAllowLocking = null;

  public ComAdobeGraniteWorkflowCoreWorkflowConfigProperties cqWorkflowConfigWorkflowPackagesRootPath(ConfigNodePropertyArray cqWorkflowConfigWorkflowPackagesRootPath) {
    this.cqWorkflowConfigWorkflowPackagesRootPath = cqWorkflowConfigWorkflowPackagesRootPath;
    return this;
  }

   /**
   * Get cqWorkflowConfigWorkflowPackagesRootPath
   * @return cqWorkflowConfigWorkflowPackagesRootPath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCqWorkflowConfigWorkflowPackagesRootPath() {
    return cqWorkflowConfigWorkflowPackagesRootPath;
  }

  public void setCqWorkflowConfigWorkflowPackagesRootPath(ConfigNodePropertyArray cqWorkflowConfigWorkflowPackagesRootPath) {
    this.cqWorkflowConfigWorkflowPackagesRootPath = cqWorkflowConfigWorkflowPackagesRootPath;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowConfigProperties cqWorkflowConfigWorkflowProcessLegacyMode(ConfigNodePropertyBoolean cqWorkflowConfigWorkflowProcessLegacyMode) {
    this.cqWorkflowConfigWorkflowProcessLegacyMode = cqWorkflowConfigWorkflowProcessLegacyMode;
    return this;
  }

   /**
   * Get cqWorkflowConfigWorkflowProcessLegacyMode
   * @return cqWorkflowConfigWorkflowProcessLegacyMode
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCqWorkflowConfigWorkflowProcessLegacyMode() {
    return cqWorkflowConfigWorkflowProcessLegacyMode;
  }

  public void setCqWorkflowConfigWorkflowProcessLegacyMode(ConfigNodePropertyBoolean cqWorkflowConfigWorkflowProcessLegacyMode) {
    this.cqWorkflowConfigWorkflowProcessLegacyMode = cqWorkflowConfigWorkflowProcessLegacyMode;
  }

  public ComAdobeGraniteWorkflowCoreWorkflowConfigProperties cqWorkflowConfigAllowLocking(ConfigNodePropertyBoolean cqWorkflowConfigAllowLocking) {
    this.cqWorkflowConfigAllowLocking = cqWorkflowConfigAllowLocking;
    return this;
  }

   /**
   * Get cqWorkflowConfigAllowLocking
   * @return cqWorkflowConfigAllowLocking
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCqWorkflowConfigAllowLocking() {
    return cqWorkflowConfigAllowLocking;
  }

  public void setCqWorkflowConfigAllowLocking(ConfigNodePropertyBoolean cqWorkflowConfigAllowLocking) {
    this.cqWorkflowConfigAllowLocking = cqWorkflowConfigAllowLocking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

