package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties   {
  
  private ConfigNodePropertyArray compatgroups = null;
  private ConfigNodePropertyBoolean enabled = null;

  /**
   **/
  public ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties compatgroups(ConfigNodePropertyArray compatgroups) {
    this.compatgroups = compatgroups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("compatgroups")
  public ConfigNodePropertyArray getCompatgroups() {
    return compatgroups;
  }
  public void setCompatgroups(ConfigNodePropertyArray compatgroups) {
    this.compatgroups = compatgroups;
  }

  /**
   **/
  public ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties = (ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties) o;
    return Objects.equals(compatgroups, comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties.compatgroups) &&
        Objects.equals(enabled, comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compatgroups, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties {\n");
    
    sb.append("    compatgroups: ").append(toIndentedString(compatgroups)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

