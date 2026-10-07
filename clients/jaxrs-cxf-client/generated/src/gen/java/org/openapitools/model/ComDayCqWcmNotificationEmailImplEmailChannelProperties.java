package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmNotificationEmailImplEmailChannelProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString emailFrom;
 /**
   * Get emailFrom
   * @return emailFrom
  **/
  @JsonProperty("email.from")
  public ConfigNodePropertyString getEmailFrom() {
    return emailFrom;
  }

  public void setEmailFrom(ConfigNodePropertyString emailFrom) {
    this.emailFrom = emailFrom;
  }

  public ComDayCqWcmNotificationEmailImplEmailChannelProperties emailFrom(ConfigNodePropertyString emailFrom) {
    this.emailFrom = emailFrom;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmNotificationEmailImplEmailChannelProperties comDayCqWcmNotificationEmailImplEmailChannelProperties = (ComDayCqWcmNotificationEmailImplEmailChannelProperties) o;
    return Objects.equals(this.emailFrom, comDayCqWcmNotificationEmailImplEmailChannelProperties.emailFrom);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

