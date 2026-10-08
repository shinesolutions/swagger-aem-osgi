package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sling.name")
  private ConfigNodePropertyString slingName;

  @JsonProperty("sling.description")
  private ConfigNodePropertyString slingDescription;

  /**
   * 
   * @return slingName
   */
  public ConfigNodePropertyString getSlingName() {
    return slingName;
  }

  public void setSlingName(ConfigNodePropertyString slingName) {
    this.slingName = slingName;
  }

  /**
   * 
   * @return slingDescription
   */
  public ConfigNodePropertyString getSlingDescription() {
    return slingDescription;
  }

  public void setSlingDescription(ConfigNodePropertyString slingDescription) {
    this.slingDescription = slingDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties orgApacheSlingSettingsImplSlingSettingsServiceImplProperties = (OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties) o;
    return Objects.equals(this.slingName, orgApacheSlingSettingsImplSlingSettingsServiceImplProperties.slingName) &&
        Objects.equals(this.slingDescription, orgApacheSlingSettingsImplSlingSettingsServiceImplProperties.slingDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingName, slingDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties {\n");
    
    sb.append("    slingName: ").append(toIndentedString(slingName)).append("\n");
    sb.append("    slingDescription: ").append(toIndentedString(slingDescription)).append("\n");
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
