package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;

/**
 * ComDayCqWcmCoreImplServletsReferenceSearchServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComDayCqWcmCoreImplServletsReferenceSearchServletProperties   {
  @JsonProperty("referencesearchservlet.maxReferencesPerPage")
  private ConfigNodePropertyInteger referencesearchservletMaxReferencesPerPage = null;

  @JsonProperty("referencesearchservlet.maxPages")
  private ConfigNodePropertyInteger referencesearchservletMaxPages = null;

  public ComDayCqWcmCoreImplServletsReferenceSearchServletProperties referencesearchservletMaxReferencesPerPage(ConfigNodePropertyInteger referencesearchservletMaxReferencesPerPage) {
    this.referencesearchservletMaxReferencesPerPage = referencesearchservletMaxReferencesPerPage;
    return this;
  }

   /**
   * Get referencesearchservletMaxReferencesPerPage
   * @return referencesearchservletMaxReferencesPerPage
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getReferencesearchservletMaxReferencesPerPage() {
    return referencesearchservletMaxReferencesPerPage;
  }

  public void setReferencesearchservletMaxReferencesPerPage(ConfigNodePropertyInteger referencesearchservletMaxReferencesPerPage) {
    this.referencesearchservletMaxReferencesPerPage = referencesearchservletMaxReferencesPerPage;
  }

  public ComDayCqWcmCoreImplServletsReferenceSearchServletProperties referencesearchservletMaxPages(ConfigNodePropertyInteger referencesearchservletMaxPages) {
    this.referencesearchservletMaxPages = referencesearchservletMaxPages;
    return this;
  }

   /**
   * Get referencesearchservletMaxPages
   * @return referencesearchservletMaxPages
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getReferencesearchservletMaxPages() {
    return referencesearchservletMaxPages;
  }

  public void setReferencesearchservletMaxPages(ConfigNodePropertyInteger referencesearchservletMaxPages) {
    this.referencesearchservletMaxPages = referencesearchservletMaxPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplServletsReferenceSearchServletProperties comDayCqWcmCoreImplServletsReferenceSearchServletProperties = (ComDayCqWcmCoreImplServletsReferenceSearchServletProperties) o;
    return Objects.equals(this.referencesearchservletMaxReferencesPerPage, comDayCqWcmCoreImplServletsReferenceSearchServletProperties.referencesearchservletMaxReferencesPerPage) &&
        Objects.equals(this.referencesearchservletMaxPages, comDayCqWcmCoreImplServletsReferenceSearchServletProperties.referencesearchservletMaxPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referencesearchservletMaxReferencesPerPage, referencesearchservletMaxPages);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

