package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;

/**
 * ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties   {
  @JsonProperty("isMemberCheck")
  private ConfigNodePropertyBoolean isMemberCheck;

  public ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties isMemberCheck(ConfigNodePropertyBoolean isMemberCheck) {
    this.isMemberCheck = isMemberCheck;
    return this;
  }

   /**
   * Get isMemberCheck
   * @return isMemberCheck
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getIsMemberCheck() {
    return isMemberCheck;
  }

  public void setIsMemberCheck(ConfigNodePropertyBoolean isMemberCheck) {
    this.isMemberCheck = isMemberCheck;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties = (ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties) o;
    return Objects.equals(this.isMemberCheck, comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties.isMemberCheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isMemberCheck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties {\n");
    
    sb.append("    isMemberCheck: ").append(toIndentedString(isMemberCheck)).append("\n");
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

