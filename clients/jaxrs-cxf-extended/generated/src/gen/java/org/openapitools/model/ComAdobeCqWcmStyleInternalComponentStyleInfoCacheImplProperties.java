package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger size;
 /**
  * Get size
  * @return size
  */
  @JsonProperty("size")
  public ConfigNodePropertyInteger getSize() {
    return size;
  }

  /**
   * Sets the <code>size</code> property.
   */
 public void setSize(ConfigNodePropertyInteger size) {
    this.size = size;
  }

  /**
   * Sets the <code>size</code> property.
   */
  public ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties size(ConfigNodePropertyInteger size) {
    this.size = size;
    return this;
  }


  @Override
  public boolean equals(Object o) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

