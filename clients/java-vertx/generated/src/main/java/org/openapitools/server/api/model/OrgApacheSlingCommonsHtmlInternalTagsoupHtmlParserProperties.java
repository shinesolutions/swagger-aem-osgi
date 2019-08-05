package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties   {
  
  private ConfigNodePropertyArray parserFeatures = null;

  public OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties () {

  }

  public OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties (ConfigNodePropertyArray parserFeatures) {
    this.parserFeatures = parserFeatures;
  }

    
  @JsonProperty("parser.features")
  public ConfigNodePropertyArray getParserFeatures() {
    return parserFeatures;
  }
  public void setParserFeatures(ConfigNodePropertyArray parserFeatures) {
    this.parserFeatures = parserFeatures;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
