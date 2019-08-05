package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties   {
  
  private ConfigNodePropertyString osgiHttpWhiteboardServletPattern = null;
  private ConfigNodePropertyString osgiHttpWhiteboardContextSelect = null;

  public OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties () {

  }

  public OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties (ConfigNodePropertyString osgiHttpWhiteboardServletPattern, ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
  }

    
  @JsonProperty("osgi.http.whiteboard.servlet.pattern")
  public ConfigNodePropertyString getOsgiHttpWhiteboardServletPattern() {
    return osgiHttpWhiteboardServletPattern;
  }
  public void setOsgiHttpWhiteboardServletPattern(ConfigNodePropertyString osgiHttpWhiteboardServletPattern) {
    this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
  }

    
  @JsonProperty("osgi.http.whiteboard.context.select")
  public ConfigNodePropertyString getOsgiHttpWhiteboardContextSelect() {
    return osgiHttpWhiteboardContextSelect;
  }
  public void setOsgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties orgApacheFelixSystemreadyImplServletSystemReadyServletProperties = (OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties) o;
    return Objects.equals(osgiHttpWhiteboardServletPattern, orgApacheFelixSystemreadyImplServletSystemReadyServletProperties.osgiHttpWhiteboardServletPattern) &&
        Objects.equals(osgiHttpWhiteboardContextSelect, orgApacheFelixSystemreadyImplServletSystemReadyServletProperties.osgiHttpWhiteboardContextSelect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osgiHttpWhiteboardServletPattern, osgiHttpWhiteboardContextSelect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties {\n");
    
    sb.append("    osgiHttpWhiteboardServletPattern: ").append(toIndentedString(osgiHttpWhiteboardServletPattern)).append("\n");
    sb.append("    osgiHttpWhiteboardContextSelect: ").append(toIndentedString(osgiHttpWhiteboardContextSelect)).append("\n");
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
