package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqDamCoreImplRenditionMakerImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplRenditionMakerImplProperties   {
  private ConfigNodePropertyBoolean xmpPropagate;
  private ConfigNodePropertyArray xmpExcludes;

  public ComDayCqDamCoreImplRenditionMakerImplProperties() {
  }

  /**
   **/
  public ComDayCqDamCoreImplRenditionMakerImplProperties xmpPropagate(ConfigNodePropertyBoolean xmpPropagate) {
    this.xmpPropagate = xmpPropagate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("xmp.propagate")
  @Valid public ConfigNodePropertyBoolean getXmpPropagate() {
    return xmpPropagate;
  }

  @JsonProperty("xmp.propagate")
  public void setXmpPropagate(ConfigNodePropertyBoolean xmpPropagate) {
    this.xmpPropagate = xmpPropagate;
  }

  /**
   **/
  public ComDayCqDamCoreImplRenditionMakerImplProperties xmpExcludes(ConfigNodePropertyArray xmpExcludes) {
    this.xmpExcludes = xmpExcludes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("xmp.excludes")
  @Valid public ConfigNodePropertyArray getXmpExcludes() {
    return xmpExcludes;
  }

  @JsonProperty("xmp.excludes")
  public void setXmpExcludes(ConfigNodePropertyArray xmpExcludes) {
    this.xmpExcludes = xmpExcludes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplRenditionMakerImplProperties comDayCqDamCoreImplRenditionMakerImplProperties = (ComDayCqDamCoreImplRenditionMakerImplProperties) o;
    return Objects.equals(this.xmpPropagate, comDayCqDamCoreImplRenditionMakerImplProperties.xmpPropagate) &&
        Objects.equals(this.xmpExcludes, comDayCqDamCoreImplRenditionMakerImplProperties.xmpExcludes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xmpPropagate, xmpExcludes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplRenditionMakerImplProperties {\n");
    
    sb.append("    xmpPropagate: ").append(toIndentedString(xmpPropagate)).append("\n");
    sb.append("    xmpExcludes: ").append(toIndentedString(xmpExcludes)).append("\n");
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
