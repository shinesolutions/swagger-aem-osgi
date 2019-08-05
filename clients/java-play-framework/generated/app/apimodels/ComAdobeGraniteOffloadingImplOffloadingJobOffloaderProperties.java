package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties   {
  @JsonProperty("offloading.offloader.enabled")
  private ConfigNodePropertyBoolean offloadingOffloaderEnabled = null;

  public ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties offloadingOffloaderEnabled(ConfigNodePropertyBoolean offloadingOffloaderEnabled) {
    this.offloadingOffloaderEnabled = offloadingOffloaderEnabled;
    return this;
  }

   /**
   * Get offloadingOffloaderEnabled
   * @return offloadingOffloaderEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getOffloadingOffloaderEnabled() {
    return offloadingOffloaderEnabled;
  }

  public void setOffloadingOffloaderEnabled(ConfigNodePropertyBoolean offloadingOffloaderEnabled) {
    this.offloadingOffloaderEnabled = offloadingOffloaderEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties = (ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties) o;
    return Objects.equals(offloadingOffloaderEnabled, comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties.offloadingOffloaderEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offloadingOffloaderEnabled);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties {\n");
    
    sb.append("    offloadingOffloaderEnabled: ").append(toIndentedString(offloadingOffloaderEnabled)).append("\n");
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

