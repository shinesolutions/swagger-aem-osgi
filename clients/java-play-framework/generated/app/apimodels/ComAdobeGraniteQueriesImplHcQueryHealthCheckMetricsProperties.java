package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties   {
  @JsonProperty("getPeriod")
  private ConfigNodePropertyInteger getPeriod = null;

  public ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties getPeriod(ConfigNodePropertyInteger getPeriod) {
    this.getPeriod = getPeriod;
    return this;
  }

   /**
   * Get getPeriod
   * @return getPeriod
  **/
  @Valid
  public ConfigNodePropertyInteger getGetPeriod() {
    return getPeriod;
  }

  public void setGetPeriod(ConfigNodePropertyInteger getPeriod) {
    this.getPeriod = getPeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties comAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties = (ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties) o;
    return Objects.equals(getPeriod, comAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties.getPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getPeriod);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties {\n");
    
    sb.append("    getPeriod: ").append(toIndentedString(getPeriod)).append("\n");
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

