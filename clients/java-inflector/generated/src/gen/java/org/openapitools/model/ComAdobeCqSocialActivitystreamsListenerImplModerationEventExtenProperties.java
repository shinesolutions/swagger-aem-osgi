package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties   {
  @JsonProperty("accepted")
  private ConfigNodePropertyBoolean accepted = null;

  @JsonProperty("ranked")
  private ConfigNodePropertyInteger ranked = null;

  /**
   **/
  public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties accepted(ConfigNodePropertyBoolean accepted) {
    this.accepted = accepted;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("accepted")
  public ConfigNodePropertyBoolean getAccepted() {
    return accepted;
  }
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
  public ConfigNodePropertyInteger getRanked() {
    return ranked;
  }
  public void setRanked(ConfigNodePropertyInteger ranked) {
    this.ranked = ranked;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties = (ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties) o;
    return Objects.equals(accepted, comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.accepted) &&
        Objects.equals(ranked, comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.ranked);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

