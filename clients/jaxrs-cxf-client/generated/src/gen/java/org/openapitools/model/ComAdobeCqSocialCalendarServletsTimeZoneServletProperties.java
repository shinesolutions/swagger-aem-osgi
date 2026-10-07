package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialCalendarServletsTimeZoneServletProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger timezonesExpirytime;
 /**
   * Get timezonesExpirytime
   * @return timezonesExpirytime
  **/
  @JsonProperty("timezones.expirytime")
  public ConfigNodePropertyInteger getTimezonesExpirytime() {
    return timezonesExpirytime;
  }

  public void setTimezonesExpirytime(ConfigNodePropertyInteger timezonesExpirytime) {
    this.timezonesExpirytime = timezonesExpirytime;
  }

  public ComAdobeCqSocialCalendarServletsTimeZoneServletProperties timezonesExpirytime(ConfigNodePropertyInteger timezonesExpirytime) {
    this.timezonesExpirytime = timezonesExpirytime;
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
    ComAdobeCqSocialCalendarServletsTimeZoneServletProperties comAdobeCqSocialCalendarServletsTimeZoneServletProperties = (ComAdobeCqSocialCalendarServletsTimeZoneServletProperties) o;
    return Objects.equals(this.timezonesExpirytime, comAdobeCqSocialCalendarServletsTimeZoneServletProperties.timezonesExpirytime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timezonesExpirytime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCalendarServletsTimeZoneServletProperties {\n");
    
    sb.append("    timezonesExpirytime: ").append(toIndentedString(timezonesExpirytime)).append("\n");
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

