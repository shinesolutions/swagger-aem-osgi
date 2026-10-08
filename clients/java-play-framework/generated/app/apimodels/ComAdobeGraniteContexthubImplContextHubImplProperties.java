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
 * ComAdobeGraniteContexthubImplContextHubImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteContexthubImplContextHubImplProperties   {
  @JsonProperty("com.adobe.granite.contexthub.silent_mode")
  @Valid

  private ConfigNodePropertyBoolean comAdobeGraniteContexthubSilentMode;

  @JsonProperty("com.adobe.granite.contexthub.show_ui")
  @Valid

  private ConfigNodePropertyBoolean comAdobeGraniteContexthubShowUi;

  public ComAdobeGraniteContexthubImplContextHubImplProperties comAdobeGraniteContexthubSilentMode(ConfigNodePropertyBoolean comAdobeGraniteContexthubSilentMode) {
    this.comAdobeGraniteContexthubSilentMode = comAdobeGraniteContexthubSilentMode;
    return this;
  }

   /**
   * Get comAdobeGraniteContexthubSilentMode
   * @return comAdobeGraniteContexthubSilentMode
  **/
  public ConfigNodePropertyBoolean getComAdobeGraniteContexthubSilentMode() {
    return comAdobeGraniteContexthubSilentMode;
  }

  public void setComAdobeGraniteContexthubSilentMode(ConfigNodePropertyBoolean comAdobeGraniteContexthubSilentMode) {
    this.comAdobeGraniteContexthubSilentMode = comAdobeGraniteContexthubSilentMode;
  }

  public ComAdobeGraniteContexthubImplContextHubImplProperties comAdobeGraniteContexthubShowUi(ConfigNodePropertyBoolean comAdobeGraniteContexthubShowUi) {
    this.comAdobeGraniteContexthubShowUi = comAdobeGraniteContexthubShowUi;
    return this;
  }

   /**
   * Get comAdobeGraniteContexthubShowUi
   * @return comAdobeGraniteContexthubShowUi
  **/
  public ConfigNodePropertyBoolean getComAdobeGraniteContexthubShowUi() {
    return comAdobeGraniteContexthubShowUi;
  }

  public void setComAdobeGraniteContexthubShowUi(ConfigNodePropertyBoolean comAdobeGraniteContexthubShowUi) {
    this.comAdobeGraniteContexthubShowUi = comAdobeGraniteContexthubShowUi;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteContexthubImplContextHubImplProperties comAdobeGraniteContexthubImplContextHubImplProperties = (ComAdobeGraniteContexthubImplContextHubImplProperties) o;
    return Objects.equals(comAdobeGraniteContexthubSilentMode, comAdobeGraniteContexthubImplContextHubImplProperties.comAdobeGraniteContexthubSilentMode) &&
        Objects.equals(comAdobeGraniteContexthubShowUi, comAdobeGraniteContexthubImplContextHubImplProperties.comAdobeGraniteContexthubShowUi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comAdobeGraniteContexthubSilentMode, comAdobeGraniteContexthubShowUi);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteContexthubImplContextHubImplProperties {\n");
    
    sb.append("    comAdobeGraniteContexthubSilentMode: ").append(toIndentedString(comAdobeGraniteContexthubSilentMode)).append("\n");
    sb.append("    comAdobeGraniteContexthubShowUi: ").append(toIndentedString(comAdobeGraniteContexthubShowUi)).append("\n");
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

