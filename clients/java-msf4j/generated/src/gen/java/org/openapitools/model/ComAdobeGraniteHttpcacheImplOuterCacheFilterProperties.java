package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;

/**
 * ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties   {
  @JsonProperty("com.adobe.granite.httpcache.url.paths")
  private ConfigNodePropertyArray comAdobeGraniteHttpcacheUrlPaths = null;

  public ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties comAdobeGraniteHttpcacheUrlPaths(ConfigNodePropertyArray comAdobeGraniteHttpcacheUrlPaths) {
    this.comAdobeGraniteHttpcacheUrlPaths = comAdobeGraniteHttpcacheUrlPaths;
    return this;
  }

   /**
   * Get comAdobeGraniteHttpcacheUrlPaths
   * @return comAdobeGraniteHttpcacheUrlPaths
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getComAdobeGraniteHttpcacheUrlPaths() {
    return comAdobeGraniteHttpcacheUrlPaths;
  }

  public void setComAdobeGraniteHttpcacheUrlPaths(ConfigNodePropertyArray comAdobeGraniteHttpcacheUrlPaths) {
    this.comAdobeGraniteHttpcacheUrlPaths = comAdobeGraniteHttpcacheUrlPaths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties comAdobeGraniteHttpcacheImplOuterCacheFilterProperties = (ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties) o;
    return Objects.equals(this.comAdobeGraniteHttpcacheUrlPaths, comAdobeGraniteHttpcacheImplOuterCacheFilterProperties.comAdobeGraniteHttpcacheUrlPaths);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

