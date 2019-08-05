package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties   {
  

  private ConfigNodePropertyString eventFilter = null;

  private ConfigNodePropertyArray fontmgrSystemFontDir = null;

  private ConfigNodePropertyString fontmgrAdobeFontDir = null;

  private ConfigNodePropertyString fontmgrCustomerFontDir = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("event.filter")
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }
  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fontmgr.system.font.dir")
  public ConfigNodePropertyArray getFontmgrSystemFontDir() {
    return fontmgrSystemFontDir;
  }
  public void setFontmgrSystemFontDir(ConfigNodePropertyArray fontmgrSystemFontDir) {
    this.fontmgrSystemFontDir = fontmgrSystemFontDir;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fontmgr.adobe.font.dir")
  public ConfigNodePropertyString getFontmgrAdobeFontDir() {
    return fontmgrAdobeFontDir;
  }
  public void setFontmgrAdobeFontDir(ConfigNodePropertyString fontmgrAdobeFontDir) {
    this.fontmgrAdobeFontDir = fontmgrAdobeFontDir;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fontmgr.customer.font.dir")
  public ConfigNodePropertyString getFontmgrCustomerFontDir() {
    return fontmgrCustomerFontDir;
  }
  public void setFontmgrCustomerFontDir(ConfigNodePropertyString fontmgrCustomerFontDir) {
    this.fontmgrCustomerFontDir = fontmgrCustomerFontDir;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties = (ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties) o;
    return Objects.equals(eventFilter, comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.eventFilter) &&
        Objects.equals(fontmgrSystemFontDir, comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.fontmgrSystemFontDir) &&
        Objects.equals(fontmgrAdobeFontDir, comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.fontmgrAdobeFontDir) &&
        Objects.equals(fontmgrCustomerFontDir, comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.fontmgrCustomerFontDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventFilter, fontmgrSystemFontDir, fontmgrAdobeFontDir, fontmgrCustomerFontDir);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties {\n");
    
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
    sb.append("    fontmgrSystemFontDir: ").append(toIndentedString(fontmgrSystemFontDir)).append("\n");
    sb.append("    fontmgrAdobeFontDir: ").append(toIndentedString(fontmgrAdobeFontDir)).append("\n");
    sb.append("    fontmgrCustomerFontDir: ").append(toIndentedString(fontmgrCustomerFontDir)).append("\n");
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

