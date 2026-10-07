package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties {

  private ConfigNodePropertyString jmxObjectname;

  private ConfigNodePropertyBoolean active;

  public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties jmxObjectname(ConfigNodePropertyString jmxObjectname) {
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
  public ConfigNodePropertyString getJmxObjectname() {
    return jmxObjectname;
  }

  public void setJmxObjectname(ConfigNodePropertyString jmxObjectname) {
    this.jmxObjectname = jmxObjectname;
  }

  public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties active(ConfigNodePropertyBoolean active) {
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
  public ConfigNodePropertyBoolean getActive() {
    return active;
  }

  public void setActive(ConfigNodePropertyBoolean active) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

