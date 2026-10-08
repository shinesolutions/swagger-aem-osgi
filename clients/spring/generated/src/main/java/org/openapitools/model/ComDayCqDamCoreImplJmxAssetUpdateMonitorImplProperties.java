package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties
 */

@JsonTypeName("comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jmxObjectname;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean active;

  public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties jmxObjectname(@Nullable ConfigNodePropertyString jmxObjectname) {
    this.jmxObjectname = jmxObjectname;
    return this;
  }

  /**
   * Get jmxObjectname
   * @return jmxObjectname
   */
  @Valid 
  @Schema(name = "jmx.objectname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jmx.objectname")
  public @Nullable ConfigNodePropertyString getJmxObjectname() {
    return jmxObjectname;
  }

  @JsonProperty("jmx.objectname")
  public void setJmxObjectname(@Nullable ConfigNodePropertyString jmxObjectname) {
    this.jmxObjectname = jmxObjectname;
  }

  public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties active(@Nullable ConfigNodePropertyBoolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  @Valid 
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable ConfigNodePropertyBoolean getActive() {
    return active;
  }

  @JsonProperty("active")
  public void setActive(@Nullable ConfigNodePropertyBoolean active) {
    this.active = active;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties = (ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties) o;
    return Objects.equals(this.jmxObjectname, comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties.jmxObjectname) &&
        Objects.equals(this.active, comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jmxObjectname, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties {\n");
    sb.append("    jmxObjectname: ").append(toIndentedString(jmxObjectname)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

