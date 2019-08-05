package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties   {
  
  private ConfigNodePropertyArray fieldWhitelist = null;

  public ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties () {

  }

  public ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties (ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
  }

    
  @JsonProperty("fieldWhitelist")
  public ConfigNodePropertyArray getFieldWhitelist() {
    return fieldWhitelist;
  }
  public void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
