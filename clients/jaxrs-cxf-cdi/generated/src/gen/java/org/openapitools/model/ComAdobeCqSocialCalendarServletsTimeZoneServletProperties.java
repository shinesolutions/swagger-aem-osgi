package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComAdobeCqSocialCalendarServletsTimeZoneServletProperties   {
  
  private ConfigNodePropertyInteger timezonesExpirytime;

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

