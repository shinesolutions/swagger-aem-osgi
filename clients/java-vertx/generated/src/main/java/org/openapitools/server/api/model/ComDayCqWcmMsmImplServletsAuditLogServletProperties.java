package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmMsmImplServletsAuditLogServletProperties   {
  
  private ConfigNodePropertyInteger auditlogservletDefaultEventsCount = null;
  private ConfigNodePropertyString auditlogservletDefaultPath = null;

  public ComDayCqWcmMsmImplServletsAuditLogServletProperties () {

  }

  public ComDayCqWcmMsmImplServletsAuditLogServletProperties (ConfigNodePropertyInteger auditlogservletDefaultEventsCount, ConfigNodePropertyString auditlogservletDefaultPath) {
    this.auditlogservletDefaultEventsCount = auditlogservletDefaultEventsCount;
    this.auditlogservletDefaultPath = auditlogservletDefaultPath;
  }

    
  @JsonProperty("auditlogservlet.default.events.count")
  public ConfigNodePropertyInteger getAuditlogservletDefaultEventsCount() {
    return auditlogservletDefaultEventsCount;
  }
  public void setAuditlogservletDefaultEventsCount(ConfigNodePropertyInteger auditlogservletDefaultEventsCount) {
    this.auditlogservletDefaultEventsCount = auditlogservletDefaultEventsCount;
  }

    
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
    return Objects.equals(auditlogservletDefaultEventsCount, comDayCqWcmMsmImplServletsAuditLogServletProperties.auditlogservletDefaultEventsCount) &&
        Objects.equals(auditlogservletDefaultPath, comDayCqWcmMsmImplServletsAuditLogServletProperties.auditlogservletDefaultPath);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
