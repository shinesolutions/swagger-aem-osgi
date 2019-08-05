package org.openapitools.model;

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

public class ComDayCqTaggingImplJcrTagManagerFactoryImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean validationEnabled = null;
 /**
   * Get validationEnabled
   * @return validationEnabled
  **/
  @JsonProperty("validation.enabled")
  public ConfigNodePropertyBoolean getValidationEnabled() {
    return validationEnabled;
  }

  public void setValidationEnabled(ConfigNodePropertyBoolean validationEnabled) {
    this.validationEnabled = validationEnabled;
  }

  public ComDayCqTaggingImplJcrTagManagerFactoryImplProperties validationEnabled(ConfigNodePropertyBoolean validationEnabled) {
    this.validationEnabled = validationEnabled;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqTaggingImplJcrTagManagerFactoryImplProperties {\n");
    
    sb.append("    validationEnabled: ").append(toIndentedString(validationEnabled)).append("\n");
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

