package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqCommonsServletsRootMappingServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqCommonsServletsRootMappingServletProperties   {
  @JsonProperty("rootmapping.target")
  @Valid

  private ConfigNodePropertyString rootmappingTarget;

  public ComDayCqCommonsServletsRootMappingServletProperties rootmappingTarget(ConfigNodePropertyString rootmappingTarget) {
    this.rootmappingTarget = rootmappingTarget;
    return this;
  }

   /**
   * Get rootmappingTarget
   * @return rootmappingTarget
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

