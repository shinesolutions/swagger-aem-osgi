package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComDayCqWcmFoundationFormsImplFormChooserServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComDayCqWcmFoundationFormsImplFormChooserServletProperties   {
  @JsonProperty("service.name")
  private ConfigNodePropertyString serviceName = null;

  @JsonProperty("sling.servlet.resourceTypes")
  private ConfigNodePropertyString slingServletResourceTypes = null;

  @JsonProperty("sling.servlet.selectors")
  private ConfigNodePropertyString slingServletSelectors = null;

  @JsonProperty("sling.servlet.methods")
  private ConfigNodePropertyArray slingServletMethods = null;

  @JsonProperty("forms.formchooserservlet.advansesearch.require")
  private ConfigNodePropertyBoolean formsFormchooserservletAdvansesearchRequire = null;

  public ComDayCqWcmFoundationFormsImplFormChooserServletProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public ComDayCqWcmFoundationFormsImplFormChooserServletProperties slingServletResourceTypes(ConfigNodePropertyString slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
    return this;
  }

  /**
   * Get slingServletResourceTypes
   * @return slingServletResourceTypes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }

  public void setSlingServletResourceTypes(ConfigNodePropertyString slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

  public ComDayCqWcmFoundationFormsImplFormChooserServletProperties slingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

  /**
   * Get slingServletSelectors
   * @return slingServletSelectors
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }

  public void setSlingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  public ComDayCqWcmFoundationFormsImplFormChooserServletProperties slingServletMethods(ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

  /**
   * Get slingServletMethods
   * @return slingServletMethods
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getSlingServletMethods() {
    return slingServletMethods;
  }

  public void setSlingServletMethods(ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  public ComDayCqWcmFoundationFormsImplFormChooserServletProperties formsFormchooserservletAdvansesearchRequire(ConfigNodePropertyBoolean formsFormchooserservletAdvansesearchRequire) {
    this.formsFormchooserservletAdvansesearchRequire = formsFormchooserservletAdvansesearchRequire;
    return this;
  }

  /**
   * Get formsFormchooserservletAdvansesearchRequire
   * @return formsFormchooserservletAdvansesearchRequire
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getFormsFormchooserservletAdvansesearchRequire() {
    return formsFormchooserservletAdvansesearchRequire;
  }

  public void setFormsFormchooserservletAdvansesearchRequire(ConfigNodePropertyBoolean formsFormchooserservletAdvansesearchRequire) {
    this.formsFormchooserservletAdvansesearchRequire = formsFormchooserservletAdvansesearchRequire;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

