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

public class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("group2member.relationship.outgoing")
  private ConfigNodePropertyString group2memberRelationshipOutgoing;

  @JsonProperty("group2member.excluded.outgoing")
  private ConfigNodePropertyArray group2memberExcludedOutgoing;

  @JsonProperty("group2member.relationship.incoming")
  private ConfigNodePropertyString group2memberRelationshipIncoming;

  @JsonProperty("group2member.excluded.incoming")
  private ConfigNodePropertyArray group2memberExcludedIncoming;

  /**
   * 
   * @return group2memberRelationshipOutgoing
   */
  public ConfigNodePropertyString getGroup2memberRelationshipOutgoing() {
    return group2memberRelationshipOutgoing;
  }

  public void setGroup2memberRelationshipOutgoing(ConfigNodePropertyString group2memberRelationshipOutgoing) {
    this.group2memberRelationshipOutgoing = group2memberRelationshipOutgoing;
  }

  /**
   * 
   * @return group2memberExcludedOutgoing
   */
  public ConfigNodePropertyArray getGroup2memberExcludedOutgoing() {
    return group2memberExcludedOutgoing;
  }

  public void setGroup2memberExcludedOutgoing(ConfigNodePropertyArray group2memberExcludedOutgoing) {
    this.group2memberExcludedOutgoing = group2memberExcludedOutgoing;
  }

  /**
   * 
   * @return group2memberRelationshipIncoming
   */
  public ConfigNodePropertyString getGroup2memberRelationshipIncoming() {
    return group2memberRelationshipIncoming;
  }

  public void setGroup2memberRelationshipIncoming(ConfigNodePropertyString group2memberRelationshipIncoming) {
    this.group2memberRelationshipIncoming = group2memberRelationshipIncoming;
  }

  /**
   * 
   * @return group2memberExcludedIncoming
   */
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
    return Objects.equals(this.group2memberRelationshipOutgoing, comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.group2memberRelationshipOutgoing) &&
        Objects.equals(this.group2memberExcludedOutgoing, comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.group2memberExcludedOutgoing) &&
        Objects.equals(this.group2memberRelationshipIncoming, comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.group2memberRelationshipIncoming) &&
        Objects.equals(this.group2memberExcludedIncoming, comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.group2memberExcludedIncoming);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
