package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqWcmMsmImplServletsAuditLogServletProperties   {
  @JsonProperty("auditlogservlet.default.events.count")
  private ConfigNodePropertyInteger auditlogservletDefaultEventsCount = null;

  @JsonProperty("auditlogservlet.default.path")
  private ConfigNodePropertyString auditlogservletDefaultPath = null;

  public ComDayCqWcmMsmImplServletsAuditLogServletProperties auditlogservletDefaultEventsCount(ConfigNodePropertyInteger auditlogservletDefaultEventsCount) {
    this.auditlogservletDefaultEventsCount = auditlogservletDefaultEventsCount;
    return this;
  }

   /**
   * Get auditlogservletDefaultEventsCount
   * @return auditlogservletDefaultEventsCount
  **/
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
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

