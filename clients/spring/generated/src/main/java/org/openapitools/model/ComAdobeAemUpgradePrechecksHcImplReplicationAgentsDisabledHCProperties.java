package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties   {
  @JsonProperty("hc.name")
  private ConfigNodePropertyString hcName = null;

  @JsonProperty("hc.tags")
  private ConfigNodePropertyArray hcTags = null;

  @JsonProperty("hc.mbean.name")
  private ConfigNodePropertyString hcMbeanName = null;

  public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties hcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
    return this;
  }

  /**
   * Get hcName
   * @return hcName
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getHcName() {
    return hcName;
  }

  public void setHcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

  public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

  /**
   * Get hcTags
   * @return hcTags
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties hcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
    return this;
  }

  /**
   * Get hcMbeanName
   * @return hcMbeanName
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }

  public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties = (ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties) o;
    return Objects.equals(this.hcName, comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.hcName) &&
        Objects.equals(this.hcTags, comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.hcTags) &&
        Objects.equals(this.hcMbeanName, comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.hcMbeanName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcName, hcTags, hcMbeanName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties {\n");
    
    sb.append("    hcName: ").append(toIndentedString(hcName)).append("\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    hcMbeanName: ").append(toIndentedString(hcMbeanName)).append("\n");
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

