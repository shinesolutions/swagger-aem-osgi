package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties   {
  
  private ConfigNodePropertyArray xmphandlerCqFormats = null;

  public ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties () {

  }

  public ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties (ConfigNodePropertyArray xmphandlerCqFormats) {
    this.xmphandlerCqFormats = xmphandlerCqFormats;
  }

    
  @JsonProperty("xmphandler.cq.formats")
  public ConfigNodePropertyArray getXmphandlerCqFormats() {
    return xmphandlerCqFormats;
  }
  public void setXmphandlerCqFormats(ConfigNodePropertyArray xmphandlerCqFormats) {
    this.xmphandlerCqFormats = xmphandlerCqFormats;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties = (ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties) o;
    return Objects.equals(xmphandlerCqFormats, comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.xmphandlerCqFormats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xmphandlerCqFormats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties {\n");
    
    sb.append("    xmphandlerCqFormats: ").append(toIndentedString(xmphandlerCqFormats)).append("\n");
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