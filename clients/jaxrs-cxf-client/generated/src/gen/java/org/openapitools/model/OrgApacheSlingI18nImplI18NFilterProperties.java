package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingI18nImplI18NFilterProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger serviceRanking = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray slingFilterScope = null;
 /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public OrgApacheSlingI18nImplI18NFilterProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

 /**
   * Get slingFilterScope
   * @return slingFilterScope
  **/
  @JsonProperty("sling.filter.scope")
  public ConfigNodePropertyArray getSlingFilterScope() {
    return slingFilterScope;
  }

  public void setSlingFilterScope(ConfigNodePropertyArray slingFilterScope) {
    this.slingFilterScope = slingFilterScope;
  }

  public OrgApacheSlingI18nImplI18NFilterProperties slingFilterScope(ConfigNodePropertyArray slingFilterScope) {
    this.slingFilterScope = slingFilterScope;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

