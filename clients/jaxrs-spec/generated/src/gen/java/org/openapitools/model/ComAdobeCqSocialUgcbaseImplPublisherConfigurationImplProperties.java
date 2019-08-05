package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties   {
  
  private @Valid ConfigNodePropertyBoolean isPrimaryPublisher = null;

  /**
   **/
  public ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties isPrimaryPublisher(ConfigNodePropertyBoolean isPrimaryPublisher) {
    this.isPrimaryPublisher = isPrimaryPublisher;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("isPrimaryPublisher")
  public ConfigNodePropertyBoolean getIsPrimaryPublisher() {
    return isPrimaryPublisher;
  }
  public void setIsPrimaryPublisher(ConfigNodePropertyBoolean isPrimaryPublisher) {
    this.isPrimaryPublisher = isPrimaryPublisher;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties = (ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties) o;
    return Objects.equals(isPrimaryPublisher, comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties.isPrimaryPublisher);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPrimaryPublisher);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties {\n");
    
    sb.append("    isPrimaryPublisher: ").append(toIndentedString(isPrimaryPublisher)).append("\n");
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

