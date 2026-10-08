package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWcmFoundationFormsImplFormChooserServletProperties
 */

@JsonTypeName("comDayCqWcmFoundationFormsImplFormChooserServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmFoundationFormsImplFormChooserServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString serviceName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString slingServletResourceTypes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString slingServletSelectors;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray slingServletMethods;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean formsFormchooserservletAdvansesearchRequire;

  public ComDayCqWcmFoundationFormsImplFormChooserServletProperties serviceName(@Nullable ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
   */
  @Valid 
  @Schema(name = "service.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service.name")
  public @Nullable ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  @JsonProperty("service.name")
  public void setServiceName(@Nullable ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public ComDayCqWcmFoundationFormsImplFormChooserServletProperties slingServletResourceTypes(@Nullable ConfigNodePropertyString slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
    return this;
  }

  /**
   * Get slingServletResourceTypes
   * @return slingServletResourceTypes
   */
  @Valid 
  @Schema(name = "sling.servlet.resourceTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.servlet.resourceTypes")
  public @Nullable ConfigNodePropertyString getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }

  @JsonProperty("sling.servlet.resourceTypes")
  public void setSlingServletResourceTypes(@Nullable ConfigNodePropertyString slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

  public ComDayCqWcmFoundationFormsImplFormChooserServletProperties slingServletSelectors(@Nullable ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

  /**
   * Get slingServletSelectors
   * @return slingServletSelectors
   */
  @Valid 
  @Schema(name = "sling.servlet.selectors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.servlet.selectors")
  public @Nullable ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }

  @JsonProperty("sling.servlet.selectors")
  public void setSlingServletSelectors(@Nullable ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  public ComDayCqWcmFoundationFormsImplFormChooserServletProperties slingServletMethods(@Nullable ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

  /**
   * Get slingServletMethods
   * @return slingServletMethods
   */
  @Valid 
  @Schema(name = "sling.servlet.methods", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.servlet.methods")
  public @Nullable ConfigNodePropertyArray getSlingServletMethods() {
    return slingServletMethods;
  }

  @JsonProperty("sling.servlet.methods")
  public void setSlingServletMethods(@Nullable ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  public ComDayCqWcmFoundationFormsImplFormChooserServletProperties formsFormchooserservletAdvansesearchRequire(@Nullable ConfigNodePropertyBoolean formsFormchooserservletAdvansesearchRequire) {
    this.formsFormchooserservletAdvansesearchRequire = formsFormchooserservletAdvansesearchRequire;
    return this;
  }

  /**
   * Get formsFormchooserservletAdvansesearchRequire
   * @return formsFormchooserservletAdvansesearchRequire
   */
  @Valid 
  @Schema(name = "forms.formchooserservlet.advansesearch.require", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("forms.formchooserservlet.advansesearch.require")
  public @Nullable ConfigNodePropertyBoolean getFormsFormchooserservletAdvansesearchRequire() {
    return formsFormchooserservletAdvansesearchRequire;
  }

  @JsonProperty("forms.formchooserservlet.advansesearch.require")
  public void setFormsFormchooserservletAdvansesearchRequire(@Nullable ConfigNodePropertyBoolean formsFormchooserservletAdvansesearchRequire) {
    this.formsFormchooserservletAdvansesearchRequire = formsFormchooserservletAdvansesearchRequire;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmFoundationFormsImplFormChooserServletProperties comDayCqWcmFoundationFormsImplFormChooserServletProperties = (ComDayCqWcmFoundationFormsImplFormChooserServletProperties) o;
    return Objects.equals(this.serviceName, comDayCqWcmFoundationFormsImplFormChooserServletProperties.serviceName) &&
        Objects.equals(this.slingServletResourceTypes, comDayCqWcmFoundationFormsImplFormChooserServletProperties.slingServletResourceTypes) &&
        Objects.equals(this.slingServletSelectors, comDayCqWcmFoundationFormsImplFormChooserServletProperties.slingServletSelectors) &&
        Objects.equals(this.slingServletMethods, comDayCqWcmFoundationFormsImplFormChooserServletProperties.slingServletMethods) &&
        Objects.equals(this.formsFormchooserservletAdvansesearchRequire, comDayCqWcmFoundationFormsImplFormChooserServletProperties.formsFormchooserservletAdvansesearchRequire);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName, slingServletResourceTypes, slingServletSelectors, slingServletMethods, formsFormchooserservletAdvansesearchRequire);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationFormsImplFormChooserServletProperties {\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    slingServletResourceTypes: ").append(toIndentedString(slingServletResourceTypes)).append("\n");
    sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
    sb.append("    formsFormchooserservletAdvansesearchRequire: ").append(toIndentedString(formsFormchooserservletAdvansesearchRequire)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

