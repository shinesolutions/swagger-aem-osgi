package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties   {
  
  private ConfigNodePropertyBoolean formsManagerConfigIncludeOOTBTemplates = null;
  private ConfigNodePropertyBoolean formsManagerConfigIncludeDeprecatedTemplates = null;

  public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties () {

  }

  public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties (ConfigNodePropertyBoolean formsManagerConfigIncludeOOTBTemplates, ConfigNodePropertyBoolean formsManagerConfigIncludeDeprecatedTemplates) {
    this.formsManagerConfigIncludeOOTBTemplates = formsManagerConfigIncludeOOTBTemplates;
    this.formsManagerConfigIncludeDeprecatedTemplates = formsManagerConfigIncludeDeprecatedTemplates;
  }

    
  @JsonProperty("formsManagerConfig.includeOOTBTemplates")
  public ConfigNodePropertyBoolean getFormsManagerConfigIncludeOOTBTemplates() {
    return formsManagerConfigIncludeOOTBTemplates;
  }
  public void setFormsManagerConfigIncludeOOTBTemplates(ConfigNodePropertyBoolean formsManagerConfigIncludeOOTBTemplates) {
    this.formsManagerConfigIncludeOOTBTemplates = formsManagerConfigIncludeOOTBTemplates;
  }

    
  @JsonProperty("formsManagerConfig.includeDeprecatedTemplates")
  public ConfigNodePropertyBoolean getFormsManagerConfigIncludeDeprecatedTemplates() {
    return formsManagerConfigIncludeDeprecatedTemplates;
  }
  public void setFormsManagerConfigIncludeDeprecatedTemplates(ConfigNodePropertyBoolean formsManagerConfigIncludeDeprecatedTemplates) {
    this.formsManagerConfigIncludeDeprecatedTemplates = formsManagerConfigIncludeDeprecatedTemplates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties = (ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties) o;
    return Objects.equals(formsManagerConfigIncludeOOTBTemplates, comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties.formsManagerConfigIncludeOOTBTemplates) &&
        Objects.equals(formsManagerConfigIncludeDeprecatedTemplates, comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties.formsManagerConfigIncludeDeprecatedTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formsManagerConfigIncludeOOTBTemplates, formsManagerConfigIncludeDeprecatedTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties {\n");
    
    sb.append("    formsManagerConfigIncludeOOTBTemplates: ").append(toIndentedString(formsManagerConfigIncludeOOTBTemplates)).append("\n");
    sb.append("    formsManagerConfigIncludeDeprecatedTemplates: ").append(toIndentedString(formsManagerConfigIncludeDeprecatedTemplates)).append("\n");
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
