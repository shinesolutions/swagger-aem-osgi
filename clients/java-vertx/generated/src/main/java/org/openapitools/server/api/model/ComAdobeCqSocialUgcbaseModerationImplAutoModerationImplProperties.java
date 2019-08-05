package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties   {
  
  private ConfigNodePropertyArray automoderationSequence = null;
  private ConfigNodePropertyBoolean automoderationOnfailurestop = null;

  public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties () {

  }

  public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties (ConfigNodePropertyArray automoderationSequence, ConfigNodePropertyBoolean automoderationOnfailurestop) {
    this.automoderationSequence = automoderationSequence;
    this.automoderationOnfailurestop = automoderationOnfailurestop;
  }

    
  @JsonProperty("automoderation.sequence")
  public ConfigNodePropertyArray getAutomoderationSequence() {
    return automoderationSequence;
  }
  public void setAutomoderationSequence(ConfigNodePropertyArray automoderationSequence) {
    this.automoderationSequence = automoderationSequence;
  }

    
  @JsonProperty("automoderation.onfailurestop")
  public ConfigNodePropertyBoolean getAutomoderationOnfailurestop() {
    return automoderationOnfailurestop;
  }
  public void setAutomoderationOnfailurestop(ConfigNodePropertyBoolean automoderationOnfailurestop) {
    this.automoderationOnfailurestop = automoderationOnfailurestop;
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
    return Objects.equals(automoderationSequence, comAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.automoderationSequence) &&
        Objects.equals(automoderationOnfailurestop, comAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.automoderationOnfailurestop);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
