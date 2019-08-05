package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties   {
  

  private ConfigNodePropertyBoolean cqSocialContentFragmentsServicesEnabled = null;

  private ConfigNodePropertyInteger cqSocialContentFragmentsServicesWaitTimeSeconds = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.social.content.fragments.services.enabled")
  public ConfigNodePropertyBoolean getCqSocialContentFragmentsServicesEnabled() {
    return cqSocialContentFragmentsServicesEnabled;
  }
  public void setCqSocialContentFragmentsServicesEnabled(ConfigNodePropertyBoolean cqSocialContentFragmentsServicesEnabled) {
    this.cqSocialContentFragmentsServicesEnabled = cqSocialContentFragmentsServicesEnabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.social.content.fragments.services.waitTimeSeconds")
  public ConfigNodePropertyInteger getCqSocialContentFragmentsServicesWaitTimeSeconds() {
    return cqSocialContentFragmentsServicesWaitTimeSeconds;
  }
  public void setCqSocialContentFragmentsServicesWaitTimeSeconds(ConfigNodePropertyInteger cqSocialContentFragmentsServicesWaitTimeSeconds) {
    this.cqSocialContentFragmentsServicesWaitTimeSeconds = cqSocialContentFragmentsServicesWaitTimeSeconds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties = (ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties) o;
    return Objects.equals(cqSocialContentFragmentsServicesEnabled, comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.cqSocialContentFragmentsServicesEnabled) &&
        Objects.equals(cqSocialContentFragmentsServicesWaitTimeSeconds, comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.cqSocialContentFragmentsServicesWaitTimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqSocialContentFragmentsServicesEnabled, cqSocialContentFragmentsServicesWaitTimeSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties {\n");
    
    sb.append("    cqSocialContentFragmentsServicesEnabled: ").append(toIndentedString(cqSocialContentFragmentsServicesEnabled)).append("\n");
    sb.append("    cqSocialContentFragmentsServicesWaitTimeSeconds: ").append(toIndentedString(cqSocialContentFragmentsServicesWaitTimeSeconds)).append("\n");
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

