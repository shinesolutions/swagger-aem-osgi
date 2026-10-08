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
 * ComDayCqWcmCoreImplEventPageEventAuditListenerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmCoreImplEventPageEventAuditListenerProperties   {
  @JsonProperty("configured")
  @Valid

  private ConfigNodePropertyString configured;

  public ComDayCqWcmCoreImplEventPageEventAuditListenerProperties configured(ConfigNodePropertyString configured) {
    this.configured = configured;
    return this;
  }

   /**
   * Get configured
   * @return configured
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

