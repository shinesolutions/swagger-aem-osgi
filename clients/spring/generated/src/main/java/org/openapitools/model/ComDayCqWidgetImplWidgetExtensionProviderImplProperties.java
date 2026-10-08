package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWidgetImplWidgetExtensionProviderImplProperties
 */

@JsonTypeName("comDayCqWidgetImplWidgetExtensionProviderImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWidgetImplWidgetExtensionProviderImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray extendableWidgets;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean widgetextensionproviderDebug;

  public ComDayCqWidgetImplWidgetExtensionProviderImplProperties extendableWidgets(@Nullable ConfigNodePropertyArray extendableWidgets) {
    this.extendableWidgets = extendableWidgets;
    return this;
  }

  /**
   * Get extendableWidgets
   * @return extendableWidgets
   */
  @Valid 
  @Schema(name = "extendable.widgets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extendable.widgets")
  public @Nullable ConfigNodePropertyArray getExtendableWidgets() {
    return extendableWidgets;
  }

  @JsonProperty("extendable.widgets")
  public void setExtendableWidgets(@Nullable ConfigNodePropertyArray extendableWidgets) {
    this.extendableWidgets = extendableWidgets;
  }

  public ComDayCqWidgetImplWidgetExtensionProviderImplProperties widgetextensionproviderDebug(@Nullable ConfigNodePropertyBoolean widgetextensionproviderDebug) {
    this.widgetextensionproviderDebug = widgetextensionproviderDebug;
    return this;
  }

  /**
   * Get widgetextensionproviderDebug
   * @return widgetextensionproviderDebug
   */
  @Valid 
  @Schema(name = "widgetextensionprovider.debug", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("widgetextensionprovider.debug")
  public @Nullable ConfigNodePropertyBoolean getWidgetextensionproviderDebug() {
    return widgetextensionproviderDebug;
  }

  @JsonProperty("widgetextensionprovider.debug")
  public void setWidgetextensionproviderDebug(@Nullable ConfigNodePropertyBoolean widgetextensionproviderDebug) {
    this.widgetextensionproviderDebug = widgetextensionproviderDebug;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWidgetImplWidgetExtensionProviderImplProperties comDayCqWidgetImplWidgetExtensionProviderImplProperties = (ComDayCqWidgetImplWidgetExtensionProviderImplProperties) o;
    return Objects.equals(this.extendableWidgets, comDayCqWidgetImplWidgetExtensionProviderImplProperties.extendableWidgets) &&
        Objects.equals(this.widgetextensionproviderDebug, comDayCqWidgetImplWidgetExtensionProviderImplProperties.widgetextensionproviderDebug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendableWidgets, widgetextensionproviderDebug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWidgetImplWidgetExtensionProviderImplProperties {\n");
    sb.append("    extendableWidgets: ").append(toIndentedString(extendableWidgets)).append("\n");
    sb.append("    widgetextensionproviderDebug: ").append(toIndentedString(widgetextensionproviderDebug)).append("\n");
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

