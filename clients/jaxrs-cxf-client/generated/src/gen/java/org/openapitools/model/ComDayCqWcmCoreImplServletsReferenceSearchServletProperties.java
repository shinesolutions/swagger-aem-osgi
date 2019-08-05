package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqWcmCoreImplServletsReferenceSearchServletProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger referencesearchservletMaxReferencesPerPage = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger referencesearchservletMaxPages = null;
 /**
   * Get referencesearchservletMaxReferencesPerPage
   * @return referencesearchservletMaxReferencesPerPage
  **/
  @JsonProperty("referencesearchservlet.maxReferencesPerPage")
  public ConfigNodePropertyInteger getReferencesearchservletMaxReferencesPerPage() {
    return referencesearchservletMaxReferencesPerPage;
  }

  public void setReferencesearchservletMaxReferencesPerPage(ConfigNodePropertyInteger referencesearchservletMaxReferencesPerPage) {
    this.referencesearchservletMaxReferencesPerPage = referencesearchservletMaxReferencesPerPage;
  }

  public ComDayCqWcmCoreImplServletsReferenceSearchServletProperties referencesearchservletMaxReferencesPerPage(ConfigNodePropertyInteger referencesearchservletMaxReferencesPerPage) {
    this.referencesearchservletMaxReferencesPerPage = referencesearchservletMaxReferencesPerPage;
    return this;
  }

 /**
   * Get referencesearchservletMaxPages
   * @return referencesearchservletMaxPages
  **/
  @JsonProperty("referencesearchservlet.maxPages")
  public ConfigNodePropertyInteger getReferencesearchservletMaxPages() {
    return referencesearchservletMaxPages;
  }

  public void setReferencesearchservletMaxPages(ConfigNodePropertyInteger referencesearchservletMaxPages) {
    this.referencesearchservletMaxPages = referencesearchservletMaxPages;
  }

  public ComDayCqWcmCoreImplServletsReferenceSearchServletProperties referencesearchservletMaxPages(ConfigNodePropertyInteger referencesearchservletMaxPages) {
    this.referencesearchservletMaxPages = referencesearchservletMaxPages;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplServletsReferenceSearchServletProperties {\n");
    
    sb.append("    referencesearchservletMaxReferencesPerPage: ").append(toIndentedString(referencesearchservletMaxReferencesPerPage)).append("\n");
    sb.append("    referencesearchservletMaxPages: ").append(toIndentedString(referencesearchservletMaxPages)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

