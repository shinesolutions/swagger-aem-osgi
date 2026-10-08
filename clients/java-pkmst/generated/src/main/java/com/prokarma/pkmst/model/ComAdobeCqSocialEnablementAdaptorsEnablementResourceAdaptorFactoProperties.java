package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties   {
  @JsonProperty("isMemberCheck")
  private ConfigNodePropertyBoolean isMemberCheck;

  public ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties isMemberCheck(ConfigNodePropertyBoolean isMemberCheck) {
    this.isMemberCheck = isMemberCheck;
    return this;
  }

  /**
   * Get isMemberCheck
   * @return isMemberCheck
   */
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
    ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties = (ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties) o;
    return Objects.equals(this.isMemberCheck, comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties.isMemberCheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isMemberCheck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties {\n");
    
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

