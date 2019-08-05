package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteSecurityUserUserPropertiesServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties   {
  @JsonProperty("adapter.condition")
  private ConfigNodePropertyString adapterCondition = null;

  @JsonProperty("granite.userproperties.nodetypes")
  private ConfigNodePropertyArray graniteUserpropertiesNodetypes = null;

  @JsonProperty("granite.userproperties.resourcetypes")
  private ConfigNodePropertyArray graniteUserpropertiesResourcetypes = null;

  public ComAdobeGraniteSecurityUserUserPropertiesServiceProperties adapterCondition(ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
    return this;
  }

   /**
   * Get adapterCondition
   * @return adapterCondition
  **/
  @Valid
  public ConfigNodePropertyString getAdapterCondition() {
    return adapterCondition;
  }

  public void setAdapterCondition(ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
  }

  public ComAdobeGraniteSecurityUserUserPropertiesServiceProperties graniteUserpropertiesNodetypes(ConfigNodePropertyArray graniteUserpropertiesNodetypes) {
    this.graniteUserpropertiesNodetypes = graniteUserpropertiesNodetypes;
    return this;
  }

   /**
   * Get graniteUserpropertiesNodetypes
   * @return graniteUserpropertiesNodetypes
  **/
  @Valid
  public ConfigNodePropertyArray getGraniteUserpropertiesNodetypes() {
    return graniteUserpropertiesNodetypes;
  }

  public void setGraniteUserpropertiesNodetypes(ConfigNodePropertyArray graniteUserpropertiesNodetypes) {
    this.graniteUserpropertiesNodetypes = graniteUserpropertiesNodetypes;
  }

  public ComAdobeGraniteSecurityUserUserPropertiesServiceProperties graniteUserpropertiesResourcetypes(ConfigNodePropertyArray graniteUserpropertiesResourcetypes) {
    this.graniteUserpropertiesResourcetypes = graniteUserpropertiesResourcetypes;
    return this;
  }

   /**
   * Get graniteUserpropertiesResourcetypes
   * @return graniteUserpropertiesResourcetypes
  **/
  @Valid
  public ConfigNodePropertyArray getGraniteUserpropertiesResourcetypes() {
    return graniteUserpropertiesResourcetypes;
  }

  public void setGraniteUserpropertiesResourcetypes(ConfigNodePropertyArray graniteUserpropertiesResourcetypes) {
    this.graniteUserpropertiesResourcetypes = graniteUserpropertiesResourcetypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

