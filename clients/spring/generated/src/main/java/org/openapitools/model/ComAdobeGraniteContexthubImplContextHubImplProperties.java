package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeGraniteContexthubImplContextHubImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeGraniteContexthubImplContextHubImplProperties   {
  @JsonProperty("com.adobe.granite.contexthub.silent_mode")
  private ConfigNodePropertyBoolean comAdobeGraniteContexthubSilentMode = null;

  @JsonProperty("com.adobe.granite.contexthub.show_ui")
  private ConfigNodePropertyBoolean comAdobeGraniteContexthubShowUi = null;

  public ComAdobeGraniteContexthubImplContextHubImplProperties comAdobeGraniteContexthubSilentMode(ConfigNodePropertyBoolean comAdobeGraniteContexthubSilentMode) {
    this.comAdobeGraniteContexthubSilentMode = comAdobeGraniteContexthubSilentMode;
    return this;
  }

  /**
   * Get comAdobeGraniteContexthubSilentMode
   * @return comAdobeGraniteContexthubSilentMode
  **/
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getComAdobeGraniteContexthubShowUi() {
    return comAdobeGraniteContexthubShowUi;
  }

  public void setComAdobeGraniteContexthubShowUi(ConfigNodePropertyBoolean comAdobeGraniteContexthubShowUi) {
    this.comAdobeGraniteContexthubShowUi = comAdobeGraniteContexthubShowUi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteContexthubImplContextHubImplProperties comAdobeGraniteContexthubImplContextHubImplProperties = (ComAdobeGraniteContexthubImplContextHubImplProperties) o;
    return Objects.equals(this.comAdobeGraniteContexthubSilentMode, comAdobeGraniteContexthubImplContextHubImplProperties.comAdobeGraniteContexthubSilentMode) &&
        Objects.equals(this.comAdobeGraniteContexthubShowUi, comAdobeGraniteContexthubImplContextHubImplProperties.comAdobeGraniteContexthubShowUi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comAdobeGraniteContexthubSilentMode, comAdobeGraniteContexthubShowUi);
  }

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

