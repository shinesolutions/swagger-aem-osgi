package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("adapter.condition")
  private ConfigNodePropertyString adapterCondition;

  @JsonProperty("granite.userproperties.nodetypes")
  private ConfigNodePropertyArray graniteUserpropertiesNodetypes;

  @JsonProperty("granite.userproperties.resourcetypes")
  private ConfigNodePropertyArray graniteUserpropertiesResourcetypes;

  /**
   * 
   * @return adapterCondition
   */
  public ConfigNodePropertyString getAdapterCondition() {
    return adapterCondition;
  }

  public void setAdapterCondition(ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
  }

  /**
   * 
   * @return graniteUserpropertiesNodetypes
   */
  public ConfigNodePropertyArray getGraniteUserpropertiesNodetypes() {
    return graniteUserpropertiesNodetypes;
  }

  public void setGraniteUserpropertiesNodetypes(ConfigNodePropertyArray graniteUserpropertiesNodetypes) {
    this.graniteUserpropertiesNodetypes = graniteUserpropertiesNodetypes;
  }

  /**
   * 
   * @return graniteUserpropertiesResourcetypes
   */
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
    return Objects.equals(this.adapterCondition, comAdobeGraniteSecurityUserUserPropertiesServiceProperties.adapterCondition) &&
        Objects.equals(this.graniteUserpropertiesNodetypes, comAdobeGraniteSecurityUserUserPropertiesServiceProperties.graniteUserpropertiesNodetypes) &&
        Objects.equals(this.graniteUserpropertiesResourcetypes, comAdobeGraniteSecurityUserUserPropertiesServiceProperties.graniteUserpropertiesResourcetypes);
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
