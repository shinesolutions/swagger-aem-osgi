package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqWcmCoreImplServletsReferenceSearchServletProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("referencesearchservlet.maxReferencesPerPage")
  private ConfigNodePropertyInteger referencesearchservletMaxReferencesPerPage;

  @JsonProperty("referencesearchservlet.maxPages")
  private ConfigNodePropertyInteger referencesearchservletMaxPages;

  /**
   * 
   * @return referencesearchservletMaxReferencesPerPage
   */
  public ConfigNodePropertyInteger getReferencesearchservletMaxReferencesPerPage() {
    return referencesearchservletMaxReferencesPerPage;
  }

  public void setReferencesearchservletMaxReferencesPerPage(ConfigNodePropertyInteger referencesearchservletMaxReferencesPerPage) {
    this.referencesearchservletMaxReferencesPerPage = referencesearchservletMaxReferencesPerPage;
  }

  /**
   * 
   * @return referencesearchservletMaxPages
   */
  public ConfigNodePropertyInteger getReferencesearchservletMaxPages() {
    return referencesearchservletMaxPages;
  }

  public void setReferencesearchservletMaxPages(ConfigNodePropertyInteger referencesearchservletMaxPages) {
    this.referencesearchservletMaxPages = referencesearchservletMaxPages;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
