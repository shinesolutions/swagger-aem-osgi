package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString osgiHttpWhiteboardServletPattern;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString osgiHttpWhiteboardContextSelect;
 /**
  * Get osgiHttpWhiteboardServletPattern
  * @return osgiHttpWhiteboardServletPattern
  */
  @JsonProperty("osgi.http.whiteboard.servlet.pattern")
  public ConfigNodePropertyString getOsgiHttpWhiteboardServletPattern() {
    return osgiHttpWhiteboardServletPattern;
  }

  /**
   * Sets the <code>osgiHttpWhiteboardServletPattern</code> property.
   */
 public void setOsgiHttpWhiteboardServletPattern(ConfigNodePropertyString osgiHttpWhiteboardServletPattern) {
    this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
  }

  /**
   * Sets the <code>osgiHttpWhiteboardServletPattern</code> property.
   */
  public OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties osgiHttpWhiteboardServletPattern(ConfigNodePropertyString osgiHttpWhiteboardServletPattern) {
    this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
    return this;
  }

 /**
  * Get osgiHttpWhiteboardContextSelect
  * @return osgiHttpWhiteboardContextSelect
  */
  @JsonProperty("osgi.http.whiteboard.context.select")
  public ConfigNodePropertyString getOsgiHttpWhiteboardContextSelect() {
    return osgiHttpWhiteboardContextSelect;
  }

  /**
   * Sets the <code>osgiHttpWhiteboardContextSelect</code> property.
   */
 public void setOsgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
  }

  /**
   * Sets the <code>osgiHttpWhiteboardContextSelect</code> property.
   */
  public OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties osgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
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
    OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties orgApacheFelixSystemreadyImplServletSystemAliveServletProperties = (OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties) o;
    return Objects.equals(this.osgiHttpWhiteboardServletPattern, orgApacheFelixSystemreadyImplServletSystemAliveServletProperties.osgiHttpWhiteboardServletPattern) &&
        Objects.equals(this.osgiHttpWhiteboardContextSelect, orgApacheFelixSystemreadyImplServletSystemAliveServletProperties.osgiHttpWhiteboardContextSelect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osgiHttpWhiteboardServletPattern, osgiHttpWhiteboardContextSelect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties {\n");
    
    sb.append("    osgiHttpWhiteboardServletPattern: ").append(toIndentedString(osgiHttpWhiteboardServletPattern)).append("\n");
    sb.append("    osgiHttpWhiteboardContextSelect: ").append(toIndentedString(osgiHttpWhiteboardContextSelect)).append("\n");
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

