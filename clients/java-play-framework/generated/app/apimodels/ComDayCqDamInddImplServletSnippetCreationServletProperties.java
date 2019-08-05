package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamInddImplServletSnippetCreationServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamInddImplServletSnippetCreationServletProperties   {
  @JsonProperty("snippetcreation.maxcollections")
  private ConfigNodePropertyInteger snippetcreationMaxcollections = null;

  public ComDayCqDamInddImplServletSnippetCreationServletProperties snippetcreationMaxcollections(ConfigNodePropertyInteger snippetcreationMaxcollections) {
    this.snippetcreationMaxcollections = snippetcreationMaxcollections;
    return this;
  }

   /**
   * Get snippetcreationMaxcollections
   * @return snippetcreationMaxcollections
  **/
  @Valid
  public ConfigNodePropertyInteger getSnippetcreationMaxcollections() {
    return snippetcreationMaxcollections;
  }

  public void setSnippetcreationMaxcollections(ConfigNodePropertyInteger snippetcreationMaxcollections) {
    this.snippetcreationMaxcollections = snippetcreationMaxcollections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamInddImplServletSnippetCreationServletProperties comDayCqDamInddImplServletSnippetCreationServletProperties = (ComDayCqDamInddImplServletSnippetCreationServletProperties) o;
    return Objects.equals(snippetcreationMaxcollections, comDayCqDamInddImplServletSnippetCreationServletProperties.snippetcreationMaxcollections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snippetcreationMaxcollections);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

