package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties   {
  
  private ConfigNodePropertyString adapterCondition = null;
  private ConfigNodePropertyArray graniteUserpropertiesNodetypes = null;
  private ConfigNodePropertyArray graniteUserpropertiesResourcetypes = null;

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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
