package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties   {
  
  private ConfigNodePropertyArray fieldWhitelist = null;


  /**
   **/
  public ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties fieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fieldWhitelist")
  public ConfigNodePropertyArray getFieldWhitelist() {
    return fieldWhitelist;
  }
  public void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties = (ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties) o;
    return Objects.equals(fieldWhitelist, comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties.fieldWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldWhitelist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties {\n");
    
    sb.append("    fieldWhitelist: ").append(toIndentedString(fieldWhitelist)).append("\n");
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

