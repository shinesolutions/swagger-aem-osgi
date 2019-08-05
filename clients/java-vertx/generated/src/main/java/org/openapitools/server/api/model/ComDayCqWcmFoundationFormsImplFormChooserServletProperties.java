package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmFoundationFormsImplFormChooserServletProperties   {
  
  private ConfigNodePropertyString serviceName = null;
  private ConfigNodePropertyString slingServletResourceTypes = null;
  private ConfigNodePropertyString slingServletSelectors = null;
  private ConfigNodePropertyArray slingServletMethods = null;
  private ConfigNodePropertyBoolean formsFormchooserservletAdvansesearchRequire = null;

  public ComDayCqWcmFoundationFormsImplFormChooserServletProperties () {

  }

  public ComDayCqWcmFoundationFormsImplFormChooserServletProperties (ConfigNodePropertyString serviceName, ConfigNodePropertyString slingServletResourceTypes, ConfigNodePropertyString slingServletSelectors, ConfigNodePropertyArray slingServletMethods, ConfigNodePropertyBoolean formsFormchooserservletAdvansesearchRequire) {
    this.serviceName = serviceName;
    this.slingServletResourceTypes = slingServletResourceTypes;
    this.slingServletSelectors = slingServletSelectors;
    this.slingServletMethods = slingServletMethods;
    this.formsFormchooserservletAdvansesearchRequire = formsFormchooserservletAdvansesearchRequire;
  }

    
  @JsonProperty("service.name")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }
  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

    
  @JsonProperty("sling.servlet.resourceTypes")
  public ConfigNodePropertyString getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }
  public void setSlingServletResourceTypes(ConfigNodePropertyString slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

    
  @JsonProperty("sling.servlet.selectors")
  public ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }
  public void setSlingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

    
  @JsonProperty("sling.servlet.methods")
  public ConfigNodePropertyArray getSlingServletMethods() {
    return slingServletMethods;
  }
  public void setSlingServletMethods(ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

    
  @JsonProperty("forms.formchooserservlet.advansesearch.require")
  public ConfigNodePropertyBoolean getFormsFormchooserservletAdvansesearchRequire() {
    return formsFormchooserservletAdvansesearchRequire;
  }
  public void setFormsFormchooserservletAdvansesearchRequire(ConfigNodePropertyBoolean formsFormchooserservletAdvansesearchRequire) {
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
    return Objects.equals(serviceName, comDayCqWcmFoundationFormsImplFormChooserServletProperties.serviceName) &&
        Objects.equals(slingServletResourceTypes, comDayCqWcmFoundationFormsImplFormChooserServletProperties.slingServletResourceTypes) &&
        Objects.equals(slingServletSelectors, comDayCqWcmFoundationFormsImplFormChooserServletProperties.slingServletSelectors) &&
        Objects.equals(slingServletMethods, comDayCqWcmFoundationFormsImplFormChooserServletProperties.slingServletMethods) &&
        Objects.equals(formsFormchooserservletAdvansesearchRequire, comDayCqWcmFoundationFormsImplFormChooserServletProperties.formsFormchooserservletAdvansesearchRequire);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
