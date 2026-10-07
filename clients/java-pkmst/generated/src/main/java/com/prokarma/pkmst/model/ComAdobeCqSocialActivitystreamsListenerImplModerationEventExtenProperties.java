package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties   {
  @JsonProperty("accepted")
  private ConfigNodePropertyBoolean accepted;

  @JsonProperty("ranked")
  private ConfigNodePropertyInteger ranked;

  public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties accepted(ConfigNodePropertyBoolean accepted) {
    this.accepted = accepted;
    return this;
  }

  /**
   * Get accepted
   * @return accepted
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getAccepted() {
    return accepted;
  }

  public void setAccepted(ConfigNodePropertyBoolean accepted) {
    this.accepted = accepted;
  }

  public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties ranked(ConfigNodePropertyInteger ranked) {
    this.ranked = ranked;
    return this;
  }

  /**
   * Get ranked
   * @return ranked
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getRanked() {
    return ranked;
  }

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

