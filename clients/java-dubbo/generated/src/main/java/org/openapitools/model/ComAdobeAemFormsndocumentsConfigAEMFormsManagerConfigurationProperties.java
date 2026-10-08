package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("formsManagerConfig.includeOOTBTemplates")
  private ConfigNodePropertyBoolean formsManagerConfigIncludeOOTBTemplates;

  @JsonProperty("formsManagerConfig.includeDeprecatedTemplates")
  private ConfigNodePropertyBoolean formsManagerConfigIncludeDeprecatedTemplates;

  /**
   * 
   * @return formsManagerConfigIncludeOOTBTemplates
   */
  public ConfigNodePropertyBoolean getFormsManagerConfigIncludeOOTBTemplates() {
    return formsManagerConfigIncludeOOTBTemplates;
  }

  public void setFormsManagerConfigIncludeOOTBTemplates(ConfigNodePropertyBoolean formsManagerConfigIncludeOOTBTemplates) {
    this.formsManagerConfigIncludeOOTBTemplates = formsManagerConfigIncludeOOTBTemplates;
  }

  /**
   * 
   * @return formsManagerConfigIncludeDeprecatedTemplates
   */
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
    return Objects.equals(this.formsManagerConfigIncludeOOTBTemplates, comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties.formsManagerConfigIncludeOOTBTemplates) &&
        Objects.equals(this.formsManagerConfigIncludeDeprecatedTemplates, comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties.formsManagerConfigIncludeDeprecatedTemplates);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
