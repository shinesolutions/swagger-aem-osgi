package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeGraniteContexthubImplContextHubImplProperties   {
  
  private ConfigNodePropertyBoolean comAdobeGraniteContexthubSilentMode = null;
  private ConfigNodePropertyBoolean comAdobeGraniteContexthubShowUi = null;

  /**
   **/
  public ComAdobeGraniteContexthubImplContextHubImplProperties comAdobeGraniteContexthubSilentMode(ConfigNodePropertyBoolean comAdobeGraniteContexthubSilentMode) {
    this.comAdobeGraniteContexthubSilentMode = comAdobeGraniteContexthubSilentMode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.contexthub.silent_mode")
  public ConfigNodePropertyBoolean getComAdobeGraniteContexthubSilentMode() {
    return comAdobeGraniteContexthubSilentMode;
  }
  public void setComAdobeGraniteContexthubSilentMode(ConfigNodePropertyBoolean comAdobeGraniteContexthubSilentMode) {
    this.comAdobeGraniteContexthubSilentMode = comAdobeGraniteContexthubSilentMode;
  }

  /**
   **/
  public ComAdobeGraniteContexthubImplContextHubImplProperties comAdobeGraniteContexthubShowUi(ConfigNodePropertyBoolean comAdobeGraniteContexthubShowUi) {
    this.comAdobeGraniteContexthubShowUi = comAdobeGraniteContexthubShowUi;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.contexthub.show_ui")
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
    return Objects.equals(comAdobeGraniteContexthubSilentMode, comAdobeGraniteContexthubImplContextHubImplProperties.comAdobeGraniteContexthubSilentMode) &&
        Objects.equals(comAdobeGraniteContexthubShowUi, comAdobeGraniteContexthubImplContextHubImplProperties.comAdobeGraniteContexthubShowUi);
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

