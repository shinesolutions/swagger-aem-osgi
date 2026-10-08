package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;

/**
 * OrgApacheSlingEventImplEventingThreadPoolProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEventImplEventingThreadPoolProperties   {
  @JsonProperty("minPoolSize")
  private ConfigNodePropertyInteger minPoolSize;

  public OrgApacheSlingEventImplEventingThreadPoolProperties minPoolSize(ConfigNodePropertyInteger minPoolSize) {
    this.minPoolSize = minPoolSize;
    return this;
  }

   /**
   * Get minPoolSize
   * @return minPoolSize
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.minPoolSize, orgApacheSlingEventImplEventingThreadPoolProperties.minPoolSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minPoolSize);
  }

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

