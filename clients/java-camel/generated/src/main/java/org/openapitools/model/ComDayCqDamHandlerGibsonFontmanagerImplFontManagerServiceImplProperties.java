package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties
 */

@JsonTypeName("comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties {

  private ConfigNodePropertyString eventFilter;

  private ConfigNodePropertyArray fontmgrSystemFontDir;

  private ConfigNodePropertyString fontmgrAdobeFontDir;

  private ConfigNodePropertyString fontmgrCustomerFontDir;

  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

  /**
   * Get eventFilter
   * @return eventFilter
   */
  @Valid 
  @Schema(name = "event.filter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event.filter")
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties fontmgrSystemFontDir(ConfigNodePropertyArray fontmgrSystemFontDir) {
    this.fontmgrSystemFontDir = fontmgrSystemFontDir;
    return this;
  }

  /**
   * Get fontmgrSystemFontDir
   * @return fontmgrSystemFontDir
   */
  @Valid 
  @Schema(name = "fontmgr.system.font.dir", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fontmgr.system.font.dir")
  public ConfigNodePropertyArray getFontmgrSystemFontDir() {
    return fontmgrSystemFontDir;
  }

  public void setFontmgrSystemFontDir(ConfigNodePropertyArray fontmgrSystemFontDir) {
    this.fontmgrSystemFontDir = fontmgrSystemFontDir;
  }

  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties fontmgrAdobeFontDir(ConfigNodePropertyString fontmgrAdobeFontDir) {
    this.fontmgrAdobeFontDir = fontmgrAdobeFontDir;
    return this;
  }

  /**
   * Get fontmgrAdobeFontDir
   * @return fontmgrAdobeFontDir
   */
  @Valid 
  @Schema(name = "fontmgr.adobe.font.dir", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fontmgr.adobe.font.dir")
  public ConfigNodePropertyString getFontmgrAdobeFontDir() {
    return fontmgrAdobeFontDir;
  }

  public void setFontmgrAdobeFontDir(ConfigNodePropertyString fontmgrAdobeFontDir) {
    this.fontmgrAdobeFontDir = fontmgrAdobeFontDir;
  }

  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties fontmgrCustomerFontDir(ConfigNodePropertyString fontmgrCustomerFontDir) {
    this.fontmgrCustomerFontDir = fontmgrCustomerFontDir;
    return this;
  }

  /**
   * Get fontmgrCustomerFontDir
   * @return fontmgrCustomerFontDir
   */
  @Valid 
  @Schema(name = "fontmgr.customer.font.dir", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

