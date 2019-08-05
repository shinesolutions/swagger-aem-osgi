package org.openapitools.model;

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

public class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger numberOfDays = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger ageOfFile = null;
 /**
   * Get numberOfDays
   * @return numberOfDays
  **/
  @JsonProperty("numberOfDays")
  public ConfigNodePropertyInteger getNumberOfDays() {
    return numberOfDays;
  }

  public void setNumberOfDays(ConfigNodePropertyInteger numberOfDays) {
    this.numberOfDays = numberOfDays;
  }

  public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties numberOfDays(ConfigNodePropertyInteger numberOfDays) {
    this.numberOfDays = numberOfDays;
    return this;
  }

 /**
   * Get ageOfFile
   * @return ageOfFile
  **/
  @JsonProperty("ageOfFile")
  public ConfigNodePropertyInteger getAgeOfFile() {
    return ageOfFile;
  }

  public void setAgeOfFile(ConfigNodePropertyInteger ageOfFile) {
    this.ageOfFile = ageOfFile;
  }

  public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties ageOfFile(ConfigNodePropertyInteger ageOfFile) {
    this.ageOfFile = ageOfFile;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties {\n");
    
    sb.append("    numberOfDays: ").append(toIndentedString(numberOfDays)).append("\n");
    sb.append("    ageOfFile: ").append(toIndentedString(ageOfFile)).append("\n");
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

