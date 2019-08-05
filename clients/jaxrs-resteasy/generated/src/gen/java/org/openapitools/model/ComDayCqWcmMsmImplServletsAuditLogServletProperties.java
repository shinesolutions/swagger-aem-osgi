package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqWcmMsmImplServletsAuditLogServletProperties   {
  
  private ConfigNodePropertyInteger auditlogservletDefaultEventsCount = null;
  private ConfigNodePropertyString auditlogservletDefaultPath = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("auditlogservlet.default.events.count")
  public ConfigNodePropertyInteger getAuditlogservletDefaultEventsCount() {
    return auditlogservletDefaultEventsCount;
  }
  public void setAuditlogservletDefaultEventsCount(ConfigNodePropertyInteger auditlogservletDefaultEventsCount) {
    this.auditlogservletDefaultEventsCount = auditlogservletDefaultEventsCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("auditlogservlet.default.path")
  public ConfigNodePropertyString getAuditlogservletDefaultPath() {
    return auditlogservletDefaultPath;
  }
  public void setAuditlogservletDefaultPath(ConfigNodePropertyString auditlogservletDefaultPath) {
    this.auditlogservletDefaultPath = auditlogservletDefaultPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

