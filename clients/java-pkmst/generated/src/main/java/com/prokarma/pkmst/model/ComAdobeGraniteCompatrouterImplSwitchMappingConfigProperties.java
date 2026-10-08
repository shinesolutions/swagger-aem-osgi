package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties   {
  @JsonProperty("group")
  private ConfigNodePropertyString group;

  @JsonProperty("ids")
  private ConfigNodePropertyArray ids;

  public ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties group(ConfigNodePropertyString group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getGroup() {
    return group;
  }

  public void setGroup(ConfigNodePropertyString group) {
    this.group = group;
  }

  public ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties ids(ConfigNodePropertyArray ids) {
    this.ids = ids;
    return this;
  }

  /**
   * Get ids
   * @return ids
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getIds() {
    return ids;
  }

  public void setIds(ConfigNodePropertyArray ids) {
    this.ids = ids;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties = (ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties) o;
    return Objects.equals(this.group, comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.group) &&
        Objects.equals(this.ids, comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

