package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray graniteColonData = null;
 /**
   * Get graniteColonData
   * @return graniteColonData
  **/
  @JsonProperty("granite:data")
  public ConfigNodePropertyArray getGraniteColonData() {
    return graniteColonData;
  }

  public void setGraniteColonData(ConfigNodePropertyArray graniteColonData) {
    this.graniteColonData = graniteColonData;
  }

  public ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties graniteColonData(ConfigNodePropertyArray graniteColonData) {
    this.graniteColonData = graniteColonData;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties {\n");
    
    sb.append("    graniteColonData: ").append(toIndentedString(graniteColonData)).append("\n");
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

