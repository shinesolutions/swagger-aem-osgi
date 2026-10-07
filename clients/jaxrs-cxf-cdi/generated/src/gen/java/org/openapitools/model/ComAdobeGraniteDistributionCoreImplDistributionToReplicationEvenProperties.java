package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties   {
  
  private ConfigNodePropertyArray importerName;

  /**
   **/
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

