package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties   {
  
  private ConfigNodePropertyString group2memberRelationshipOutgoing = null;
  private ConfigNodePropertyArray group2memberExcludedOutgoing = null;
  private ConfigNodePropertyString group2memberRelationshipIncoming = null;
  private ConfigNodePropertyArray group2memberExcludedIncoming = null;

  public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties () {

  }

  public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties (ConfigNodePropertyString group2memberRelationshipOutgoing, ConfigNodePropertyArray group2memberExcludedOutgoing, ConfigNodePropertyString group2memberRelationshipIncoming, ConfigNodePropertyArray group2memberExcludedIncoming) {
    this.group2memberRelationshipOutgoing = group2memberRelationshipOutgoing;
    this.group2memberExcludedOutgoing = group2memberExcludedOutgoing;
    this.group2memberRelationshipIncoming = group2memberRelationshipIncoming;
    this.group2memberExcludedIncoming = group2memberExcludedIncoming;
  }

    
  @JsonProperty("group2member.relationship.outgoing")
  public ConfigNodePropertyString getGroup2memberRelationshipOutgoing() {
    return group2memberRelationshipOutgoing;
  }
  public void setGroup2memberRelationshipOutgoing(ConfigNodePropertyString group2memberRelationshipOutgoing) {
    this.group2memberRelationshipOutgoing = group2memberRelationshipOutgoing;
  }

    
  @JsonProperty("group2member.excluded.outgoing")
  public ConfigNodePropertyArray getGroup2memberExcludedOutgoing() {
    return group2memberExcludedOutgoing;
  }
  public void setGroup2memberExcludedOutgoing(ConfigNodePropertyArray group2memberExcludedOutgoing) {
    this.group2memberExcludedOutgoing = group2memberExcludedOutgoing;
  }

    
  @JsonProperty("group2member.relationship.incoming")
  public ConfigNodePropertyString getGroup2memberRelationshipIncoming() {
    return group2memberRelationshipIncoming;
  }
  public void setGroup2memberRelationshipIncoming(ConfigNodePropertyString group2memberRelationshipIncoming) {
    this.group2memberRelationshipIncoming = group2memberRelationshipIncoming;
  }

    
  @JsonProperty("group2member.excluded.incoming")
  public ConfigNodePropertyArray getGroup2memberExcludedIncoming() {
    return group2memberExcludedIncoming;
  }
  public void setGroup2memberExcludedIncoming(ConfigNodePropertyArray group2memberExcludedIncoming) {
    this.group2memberExcludedIncoming = group2memberExcludedIncoming;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties = (ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties) o;
    return Objects.equals(group2memberRelationshipOutgoing, comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.group2memberRelationshipOutgoing) &&
        Objects.equals(group2memberExcludedOutgoing, comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.group2memberExcludedOutgoing) &&
        Objects.equals(group2memberRelationshipIncoming, comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.group2memberRelationshipIncoming) &&
        Objects.equals(group2memberExcludedIncoming, comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.group2memberExcludedIncoming);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group2memberRelationshipOutgoing, group2memberExcludedOutgoing, group2memberRelationshipIncoming, group2memberExcludedIncoming);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties {\n");
    
    sb.append("    group2memberRelationshipOutgoing: ").append(toIndentedString(group2memberRelationshipOutgoing)).append("\n");
    sb.append("    group2memberExcludedOutgoing: ").append(toIndentedString(group2memberExcludedOutgoing)).append("\n");
    sb.append("    group2memberRelationshipIncoming: ").append(toIndentedString(group2memberRelationshipIncoming)).append("\n");
    sb.append("    group2memberExcludedIncoming: ").append(toIndentedString(group2memberExcludedIncoming)).append("\n");
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
