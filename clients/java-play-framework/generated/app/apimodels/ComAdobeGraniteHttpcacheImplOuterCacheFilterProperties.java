package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties   {
  @JsonProperty("com.adobe.granite.httpcache.url.paths")
  @Valid

  private ConfigNodePropertyArray comAdobeGraniteHttpcacheUrlPaths;

  public ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties comAdobeGraniteHttpcacheUrlPaths(ConfigNodePropertyArray comAdobeGraniteHttpcacheUrlPaths) {
    this.comAdobeGraniteHttpcacheUrlPaths = comAdobeGraniteHttpcacheUrlPaths;
    return this;
  }

   /**
   * Get comAdobeGraniteHttpcacheUrlPaths
   * @return comAdobeGraniteHttpcacheUrlPaths
  **/
  public ConfigNodePropertyArray getComAdobeGraniteHttpcacheUrlPaths() {
    return comAdobeGraniteHttpcacheUrlPaths;
  }

  public void setComAdobeGraniteHttpcacheUrlPaths(ConfigNodePropertyArray comAdobeGraniteHttpcacheUrlPaths) {
    this.comAdobeGraniteHttpcacheUrlPaths = comAdobeGraniteHttpcacheUrlPaths;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties comAdobeGraniteHttpcacheImplOuterCacheFilterProperties = (ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties) o;
    return Objects.equals(comAdobeGraniteHttpcacheUrlPaths, comAdobeGraniteHttpcacheImplOuterCacheFilterProperties.comAdobeGraniteHttpcacheUrlPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comAdobeGraniteHttpcacheUrlPaths);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties {\n");
    
    sb.append("    comAdobeGraniteHttpcacheUrlPaths: ").append(toIndentedString(comAdobeGraniteHttpcacheUrlPaths)).append("\n");
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

