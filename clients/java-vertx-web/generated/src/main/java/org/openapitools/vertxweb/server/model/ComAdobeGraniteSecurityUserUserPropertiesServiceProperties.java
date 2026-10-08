package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyArray;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties   {
  
  private ConfigNodePropertyString adapterCondition;
  private ConfigNodePropertyArray graniteUserpropertiesNodetypes;
  private ConfigNodePropertyArray graniteUserpropertiesResourcetypes;

  public ComAdobeGraniteSecurityUserUserPropertiesServiceProperties () {

  }

  public ComAdobeGraniteSecurityUserUserPropertiesServiceProperties (ConfigNodePropertyString adapterCondition, ConfigNodePropertyArray graniteUserpropertiesNodetypes, ConfigNodePropertyArray graniteUserpropertiesResourcetypes) {
    this.adapterCondition = adapterCondition;
    this.graniteUserpropertiesNodetypes = graniteUserpropertiesNodetypes;
    this.graniteUserpropertiesResourcetypes = graniteUserpropertiesResourcetypes;
  }

    
  @JsonProperty("adapter.condition")
  public ConfigNodePropertyString getAdapterCondition() {
    return adapterCondition;
  }
  public void setAdapterCondition(ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
  }

    
  @JsonProperty("granite.userproperties.nodetypes")
  public ConfigNodePropertyArray getGraniteUserpropertiesNodetypes() {
    return graniteUserpropertiesNodetypes;
  }
  public void setGraniteUserpropertiesNodetypes(ConfigNodePropertyArray graniteUserpropertiesNodetypes) {
    this.graniteUserpropertiesNodetypes = graniteUserpropertiesNodetypes;
  }

    
  @JsonProperty("granite.userproperties.resourcetypes")
  public ConfigNodePropertyArray getGraniteUserpropertiesResourcetypes() {
    return graniteUserpropertiesResourcetypes;
  }
  public void setGraniteUserpropertiesResourcetypes(ConfigNodePropertyArray graniteUserpropertiesResourcetypes) {
    this.graniteUserpropertiesResourcetypes = graniteUserpropertiesResourcetypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteSecurityUserUserPropertiesServiceProperties comAdobeGraniteSecurityUserUserPropertiesServiceProperties = (ComAdobeGraniteSecurityUserUserPropertiesServiceProperties) o;
    return Objects.equals(adapterCondition, comAdobeGraniteSecurityUserUserPropertiesServiceProperties.adapterCondition) &&
        Objects.equals(graniteUserpropertiesNodetypes, comAdobeGraniteSecurityUserUserPropertiesServiceProperties.graniteUserpropertiesNodetypes) &&
        Objects.equals(graniteUserpropertiesResourcetypes, comAdobeGraniteSecurityUserUserPropertiesServiceProperties.graniteUserpropertiesResourcetypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adapterCondition, graniteUserpropertiesNodetypes, graniteUserpropertiesResourcetypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties {\n");
    
    sb.append("    adapterCondition: ").append(toIndentedString(adapterCondition)).append("\n");
    sb.append("    graniteUserpropertiesNodetypes: ").append(toIndentedString(graniteUserpropertiesNodetypes)).append("\n");
    sb.append("    graniteUserpropertiesResourcetypes: ").append(toIndentedString(graniteUserpropertiesResourcetypes)).append("\n");
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
