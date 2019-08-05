package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties   {
  @JsonProperty("contentReferenceConfig.resourceTypes")
  private ConfigNodePropertyArray contentReferenceConfigResourceTypes = null;

  public ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties contentReferenceConfigResourceTypes(ConfigNodePropertyArray contentReferenceConfigResourceTypes) {
    this.contentReferenceConfigResourceTypes = contentReferenceConfigResourceTypes;
    return this;
  }

   /**
   * Get contentReferenceConfigResourceTypes
   * @return contentReferenceConfigResourceTypes
  **/
  @Valid
  public ConfigNodePropertyArray getContentReferenceConfigResourceTypes() {
    return contentReferenceConfigResourceTypes;
  }

  public void setContentReferenceConfigResourceTypes(ConfigNodePropertyArray contentReferenceConfigResourceTypes) {
    this.contentReferenceConfigResourceTypes = contentReferenceConfigResourceTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties = (ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties) o;
    return Objects.equals(contentReferenceConfigResourceTypes, comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties.contentReferenceConfigResourceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentReferenceConfigResourceTypes);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties {\n");
    
    sb.append("    contentReferenceConfigResourceTypes: ").append(toIndentedString(contentReferenceConfigResourceTypes)).append("\n");
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

