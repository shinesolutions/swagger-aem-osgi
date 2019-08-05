package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreImplServletGuidLookupFilterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplServletGuidLookupFilterProperties   {
  @JsonProperty("cq.dam.core.guidlookupfilter.enabled")
  private ConfigNodePropertyBoolean cqDamCoreGuidlookupfilterEnabled = null;

  public ComDayCqDamCoreImplServletGuidLookupFilterProperties cqDamCoreGuidlookupfilterEnabled(ConfigNodePropertyBoolean cqDamCoreGuidlookupfilterEnabled) {
    this.cqDamCoreGuidlookupfilterEnabled = cqDamCoreGuidlookupfilterEnabled;
    return this;
  }

   /**
   * Get cqDamCoreGuidlookupfilterEnabled
   * @return cqDamCoreGuidlookupfilterEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getCqDamCoreGuidlookupfilterEnabled() {
    return cqDamCoreGuidlookupfilterEnabled;
  }

  public void setCqDamCoreGuidlookupfilterEnabled(ConfigNodePropertyBoolean cqDamCoreGuidlookupfilterEnabled) {
    this.cqDamCoreGuidlookupfilterEnabled = cqDamCoreGuidlookupfilterEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletGuidLookupFilterProperties comDayCqDamCoreImplServletGuidLookupFilterProperties = (ComDayCqDamCoreImplServletGuidLookupFilterProperties) o;
    return Objects.equals(cqDamCoreGuidlookupfilterEnabled, comDayCqDamCoreImplServletGuidLookupFilterProperties.cqDamCoreGuidlookupfilterEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamCoreGuidlookupfilterEnabled);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletGuidLookupFilterProperties {\n");
    
    sb.append("    cqDamCoreGuidlookupfilterEnabled: ").append(toIndentedString(cqDamCoreGuidlookupfilterEnabled)).append("\n");
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

