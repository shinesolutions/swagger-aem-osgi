package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqDamInddImplServletSnippetCreationServletProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("snippetcreation.maxcollections")
  private ConfigNodePropertyInteger snippetcreationMaxcollections;

  /**
   * 
   * @return snippetcreationMaxcollections
   */
  public ConfigNodePropertyInteger getSnippetcreationMaxcollections() {
    return snippetcreationMaxcollections;
  }

  public void setSnippetcreationMaxcollections(ConfigNodePropertyInteger snippetcreationMaxcollections) {
    this.snippetcreationMaxcollections = snippetcreationMaxcollections;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamInddImplServletSnippetCreationServletProperties comDayCqDamInddImplServletSnippetCreationServletProperties = (ComDayCqDamInddImplServletSnippetCreationServletProperties) o;
    return Objects.equals(this.snippetcreationMaxcollections, comDayCqDamInddImplServletSnippetCreationServletProperties.snippetcreationMaxcollections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snippetcreationMaxcollections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamInddImplServletSnippetCreationServletProperties {\n");
    
    sb.append("    snippetcreationMaxcollections: ").append(toIndentedString(snippetcreationMaxcollections)).append("\n");
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
