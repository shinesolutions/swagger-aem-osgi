package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqCommonsServletsRootMappingServletProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString rootmappingTarget;
 /**
   * Get rootmappingTarget
   * @return rootmappingTarget
  **/
  @JsonProperty("rootmapping.target")
  public ConfigNodePropertyString getRootmappingTarget() {
    return rootmappingTarget;
  }

  public void setRootmappingTarget(ConfigNodePropertyString rootmappingTarget) {
    this.rootmappingTarget = rootmappingTarget;
  }

  public ComDayCqCommonsServletsRootMappingServletProperties rootmappingTarget(ConfigNodePropertyString rootmappingTarget) {
    this.rootmappingTarget = rootmappingTarget;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqCommonsServletsRootMappingServletProperties comDayCqCommonsServletsRootMappingServletProperties = (ComDayCqCommonsServletsRootMappingServletProperties) o;
    return Objects.equals(this.rootmappingTarget, comDayCqCommonsServletsRootMappingServletProperties.rootmappingTarget);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

