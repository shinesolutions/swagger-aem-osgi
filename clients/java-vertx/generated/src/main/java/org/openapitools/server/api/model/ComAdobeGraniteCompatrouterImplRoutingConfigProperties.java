package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteCompatrouterImplRoutingConfigProperties   {
  
  private ConfigNodePropertyString id = null;
  private ConfigNodePropertyString compatPath = null;
  private ConfigNodePropertyString newPath = null;

  public ComAdobeGraniteCompatrouterImplRoutingConfigProperties () {

  }

  public ComAdobeGraniteCompatrouterImplRoutingConfigProperties (ConfigNodePropertyString id, ConfigNodePropertyString compatPath, ConfigNodePropertyString newPath) {
    this.id = id;
    this.compatPath = compatPath;
    this.newPath = newPath;
  }

    
  @JsonProperty("id")
  public ConfigNodePropertyString getId() {
    return id;
  }
  public void setId(ConfigNodePropertyString id) {
    this.id = id;
  }

    
  @JsonProperty("compatPath")
  public ConfigNodePropertyString getCompatPath() {
    return compatPath;
  }
  public void setCompatPath(ConfigNodePropertyString compatPath) {
    this.compatPath = compatPath;
  }

    
  @JsonProperty("newPath")
  public ConfigNodePropertyString getNewPath() {
    return newPath;
  }
  public void setNewPath(ConfigNodePropertyString newPath) {
    this.newPath = newPath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteCompatrouterImplRoutingConfigProperties comAdobeGraniteCompatrouterImplRoutingConfigProperties = (ComAdobeGraniteCompatrouterImplRoutingConfigProperties) o;
    return Objects.equals(id, comAdobeGraniteCompatrouterImplRoutingConfigProperties.id) &&
        Objects.equals(compatPath, comAdobeGraniteCompatrouterImplRoutingConfigProperties.compatPath) &&
        Objects.equals(newPath, comAdobeGraniteCompatrouterImplRoutingConfigProperties.newPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, compatPath, newPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteCompatrouterImplRoutingConfigProperties {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    compatPath: ").append(toIndentedString(compatPath)).append("\n");
    sb.append("    newPath: ").append(toIndentedString(newPath)).append("\n");
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
