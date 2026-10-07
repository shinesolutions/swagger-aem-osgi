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
 * ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties
 */

@JsonTypeName("comDayCqDamScene7ImplScene7DamChangeEventListenerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cqDamScene7DamchangeeventlistenerEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cqDamScene7DamchangeeventlistenerObservedPaths;

  public ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties cqDamScene7DamchangeeventlistenerEnabled(@Nullable ConfigNodePropertyBoolean cqDamScene7DamchangeeventlistenerEnabled) {
    this.cqDamScene7DamchangeeventlistenerEnabled = cqDamScene7DamchangeeventlistenerEnabled;
    return this;
  }

  /**
   * Get cqDamScene7DamchangeeventlistenerEnabled
   * @return cqDamScene7DamchangeeventlistenerEnabled
   */
  @Valid 
  @Schema(name = "cq.dam.scene7.damchangeeventlistener.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.scene7.damchangeeventlistener.enabled")
  public @Nullable ConfigNodePropertyBoolean getCqDamScene7DamchangeeventlistenerEnabled() {
    return cqDamScene7DamchangeeventlistenerEnabled;
  }

  @JsonProperty("cq.dam.scene7.damchangeeventlistener.enabled")
  public void setCqDamScene7DamchangeeventlistenerEnabled(@Nullable ConfigNodePropertyBoolean cqDamScene7DamchangeeventlistenerEnabled) {
    this.cqDamScene7DamchangeeventlistenerEnabled = cqDamScene7DamchangeeventlistenerEnabled;
  }

  public ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties cqDamScene7DamchangeeventlistenerObservedPaths(@Nullable ConfigNodePropertyArray cqDamScene7DamchangeeventlistenerObservedPaths) {
    this.cqDamScene7DamchangeeventlistenerObservedPaths = cqDamScene7DamchangeeventlistenerObservedPaths;
    return this;
  }

  /**
   * Get cqDamScene7DamchangeeventlistenerObservedPaths
   * @return cqDamScene7DamchangeeventlistenerObservedPaths
   */
  @Valid 
  @Schema(name = "cq.dam.scene7.damchangeeventlistener.observed.paths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.scene7.damchangeeventlistener.observed.paths")
  public @Nullable ConfigNodePropertyArray getCqDamScene7DamchangeeventlistenerObservedPaths() {
    return cqDamScene7DamchangeeventlistenerObservedPaths;
  }

  @JsonProperty("cq.dam.scene7.damchangeeventlistener.observed.paths")
  public void setCqDamScene7DamchangeeventlistenerObservedPaths(@Nullable ConfigNodePropertyArray cqDamScene7DamchangeeventlistenerObservedPaths) {
    this.cqDamScene7DamchangeeventlistenerObservedPaths = cqDamScene7DamchangeeventlistenerObservedPaths;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties comDayCqDamScene7ImplScene7DamChangeEventListenerProperties = (ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties) o;
    return Objects.equals(this.cqDamScene7DamchangeeventlistenerEnabled, comDayCqDamScene7ImplScene7DamChangeEventListenerProperties.cqDamScene7DamchangeeventlistenerEnabled) &&
        Objects.equals(this.cqDamScene7DamchangeeventlistenerObservedPaths, comDayCqDamScene7ImplScene7DamChangeEventListenerProperties.cqDamScene7DamchangeeventlistenerObservedPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamScene7DamchangeeventlistenerEnabled, cqDamScene7DamchangeeventlistenerObservedPaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties {\n");
    sb.append("    cqDamScene7DamchangeeventlistenerEnabled: ").append(toIndentedString(cqDamScene7DamchangeeventlistenerEnabled)).append("\n");
    sb.append("    cqDamScene7DamchangeeventlistenerObservedPaths: ").append(toIndentedString(cqDamScene7DamchangeeventlistenerObservedPaths)).append("\n");
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

