/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqPollingImporterImplManagedPollingImporterImplProperties   {
  
  private ConfigNodePropertyString importerUser;

  /**
   */
  public ComDayCqPollingImporterImplManagedPollingImporterImplProperties importerUser(ConfigNodePropertyString importerUser) {
    this.importerUser = importerUser;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("importer.user")
  public ConfigNodePropertyString getImporterUser() {
    return importerUser;
  }
  public void setImporterUser(ConfigNodePropertyString importerUser) {
    this.importerUser = importerUser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqPollingImporterImplManagedPollingImporterImplProperties comDayCqPollingImporterImplManagedPollingImporterImplProperties = (ComDayCqPollingImporterImplManagedPollingImporterImplProperties) o;
    return Objects.equals(importerUser, comDayCqPollingImporterImplManagedPollingImporterImplProperties.importerUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importerUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqPollingImporterImplManagedPollingImporterImplProperties {\n");
    
    sb.append("    importerUser: ").append(toIndentedString(importerUser)).append("\n");
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

