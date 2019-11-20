package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqWcmNotificationEmailImplEmailChannelProperties   {
  
  private ConfigNodePropertyString emailFrom = null;


  /**
   **/
  public ComDayCqWcmNotificationEmailImplEmailChannelProperties emailFrom(ConfigNodePropertyString emailFrom) {
    this.emailFrom = emailFrom;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("email.from")
  public ConfigNodePropertyString getEmailFrom() {
    return emailFrom;
  }
  public void setEmailFrom(ConfigNodePropertyString emailFrom) {
    this.emailFrom = emailFrom;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmNotificationEmailImplEmailChannelProperties comDayCqWcmNotificationEmailImplEmailChannelProperties = (ComDayCqWcmNotificationEmailImplEmailChannelProperties) o;
    return Objects.equals(emailFrom, comDayCqWcmNotificationEmailImplEmailChannelProperties.emailFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmNotificationEmailImplEmailChannelProperties {\n");
    
    sb.append("    emailFrom: ").append(toIndentedString(emailFrom)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
