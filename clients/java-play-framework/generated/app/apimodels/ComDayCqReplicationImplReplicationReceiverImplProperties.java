package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqReplicationImplReplicationReceiverImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqReplicationImplReplicationReceiverImplProperties   {
  @JsonProperty("receiver.tmpfile.threshold")
  private ConfigNodePropertyInteger receiverTmpfileThreshold = null;

  @JsonProperty("receiver.packages.use.install")
  private ConfigNodePropertyBoolean receiverPackagesUseInstall = null;

  public ComDayCqReplicationImplReplicationReceiverImplProperties receiverTmpfileThreshold(ConfigNodePropertyInteger receiverTmpfileThreshold) {
    this.receiverTmpfileThreshold = receiverTmpfileThreshold;
    return this;
  }

   /**
   * Get receiverTmpfileThreshold
   * @return receiverTmpfileThreshold
  **/
  @Valid
  public ConfigNodePropertyInteger getReceiverTmpfileThreshold() {
    return receiverTmpfileThreshold;
  }

  public void setReceiverTmpfileThreshold(ConfigNodePropertyInteger receiverTmpfileThreshold) {
    this.receiverTmpfileThreshold = receiverTmpfileThreshold;
  }

  public ComDayCqReplicationImplReplicationReceiverImplProperties receiverPackagesUseInstall(ConfigNodePropertyBoolean receiverPackagesUseInstall) {
    this.receiverPackagesUseInstall = receiverPackagesUseInstall;
    return this;
  }

   /**
   * Get receiverPackagesUseInstall
   * @return receiverPackagesUseInstall
  **/
  @Valid
  public ConfigNodePropertyBoolean getReceiverPackagesUseInstall() {
    return receiverPackagesUseInstall;
  }

  public void setReceiverPackagesUseInstall(ConfigNodePropertyBoolean receiverPackagesUseInstall) {
    this.receiverPackagesUseInstall = receiverPackagesUseInstall;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

