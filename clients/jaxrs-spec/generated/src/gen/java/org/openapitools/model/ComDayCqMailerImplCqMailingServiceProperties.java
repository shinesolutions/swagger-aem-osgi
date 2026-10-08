package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqMailerImplCqMailingServiceProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqMailerImplCqMailingServiceProperties   {
  private ConfigNodePropertyString maxRecipientCount;

  public ComDayCqMailerImplCqMailingServiceProperties() {
  }

  /**
   **/
  public ComDayCqMailerImplCqMailingServiceProperties maxRecipientCount(ConfigNodePropertyString maxRecipientCount) {
    this.maxRecipientCount = maxRecipientCount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("max.recipient.count")
  @Valid public ConfigNodePropertyString getMaxRecipientCount() {
    return maxRecipientCount;
  }

  @JsonProperty("max.recipient.count")
  public void setMaxRecipientCount(ConfigNodePropertyString maxRecipientCount) {
    this.maxRecipientCount = maxRecipientCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqMailerImplCqMailingServiceProperties comDayCqMailerImplCqMailingServiceProperties = (ComDayCqMailerImplCqMailingServiceProperties) o;
    return Objects.equals(this.maxRecipientCount, comDayCqMailerImplCqMailingServiceProperties.maxRecipientCount);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
