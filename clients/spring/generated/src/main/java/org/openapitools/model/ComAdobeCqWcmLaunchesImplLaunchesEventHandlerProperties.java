package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
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
 * ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties
 */

@JsonTypeName("comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString eventFilter;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger launchesEventhandlerThreadpoolMaxsize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown launchesEventhandlerThreadpoolPriority;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean launchesEventhandlerUpdatelastmodification;

  public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties eventFilter(@Nullable ConfigNodePropertyString eventFilter) {
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

  public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties launchesEventhandlerThreadpoolMaxsize(@Nullable ConfigNodePropertyInteger launchesEventhandlerThreadpoolMaxsize) {
    this.launchesEventhandlerThreadpoolMaxsize = launchesEventhandlerThreadpoolMaxsize;
    return this;
  }

  /**
   * Get launchesEventhandlerThreadpoolMaxsize
   * @return launchesEventhandlerThreadpoolMaxsize
   */
  @Valid 
  @Schema(name = "launches.eventhandler.threadpool.maxsize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("launches.eventhandler.threadpool.maxsize")
  public @Nullable ConfigNodePropertyInteger getLaunchesEventhandlerThreadpoolMaxsize() {
    return launchesEventhandlerThreadpoolMaxsize;
  }

  @JsonProperty("launches.eventhandler.threadpool.maxsize")
  public void setLaunchesEventhandlerThreadpoolMaxsize(@Nullable ConfigNodePropertyInteger launchesEventhandlerThreadpoolMaxsize) {
    this.launchesEventhandlerThreadpoolMaxsize = launchesEventhandlerThreadpoolMaxsize;
  }

  public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties launchesEventhandlerThreadpoolPriority(@Nullable ConfigNodePropertyDropDown launchesEventhandlerThreadpoolPriority) {
    this.launchesEventhandlerThreadpoolPriority = launchesEventhandlerThreadpoolPriority;
    return this;
  }

  /**
   * Get launchesEventhandlerThreadpoolPriority
   * @return launchesEventhandlerThreadpoolPriority
   */
  @Valid 
  @Schema(name = "launches.eventhandler.threadpool.priority", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("launches.eventhandler.threadpool.priority")
  public @Nullable ConfigNodePropertyDropDown getLaunchesEventhandlerThreadpoolPriority() {
    return launchesEventhandlerThreadpoolPriority;
  }

  @JsonProperty("launches.eventhandler.threadpool.priority")
  public void setLaunchesEventhandlerThreadpoolPriority(@Nullable ConfigNodePropertyDropDown launchesEventhandlerThreadpoolPriority) {
    this.launchesEventhandlerThreadpoolPriority = launchesEventhandlerThreadpoolPriority;
  }

  public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties launchesEventhandlerUpdatelastmodification(@Nullable ConfigNodePropertyBoolean launchesEventhandlerUpdatelastmodification) {
    this.launchesEventhandlerUpdatelastmodification = launchesEventhandlerUpdatelastmodification;
    return this;
  }

  /**
   * Get launchesEventhandlerUpdatelastmodification
   * @return launchesEventhandlerUpdatelastmodification
   */
  @Valid 
  @Schema(name = "launches.eventhandler.updatelastmodification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("launches.eventhandler.updatelastmodification")
  public @Nullable ConfigNodePropertyBoolean getLaunchesEventhandlerUpdatelastmodification() {
    return launchesEventhandlerUpdatelastmodification;
  }

  @JsonProperty("launches.eventhandler.updatelastmodification")
  public void setLaunchesEventhandlerUpdatelastmodification(@Nullable ConfigNodePropertyBoolean launchesEventhandlerUpdatelastmodification) {
    this.launchesEventhandlerUpdatelastmodification = launchesEventhandlerUpdatelastmodification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties = (ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties) o;
    return Objects.equals(this.eventFilter, comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.eventFilter) &&
        Objects.equals(this.launchesEventhandlerThreadpoolMaxsize, comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.launchesEventhandlerThreadpoolMaxsize) &&
        Objects.equals(this.launchesEventhandlerThreadpoolPriority, comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.launchesEventhandlerThreadpoolPriority) &&
        Objects.equals(this.launchesEventhandlerUpdatelastmodification, comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.launchesEventhandlerUpdatelastmodification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventFilter, launchesEventhandlerThreadpoolMaxsize, launchesEventhandlerThreadpoolPriority, launchesEventhandlerUpdatelastmodification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties {\n");
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
    sb.append("    launchesEventhandlerThreadpoolMaxsize: ").append(toIndentedString(launchesEventhandlerThreadpoolMaxsize)).append("\n");
    sb.append("    launchesEventhandlerThreadpoolPriority: ").append(toIndentedString(launchesEventhandlerThreadpoolPriority)).append("\n");
    sb.append("    launchesEventhandlerUpdatelastmodification: ").append(toIndentedString(launchesEventhandlerUpdatelastmodification)).append("\n");
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

