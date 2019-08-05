package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties   {
  @JsonProperty("cq.social.content.fragments.services.enabled")
  private ConfigNodePropertyBoolean cqSocialContentFragmentsServicesEnabled = null;

  @JsonProperty("cq.social.content.fragments.services.waitTimeSeconds")
  private ConfigNodePropertyInteger cqSocialContentFragmentsServicesWaitTimeSeconds = null;

  public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties cqSocialContentFragmentsServicesEnabled(ConfigNodePropertyBoolean cqSocialContentFragmentsServicesEnabled) {
    this.cqSocialContentFragmentsServicesEnabled = cqSocialContentFragmentsServicesEnabled;
    return this;
  }

  /**
   * Get cqSocialContentFragmentsServicesEnabled
   * @return cqSocialContentFragmentsServicesEnabled
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getCqSocialContentFragmentsServicesEnabled() {
    return cqSocialContentFragmentsServicesEnabled;
  }

  public void setCqSocialContentFragmentsServicesEnabled(ConfigNodePropertyBoolean cqSocialContentFragmentsServicesEnabled) {
    this.cqSocialContentFragmentsServicesEnabled = cqSocialContentFragmentsServicesEnabled;
  }

  public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties cqSocialContentFragmentsServicesWaitTimeSeconds(ConfigNodePropertyInteger cqSocialContentFragmentsServicesWaitTimeSeconds) {
    this.cqSocialContentFragmentsServicesWaitTimeSeconds = cqSocialContentFragmentsServicesWaitTimeSeconds;
    return this;
  }

  /**
   * Get cqSocialContentFragmentsServicesWaitTimeSeconds
   * @return cqSocialContentFragmentsServicesWaitTimeSeconds
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getCqSocialContentFragmentsServicesWaitTimeSeconds() {
    return cqSocialContentFragmentsServicesWaitTimeSeconds;
  }

  public void setCqSocialContentFragmentsServicesWaitTimeSeconds(ConfigNodePropertyInteger cqSocialContentFragmentsServicesWaitTimeSeconds) {
    this.cqSocialContentFragmentsServicesWaitTimeSeconds = cqSocialContentFragmentsServicesWaitTimeSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties = (ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties) o;
    return Objects.equals(this.cqSocialContentFragmentsServicesEnabled, comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.cqSocialContentFragmentsServicesEnabled) &&
        Objects.equals(this.cqSocialContentFragmentsServicesWaitTimeSeconds, comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.cqSocialContentFragmentsServicesWaitTimeSeconds);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

