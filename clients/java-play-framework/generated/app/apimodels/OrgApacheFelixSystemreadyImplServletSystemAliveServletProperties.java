package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties   {
  @JsonProperty("osgi.http.whiteboard.servlet.pattern")
  private ConfigNodePropertyString osgiHttpWhiteboardServletPattern = null;

  @JsonProperty("osgi.http.whiteboard.context.select")
  private ConfigNodePropertyString osgiHttpWhiteboardContextSelect = null;

  public OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties osgiHttpWhiteboardServletPattern(ConfigNodePropertyString osgiHttpWhiteboardServletPattern) {
    this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
    return this;
  }

   /**
   * Get osgiHttpWhiteboardServletPattern
   * @return osgiHttpWhiteboardServletPattern
  **/
  @Valid
  public ConfigNodePropertyString getOsgiHttpWhiteboardServletPattern() {
    return osgiHttpWhiteboardServletPattern;
  }

  public void setOsgiHttpWhiteboardServletPattern(ConfigNodePropertyString osgiHttpWhiteboardServletPattern) {
    this.osgiHttpWhiteboardServletPattern = osgiHttpWhiteboardServletPattern;
  }

  public OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties osgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
    this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
    return this;
  }

   /**
   * Get osgiHttpWhiteboardContextSelect
   * @return osgiHttpWhiteboardContextSelect
  **/
  @Valid
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
    OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties orgApacheFelixSystemreadyImplServletSystemAliveServletProperties = (OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties) o;
    return Objects.equals(osgiHttpWhiteboardServletPattern, orgApacheFelixSystemreadyImplServletSystemAliveServletProperties.osgiHttpWhiteboardServletPattern) &&
        Objects.equals(osgiHttpWhiteboardContextSelect, orgApacheFelixSystemreadyImplServletSystemAliveServletProperties.osgiHttpWhiteboardContextSelect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osgiHttpWhiteboardServletPattern, osgiHttpWhiteboardContextSelect);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

