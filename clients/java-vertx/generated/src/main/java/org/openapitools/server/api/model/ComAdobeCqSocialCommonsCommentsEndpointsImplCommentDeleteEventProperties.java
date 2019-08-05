package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties   {
  
  private ConfigNodePropertyInteger ranking = null;

  public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties () {

  }

  public ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties (ConfigNodePropertyInteger ranking) {
    this.ranking = ranking;
  }

    
  @JsonProperty("ranking")
  public ConfigNodePropertyInteger getRanking() {
    return ranking;
  }
  public void setRanking(ConfigNodePropertyInteger ranking) {
    this.ranking = ranking;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties = (ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties) o;
    return Objects.equals(ranking, comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties.ranking);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
