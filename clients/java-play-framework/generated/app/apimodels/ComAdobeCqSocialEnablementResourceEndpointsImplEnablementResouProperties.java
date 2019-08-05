package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties   {
  @JsonProperty("fieldWhitelist")
  private ConfigNodePropertyArray fieldWhitelist = null;

  public ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties fieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
    return this;
  }

   /**
   * Get fieldWhitelist
   * @return fieldWhitelist
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

