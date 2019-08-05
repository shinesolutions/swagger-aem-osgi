package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties   {
  @JsonProperty("legacyCloudUGCPathMapping")
  private ConfigNodePropertyBoolean legacyCloudUGCPathMapping = null;

  public ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties legacyCloudUGCPathMapping(ConfigNodePropertyBoolean legacyCloudUGCPathMapping) {
    this.legacyCloudUGCPathMapping = legacyCloudUGCPathMapping;
    return this;
  }

  /**
   * Get legacyCloudUGCPathMapping
   * @return legacyCloudUGCPathMapping
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getLegacyCloudUGCPathMapping() {
    return legacyCloudUGCPathMapping;
  }

  public void setLegacyCloudUGCPathMapping(ConfigNodePropertyBoolean legacyCloudUGCPathMapping) {
    this.legacyCloudUGCPathMapping = legacyCloudUGCPathMapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

