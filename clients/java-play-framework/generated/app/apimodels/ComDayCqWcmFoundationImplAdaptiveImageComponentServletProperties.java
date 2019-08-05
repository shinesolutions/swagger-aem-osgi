package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties   {
  @JsonProperty("adapt.supported.widths")
  private ConfigNodePropertyArray adaptSupportedWidths = null;

  public ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties adaptSupportedWidths(ConfigNodePropertyArray adaptSupportedWidths) {
    this.adaptSupportedWidths = adaptSupportedWidths;
    return this;
  }

   /**
   * Get adaptSupportedWidths
   * @return adaptSupportedWidths
  **/
  @Valid
  public ConfigNodePropertyArray getAdaptSupportedWidths() {
    return adaptSupportedWidths;
  }

  public void setAdaptSupportedWidths(ConfigNodePropertyArray adaptSupportedWidths) {
    this.adaptSupportedWidths = adaptSupportedWidths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties = (ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties) o;
    return Objects.equals(adaptSupportedWidths, comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties.adaptSupportedWidths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adaptSupportedWidths);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties {\n");
    
    sb.append("    adaptSupportedWidths: ").append(toIndentedString(adaptSupportedWidths)).append("\n");
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

