package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray parserFeatures;
 /**
  * Get parserFeatures
  * @return parserFeatures
  */
  @JsonProperty("parser.features")
  public ConfigNodePropertyArray getParserFeatures() {
    return parserFeatures;
  }

  /**
   * Sets the <code>parserFeatures</code> property.
   */
 public void setParserFeatures(ConfigNodePropertyArray parserFeatures) {
    this.parserFeatures = parserFeatures;
  }

  /**
   * Sets the <code>parserFeatures</code> property.
   */
  public OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties parserFeatures(ConfigNodePropertyArray parserFeatures) {
    this.parserFeatures = parserFeatures;
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
    OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties = (OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties) o;
    return Objects.equals(this.parserFeatures, orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties.parserFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parserFeatures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties {\n");
    
    sb.append("    parserFeatures: ").append(toIndentedString(parserFeatures)).append("\n");
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

