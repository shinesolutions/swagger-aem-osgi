package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheSlingEventImplEventingThreadPoolProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingEventImplEventingThreadPoolProperties   {
  @JsonProperty("minPoolSize")
  @Valid

  private ConfigNodePropertyInteger minPoolSize;

  public OrgApacheSlingEventImplEventingThreadPoolProperties minPoolSize(ConfigNodePropertyInteger minPoolSize) {
    this.minPoolSize = minPoolSize;
    return this;
  }

   /**
   * Get minPoolSize
   * @return minPoolSize
  **/
  public ConfigNodePropertyInteger getMinPoolSize() {
    return minPoolSize;
  }

  public void setMinPoolSize(ConfigNodePropertyInteger minPoolSize) {
    this.minPoolSize = minPoolSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingEventImplEventingThreadPoolProperties orgApacheSlingEventImplEventingThreadPoolProperties = (OrgApacheSlingEventImplEventingThreadPoolProperties) o;
    return Objects.equals(minPoolSize, orgApacheSlingEventImplEventingThreadPoolProperties.minPoolSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minPoolSize);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingEventImplEventingThreadPoolProperties {\n");
    
    sb.append("    minPoolSize: ").append(toIndentedString(minPoolSize)).append("\n");
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

