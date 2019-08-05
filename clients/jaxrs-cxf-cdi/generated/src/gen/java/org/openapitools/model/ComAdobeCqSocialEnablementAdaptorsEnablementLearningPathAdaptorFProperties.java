package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties   {
  
  private ConfigNodePropertyBoolean isMemberCheck = null;


  /**
   **/
  public ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties isMemberCheck(ConfigNodePropertyBoolean isMemberCheck) {
    this.isMemberCheck = isMemberCheck;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("isMemberCheck")
  public ConfigNodePropertyBoolean getIsMemberCheck() {
    return isMemberCheck;
  }
  public void setIsMemberCheck(ConfigNodePropertyBoolean isMemberCheck) {
    this.isMemberCheck = isMemberCheck;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties = (ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties) o;
    return Objects.equals(isMemberCheck, comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties.isMemberCheck);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

