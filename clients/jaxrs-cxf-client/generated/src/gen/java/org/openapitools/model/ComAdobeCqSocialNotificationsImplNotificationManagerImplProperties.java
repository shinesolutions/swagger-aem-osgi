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

public class ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger maxUnreadNotificationCount = null;
 /**
   * Get maxUnreadNotificationCount
   * @return maxUnreadNotificationCount
  **/
  @JsonProperty("max.unread.notification.count")
  public ConfigNodePropertyInteger getMaxUnreadNotificationCount() {
    return maxUnreadNotificationCount;
  }

  public void setMaxUnreadNotificationCount(ConfigNodePropertyInteger maxUnreadNotificationCount) {
    this.maxUnreadNotificationCount = maxUnreadNotificationCount;
  }

  public ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties maxUnreadNotificationCount(ConfigNodePropertyInteger maxUnreadNotificationCount) {
    this.maxUnreadNotificationCount = maxUnreadNotificationCount;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

