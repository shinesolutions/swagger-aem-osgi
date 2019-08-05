package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean cqSocialContentFragmentsServicesEnabled = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger cqSocialContentFragmentsServicesWaitTimeSeconds = null;
 /**
   * Get cqSocialContentFragmentsServicesEnabled
   * @return cqSocialContentFragmentsServicesEnabled
  **/
  @JsonProperty("cq.social.content.fragments.services.enabled")
  public ConfigNodePropertyBoolean getCqSocialContentFragmentsServicesEnabled() {
    return cqSocialContentFragmentsServicesEnabled;
  }

  public void setCqSocialContentFragmentsServicesEnabled(ConfigNodePropertyBoolean cqSocialContentFragmentsServicesEnabled) {
    this.cqSocialContentFragmentsServicesEnabled = cqSocialContentFragmentsServicesEnabled;
  }

  public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties cqSocialContentFragmentsServicesEnabled(ConfigNodePropertyBoolean cqSocialContentFragmentsServicesEnabled) {
    this.cqSocialContentFragmentsServicesEnabled = cqSocialContentFragmentsServicesEnabled;
    return this;
  }

 /**
   * Get cqSocialContentFragmentsServicesWaitTimeSeconds
   * @return cqSocialContentFragmentsServicesWaitTimeSeconds
  **/
  @JsonProperty("cq.social.content.fragments.services.waitTimeSeconds")
  public ConfigNodePropertyInteger getCqSocialContentFragmentsServicesWaitTimeSeconds() {
    return cqSocialContentFragmentsServicesWaitTimeSeconds;
  }

  public void setCqSocialContentFragmentsServicesWaitTimeSeconds(ConfigNodePropertyInteger cqSocialContentFragmentsServicesWaitTimeSeconds) {
    this.cqSocialContentFragmentsServicesWaitTimeSeconds = cqSocialContentFragmentsServicesWaitTimeSeconds;
  }

  public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties cqSocialContentFragmentsServicesWaitTimeSeconds(ConfigNodePropertyInteger cqSocialContentFragmentsServicesWaitTimeSeconds) {
    this.cqSocialContentFragmentsServicesWaitTimeSeconds = cqSocialContentFragmentsServicesWaitTimeSeconds;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

