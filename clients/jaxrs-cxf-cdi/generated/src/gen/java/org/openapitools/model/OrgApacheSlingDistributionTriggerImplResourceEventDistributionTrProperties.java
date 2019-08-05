package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties   {
  
  private ConfigNodePropertyString name = null;

  private ConfigNodePropertyString path = null;


  /**
   **/
  public OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }


  /**
   **/
  public OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties orgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties = (OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties) o;
    return Objects.equals(name, orgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties.name) &&
        Objects.equals(path, orgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

