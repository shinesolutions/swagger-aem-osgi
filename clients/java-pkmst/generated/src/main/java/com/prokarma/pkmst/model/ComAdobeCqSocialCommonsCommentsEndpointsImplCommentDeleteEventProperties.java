package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties   {
  @JsonProperty("ranking")
  private ConfigNodePropertyInteger ranking = null;

  public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties ranking(ConfigNodePropertyInteger ranking) {
    this.ranking = ranking;
    return this;
  }

   /**
   * Get ranking
   * @return ranking
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getRanking() {
    return ranking;
  }

  public void setRanking(ConfigNodePropertyInteger ranking) {
    this.ranking = ranking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties = (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties) o;
    return Objects.equals(this.ranking, comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties.ranking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties {\n");
    
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
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

