package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties   {
  @JsonProperty("brightedge.url")
  @Valid

  private ConfigNodePropertyString brightedgeUrl;

  public ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties brightedgeUrl(ConfigNodePropertyString brightedgeUrl) {
    this.brightedgeUrl = brightedgeUrl;
    return this;
  }

   /**
   * Get brightedgeUrl
   * @return brightedgeUrl
  **/
  public ConfigNodePropertyString getBrightedgeUrl() {
    return brightedgeUrl;
  }

  public void setBrightedgeUrl(ConfigNodePropertyString brightedgeUrl) {
    this.brightedgeUrl = brightedgeUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties comAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties = (ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties) o;
    return Objects.equals(brightedgeUrl, comAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties.brightedgeUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brightedgeUrl);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties {\n");
    
    sb.append("    brightedgeUrl: ").append(toIndentedString(brightedgeUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

