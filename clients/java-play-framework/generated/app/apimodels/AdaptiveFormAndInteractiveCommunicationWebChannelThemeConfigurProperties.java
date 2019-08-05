package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties   {
  @JsonProperty("fontList")
  private ConfigNodePropertyArray fontList = null;

  public AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties fontList(ConfigNodePropertyArray fontList) {
    this.fontList = fontList;
    return this;
  }

   /**
   * Get fontList
   * @return fontList
  **/
  @Valid
  public ConfigNodePropertyArray getFontList() {
    return fontList;
  }

  public void setFontList(ConfigNodePropertyArray fontList) {
    this.fontList = fontList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties = (AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties) o;
    return Objects.equals(fontList, adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties.fontList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fontList);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties {\n");
    
    sb.append("    fontList: ").append(toIndentedString(fontList)).append("\n");
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

