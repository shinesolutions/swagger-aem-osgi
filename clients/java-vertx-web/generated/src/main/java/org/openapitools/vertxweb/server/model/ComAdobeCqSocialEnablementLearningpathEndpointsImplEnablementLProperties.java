package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties   {
  
  private ConfigNodePropertyArray fieldWhitelist;

  public ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties () {

  }

  public ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties (ConfigNodePropertyArray fieldWhitelist) {
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
    ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties = (ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties) o;
    return Objects.equals(fieldWhitelist, comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties.fieldWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldWhitelist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties {\n");
    
    sb.append("    fieldWhitelist: ").append(toIndentedString(fieldWhitelist)).append("\n");
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
