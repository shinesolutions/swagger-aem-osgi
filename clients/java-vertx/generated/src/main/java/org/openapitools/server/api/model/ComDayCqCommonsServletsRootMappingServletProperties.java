package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqCommonsServletsRootMappingServletProperties   {
  
  private ConfigNodePropertyString rootmappingTarget = null;

  public ComDayCqCommonsServletsRootMappingServletProperties () {

  }

  public ComDayCqCommonsServletsRootMappingServletProperties (ConfigNodePropertyString rootmappingTarget) {
    this.rootmappingTarget = rootmappingTarget;
  }

    
  @JsonProperty("rootmapping.target")
  public ConfigNodePropertyString getRootmappingTarget() {
    return rootmappingTarget;
  }
  public void setRootmappingTarget(ConfigNodePropertyString rootmappingTarget) {
    this.rootmappingTarget = rootmappingTarget;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
