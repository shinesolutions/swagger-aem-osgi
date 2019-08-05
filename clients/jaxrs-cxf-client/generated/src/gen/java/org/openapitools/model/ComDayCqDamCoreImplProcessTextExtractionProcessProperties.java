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

public class ComDayCqDamCoreImplProcessTextExtractionProcessProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray mimeTypes = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger maxExtract = null;
 /**
   * Get mimeTypes
   * @return mimeTypes
  **/
  @JsonProperty("mimeTypes")
  public ConfigNodePropertyArray getMimeTypes() {
    return mimeTypes;
  }

  public void setMimeTypes(ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
  }

  public ComDayCqDamCoreImplProcessTextExtractionProcessProperties mimeTypes(ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
    return this;
  }

 /**
   * Get maxExtract
   * @return maxExtract
  **/
  @JsonProperty("maxExtract")
  public ConfigNodePropertyInteger getMaxExtract() {
    return maxExtract;
  }

  public void setMaxExtract(ConfigNodePropertyInteger maxExtract) {
    this.maxExtract = maxExtract;
  }

  public ComDayCqDamCoreImplProcessTextExtractionProcessProperties maxExtract(ConfigNodePropertyInteger maxExtract) {
    this.maxExtract = maxExtract;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplProcessTextExtractionProcessProperties {\n");
    
    sb.append("    mimeTypes: ").append(toIndentedString(mimeTypes)).append("\n");
    sb.append("    maxExtract: ").append(toIndentedString(maxExtract)).append("\n");
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

