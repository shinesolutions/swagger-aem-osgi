package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties   {
  @JsonProperty("size")
  private ConfigNodePropertyInteger size = null;

  public ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties size(ConfigNodePropertyInteger size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getSize() {
    return size;
  }

  public void setSize(ConfigNodePropertyInteger size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties = (ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties) o;
    return Objects.equals(this.size, comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

