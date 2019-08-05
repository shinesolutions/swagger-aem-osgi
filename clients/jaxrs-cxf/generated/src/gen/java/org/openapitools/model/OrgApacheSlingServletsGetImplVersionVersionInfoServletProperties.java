package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray slingServletSelectors = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean ecmaSuport = null;
 /**
   * Get slingServletSelectors
   * @return slingServletSelectors
  **/
  @JsonProperty("sling.servlet.selectors")
  public ConfigNodePropertyArray getSlingServletSelectors() {
    return slingServletSelectors;
  }

  public void setSlingServletSelectors(ConfigNodePropertyArray slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  public OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties slingServletSelectors(ConfigNodePropertyArray slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

 /**
   * Get ecmaSuport
   * @return ecmaSuport
  **/
  @JsonProperty("ecmaSuport")
  public ConfigNodePropertyBoolean getEcmaSuport() {
    return ecmaSuport;
  }

  public void setEcmaSuport(ConfigNodePropertyBoolean ecmaSuport) {
    this.ecmaSuport = ecmaSuport;
  }

  public OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties ecmaSuport(ConfigNodePropertyBoolean ecmaSuport) {
    this.ecmaSuport = ecmaSuport;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties {\n");
    
    sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
    sb.append("    ecmaSuport: ").append(toIndentedString(ecmaSuport)).append("\n");
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

