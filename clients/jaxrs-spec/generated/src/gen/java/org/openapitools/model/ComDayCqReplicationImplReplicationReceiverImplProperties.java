package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
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



@JsonTypeName("comDayCqReplicationImplReplicationReceiverImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqReplicationImplReplicationReceiverImplProperties   {
  private ConfigNodePropertyInteger receiverTmpfileThreshold;
  private ConfigNodePropertyBoolean receiverPackagesUseInstall;

  public ComDayCqReplicationImplReplicationReceiverImplProperties() {
  }

  /**
   **/
  public ComDayCqReplicationImplReplicationReceiverImplProperties receiverTmpfileThreshold(ConfigNodePropertyInteger receiverTmpfileThreshold) {
    this.receiverTmpfileThreshold = receiverTmpfileThreshold;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("receiver.tmpfile.threshold")
  @Valid public ConfigNodePropertyInteger getReceiverTmpfileThreshold() {
    return receiverTmpfileThreshold;
  }

  @JsonProperty("receiver.tmpfile.threshold")
  public void setReceiverTmpfileThreshold(ConfigNodePropertyInteger receiverTmpfileThreshold) {
    this.receiverTmpfileThreshold = receiverTmpfileThreshold;
  }

  /**
   **/
  public ComDayCqReplicationImplReplicationReceiverImplProperties receiverPackagesUseInstall(ConfigNodePropertyBoolean receiverPackagesUseInstall) {
    this.receiverPackagesUseInstall = receiverPackagesUseInstall;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("receiver.packages.use.install")
  @Valid public ConfigNodePropertyBoolean getReceiverPackagesUseInstall() {
    return receiverPackagesUseInstall;
  }

  @JsonProperty("receiver.packages.use.install")
  public void setReceiverPackagesUseInstall(ConfigNodePropertyBoolean receiverPackagesUseInstall) {
    this.receiverPackagesUseInstall = receiverPackagesUseInstall;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqReplicationImplReplicationReceiverImplProperties comDayCqReplicationImplReplicationReceiverImplProperties = (ComDayCqReplicationImplReplicationReceiverImplProperties) o;
    return Objects.equals(this.receiverTmpfileThreshold, comDayCqReplicationImplReplicationReceiverImplProperties.receiverTmpfileThreshold) &&
        Objects.equals(this.receiverPackagesUseInstall, comDayCqReplicationImplReplicationReceiverImplProperties.receiverPackagesUseInstall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receiverTmpfileThreshold, receiverPackagesUseInstall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReplicationImplReplicationReceiverImplProperties {\n");
    
    sb.append("    receiverTmpfileThreshold: ").append(toIndentedString(receiverTmpfileThreshold)).append("\n");
    sb.append("    receiverPackagesUseInstall: ").append(toIndentedString(receiverPackagesUseInstall)).append("\n");
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
