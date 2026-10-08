package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmFoundationFormsImplFormChooserServletProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString serviceName;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString slingServletResourceTypes;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString slingServletSelectors;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray slingServletMethods;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean formsFormchooserservletAdvansesearchRequire;
 /**
   * Get serviceName
   * @return serviceName
  **/
  @JsonProperty("service.name")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public ComDayCqWcmFoundationFormsImplFormChooserServletProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

 /**
   * Get slingServletResourceTypes
   * @return slingServletResourceTypes
  **/
  @JsonProperty("sling.servlet.resourceTypes")
  public ConfigNodePropertyString getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }

  public void setSlingServletResourceTypes(ConfigNodePropertyString slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

  public ComDayCqWcmFoundationFormsImplFormChooserServletProperties slingServletResourceTypes(ConfigNodePropertyString slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
    return this;
  }

 /**
   * Get slingServletSelectors
   * @return slingServletSelectors
  **/
  @JsonProperty("sling.servlet.selectors")
  public ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }

  public void setSlingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  public ComDayCqWcmFoundationFormsImplFormChooserServletProperties slingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

 /**
   * Get slingServletMethods
   * @return slingServletMethods
  **/
  @JsonProperty("sling.servlet.methods")
  public ConfigNodePropertyArray getSlingServletMethods() {
    return slingServletMethods;
  }

  public void setSlingServletMethods(ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  public ComDayCqWcmFoundationFormsImplFormChooserServletProperties slingServletMethods(ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

 /**
   * Get formsFormchooserservletAdvansesearchRequire
   * @return formsFormchooserservletAdvansesearchRequire
  **/
  @JsonProperty("forms.formchooserservlet.advansesearch.require")
  public ConfigNodePropertyBoolean getFormsFormchooserservletAdvansesearchRequire() {
    return formsFormchooserservletAdvansesearchRequire;
  }

  public void setFormsFormchooserservletAdvansesearchRequire(ConfigNodePropertyBoolean formsFormchooserservletAdvansesearchRequire) {
    this.formsFormchooserservletAdvansesearchRequire = formsFormchooserservletAdvansesearchRequire;
  }

  public ComDayCqWcmFoundationFormsImplFormChooserServletProperties formsFormchooserservletAdvansesearchRequire(ConfigNodePropertyBoolean formsFormchooserservletAdvansesearchRequire) {
    this.formsFormchooserservletAdvansesearchRequire = formsFormchooserservletAdvansesearchRequire;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

