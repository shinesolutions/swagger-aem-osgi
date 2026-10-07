package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties   {
  @JsonProperty("compatgroups")
  private ConfigNodePropertyArray compatgroups;

  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled;

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
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

