package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqWcmNotificationEmailImplEmailChannelProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqWcmNotificationEmailImplEmailChannelProperties   {
  @JsonProperty("email.from")
  private ConfigNodePropertyString emailFrom = null;

  public ComDayCqWcmNotificationEmailImplEmailChannelProperties emailFrom(ConfigNodePropertyString emailFrom) {
    this.emailFrom = emailFrom;
    return this;
  }

   /**
   * Get emailFrom
   * @return emailFrom
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

