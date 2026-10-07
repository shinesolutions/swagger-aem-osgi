package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties
 */

@JsonTypeName("comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties {

  private ConfigNodePropertyBoolean formsManagerConfigIncludeOOTBTemplates;

  private ConfigNodePropertyBoolean formsManagerConfigIncludeDeprecatedTemplates;

  public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties formsManagerConfigIncludeOOTBTemplates(ConfigNodePropertyBoolean formsManagerConfigIncludeOOTBTemplates) {
    this.formsManagerConfigIncludeOOTBTemplates = formsManagerConfigIncludeOOTBTemplates;
    return this;
  }

  /**
   * Get formsManagerConfigIncludeOOTBTemplates
   * @return formsManagerConfigIncludeOOTBTemplates
   */
  @Valid 
  @Schema(name = "formsManagerConfig.includeOOTBTemplates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formsManagerConfig.includeOOTBTemplates")
  public ConfigNodePropertyBoolean getFormsManagerConfigIncludeOOTBTemplates() {
    return formsManagerConfigIncludeOOTBTemplates;
  }

  public void setFormsManagerConfigIncludeOOTBTemplates(ConfigNodePropertyBoolean formsManagerConfigIncludeOOTBTemplates) {
    this.formsManagerConfigIncludeOOTBTemplates = formsManagerConfigIncludeOOTBTemplates;
  }

  public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties formsManagerConfigIncludeDeprecatedTemplates(ConfigNodePropertyBoolean formsManagerConfigIncludeDeprecatedTemplates) {
    this.formsManagerConfigIncludeDeprecatedTemplates = formsManagerConfigIncludeDeprecatedTemplates;
    return this;
  }

  /**
   * Get formsManagerConfigIncludeDeprecatedTemplates
   * @return formsManagerConfigIncludeDeprecatedTemplates
   */
  @Valid 
  @Schema(name = "formsManagerConfig.includeDeprecatedTemplates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

