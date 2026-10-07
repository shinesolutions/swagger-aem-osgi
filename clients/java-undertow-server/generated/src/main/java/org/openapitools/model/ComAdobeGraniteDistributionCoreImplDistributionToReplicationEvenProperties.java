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
import org.openapitools.model.ConfigNodePropertyArray;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties   {
  
  private ConfigNodePropertyArray importerName;

  /**
   */
  public ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties importerName(ConfigNodePropertyArray importerName) {
    this.importerName = importerName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("importer.name")
  public ConfigNodePropertyArray getImporterName() {
    return importerName;
  }
  public void setImporterName(ConfigNodePropertyArray importerName) {
    this.importerName = importerName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties comAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties = (ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties) o;
    return Objects.equals(importerName, comAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties.importerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties {\n");
    
    sb.append("    importerName: ").append(toIndentedString(importerName)).append("\n");
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

