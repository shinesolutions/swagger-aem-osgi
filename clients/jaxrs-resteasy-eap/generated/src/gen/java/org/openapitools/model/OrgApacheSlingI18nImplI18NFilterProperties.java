package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingI18nImplI18NFilterProperties   {
  

  private ConfigNodePropertyInteger serviceRanking = null;

  private ConfigNodePropertyArray slingFilterScope = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.filter.scope")
  public ConfigNodePropertyArray getSlingFilterScope() {
    return slingFilterScope;
  }
  public void setSlingFilterScope(ConfigNodePropertyArray slingFilterScope) {
    this.slingFilterScope = slingFilterScope;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingI18nImplI18NFilterProperties orgApacheSlingI18nImplI18NFilterProperties = (OrgApacheSlingI18nImplI18NFilterProperties) o;
    return Objects.equals(serviceRanking, orgApacheSlingI18nImplI18NFilterProperties.serviceRanking) &&
        Objects.equals(slingFilterScope, orgApacheSlingI18nImplI18NFilterProperties.slingFilterScope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, slingFilterScope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingI18nImplI18NFilterProperties {\n");
    
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    slingFilterScope: ").append(toIndentedString(slingFilterScope)).append("\n");
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

