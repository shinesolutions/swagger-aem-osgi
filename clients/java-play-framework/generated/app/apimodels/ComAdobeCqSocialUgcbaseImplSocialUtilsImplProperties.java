package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
    return Objects.equals(legacyCloudUGCPathMapping, comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties.legacyCloudUGCPathMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legacyCloudUGCPathMapping);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

