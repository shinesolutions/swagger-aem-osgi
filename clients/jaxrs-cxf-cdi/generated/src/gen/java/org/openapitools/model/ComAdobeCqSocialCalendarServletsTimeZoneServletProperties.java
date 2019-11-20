package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqSocialCalendarServletsTimeZoneServletProperties   {
  
  private ConfigNodePropertyInteger timezonesExpirytime = null;


  /**
   **/
  public ComAdobeCqSocialCalendarServletsTimeZoneServletProperties timezonesExpirytime(ConfigNodePropertyInteger timezonesExpirytime) {
    this.timezonesExpirytime = timezonesExpirytime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("timezones.expirytime")
  public ConfigNodePropertyInteger getTimezonesExpirytime() {
    return timezonesExpirytime;
  }
  public void setTimezonesExpirytime(ConfigNodePropertyInteger timezonesExpirytime) {
    this.timezonesExpirytime = timezonesExpirytime;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCalendarServletsTimeZoneServletProperties comAdobeCqSocialCalendarServletsTimeZoneServletProperties = (ComAdobeCqSocialCalendarServletsTimeZoneServletProperties) o;
    return Objects.equals(timezonesExpirytime, comAdobeCqSocialCalendarServletsTimeZoneServletProperties.timezonesExpirytime);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
