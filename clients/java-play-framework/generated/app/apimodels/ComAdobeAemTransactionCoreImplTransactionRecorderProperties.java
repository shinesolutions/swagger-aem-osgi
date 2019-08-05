package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeAemTransactionCoreImplTransactionRecorderProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeAemTransactionCoreImplTransactionRecorderProperties   {
  @JsonProperty("isTransactionRecordingEnabled")
  private ConfigNodePropertyBoolean isTransactionRecordingEnabled = null;

  public ComAdobeAemTransactionCoreImplTransactionRecorderProperties isTransactionRecordingEnabled(ConfigNodePropertyBoolean isTransactionRecordingEnabled) {
    this.isTransactionRecordingEnabled = isTransactionRecordingEnabled;
    return this;
  }

   /**
   * Get isTransactionRecordingEnabled
   * @return isTransactionRecordingEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getIsTransactionRecordingEnabled() {
    return isTransactionRecordingEnabled;
  }

  public void setIsTransactionRecordingEnabled(ConfigNodePropertyBoolean isTransactionRecordingEnabled) {
    this.isTransactionRecordingEnabled = isTransactionRecordingEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeAemTransactionCoreImplTransactionRecorderProperties comAdobeAemTransactionCoreImplTransactionRecorderProperties = (ComAdobeAemTransactionCoreImplTransactionRecorderProperties) o;
    return Objects.equals(isTransactionRecordingEnabled, comAdobeAemTransactionCoreImplTransactionRecorderProperties.isTransactionRecordingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isTransactionRecordingEnabled);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeAemTransactionCoreImplTransactionRecorderProperties {\n");
    
    sb.append("    isTransactionRecordingEnabled: ").append(toIndentedString(isTransactionRecordingEnabled)).append("\n");
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

