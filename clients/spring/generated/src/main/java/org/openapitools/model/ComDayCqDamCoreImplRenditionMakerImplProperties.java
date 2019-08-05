package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComDayCqDamCoreImplRenditionMakerImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComDayCqDamCoreImplRenditionMakerImplProperties   {
  @JsonProperty("xmp.propagate")
  private ConfigNodePropertyBoolean xmpPropagate = null;

  @JsonProperty("xmp.excludes")
  private ConfigNodePropertyArray xmpExcludes = null;

  public ComDayCqDamCoreImplRenditionMakerImplProperties xmpPropagate(ConfigNodePropertyBoolean xmpPropagate) {
    this.xmpPropagate = xmpPropagate;
    return this;
  }

  /**
   * Get xmpPropagate
   * @return xmpPropagate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getXmpPropagate() {
    return xmpPropagate;
  }

  public void setXmpPropagate(ConfigNodePropertyBoolean xmpPropagate) {
    this.xmpPropagate = xmpPropagate;
  }

  public ComDayCqDamCoreImplRenditionMakerImplProperties xmpExcludes(ConfigNodePropertyArray xmpExcludes) {
    this.xmpExcludes = xmpExcludes;
    return this;
  }

  /**
   * Get xmpExcludes
   * @return xmpExcludes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getXmpExcludes() {
    return xmpExcludes;
  }

  public void setXmpExcludes(ConfigNodePropertyArray xmpExcludes) {
    this.xmpExcludes = xmpExcludes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

