package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties   {
  @JsonProperty("automoderation.sequence")
  private ConfigNodePropertyArray automoderationSequence = null;

  @JsonProperty("automoderation.onfailurestop")
  private ConfigNodePropertyBoolean automoderationOnfailurestop = null;

  public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties automoderationSequence(ConfigNodePropertyArray automoderationSequence) {
    this.automoderationSequence = automoderationSequence;
    return this;
  }

   /**
   * Get automoderationSequence
   * @return automoderationSequence
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getAutomoderationSequence() {
    return automoderationSequence;
  }

  public void setAutomoderationSequence(ConfigNodePropertyArray automoderationSequence) {
    this.automoderationSequence = automoderationSequence;
  }

  public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties automoderationOnfailurestop(ConfigNodePropertyBoolean automoderationOnfailurestop) {
    this.automoderationOnfailurestop = automoderationOnfailurestop;
    return this;
  }

   /**
   * Get automoderationOnfailurestop
   * @return automoderationOnfailurestop
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getAutomoderationOnfailurestop() {
    return automoderationOnfailurestop;
  }

  public void setAutomoderationOnfailurestop(ConfigNodePropertyBoolean automoderationOnfailurestop) {
    this.automoderationOnfailurestop = automoderationOnfailurestop;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties comAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties = (ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties) o;
    return Objects.equals(this.automoderationSequence, comAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.automoderationSequence) &&
        Objects.equals(this.automoderationOnfailurestop, comAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.automoderationOnfailurestop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automoderationSequence, automoderationOnfailurestop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties {\n");
    
    sb.append("    automoderationSequence: ").append(toIndentedString(automoderationSequence)).append("\n");
    sb.append("    automoderationOnfailurestop: ").append(toIndentedString(automoderationOnfailurestop)).append("\n");
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

