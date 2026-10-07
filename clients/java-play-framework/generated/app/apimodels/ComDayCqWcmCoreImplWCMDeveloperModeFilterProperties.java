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
 * ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties   {
  @JsonProperty("wcmdevmodefilter.enabled")
  @Valid

  private ConfigNodePropertyBoolean wcmdevmodefilterEnabled;

  public ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties wcmdevmodefilterEnabled(ConfigNodePropertyBoolean wcmdevmodefilterEnabled) {
    this.wcmdevmodefilterEnabled = wcmdevmodefilterEnabled;
    return this;
  }

   /**
   * Get wcmdevmodefilterEnabled
   * @return wcmdevmodefilterEnabled
  **/
  public ConfigNodePropertyBoolean getWcmdevmodefilterEnabled() {
    return wcmdevmodefilterEnabled;
  }

  public void setWcmdevmodefilterEnabled(ConfigNodePropertyBoolean wcmdevmodefilterEnabled) {
    this.wcmdevmodefilterEnabled = wcmdevmodefilterEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties comDayCqWcmCoreImplWCMDeveloperModeFilterProperties = (ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties) o;
    return Objects.equals(wcmdevmodefilterEnabled, comDayCqWcmCoreImplWCMDeveloperModeFilterProperties.wcmdevmodefilterEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wcmdevmodefilterEnabled);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties {\n");
    
    sb.append("    wcmdevmodefilterEnabled: ").append(toIndentedString(wcmdevmodefilterEnabled)).append("\n");
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

