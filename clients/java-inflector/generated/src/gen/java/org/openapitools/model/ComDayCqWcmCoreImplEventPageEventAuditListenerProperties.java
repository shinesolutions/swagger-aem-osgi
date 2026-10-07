package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplEventPageEventAuditListenerProperties   {
  @JsonProperty("configured")
  private ConfigNodePropertyString configured;

  /**
   **/
  public ComDayCqWcmCoreImplEventPageEventAuditListenerProperties configured(ConfigNodePropertyString configured) {
    this.configured = configured;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("configured")
  public ConfigNodePropertyString getConfigured() {
    return configured;
  }
  public void setConfigured(ConfigNodePropertyString configured) {
    this.configured = configured;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplEventPageEventAuditListenerProperties comDayCqWcmCoreImplEventPageEventAuditListenerProperties = (ComDayCqWcmCoreImplEventPageEventAuditListenerProperties) o;
    return Objects.equals(configured, comDayCqWcmCoreImplEventPageEventAuditListenerProperties.configured);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configured);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplEventPageEventAuditListenerProperties {\n");
    
    sb.append("    configured: ").append(toIndentedString(configured)).append("\n");
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

