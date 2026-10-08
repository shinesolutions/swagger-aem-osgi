package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties   {
  private ConfigNodePropertyString eventFilter;
  private ConfigNodePropertyArray fontmgrSystemFontDir;
  private ConfigNodePropertyString fontmgrAdobeFontDir;
  private ConfigNodePropertyString fontmgrCustomerFontDir;

  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties() {
  }

  /**
   **/
  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("event.filter")
  @Valid public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  @JsonProperty("event.filter")
  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  /**
   **/
  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties fontmgrSystemFontDir(ConfigNodePropertyArray fontmgrSystemFontDir) {
    this.fontmgrSystemFontDir = fontmgrSystemFontDir;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fontmgr.system.font.dir")
  @Valid public ConfigNodePropertyArray getFontmgrSystemFontDir() {
    return fontmgrSystemFontDir;
  }

  @JsonProperty("fontmgr.system.font.dir")
  public void setFontmgrSystemFontDir(ConfigNodePropertyArray fontmgrSystemFontDir) {
    this.fontmgrSystemFontDir = fontmgrSystemFontDir;
  }

  /**
   **/
  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties fontmgrAdobeFontDir(ConfigNodePropertyString fontmgrAdobeFontDir) {
    this.fontmgrAdobeFontDir = fontmgrAdobeFontDir;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fontmgr.adobe.font.dir")
  @Valid public ConfigNodePropertyString getFontmgrAdobeFontDir() {
    return fontmgrAdobeFontDir;
  }

  @JsonProperty("fontmgr.adobe.font.dir")
  public void setFontmgrAdobeFontDir(ConfigNodePropertyString fontmgrAdobeFontDir) {
    this.fontmgrAdobeFontDir = fontmgrAdobeFontDir;
  }

  /**
   **/
  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties fontmgrCustomerFontDir(ConfigNodePropertyString fontmgrCustomerFontDir) {
    this.fontmgrCustomerFontDir = fontmgrCustomerFontDir;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fontmgr.customer.font.dir")
  @Valid public ConfigNodePropertyString getFontmgrCustomerFontDir() {
    return fontmgrCustomerFontDir;
  }

  @JsonProperty("fontmgr.customer.font.dir")
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
    return Objects.equals(this.eventFilter, comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.eventFilter) &&
        Objects.equals(this.fontmgrSystemFontDir, comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.fontmgrSystemFontDir) &&
        Objects.equals(this.fontmgrAdobeFontDir, comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.fontmgrAdobeFontDir) &&
        Objects.equals(this.fontmgrCustomerFontDir, comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.fontmgrCustomerFontDir);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
