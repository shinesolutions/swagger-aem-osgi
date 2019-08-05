package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString slingName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString slingDescription = null;
 /**
   * Get slingName
   * @return slingName
  **/
  @JsonProperty("sling.name")
  public ConfigNodePropertyString getSlingName() {
    return slingName;
  }

  public void setSlingName(ConfigNodePropertyString slingName) {
    this.slingName = slingName;
  }

  public OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties slingName(ConfigNodePropertyString slingName) {
    this.slingName = slingName;
    return this;
  }

 /**
   * Get slingDescription
   * @return slingDescription
  **/
  @JsonProperty("sling.description")
  public ConfigNodePropertyString getSlingDescription() {
    return slingDescription;
  }

  public void setSlingDescription(ConfigNodePropertyString slingDescription) {
    this.slingDescription = slingDescription;
  }

  public OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties slingDescription(ConfigNodePropertyString slingDescription) {
    this.slingDescription = slingDescription;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties {\n");
    
    sb.append("    slingName: ").append(toIndentedString(slingName)).append("\n");
    sb.append("    slingDescription: ").append(toIndentedString(slingDescription)).append("\n");
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

