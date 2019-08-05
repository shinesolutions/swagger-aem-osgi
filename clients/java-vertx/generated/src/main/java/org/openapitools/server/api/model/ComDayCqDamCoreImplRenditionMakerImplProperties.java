package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamCoreImplRenditionMakerImplProperties   {
  
  private ConfigNodePropertyBoolean xmpPropagate = null;
  private ConfigNodePropertyArray xmpExcludes = null;

  public ComDayCqDamCoreImplRenditionMakerImplProperties () {

  }

  public ComDayCqDamCoreImplRenditionMakerImplProperties (ConfigNodePropertyBoolean xmpPropagate, ConfigNodePropertyArray xmpExcludes) {
    this.xmpPropagate = xmpPropagate;
    this.xmpExcludes = xmpExcludes;
  }

    
  @JsonProperty("xmp.propagate")
  public ConfigNodePropertyBoolean getXmpPropagate() {
    return xmpPropagate;
  }
  public void setXmpPropagate(ConfigNodePropertyBoolean xmpPropagate) {
    this.xmpPropagate = xmpPropagate;
  }

    
  @JsonProperty("xmp.excludes")
  public ConfigNodePropertyArray getXmpExcludes() {
    return xmpExcludes;
  }
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
    return Objects.equals(xmpPropagate, comDayCqDamCoreImplRenditionMakerImplProperties.xmpPropagate) &&
        Objects.equals(xmpExcludes, comDayCqDamCoreImplRenditionMakerImplProperties.xmpExcludes);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
