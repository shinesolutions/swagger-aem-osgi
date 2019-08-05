package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties   {
  
  private ConfigNodePropertyArray mimetype = null;

  public ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties () {

  }

  public ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties (ConfigNodePropertyArray mimetype) {
    this.mimetype = mimetype;
  }

    
  @JsonProperty("mimetype")
  public ConfigNodePropertyArray getMimetype() {
    return mimetype;
  }
  public void setMimetype(ConfigNodePropertyArray mimetype) {
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
    ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties = (ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties) o;
    return Objects.equals(mimetype, comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties.mimetype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mimetype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties {\n");
    
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
