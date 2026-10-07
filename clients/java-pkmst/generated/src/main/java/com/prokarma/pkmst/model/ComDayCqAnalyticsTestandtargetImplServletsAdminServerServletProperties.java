package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties   {
  @JsonProperty("testandtarget.endpoint.url")
  private ConfigNodePropertyString testandtargetEndpointUrl;

  public ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties testandtargetEndpointUrl(ConfigNodePropertyString testandtargetEndpointUrl) {
    this.testandtargetEndpointUrl = testandtargetEndpointUrl;
    return this;
  }

  /**
   * Get testandtargetEndpointUrl
   * @return testandtargetEndpointUrl
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getTestandtargetEndpointUrl() {
    return testandtargetEndpointUrl;
  }

  public void setTestandtargetEndpointUrl(ConfigNodePropertyString testandtargetEndpointUrl) {
    this.testandtargetEndpointUrl = testandtargetEndpointUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties comDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties = (ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties) o;
    return Objects.equals(this.testandtargetEndpointUrl, comDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.testandtargetEndpointUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testandtargetEndpointUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties {\n");
    
    sb.append("    testandtargetEndpointUrl: ").append(toIndentedString(testandtargetEndpointUrl)).append("\n");
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

