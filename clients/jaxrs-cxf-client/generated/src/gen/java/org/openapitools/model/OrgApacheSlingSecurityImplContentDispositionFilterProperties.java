package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingSecurityImplContentDispositionFilterProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray slingContentDispositionPaths = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray slingContentDispositionExcludedPaths = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean slingContentDispositionAllPaths = null;
 /**
   * Get slingContentDispositionPaths
   * @return slingContentDispositionPaths
  **/
  @JsonProperty("sling.content.disposition.paths")
  public ConfigNodePropertyArray getSlingContentDispositionPaths() {
    return slingContentDispositionPaths;
  }

  public void setSlingContentDispositionPaths(ConfigNodePropertyArray slingContentDispositionPaths) {
    this.slingContentDispositionPaths = slingContentDispositionPaths;
  }

  public OrgApacheSlingSecurityImplContentDispositionFilterProperties slingContentDispositionPaths(ConfigNodePropertyArray slingContentDispositionPaths) {
    this.slingContentDispositionPaths = slingContentDispositionPaths;
    return this;
  }

 /**
   * Get slingContentDispositionExcludedPaths
   * @return slingContentDispositionExcludedPaths
  **/
  @JsonProperty("sling.content.disposition.excluded.paths")
  public ConfigNodePropertyArray getSlingContentDispositionExcludedPaths() {
    return slingContentDispositionExcludedPaths;
  }

  public void setSlingContentDispositionExcludedPaths(ConfigNodePropertyArray slingContentDispositionExcludedPaths) {
    this.slingContentDispositionExcludedPaths = slingContentDispositionExcludedPaths;
  }

  public OrgApacheSlingSecurityImplContentDispositionFilterProperties slingContentDispositionExcludedPaths(ConfigNodePropertyArray slingContentDispositionExcludedPaths) {
    this.slingContentDispositionExcludedPaths = slingContentDispositionExcludedPaths;
    return this;
  }

 /**
   * Get slingContentDispositionAllPaths
   * @return slingContentDispositionAllPaths
  **/
  @JsonProperty("sling.content.disposition.all.paths")
  public ConfigNodePropertyBoolean getSlingContentDispositionAllPaths() {
    return slingContentDispositionAllPaths;
  }

  public void setSlingContentDispositionAllPaths(ConfigNodePropertyBoolean slingContentDispositionAllPaths) {
    this.slingContentDispositionAllPaths = slingContentDispositionAllPaths;
  }

  public OrgApacheSlingSecurityImplContentDispositionFilterProperties slingContentDispositionAllPaths(ConfigNodePropertyBoolean slingContentDispositionAllPaths) {
    this.slingContentDispositionAllPaths = slingContentDispositionAllPaths;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingSecurityImplContentDispositionFilterProperties {\n");
    
    sb.append("    slingContentDispositionPaths: ").append(toIndentedString(slingContentDispositionPaths)).append("\n");
    sb.append("    slingContentDispositionExcludedPaths: ").append(toIndentedString(slingContentDispositionExcludedPaths)).append("\n");
    sb.append("    slingContentDispositionAllPaths: ").append(toIndentedString(slingContentDispositionAllPaths)).append("\n");
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

