package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties   {
  @JsonProperty("fontList")
  @Valid

  private ConfigNodePropertyArray fontList;

  public AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties fontList(ConfigNodePropertyArray fontList) {
    this.fontList = fontList;
    return this;
  }

   /**
   * Get fontList
   * @return fontList
  **/
  public ConfigNodePropertyArray getFontList() {
    return fontList;
  }

  public void setFontList(ConfigNodePropertyArray fontList) {
    this.fontList = fontList;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

