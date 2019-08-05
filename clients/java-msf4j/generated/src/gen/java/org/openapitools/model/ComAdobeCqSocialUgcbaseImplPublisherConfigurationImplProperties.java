package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;

/**
 * ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties   {
  @JsonProperty("isPrimaryPublisher")
  private ConfigNodePropertyBoolean isPrimaryPublisher = null;

  public ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties isPrimaryPublisher(ConfigNodePropertyBoolean isPrimaryPublisher) {
    this.isPrimaryPublisher = isPrimaryPublisher;
    return this;
  }

   /**
   * Get isPrimaryPublisher
   * @return isPrimaryPublisher
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.isPrimaryPublisher, comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties.isPrimaryPublisher);
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

