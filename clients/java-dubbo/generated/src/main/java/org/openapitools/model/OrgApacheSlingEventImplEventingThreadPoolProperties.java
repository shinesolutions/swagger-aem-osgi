package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingEventImplEventingThreadPoolProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("minPoolSize")
  private ConfigNodePropertyInteger minPoolSize;

  /**
   * 
   * @return minPoolSize
   */
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
