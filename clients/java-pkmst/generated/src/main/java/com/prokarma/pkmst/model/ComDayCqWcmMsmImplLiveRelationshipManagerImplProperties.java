package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties   {
  @JsonProperty("liverelationshipmgr.relationsconfig.default")
  private ConfigNodePropertyString liverelationshipmgrRelationsconfigDefault;

  public ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties liverelationshipmgrRelationsconfigDefault(ConfigNodePropertyString liverelationshipmgrRelationsconfigDefault) {
    this.liverelationshipmgrRelationsconfigDefault = liverelationshipmgrRelationsconfigDefault;
    return this;
  }

  /**
   * Get liverelationshipmgrRelationsconfigDefault
   * @return liverelationshipmgrRelationsconfigDefault
   */
  @ApiModelProperty(value = "")
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

