package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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
    return Objects.equals(automoderationSequence, comAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.automoderationSequence) &&
        Objects.equals(automoderationOnfailurestop, comAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.automoderationOnfailurestop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automoderationSequence, automoderationOnfailurestop);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

