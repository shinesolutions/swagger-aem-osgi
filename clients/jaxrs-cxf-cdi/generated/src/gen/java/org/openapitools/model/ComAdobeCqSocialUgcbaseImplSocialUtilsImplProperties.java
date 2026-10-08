package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties   {
  
  private ConfigNodePropertyBoolean legacyCloudUGCPathMapping;

  /**
   **/
  public ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties legacyCloudUGCPathMapping(ConfigNodePropertyBoolean legacyCloudUGCPathMapping) {
    this.legacyCloudUGCPathMapping = legacyCloudUGCPathMapping;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("legacyCloudUGCPathMapping")
  public ConfigNodePropertyBoolean getLegacyCloudUGCPathMapping() {
    return legacyCloudUGCPathMapping;
  }
  public void setLegacyCloudUGCPathMapping(ConfigNodePropertyBoolean legacyCloudUGCPathMapping) {
    this.legacyCloudUGCPathMapping = legacyCloudUGCPathMapping;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties = (ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties) o;
    return Objects.equals(this.legacyCloudUGCPathMapping, comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties.legacyCloudUGCPathMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legacyCloudUGCPathMapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties {\n");
    
    sb.append("    legacyCloudUGCPathMapping: ").append(toIndentedString(legacyCloudUGCPathMapping)).append("\n");
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

