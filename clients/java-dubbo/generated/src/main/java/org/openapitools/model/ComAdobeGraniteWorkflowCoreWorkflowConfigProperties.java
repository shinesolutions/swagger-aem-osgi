package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cq.workflow.config.workflow.packages.root.path")
  private ConfigNodePropertyArray cqWorkflowConfigWorkflowPackagesRootPath;

  @JsonProperty("cq.workflow.config.workflow.process.legacy.mode")
  private ConfigNodePropertyBoolean cqWorkflowConfigWorkflowProcessLegacyMode;

  @JsonProperty("cq.workflow.config.allow.locking")
  private ConfigNodePropertyBoolean cqWorkflowConfigAllowLocking;

  /**
   * 
   * @return cqWorkflowConfigWorkflowPackagesRootPath
   */
  public ConfigNodePropertyArray getCqWorkflowConfigWorkflowPackagesRootPath() {
    return cqWorkflowConfigWorkflowPackagesRootPath;
  }

  public void setCqWorkflowConfigWorkflowPackagesRootPath(ConfigNodePropertyArray cqWorkflowConfigWorkflowPackagesRootPath) {
    this.cqWorkflowConfigWorkflowPackagesRootPath = cqWorkflowConfigWorkflowPackagesRootPath;
  }

  /**
   * 
   * @return cqWorkflowConfigWorkflowProcessLegacyMode
   */
  public ConfigNodePropertyBoolean getCqWorkflowConfigWorkflowProcessLegacyMode() {
    return cqWorkflowConfigWorkflowProcessLegacyMode;
  }

  public void setCqWorkflowConfigWorkflowProcessLegacyMode(ConfigNodePropertyBoolean cqWorkflowConfigWorkflowProcessLegacyMode) {
    this.cqWorkflowConfigWorkflowProcessLegacyMode = cqWorkflowConfigWorkflowProcessLegacyMode;
  }

  /**
   * 
   * @return cqWorkflowConfigAllowLocking
   */
  public ConfigNodePropertyBoolean getCqWorkflowConfigAllowLocking() {
    return cqWorkflowConfigAllowLocking;
  }

  public void setCqWorkflowConfigAllowLocking(ConfigNodePropertyBoolean cqWorkflowConfigAllowLocking) {
    this.cqWorkflowConfigAllowLocking = cqWorkflowConfigAllowLocking;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
