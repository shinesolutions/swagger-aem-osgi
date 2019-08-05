package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties   {
  
  private ConfigNodePropertyBoolean accepted = null;
  private ConfigNodePropertyInteger ranked = null;

  public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties () {

  }

  public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties (ConfigNodePropertyBoolean accepted, ConfigNodePropertyInteger ranked) {
    this.accepted = accepted;
    this.ranked = ranked;
  }

    
  @JsonProperty("accepted")
  public ConfigNodePropertyBoolean getAccepted() {
    return accepted;
  }
  public void setAccepted(ConfigNodePropertyBoolean accepted) {
    this.accepted = accepted;
  }

    
  @JsonProperty("ranked")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
