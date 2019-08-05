package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqReplicationImplReplicationReceiverImplProperties   {
  
  private ConfigNodePropertyInteger receiverTmpfileThreshold = null;
  private ConfigNodePropertyBoolean receiverPackagesUseInstall = null;

  public ComDayCqReplicationImplReplicationReceiverImplProperties () {

  }

  public ComDayCqReplicationImplReplicationReceiverImplProperties (ConfigNodePropertyInteger receiverTmpfileThreshold, ConfigNodePropertyBoolean receiverPackagesUseInstall) {
    this.receiverTmpfileThreshold = receiverTmpfileThreshold;
    this.receiverPackagesUseInstall = receiverPackagesUseInstall;
  }

    
  @JsonProperty("receiver.tmpfile.threshold")
  public ConfigNodePropertyInteger getReceiverTmpfileThreshold() {
    return receiverTmpfileThreshold;
  }
  public void setReceiverTmpfileThreshold(ConfigNodePropertyInteger receiverTmpfileThreshold) {
    this.receiverTmpfileThreshold = receiverTmpfileThreshold;
  }

    
  @JsonProperty("receiver.packages.use.install")
  public ConfigNodePropertyBoolean getReceiverPackagesUseInstall() {
    return receiverPackagesUseInstall;
  }
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
    return Objects.equals(receiverTmpfileThreshold, comDayCqReplicationImplReplicationReceiverImplProperties.receiverTmpfileThreshold) &&
        Objects.equals(receiverPackagesUseInstall, comDayCqReplicationImplReplicationReceiverImplProperties.receiverPackagesUseInstall);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
