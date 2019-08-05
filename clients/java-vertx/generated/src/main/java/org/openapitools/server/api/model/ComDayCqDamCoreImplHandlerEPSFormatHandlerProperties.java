package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties   {
  
  private ConfigNodePropertyString mimetype = null;

  public ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties () {

  }

  public ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties (ConfigNodePropertyString mimetype) {
    this.mimetype = mimetype;
  }

    
  @JsonProperty("mimetype")
  public ConfigNodePropertyString getMimetype() {
    return mimetype;
  }
  public void setMimetype(ConfigNodePropertyString mimetype) {
    this.mimetype = mimetype;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties comDayCqDamCoreImplHandlerEPSFormatHandlerProperties = (ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties) o;
    return Objects.equals(mimetype, comDayCqDamCoreImplHandlerEPSFormatHandlerProperties.mimetype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mimetype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties {\n");
    
    sb.append("    mimetype: ").append(toIndentedString(mimetype)).append("\n");
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
