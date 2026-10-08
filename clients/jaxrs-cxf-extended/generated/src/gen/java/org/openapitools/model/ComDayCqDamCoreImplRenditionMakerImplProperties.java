package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplRenditionMakerImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean xmpPropagate;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray xmpExcludes;
 /**
  * Get xmpPropagate
  * @return xmpPropagate
  */
  @JsonProperty("xmp.propagate")
  public ConfigNodePropertyBoolean getXmpPropagate() {
    return xmpPropagate;
  }

  /**
   * Sets the <code>xmpPropagate</code> property.
   */
 public void setXmpPropagate(ConfigNodePropertyBoolean xmpPropagate) {
    this.xmpPropagate = xmpPropagate;
  }

  /**
   * Sets the <code>xmpPropagate</code> property.
   */
  public ComDayCqDamCoreImplRenditionMakerImplProperties xmpPropagate(ConfigNodePropertyBoolean xmpPropagate) {
    this.xmpPropagate = xmpPropagate;
    return this;
  }

 /**
  * Get xmpExcludes
  * @return xmpExcludes
  */
  @JsonProperty("xmp.excludes")
  public ConfigNodePropertyArray getXmpExcludes() {
    return xmpExcludes;
  }

  /**
   * Sets the <code>xmpExcludes</code> property.
   */
 public void setXmpExcludes(ConfigNodePropertyArray xmpExcludes) {
    this.xmpExcludes = xmpExcludes;
  }

  /**
   * Sets the <code>xmpExcludes</code> property.
   */
  public ComDayCqDamCoreImplRenditionMakerImplProperties xmpExcludes(ConfigNodePropertyArray xmpExcludes) {
    this.xmpExcludes = xmpExcludes;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

