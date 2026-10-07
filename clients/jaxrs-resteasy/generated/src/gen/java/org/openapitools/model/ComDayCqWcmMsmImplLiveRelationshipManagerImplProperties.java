package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties   {
  
  private ConfigNodePropertyString liverelationshipmgrRelationsconfigDefault;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("liverelationshipmgr.relationsconfig.default")
  @Valid
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

