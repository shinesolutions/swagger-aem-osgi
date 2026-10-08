package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties   {
  @JsonProperty("max.unread.notification.count")
  private ConfigNodePropertyInteger maxUnreadNotificationCount;

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
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

