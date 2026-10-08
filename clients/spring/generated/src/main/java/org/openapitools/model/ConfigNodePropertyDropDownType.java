package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConfigNodePropertyDropDownType
 */

@JsonTypeName("configNodePropertyDropDown_type")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConfigNodePropertyDropDownType {

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Object> labels = JsonNullable.<Object>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Object> values = JsonNullable.<Object>undefined();

  public ConfigNodePropertyDropDownType labels(Object labels) {
    this.labels = JsonNullable.of(labels);
    return this;
  }

  /**
   * Drop Down label
   * @return labels
   */
  
  @Schema(name = "labels", description = "Drop Down label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("labels")
  public JsonNullable<Object> getLabels() {
    return labels;
  }

  public void setLabels(JsonNullable<Object> labels) {
    this.labels = labels;
  }

  public ConfigNodePropertyDropDownType values(Object values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  /**
   * Drown Down value
   * @return values
   */
  
  @Schema(name = "values", description = "Drown Down value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("values")
  public JsonNullable<Object> getValues() {
    return values;
  }

  public void setValues(JsonNullable<Object> values) {
    this.values = values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigNodePropertyDropDownType configNodePropertyDropDownType = (ConfigNodePropertyDropDownType) o;
    return equalsNullable(this.labels, configNodePropertyDropDownType.labels) &&
        equalsNullable(this.values, configNodePropertyDropDownType.values);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(labels), hashCodeNullable(values));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigNodePropertyDropDownType {\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

