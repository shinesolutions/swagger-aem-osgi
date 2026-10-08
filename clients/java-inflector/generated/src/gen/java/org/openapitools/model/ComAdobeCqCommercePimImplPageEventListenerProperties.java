package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqCommercePimImplPageEventListenerProperties   {
  @JsonProperty("cq.commerce.pageeventlistener.enabled")
  private ConfigNodePropertyBoolean cqCommercePageeventlistenerEnabled;

  /**
   **/
  public ComAdobeCqCommercePimImplPageEventListenerProperties cqCommercePageeventlistenerEnabled(ConfigNodePropertyBoolean cqCommercePageeventlistenerEnabled) {
    this.cqCommercePageeventlistenerEnabled = cqCommercePageeventlistenerEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.commerce.pageeventlistener.enabled")
  public ConfigNodePropertyBoolean getCqCommercePageeventlistenerEnabled() {
    return cqCommercePageeventlistenerEnabled;
  }
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

