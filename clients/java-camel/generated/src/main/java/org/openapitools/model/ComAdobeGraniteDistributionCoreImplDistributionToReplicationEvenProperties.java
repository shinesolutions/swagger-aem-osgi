package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties
 */

@JsonTypeName("comAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties {

  private ConfigNodePropertyArray importerName;

  public ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties importerName(ConfigNodePropertyArray importerName) {
    this.importerName = importerName;
    return this;
  }

  /**
   * Get importerName
   * @return importerName
   */
  @Valid 
  @Schema(name = "importer.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.importerName, comAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties.importerName);
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

