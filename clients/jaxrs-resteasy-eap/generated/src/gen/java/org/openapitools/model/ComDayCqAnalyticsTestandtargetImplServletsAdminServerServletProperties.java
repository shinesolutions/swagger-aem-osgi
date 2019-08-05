package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties   {
  

  private ConfigNodePropertyString testandtargetEndpointUrl = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("testandtarget.endpoint.url")
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
    return Objects.equals(testandtargetEndpointUrl, comDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.testandtargetEndpointUrl);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

