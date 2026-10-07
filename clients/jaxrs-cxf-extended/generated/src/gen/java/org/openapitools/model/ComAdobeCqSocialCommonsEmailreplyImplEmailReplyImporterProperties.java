package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyDropDown;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown connectProtocol;
 /**
  * Get connectProtocol
  * @return connectProtocol
  */
  @JsonProperty("connectProtocol")
  public ConfigNodePropertyDropDown getConnectProtocol() {
    return connectProtocol;
  }

  /**
   * Sets the <code>connectProtocol</code> property.
   */
 public void setConnectProtocol(ConfigNodePropertyDropDown connectProtocol) {
    this.connectProtocol = connectProtocol;
  }

  /**
   * Sets the <code>connectProtocol</code> property.
   */
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties connectProtocol(ConfigNodePropertyDropDown connectProtocol) {
    this.connectProtocol = connectProtocol;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties = (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties) o;
    return Objects.equals(this.connectProtocol, comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties.connectProtocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectProtocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties {\n");
    
    sb.append("    connectProtocol: ").append(toIndentedString(connectProtocol)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

