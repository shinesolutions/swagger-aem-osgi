package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties   {
  @JsonProperty("forms.formparagraphpostprocessor.enabled")
  @Valid

  private ConfigNodePropertyBoolean formsFormparagraphpostprocessorEnabled;

  @JsonProperty("forms.formparagraphpostprocessor.formresourcetypes")
  @Valid

  private ConfigNodePropertyArray formsFormparagraphpostprocessorFormresourcetypes;

  public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties formsFormparagraphpostprocessorEnabled(ConfigNodePropertyBoolean formsFormparagraphpostprocessorEnabled) {
    this.formsFormparagraphpostprocessorEnabled = formsFormparagraphpostprocessorEnabled;
    return this;
  }

   /**
   * Get formsFormparagraphpostprocessorEnabled
   * @return formsFormparagraphpostprocessorEnabled
  **/
  public ConfigNodePropertyBoolean getFormsFormparagraphpostprocessorEnabled() {
    return formsFormparagraphpostprocessorEnabled;
  }

  public void setFormsFormparagraphpostprocessorEnabled(ConfigNodePropertyBoolean formsFormparagraphpostprocessorEnabled) {
    this.formsFormparagraphpostprocessorEnabled = formsFormparagraphpostprocessorEnabled;
  }

  public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties formsFormparagraphpostprocessorFormresourcetypes(ConfigNodePropertyArray formsFormparagraphpostprocessorFormresourcetypes) {
    this.formsFormparagraphpostprocessorFormresourcetypes = formsFormparagraphpostprocessorFormresourcetypes;
    return this;
  }

   /**
   * Get formsFormparagraphpostprocessorFormresourcetypes
   * @return formsFormparagraphpostprocessorFormresourcetypes
  **/
  public ConfigNodePropertyArray getFormsFormparagraphpostprocessorFormresourcetypes() {
    return formsFormparagraphpostprocessorFormresourcetypes;
  }

  public void setFormsFormparagraphpostprocessorFormresourcetypes(ConfigNodePropertyArray formsFormparagraphpostprocessorFormresourcetypes) {
    this.formsFormparagraphpostprocessorFormresourcetypes = formsFormparagraphpostprocessorFormresourcetypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties = (ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties) o;
    return Objects.equals(formsFormparagraphpostprocessorEnabled, comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.formsFormparagraphpostprocessorEnabled) &&
        Objects.equals(formsFormparagraphpostprocessorFormresourcetypes, comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.formsFormparagraphpostprocessorFormresourcetypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formsFormparagraphpostprocessorEnabled, formsFormparagraphpostprocessorFormresourcetypes);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties {\n");
    
    sb.append("    formsFormparagraphpostprocessorEnabled: ").append(toIndentedString(formsFormparagraphpostprocessorEnabled)).append("\n");
    sb.append("    formsFormparagraphpostprocessorFormresourcetypes: ").append(toIndentedString(formsFormparagraphpostprocessorFormresourcetypes)).append("\n");
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

