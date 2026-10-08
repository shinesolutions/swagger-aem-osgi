package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties   {
  
  private ConfigNodePropertyInteger getPeriod;

  /**
   **/
  public ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties getPeriod(ConfigNodePropertyInteger getPeriod) {
    this.getPeriod = getPeriod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("getPeriod")
  public ConfigNodePropertyInteger getGetPeriod() {
    return getPeriod;
  }
  public void setGetPeriod(ConfigNodePropertyInteger getPeriod) {
    this.getPeriod = getPeriod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties comAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties = (ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties) o;
    return Objects.equals(this.getPeriod, comAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties.getPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties {\n");
    
    sb.append("    getPeriod: ").append(toIndentedString(getPeriod)).append("\n");
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

