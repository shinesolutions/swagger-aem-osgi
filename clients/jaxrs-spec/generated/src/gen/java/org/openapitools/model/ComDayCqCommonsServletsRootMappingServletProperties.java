package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqCommonsServletsRootMappingServletProperties   {
  
  private @Valid ConfigNodePropertyString rootmappingTarget = null;

  /**
   **/
  public ComDayCqCommonsServletsRootMappingServletProperties rootmappingTarget(ConfigNodePropertyString rootmappingTarget) {
    this.rootmappingTarget = rootmappingTarget;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("rootmapping.target")
  public ConfigNodePropertyString getRootmappingTarget() {
    return rootmappingTarget;
  }
  public void setRootmappingTarget(ConfigNodePropertyString rootmappingTarget) {
    this.rootmappingTarget = rootmappingTarget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqCommonsServletsRootMappingServletProperties comDayCqCommonsServletsRootMappingServletProperties = (ComDayCqCommonsServletsRootMappingServletProperties) o;
    return Objects.equals(rootmappingTarget, comDayCqCommonsServletsRootMappingServletProperties.rootmappingTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootmappingTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqCommonsServletsRootMappingServletProperties {\n");
    
    sb.append("    rootmappingTarget: ").append(toIndentedString(rootmappingTarget)).append("\n");
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

