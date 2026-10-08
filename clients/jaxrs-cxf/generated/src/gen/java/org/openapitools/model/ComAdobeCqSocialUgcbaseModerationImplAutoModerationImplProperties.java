package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray automoderationSequence;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean automoderationOnfailurestop;
 /**
   * Get automoderationSequence
   * @return automoderationSequence
  **/
  @JsonProperty("automoderation.sequence")
  public ConfigNodePropertyArray getAutomoderationSequence() {
    return automoderationSequence;
  }

  public void setAutomoderationSequence(ConfigNodePropertyArray automoderationSequence) {
    this.automoderationSequence = automoderationSequence;
  }

  public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties automoderationSequence(ConfigNodePropertyArray automoderationSequence) {
    this.automoderationSequence = automoderationSequence;
    return this;
  }

 /**
   * Get automoderationOnfailurestop
   * @return automoderationOnfailurestop
  **/
  @JsonProperty("automoderation.onfailurestop")
  public ConfigNodePropertyBoolean getAutomoderationOnfailurestop() {
    return automoderationOnfailurestop;
  }

  public void setAutomoderationOnfailurestop(ConfigNodePropertyBoolean automoderationOnfailurestop) {
    this.automoderationOnfailurestop = automoderationOnfailurestop;
  }

  public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties automoderationOnfailurestop(ConfigNodePropertyBoolean automoderationOnfailurestop) {
    this.automoderationOnfailurestop = automoderationOnfailurestop;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

