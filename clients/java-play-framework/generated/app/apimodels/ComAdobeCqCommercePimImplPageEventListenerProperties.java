package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqCommercePimImplPageEventListenerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqCommercePimImplPageEventListenerProperties   {
  @JsonProperty("cq.commerce.pageeventlistener.enabled")
  @Valid

  private ConfigNodePropertyBoolean cqCommercePageeventlistenerEnabled;

  public ComAdobeCqCommercePimImplPageEventListenerProperties cqCommercePageeventlistenerEnabled(ConfigNodePropertyBoolean cqCommercePageeventlistenerEnabled) {
    this.cqCommercePageeventlistenerEnabled = cqCommercePageeventlistenerEnabled;
    return this;
  }

   /**
   * Get cqCommercePageeventlistenerEnabled
   * @return cqCommercePageeventlistenerEnabled
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

