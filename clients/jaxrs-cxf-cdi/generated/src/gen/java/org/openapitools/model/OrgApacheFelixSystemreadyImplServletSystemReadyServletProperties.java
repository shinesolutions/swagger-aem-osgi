package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties   {
  
  private ConfigNodePropertyString osgiHttpWhiteboardServletPattern = null;

  private ConfigNodePropertyString osgiHttpWhiteboardContextSelect = null;


  /**
   **/
  public OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties osgiHttpWhiteboardServletPattern(ConfigNodePropertyString osgiHttpWhiteboardServletPattern) {
    this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("osgi.http.whiteboard.servlet.pattern")
  public ConfigNodePropertyString getOsgiHttpWhiteboardServletPattern() {
    return osgiHttpWhiteboardServletPattern;
  }
  public void setOsgiHttpWhiteboardServletPattern(ConfigNodePropertyString osgiHttpWhiteboardServletPattern) {
    this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
  }


  /**
   **/
  public OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties osgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("osgi.http.whiteboard.context.select")
  public ConfigNodePropertyString getOsgiHttpWhiteboardContextSelect() {
    return osgiHttpWhiteboardContextSelect;
  }
  public void setOsgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
  }



  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

