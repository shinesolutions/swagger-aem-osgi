package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties   {
  @JsonProperty("com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters")
  private ConfigNodePropertyArray comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters;

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
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

