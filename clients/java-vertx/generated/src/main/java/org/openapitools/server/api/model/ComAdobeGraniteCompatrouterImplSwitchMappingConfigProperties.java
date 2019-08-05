package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties   {
  
  private ConfigNodePropertyString group = null;
  private ConfigNodePropertyArray ids = null;

  public ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties () {

  }

  public ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties (ConfigNodePropertyString group, ConfigNodePropertyArray ids) {
    this.group = group;
    this.ids = ids;
  }

    
  @JsonProperty("group")
  public ConfigNodePropertyString getGroup() {
    return group;
  }
  public void setGroup(ConfigNodePropertyString group) {
    this.group = group;
  }

    
  @JsonProperty("ids")
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
    return Objects.equals(group, comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.group) &&
        Objects.equals(ids, comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.ids);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
