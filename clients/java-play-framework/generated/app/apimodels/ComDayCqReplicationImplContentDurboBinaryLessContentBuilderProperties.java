package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties   {
  @JsonProperty("binary.threshold")
  private ConfigNodePropertyInteger binaryThreshold = null;

  public ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties binaryThreshold(ConfigNodePropertyInteger binaryThreshold) {
    this.binaryThreshold = binaryThreshold;
    return this;
  }

   /**
   * Get binaryThreshold
   * @return binaryThreshold
  **/
  @Valid
  public ConfigNodePropertyInteger getBinaryThreshold() {
    return binaryThreshold;
  }

  public void setBinaryThreshold(ConfigNodePropertyInteger binaryThreshold) {
    this.binaryThreshold = binaryThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties comDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties = (ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties) o;
    return Objects.equals(binaryThreshold, comDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties.binaryThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binaryThreshold);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties {\n");
    
    sb.append("    binaryThreshold: ").append(toIndentedString(binaryThreshold)).append("\n");
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

