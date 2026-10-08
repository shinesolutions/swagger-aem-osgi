package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties   {
  @JsonProperty("max.unread.notification.count")
  private ConfigNodePropertyInteger maxUnreadNotificationCount;

  public ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties maxUnreadNotificationCount(ConfigNodePropertyInteger maxUnreadNotificationCount) {
    this.maxUnreadNotificationCount = maxUnreadNotificationCount;
    return this;
  }

  /**
   * Get maxUnreadNotificationCount
   * @return maxUnreadNotificationCount
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMaxUnreadNotificationCount() {
    return maxUnreadNotificationCount;
  }

  public void setMaxUnreadNotificationCount(ConfigNodePropertyInteger maxUnreadNotificationCount) {
    this.maxUnreadNotificationCount = maxUnreadNotificationCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties comAdobeCqSocialNotificationsImplNotificationManagerImplProperties = (ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties) o;
    return Objects.equals(this.maxUnreadNotificationCount, comAdobeCqSocialNotificationsImplNotificationManagerImplProperties.maxUnreadNotificationCount);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

