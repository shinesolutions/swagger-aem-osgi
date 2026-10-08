package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties
 */

@JsonTypeName("comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger serviceRanking;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString tagpattern;

  public ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties serviceRanking(@Nullable ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  /**
   * Get serviceRanking
   * @return serviceRanking
   */
  @Valid 
  @Schema(name = "service.ranking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service.ranking")
  public @Nullable ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  @JsonProperty("service.ranking")
  public void setServiceRanking(@Nullable ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties tagpattern(@Nullable ConfigNodePropertyString tagpattern) {
    this.tagpattern = tagpattern;
    return this;
  }

  /**
   * Get tagpattern
   * @return tagpattern
   */
  @Valid 
  @Schema(name = "tagpattern", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tagpattern")
  public @Nullable ConfigNodePropertyString getTagpattern() {
    return tagpattern;
  }

  @JsonProperty("tagpattern")
  public void setTagpattern(@Nullable ConfigNodePropertyString tagpattern) {
    this.tagpattern = tagpattern;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties = (ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties) o;
    return Objects.equals(this.serviceRanking, comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties.serviceRanking) &&
        Objects.equals(this.tagpattern, comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties.tagpattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, tagpattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties {\n");
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    tagpattern: ").append(toIndentedString(tagpattern)).append("\n");
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

