package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("liverelationshipmgr.relationsconfig.default")
  private ConfigNodePropertyString liverelationshipmgrRelationsconfigDefault;

  /**
   * 
   * @return liverelationshipmgrRelationsconfigDefault
   */
  public ConfigNodePropertyString getLiverelationshipmgrRelationsconfigDefault() {
    return liverelationshipmgrRelationsconfigDefault;
  }

  public void setLiverelationshipmgrRelationsconfigDefault(ConfigNodePropertyString liverelationshipmgrRelationsconfigDefault) {
    this.liverelationshipmgrRelationsconfigDefault = liverelationshipmgrRelationsconfigDefault;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties comDayCqWcmMsmImplLiveRelationshipManagerImplProperties = (ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties) o;
    return Objects.equals(this.liverelationshipmgrRelationsconfigDefault, comDayCqWcmMsmImplLiveRelationshipManagerImplProperties.liverelationshipmgrRelationsconfigDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(liverelationshipmgrRelationsconfigDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties {\n");
    
    sb.append("    liverelationshipmgrRelationsconfigDefault: ").append(toIndentedString(liverelationshipmgrRelationsconfigDefault)).append("\n");
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
