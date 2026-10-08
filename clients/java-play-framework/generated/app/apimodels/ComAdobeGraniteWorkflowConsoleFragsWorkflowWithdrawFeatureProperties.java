package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties   {
  @JsonProperty("enabled")
  @Valid

  private ConfigNodePropertyBoolean enabled;

  public ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties = (ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties) o;
    return Objects.equals(enabled, comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

