package apimodels;

import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqDamCoreImplUnzipUnzipConfigProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplUnzipUnzipConfigProperties   {
  @JsonProperty("cq.dam.config.unzip.maxuncompressedsize")
  @Valid

  private ConfigNodePropertyInteger cqDamConfigUnzipMaxuncompressedsize;

  @JsonProperty("cq.dam.config.unzip.encoding")
  @Valid

  private ConfigNodePropertyString cqDamConfigUnzipEncoding;

  public ComDayCqDamCoreImplUnzipUnzipConfigProperties cqDamConfigUnzipMaxuncompressedsize(ConfigNodePropertyInteger cqDamConfigUnzipMaxuncompressedsize) {
    this.cqDamConfigUnzipMaxuncompressedsize = cqDamConfigUnzipMaxuncompressedsize;
    return this;
  }

   /**
   * Get cqDamConfigUnzipMaxuncompressedsize
   * @return cqDamConfigUnzipMaxuncompressedsize
  **/
  public ConfigNodePropertyInteger getCqDamConfigUnzipMaxuncompressedsize() {
    return cqDamConfigUnzipMaxuncompressedsize;
  }

  public void setCqDamConfigUnzipMaxuncompressedsize(ConfigNodePropertyInteger cqDamConfigUnzipMaxuncompressedsize) {
    this.cqDamConfigUnzipMaxuncompressedsize = cqDamConfigUnzipMaxuncompressedsize;
  }

  public ComDayCqDamCoreImplUnzipUnzipConfigProperties cqDamConfigUnzipEncoding(ConfigNodePropertyString cqDamConfigUnzipEncoding) {
    this.cqDamConfigUnzipEncoding = cqDamConfigUnzipEncoding;
    return this;
  }

   /**
   * Get cqDamConfigUnzipEncoding
   * @return cqDamConfigUnzipEncoding
  **/
  public ConfigNodePropertyString getCqDamConfigUnzipEncoding() {
    return cqDamConfigUnzipEncoding;
  }

  public void setCqDamConfigUnzipEncoding(ConfigNodePropertyString cqDamConfigUnzipEncoding) {
    this.cqDamConfigUnzipEncoding = cqDamConfigUnzipEncoding;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplUnzipUnzipConfigProperties comDayCqDamCoreImplUnzipUnzipConfigProperties = (ComDayCqDamCoreImplUnzipUnzipConfigProperties) o;
    return Objects.equals(cqDamConfigUnzipMaxuncompressedsize, comDayCqDamCoreImplUnzipUnzipConfigProperties.cqDamConfigUnzipMaxuncompressedsize) &&
        Objects.equals(cqDamConfigUnzipEncoding, comDayCqDamCoreImplUnzipUnzipConfigProperties.cqDamConfigUnzipEncoding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamConfigUnzipMaxuncompressedsize, cqDamConfigUnzipEncoding);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplUnzipUnzipConfigProperties {\n");
    
    sb.append("    cqDamConfigUnzipMaxuncompressedsize: ").append(toIndentedString(cqDamConfigUnzipMaxuncompressedsize)).append("\n");
    sb.append("    cqDamConfigUnzipEncoding: ").append(toIndentedString(cqDamConfigUnzipEncoding)).append("\n");
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

