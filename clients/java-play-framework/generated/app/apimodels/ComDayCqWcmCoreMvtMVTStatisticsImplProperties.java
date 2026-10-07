package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqWcmCoreMvtMVTStatisticsImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmCoreMvtMVTStatisticsImplProperties   {
  @JsonProperty("mvtstatistics.trackingurl")
  @Valid

  private ConfigNodePropertyString mvtstatisticsTrackingurl;

  public ComDayCqWcmCoreMvtMVTStatisticsImplProperties mvtstatisticsTrackingurl(ConfigNodePropertyString mvtstatisticsTrackingurl) {
    this.mvtstatisticsTrackingurl = mvtstatisticsTrackingurl;
    return this;
  }

   /**
   * Get mvtstatisticsTrackingurl
   * @return mvtstatisticsTrackingurl
  **/
  public ConfigNodePropertyString getMvtstatisticsTrackingurl() {
    return mvtstatisticsTrackingurl;
  }

  public void setMvtstatisticsTrackingurl(ConfigNodePropertyString mvtstatisticsTrackingurl) {
    this.mvtstatisticsTrackingurl = mvtstatisticsTrackingurl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreMvtMVTStatisticsImplProperties comDayCqWcmCoreMvtMVTStatisticsImplProperties = (ComDayCqWcmCoreMvtMVTStatisticsImplProperties) o;
    return Objects.equals(mvtstatisticsTrackingurl, comDayCqWcmCoreMvtMVTStatisticsImplProperties.mvtstatisticsTrackingurl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mvtstatisticsTrackingurl);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreMvtMVTStatisticsImplProperties {\n");
    
    sb.append("    mvtstatisticsTrackingurl: ").append(toIndentedString(mvtstatisticsTrackingurl)).append("\n");
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

