package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWcmMsmImplServletsAuditLogServletProperties
 */

@JsonTypeName("comDayCqWcmMsmImplServletsAuditLogServletProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmMsmImplServletsAuditLogServletProperties {

  private ConfigNodePropertyInteger auditlogservletDefaultEventsCount;

  private ConfigNodePropertyString auditlogservletDefaultPath;

  public ComDayCqWcmMsmImplServletsAuditLogServletProperties auditlogservletDefaultEventsCount(ConfigNodePropertyInteger auditlogservletDefaultEventsCount) {
    this.auditlogservletDefaultEventsCount = auditlogservletDefaultEventsCount;
    return this;
  }

  /**
   * Get auditlogservletDefaultEventsCount
   * @return auditlogservletDefaultEventsCount
   */
  @Valid 
  @Schema(name = "auditlogservlet.default.events.count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditlogservlet.default.events.count")
  public ConfigNodePropertyInteger getAuditlogservletDefaultEventsCount() {
    return auditlogservletDefaultEventsCount;
  }

  public void setAuditlogservletDefaultEventsCount(ConfigNodePropertyInteger auditlogservletDefaultEventsCount) {
    this.auditlogservletDefaultEventsCount = auditlogservletDefaultEventsCount;
  }

  public ComDayCqWcmMsmImplServletsAuditLogServletProperties auditlogservletDefaultPath(ConfigNodePropertyString auditlogservletDefaultPath) {
    this.auditlogservletDefaultPath = auditlogservletDefaultPath;
    return this;
  }

  /**
   * Get auditlogservletDefaultPath
   * @return auditlogservletDefaultPath
   */
  @Valid 
  @Schema(name = "auditlogservlet.default.path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditlogservlet.default.path")
  public ConfigNodePropertyString getAuditlogservletDefaultPath() {
    return auditlogservletDefaultPath;
  }

  public void setAuditlogservletDefaultPath(ConfigNodePropertyString auditlogservletDefaultPath) {
    this.auditlogservletDefaultPath = auditlogservletDefaultPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmMsmImplServletsAuditLogServletProperties comDayCqWcmMsmImplServletsAuditLogServletProperties = (ComDayCqWcmMsmImplServletsAuditLogServletProperties) o;
    return Objects.equals(this.auditlogservletDefaultEventsCount, comDayCqWcmMsmImplServletsAuditLogServletProperties.auditlogservletDefaultEventsCount) &&
        Objects.equals(this.auditlogservletDefaultPath, comDayCqWcmMsmImplServletsAuditLogServletProperties.auditlogservletDefaultPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditlogservletDefaultEventsCount, auditlogservletDefaultPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmMsmImplServletsAuditLogServletProperties {\n");
    sb.append("    auditlogservletDefaultEventsCount: ").append(toIndentedString(auditlogservletDefaultEventsCount)).append("\n");
    sb.append("    auditlogservletDefaultPath: ").append(toIndentedString(auditlogservletDefaultPath)).append("\n");
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

