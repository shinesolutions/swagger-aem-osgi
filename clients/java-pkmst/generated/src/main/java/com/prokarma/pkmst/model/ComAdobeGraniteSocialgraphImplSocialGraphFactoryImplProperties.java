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
 * ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties   {
  @JsonProperty("group2member.relationship.outgoing")
  private ConfigNodePropertyString group2memberRelationshipOutgoing;

  @JsonProperty("group2member.excluded.outgoing")
  private ConfigNodePropertyArray group2memberExcludedOutgoing;

  @JsonProperty("group2member.relationship.incoming")
  private ConfigNodePropertyString group2memberRelationshipIncoming;

  @JsonProperty("group2member.excluded.incoming")
  private ConfigNodePropertyArray group2memberExcludedIncoming;

  public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties group2memberRelationshipOutgoing(ConfigNodePropertyString group2memberRelationshipOutgoing) {
    this.group2memberRelationshipOutgoing = group2memberRelationshipOutgoing;
    return this;
  }

  /**
   * Get group2memberRelationshipOutgoing
   * @return group2memberRelationshipOutgoing
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getGroup2memberRelationshipOutgoing() {
    return group2memberRelationshipOutgoing;
  }

  public void setGroup2memberRelationshipOutgoing(ConfigNodePropertyString group2memberRelationshipOutgoing) {
    this.group2memberRelationshipOutgoing = group2memberRelationshipOutgoing;
  }

  public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties group2memberExcludedOutgoing(ConfigNodePropertyArray group2memberExcludedOutgoing) {
    this.group2memberExcludedOutgoing = group2memberExcludedOutgoing;
    return this;
  }

  /**
   * Get group2memberExcludedOutgoing
   * @return group2memberExcludedOutgoing
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getGroup2memberExcludedOutgoing() {
    return group2memberExcludedOutgoing;
  }

  public void setGroup2memberExcludedOutgoing(ConfigNodePropertyArray group2memberExcludedOutgoing) {
    this.group2memberExcludedOutgoing = group2memberExcludedOutgoing;
  }

  public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties group2memberRelationshipIncoming(ConfigNodePropertyString group2memberRelationshipIncoming) {
    this.group2memberRelationshipIncoming = group2memberRelationshipIncoming;
    return this;
  }

  /**
   * Get group2memberRelationshipIncoming
   * @return group2memberRelationshipIncoming
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getGroup2memberRelationshipIncoming() {
    return group2memberRelationshipIncoming;
  }

  public void setGroup2memberRelationshipIncoming(ConfigNodePropertyString group2memberRelationshipIncoming) {
    this.group2memberRelationshipIncoming = group2memberRelationshipIncoming;
  }

  public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties group2memberExcludedIncoming(ConfigNodePropertyArray group2memberExcludedIncoming) {
    this.group2memberExcludedIncoming = group2memberExcludedIncoming;
    return this;
  }

  /**
   * Get group2memberExcludedIncoming
   * @return group2memberExcludedIncoming
   */
  @ApiModelProperty(value = "")
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

