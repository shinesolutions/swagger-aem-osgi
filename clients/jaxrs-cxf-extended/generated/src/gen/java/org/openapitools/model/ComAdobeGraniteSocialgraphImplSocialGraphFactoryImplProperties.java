package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString group2memberRelationshipOutgoing;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray group2memberExcludedOutgoing;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString group2memberRelationshipIncoming;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray group2memberExcludedIncoming;
 /**
  * Get group2memberRelationshipOutgoing
  * @return group2memberRelationshipOutgoing
  */
  @JsonProperty("group2member.relationship.outgoing")
  public ConfigNodePropertyString getGroup2memberRelationshipOutgoing() {
    return group2memberRelationshipOutgoing;
  }

  /**
   * Sets the <code>group2memberRelationshipOutgoing</code> property.
   */
 public void setGroup2memberRelationshipOutgoing(ConfigNodePropertyString group2memberRelationshipOutgoing) {
    this.group2memberRelationshipOutgoing = group2memberRelationshipOutgoing;
  }

  /**
   * Sets the <code>group2memberRelationshipOutgoing</code> property.
   */
  public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties group2memberRelationshipOutgoing(ConfigNodePropertyString group2memberRelationshipOutgoing) {
    this.group2memberRelationshipOutgoing = group2memberRelationshipOutgoing;
    return this;
  }

 /**
  * Get group2memberExcludedOutgoing
  * @return group2memberExcludedOutgoing
  */
  @JsonProperty("group2member.excluded.outgoing")
  public ConfigNodePropertyArray getGroup2memberExcludedOutgoing() {
    return group2memberExcludedOutgoing;
  }

  /**
   * Sets the <code>group2memberExcludedOutgoing</code> property.
   */
 public void setGroup2memberExcludedOutgoing(ConfigNodePropertyArray group2memberExcludedOutgoing) {
    this.group2memberExcludedOutgoing = group2memberExcludedOutgoing;
  }

  /**
   * Sets the <code>group2memberExcludedOutgoing</code> property.
   */
  public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties group2memberExcludedOutgoing(ConfigNodePropertyArray group2memberExcludedOutgoing) {
    this.group2memberExcludedOutgoing = group2memberExcludedOutgoing;
    return this;
  }

 /**
  * Get group2memberRelationshipIncoming
  * @return group2memberRelationshipIncoming
  */
  @JsonProperty("group2member.relationship.incoming")
  public ConfigNodePropertyString getGroup2memberRelationshipIncoming() {
    return group2memberRelationshipIncoming;
  }

  /**
   * Sets the <code>group2memberRelationshipIncoming</code> property.
   */
 public void setGroup2memberRelationshipIncoming(ConfigNodePropertyString group2memberRelationshipIncoming) {
    this.group2memberRelationshipIncoming = group2memberRelationshipIncoming;
  }

  /**
   * Sets the <code>group2memberRelationshipIncoming</code> property.
   */
  public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties group2memberRelationshipIncoming(ConfigNodePropertyString group2memberRelationshipIncoming) {
    this.group2memberRelationshipIncoming = group2memberRelationshipIncoming;
    return this;
  }

 /**
  * Get group2memberExcludedIncoming
  * @return group2memberExcludedIncoming
  */
  @JsonProperty("group2member.excluded.incoming")
  public ConfigNodePropertyArray getGroup2memberExcludedIncoming() {
    return group2memberExcludedIncoming;
  }

  /**
   * Sets the <code>group2memberExcludedIncoming</code> property.
   */
 public void setGroup2memberExcludedIncoming(ConfigNodePropertyArray group2memberExcludedIncoming) {
    this.group2memberExcludedIncoming = group2memberExcludedIncoming;
  }

  /**
   * Sets the <code>group2memberExcludedIncoming</code> property.
   */
  public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties group2memberExcludedIncoming(ConfigNodePropertyArray group2memberExcludedIncoming) {
    this.group2memberExcludedIncoming = group2memberExcludedIncoming;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

