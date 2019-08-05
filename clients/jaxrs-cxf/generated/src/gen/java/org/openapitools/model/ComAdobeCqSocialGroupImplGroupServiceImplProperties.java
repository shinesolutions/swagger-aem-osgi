package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
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

public class ComAdobeCqSocialGroupImplGroupServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxWaitTime = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger minWaitBetweenRetries = null;
 /**
   * Get maxWaitTime
   * @return maxWaitTime
  **/
  @JsonProperty("maxWaitTime")
  public ConfigNodePropertyInteger getMaxWaitTime() {
    return maxWaitTime;
  }

  public void setMaxWaitTime(ConfigNodePropertyInteger maxWaitTime) {
    this.maxWaitTime = maxWaitTime;
  }

  public ComAdobeCqSocialGroupImplGroupServiceImplProperties maxWaitTime(ConfigNodePropertyInteger maxWaitTime) {
    this.maxWaitTime = maxWaitTime;
    return this;
  }

 /**
   * Get minWaitBetweenRetries
   * @return minWaitBetweenRetries
  **/
  @JsonProperty("minWaitBetweenRetries")
  public ConfigNodePropertyInteger getMinWaitBetweenRetries() {
    return minWaitBetweenRetries;
  }

  public void setMinWaitBetweenRetries(ConfigNodePropertyInteger minWaitBetweenRetries) {
    this.minWaitBetweenRetries = minWaitBetweenRetries;
  }

  public ComAdobeCqSocialGroupImplGroupServiceImplProperties minWaitBetweenRetries(ConfigNodePropertyInteger minWaitBetweenRetries) {
    this.minWaitBetweenRetries = minWaitBetweenRetries;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialGroupImplGroupServiceImplProperties {\n");
    
    sb.append("    maxWaitTime: ").append(toIndentedString(maxWaitTime)).append("\n");
    sb.append("    minWaitBetweenRetries: ").append(toIndentedString(minWaitBetweenRetries)).append("\n");
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

