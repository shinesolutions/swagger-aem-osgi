package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties   {
  @JsonProperty("max.unread.notification.count")
  private ConfigNodePropertyInteger maxUnreadNotificationCount = null;

  public ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties maxUnreadNotificationCount(ConfigNodePropertyInteger maxUnreadNotificationCount) {
    this.maxUnreadNotificationCount = maxUnreadNotificationCount;
    return this;
  }

  /**
   * Get maxUnreadNotificationCount
   * @return maxUnreadNotificationCount
  **/
  @ApiModelProperty(value = "")

  @Valid

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

