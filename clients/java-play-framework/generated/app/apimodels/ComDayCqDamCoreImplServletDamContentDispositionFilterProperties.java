package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreImplServletDamContentDispositionFilterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplServletDamContentDispositionFilterProperties   {
  @JsonProperty("cq.mime.type.blacklist")
  private ConfigNodePropertyArray cqMimeTypeBlacklist = null;

  @JsonProperty("cq.dam.empty.mime")
  private ConfigNodePropertyBoolean cqDamEmptyMime = null;

  public ComDayCqDamCoreImplServletDamContentDispositionFilterProperties cqMimeTypeBlacklist(ConfigNodePropertyArray cqMimeTypeBlacklist) {
    this.cqMimeTypeBlacklist = cqMimeTypeBlacklist;
    return this;
  }

   /**
   * Get cqMimeTypeBlacklist
   * @return cqMimeTypeBlacklist
  **/
  @Valid
  public ConfigNodePropertyArray getCqMimeTypeBlacklist() {
    return cqMimeTypeBlacklist;
  }

  public void setCqMimeTypeBlacklist(ConfigNodePropertyArray cqMimeTypeBlacklist) {
    this.cqMimeTypeBlacklist = cqMimeTypeBlacklist;
  }

  public ComDayCqDamCoreImplServletDamContentDispositionFilterProperties cqDamEmptyMime(ConfigNodePropertyBoolean cqDamEmptyMime) {
    this.cqDamEmptyMime = cqDamEmptyMime;
    return this;
  }

   /**
   * Get cqDamEmptyMime
   * @return cqDamEmptyMime
  **/
  @Valid
  public ConfigNodePropertyBoolean getCqDamEmptyMime() {
    return cqDamEmptyMime;
  }

  public void setCqDamEmptyMime(ConfigNodePropertyBoolean cqDamEmptyMime) {
    this.cqDamEmptyMime = cqDamEmptyMime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletDamContentDispositionFilterProperties comDayCqDamCoreImplServletDamContentDispositionFilterProperties = (ComDayCqDamCoreImplServletDamContentDispositionFilterProperties) o;
    return Objects.equals(cqMimeTypeBlacklist, comDayCqDamCoreImplServletDamContentDispositionFilterProperties.cqMimeTypeBlacklist) &&
        Objects.equals(cqDamEmptyMime, comDayCqDamCoreImplServletDamContentDispositionFilterProperties.cqDamEmptyMime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqMimeTypeBlacklist, cqDamEmptyMime);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletDamContentDispositionFilterProperties {\n");
    
    sb.append("    cqMimeTypeBlacklist: ").append(toIndentedString(cqMimeTypeBlacklist)).append("\n");
    sb.append("    cqDamEmptyMime: ").append(toIndentedString(cqDamEmptyMime)).append("\n");
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

