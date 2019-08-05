package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties   {
  
  private ConfigNodePropertyInteger maxUnreadNotificationCount = null;


  /**
   **/
  public ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties maxUnreadNotificationCount(ConfigNodePropertyInteger maxUnreadNotificationCount) {
    this.maxUnreadNotificationCount = maxUnreadNotificationCount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("max.unread.notification.count")
  public ConfigNodePropertyInteger getMaxUnreadNotificationCount() {
    return maxUnreadNotificationCount;
  }
  public void setMaxUnreadNotificationCount(ConfigNodePropertyInteger maxUnreadNotificationCount) {
    this.maxUnreadNotificationCount = maxUnreadNotificationCount;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties comAdobeCqSocialNotificationsImplNotificationManagerImplProperties = (ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties) o;
    return Objects.equals(maxUnreadNotificationCount, comAdobeCqSocialNotificationsImplNotificationManagerImplProperties.maxUnreadNotificationCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxUnreadNotificationCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties {\n");
    
    sb.append("    maxUnreadNotificationCount: ").append(toIndentedString(maxUnreadNotificationCount)).append("\n");
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

