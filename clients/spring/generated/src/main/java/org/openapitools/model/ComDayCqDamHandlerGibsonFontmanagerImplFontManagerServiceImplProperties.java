package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString eventFilter;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray fontmgrSystemFontDir;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString fontmgrAdobeFontDir;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString fontmgrCustomerFontDir;

  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties eventFilter(@Nullable ConfigNodePropertyString eventFilter) {
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
  public @Nullable ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  @JsonProperty("event.filter")
  public void setEventFilter(@Nullable ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties fontmgrSystemFontDir(@Nullable ConfigNodePropertyArray fontmgrSystemFontDir) {
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
  public @Nullable ConfigNodePropertyArray getFontmgrSystemFontDir() {
    return fontmgrSystemFontDir;
  }

  @JsonProperty("fontmgr.system.font.dir")
  public void setFontmgrSystemFontDir(@Nullable ConfigNodePropertyArray fontmgrSystemFontDir) {
    this.fontmgrSystemFontDir = fontmgrSystemFontDir;
  }

  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties fontmgrAdobeFontDir(@Nullable ConfigNodePropertyString fontmgrAdobeFontDir) {
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
  public @Nullable ConfigNodePropertyString getFontmgrAdobeFontDir() {
    return fontmgrAdobeFontDir;
  }

  @JsonProperty("fontmgr.adobe.font.dir")
  public void setFontmgrAdobeFontDir(@Nullable ConfigNodePropertyString fontmgrAdobeFontDir) {
    this.fontmgrAdobeFontDir = fontmgrAdobeFontDir;
  }

  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties fontmgrCustomerFontDir(@Nullable ConfigNodePropertyString fontmgrCustomerFontDir) {
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
  public @Nullable ConfigNodePropertyString getFontmgrCustomerFontDir() {
    return fontmgrCustomerFontDir;
  }

  @JsonProperty("fontmgr.customer.font.dir")
  public void setFontmgrCustomerFontDir(@Nullable ConfigNodePropertyString fontmgrCustomerFontDir) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

