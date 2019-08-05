package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;

/**
 * AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
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
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.fontList, adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties.fontList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fontList);
  }

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

