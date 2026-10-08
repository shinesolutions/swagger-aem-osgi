package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqCommercePimImplPageEventListenerProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqCommercePimImplPageEventListenerProperties   {
  private ConfigNodePropertyBoolean cqCommercePageeventlistenerEnabled;

  public ComAdobeCqCommercePimImplPageEventListenerProperties() {
  }

  /**
   **/
  public ComAdobeCqCommercePimImplPageEventListenerProperties cqCommercePageeventlistenerEnabled(ConfigNodePropertyBoolean cqCommercePageeventlistenerEnabled) {
    this.cqCommercePageeventlistenerEnabled = cqCommercePageeventlistenerEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.commerce.pageeventlistener.enabled")
  @Valid public ConfigNodePropertyBoolean getCqCommercePageeventlistenerEnabled() {
    return cqCommercePageeventlistenerEnabled;
  }

  @JsonProperty("cq.commerce.pageeventlistener.enabled")
  public void setCqCommercePageeventlistenerEnabled(ConfigNodePropertyBoolean cqCommercePageeventlistenerEnabled) {
    this.cqCommercePageeventlistenerEnabled = cqCommercePageeventlistenerEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqCommercePimImplPageEventListenerProperties comAdobeCqCommercePimImplPageEventListenerProperties = (ComAdobeCqCommercePimImplPageEventListenerProperties) o;
    return Objects.equals(this.cqCommercePageeventlistenerEnabled, comAdobeCqCommercePimImplPageEventListenerProperties.cqCommercePageeventlistenerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqCommercePageeventlistenerEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqCommercePimImplPageEventListenerProperties {\n");
    
    sb.append("    cqCommercePageeventlistenerEnabled: ").append(toIndentedString(cqCommercePageeventlistenerEnabled)).append("\n");
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
