package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

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

