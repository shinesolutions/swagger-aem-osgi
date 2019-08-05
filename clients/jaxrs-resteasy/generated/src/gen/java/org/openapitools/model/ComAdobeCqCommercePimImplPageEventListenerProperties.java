package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeCqCommercePimImplPageEventListenerProperties   {
  
  private ConfigNodePropertyBoolean cqCommercePageeventlistenerEnabled = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.commerce.pageeventlistener.enabled")
  public ConfigNodePropertyBoolean getCqCommercePageeventlistenerEnabled() {
    return cqCommercePageeventlistenerEnabled;
  }
  public void setCqCommercePageeventlistenerEnabled(ConfigNodePropertyBoolean cqCommercePageeventlistenerEnabled) {
    this.cqCommercePageeventlistenerEnabled = cqCommercePageeventlistenerEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqCommercePimImplPageEventListenerProperties comAdobeCqCommercePimImplPageEventListenerProperties = (ComAdobeCqCommercePimImplPageEventListenerProperties) o;
    return Objects.equals(cqCommercePageeventlistenerEnabled, comAdobeCqCommercePimImplPageEventListenerProperties.cqCommercePageeventlistenerEnabled);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

