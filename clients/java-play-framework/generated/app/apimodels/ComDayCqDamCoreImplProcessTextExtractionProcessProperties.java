package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreImplProcessTextExtractionProcessProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplProcessTextExtractionProcessProperties   {
  @JsonProperty("mimeTypes")
  private ConfigNodePropertyArray mimeTypes = null;

  @JsonProperty("maxExtract")
  private ConfigNodePropertyInteger maxExtract = null;

  public ComDayCqDamCoreImplProcessTextExtractionProcessProperties mimeTypes(ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
    return this;
  }

   /**
   * Get mimeTypes
   * @return mimeTypes
  **/
  @Valid
  public ConfigNodePropertyArray getMimeTypes() {
    return mimeTypes;
  }

  public void setMimeTypes(ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
  }

  public ComDayCqDamCoreImplProcessTextExtractionProcessProperties maxExtract(ConfigNodePropertyInteger maxExtract) {
    this.maxExtract = maxExtract;
    return this;
  }

   /**
   * Get maxExtract
   * @return maxExtract
  **/
  @Valid
  public ConfigNodePropertyInteger getMaxExtract() {
    return maxExtract;
  }

  public void setMaxExtract(ConfigNodePropertyInteger maxExtract) {
    this.maxExtract = maxExtract;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplProcessTextExtractionProcessProperties comDayCqDamCoreImplProcessTextExtractionProcessProperties = (ComDayCqDamCoreImplProcessTextExtractionProcessProperties) o;
    return Objects.equals(mimeTypes, comDayCqDamCoreImplProcessTextExtractionProcessProperties.mimeTypes) &&
        Objects.equals(maxExtract, comDayCqDamCoreImplProcessTextExtractionProcessProperties.maxExtract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mimeTypes, maxExtract);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplProcessTextExtractionProcessProperties {\n");
    
    sb.append("    mimeTypes: ").append(toIndentedString(mimeTypes)).append("\n");
    sb.append("    maxExtract: ").append(toIndentedString(maxExtract)).append("\n");
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

