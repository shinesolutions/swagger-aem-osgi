package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters;
 /**
  * Get comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters
  * @return comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters
  */
  @JsonProperty("com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters")
  public ConfigNodePropertyArray getComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters() {
    return comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters;
  }

  /**
   * Sets the <code>comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters</code> property.
   */
 public void setComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters(ConfigNodePropertyArray comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters) {
    this.comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters = comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters;
  }

  /**
   * Sets the <code>comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters</code> property.
   */
  public ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters(ConfigNodePropertyArray comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters) {
    this.comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters = comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters;
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
    ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties = (ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties) o;
    return Objects.equals(this.comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters, comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties.comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties {\n");
    
    sb.append("    comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters: ").append(toIndentedString(comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters)).append("\n");
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

