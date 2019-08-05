package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties   {
  
  private ConfigNodePropertyArray cqWorkflowConfigWorkflowPackagesRootPath = null;
  private ConfigNodePropertyBoolean cqWorkflowConfigWorkflowProcessLegacyMode = null;
  private ConfigNodePropertyBoolean cqWorkflowConfigAllowLocking = null;

  /**
   **/
  public ComAdobeGraniteWorkflowCoreWorkflowConfigProperties cqWorkflowConfigWorkflowPackagesRootPath(ConfigNodePropertyArray cqWorkflowConfigWorkflowPackagesRootPath) {
    this.cqWorkflowConfigWorkflowPackagesRootPath = cqWorkflowConfigWorkflowPackagesRootPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.workflow.config.workflow.packages.root.path")
  public ConfigNodePropertyArray getCqWorkflowConfigWorkflowPackagesRootPath() {
    return cqWorkflowConfigWorkflowPackagesRootPath;
  }
  public void setCqWorkflowConfigWorkflowPackagesRootPath(ConfigNodePropertyArray cqWorkflowConfigWorkflowPackagesRootPath) {
    this.cqWorkflowConfigWorkflowPackagesRootPath = cqWorkflowConfigWorkflowPackagesRootPath;
  }

  /**
   **/
  public ComAdobeGraniteWorkflowCoreWorkflowConfigProperties cqWorkflowConfigWorkflowProcessLegacyMode(ConfigNodePropertyBoolean cqWorkflowConfigWorkflowProcessLegacyMode) {
    this.cqWorkflowConfigWorkflowProcessLegacyMode = cqWorkflowConfigWorkflowProcessLegacyMode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.workflow.config.workflow.process.legacy.mode")
  public ConfigNodePropertyBoolean getCqWorkflowConfigWorkflowProcessLegacyMode() {
    return cqWorkflowConfigWorkflowProcessLegacyMode;
  }
  public void setCqWorkflowConfigWorkflowProcessLegacyMode(ConfigNodePropertyBoolean cqWorkflowConfigWorkflowProcessLegacyMode) {
    this.cqWorkflowConfigWorkflowProcessLegacyMode = cqWorkflowConfigWorkflowProcessLegacyMode;
  }

  /**
   **/
  public ComAdobeGraniteWorkflowCoreWorkflowConfigProperties cqWorkflowConfigAllowLocking(ConfigNodePropertyBoolean cqWorkflowConfigAllowLocking) {
    this.cqWorkflowConfigAllowLocking = cqWorkflowConfigAllowLocking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.workflow.config.allow.locking")
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
    return Objects.equals(cqWorkflowConfigWorkflowPackagesRootPath, comAdobeGraniteWorkflowCoreWorkflowConfigProperties.cqWorkflowConfigWorkflowPackagesRootPath) &&
        Objects.equals(cqWorkflowConfigWorkflowProcessLegacyMode, comAdobeGraniteWorkflowCoreWorkflowConfigProperties.cqWorkflowConfigWorkflowProcessLegacyMode) &&
        Objects.equals(cqWorkflowConfigAllowLocking, comAdobeGraniteWorkflowCoreWorkflowConfigProperties.cqWorkflowConfigAllowLocking);
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

