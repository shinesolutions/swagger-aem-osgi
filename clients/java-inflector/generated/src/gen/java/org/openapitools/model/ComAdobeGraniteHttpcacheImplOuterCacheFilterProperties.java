package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties   {
  @JsonProperty("com.adobe.granite.httpcache.url.paths")
  private ConfigNodePropertyArray comAdobeGraniteHttpcacheUrlPaths;

  /**
   **/
  public ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties comAdobeGraniteHttpcacheUrlPaths(ConfigNodePropertyArray comAdobeGraniteHttpcacheUrlPaths) {
    this.comAdobeGraniteHttpcacheUrlPaths = comAdobeGraniteHttpcacheUrlPaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.granite.httpcache.url.paths")
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

