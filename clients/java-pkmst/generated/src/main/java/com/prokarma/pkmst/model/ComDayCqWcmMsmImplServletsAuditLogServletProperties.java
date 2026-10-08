package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqWcmMsmImplServletsAuditLogServletProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmMsmImplServletsAuditLogServletProperties   {
  @JsonProperty("auditlogservlet.default.events.count")
  private ConfigNodePropertyInteger auditlogservletDefaultEventsCount;

  @JsonProperty("auditlogservlet.default.path")
  private ConfigNodePropertyString auditlogservletDefaultPath;

  public ComDayCqWcmMsmImplServletsAuditLogServletProperties auditlogservletDefaultEventsCount(ConfigNodePropertyInteger auditlogservletDefaultEventsCount) {
    this.auditlogservletDefaultEventsCount = auditlogservletDefaultEventsCount;
    return this;
  }

  /**
   * Get auditlogservletDefaultEventsCount
   * @return auditlogservletDefaultEventsCount
   */
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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

