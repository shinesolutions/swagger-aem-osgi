package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties   {
  @JsonProperty("parser.features")
  private ConfigNodePropertyArray parserFeatures = null;

  /**
   **/
  public OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties parserFeatures(ConfigNodePropertyArray parserFeatures) {
    this.parserFeatures = parserFeatures;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("parser.features")
  public ConfigNodePropertyArray getParserFeatures() {
    return parserFeatures;
  }
  public void setParserFeatures(ConfigNodePropertyArray parserFeatures) {
    this.parserFeatures = parserFeatures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties = (OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties) o;
    return Objects.equals(parserFeatures, orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties.parserFeatures);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

