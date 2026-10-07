package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqDamInddImplServletSnippetCreationServletProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamInddImplServletSnippetCreationServletProperties   {
  private ConfigNodePropertyInteger snippetcreationMaxcollections;

  public ComDayCqDamInddImplServletSnippetCreationServletProperties() {
  }

  /**
   **/
  public ComDayCqDamInddImplServletSnippetCreationServletProperties snippetcreationMaxcollections(ConfigNodePropertyInteger snippetcreationMaxcollections) {
    this.snippetcreationMaxcollections = snippetcreationMaxcollections;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("snippetcreation.maxcollections")
  @Valid public ConfigNodePropertyInteger getSnippetcreationMaxcollections() {
    return snippetcreationMaxcollections;
  }

  @JsonProperty("snippetcreation.maxcollections")
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
