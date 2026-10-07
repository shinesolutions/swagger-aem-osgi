package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties   {
  private ConfigNodePropertyBoolean accepted;
  private ConfigNodePropertyInteger ranked;

  public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties() {
  }

  /**
   **/
  public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties accepted(ConfigNodePropertyBoolean accepted) {
    this.accepted = accepted;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("accepted")
  @Valid public ConfigNodePropertyBoolean getAccepted() {
    return accepted;
  }

  @JsonProperty("accepted")
  public void setAccepted(ConfigNodePropertyBoolean accepted) {
    this.accepted = accepted;
  }

  /**
   **/
  public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties ranked(ConfigNodePropertyInteger ranked) {
    this.ranked = ranked;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ranked")
  @Valid public ConfigNodePropertyInteger getRanked() {
    return ranked;
  }

  @JsonProperty("ranked")
  public void setRanked(ConfigNodePropertyInteger ranked) {
    this.ranked = ranked;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties = (ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties) o;
    return Objects.equals(this.accepted, comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.accepted) &&
        Objects.equals(this.ranked, comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.ranked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accepted, ranked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties {\n");
    
    sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
    sb.append("    ranked: ").append(toIndentedString(ranked)).append("\n");
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
