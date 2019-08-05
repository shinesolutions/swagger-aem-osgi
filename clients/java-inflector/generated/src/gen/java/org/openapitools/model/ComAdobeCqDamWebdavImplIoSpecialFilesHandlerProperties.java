package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties   {
  @JsonProperty("com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters")
  private ConfigNodePropertyArray comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters = null;

  /**
   **/
  public ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters(ConfigNodePropertyArray comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters) {
    this.comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters = comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters")
  public ConfigNodePropertyArray getComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters() {
    return comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters;
  }
  public void setComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters(ConfigNodePropertyArray comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters) {
    this.comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters = comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties = (ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties) o;
    return Objects.equals(comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters, comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties.comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

