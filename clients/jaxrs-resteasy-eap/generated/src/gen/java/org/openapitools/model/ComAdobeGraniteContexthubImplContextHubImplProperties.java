package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeGraniteContexthubImplContextHubImplProperties   {
  

  private ConfigNodePropertyBoolean comAdobeGraniteContexthubSilentMode = null;

  private ConfigNodePropertyBoolean comAdobeGraniteContexthubShowUi = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.contexthub.show_ui")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

