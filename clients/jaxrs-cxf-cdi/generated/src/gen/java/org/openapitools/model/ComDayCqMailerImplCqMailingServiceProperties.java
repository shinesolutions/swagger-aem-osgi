package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqMailerImplCqMailingServiceProperties   {
  
  private ConfigNodePropertyString maxRecipientCount = null;


  /**
   **/
  public ComDayCqMailerImplCqMailingServiceProperties maxRecipientCount(ConfigNodePropertyString maxRecipientCount) {
    this.maxRecipientCount = maxRecipientCount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("max.recipient.count")
  public ConfigNodePropertyString getMaxRecipientCount() {
    return maxRecipientCount;
  }
  public void setMaxRecipientCount(ConfigNodePropertyString maxRecipientCount) {
    this.maxRecipientCount = maxRecipientCount;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqMailerImplCqMailingServiceProperties comDayCqMailerImplCqMailingServiceProperties = (ComDayCqMailerImplCqMailingServiceProperties) o;
    return Objects.equals(maxRecipientCount, comDayCqMailerImplCqMailingServiceProperties.maxRecipientCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxRecipientCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMailerImplCqMailingServiceProperties {\n");
    
    sb.append("    maxRecipientCount: ").append(toIndentedString(maxRecipientCount)).append("\n");
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

