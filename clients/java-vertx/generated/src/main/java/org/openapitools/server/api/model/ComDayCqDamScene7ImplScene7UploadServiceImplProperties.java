package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamScene7ImplScene7UploadServiceImplProperties   {
  
  private ConfigNodePropertyInteger cqDamScene7UploadserviceActivejobtimeoutLabel = null;
  private ConfigNodePropertyInteger cqDamScene7UploadserviceConnectionmaxperrouteLabel = null;

  public ComDayCqDamScene7ImplScene7UploadServiceImplProperties () {

  }

  public ComDayCqDamScene7ImplScene7UploadServiceImplProperties (ConfigNodePropertyInteger cqDamScene7UploadserviceActivejobtimeoutLabel, ConfigNodePropertyInteger cqDamScene7UploadserviceConnectionmaxperrouteLabel) {
    this.cqDamScene7UploadserviceActivejobtimeoutLabel = cqDamScene7UploadserviceActivejobtimeoutLabel;
    this.cqDamScene7UploadserviceConnectionmaxperrouteLabel = cqDamScene7UploadserviceConnectionmaxperrouteLabel;
  }

    
  @JsonProperty("cq.dam.scene7.uploadservice.activejobtimeout.label")
  public ConfigNodePropertyInteger getCqDamScene7UploadserviceActivejobtimeoutLabel() {
    return cqDamScene7UploadserviceActivejobtimeoutLabel;
  }
  public void setCqDamScene7UploadserviceActivejobtimeoutLabel(ConfigNodePropertyInteger cqDamScene7UploadserviceActivejobtimeoutLabel) {
    this.cqDamScene7UploadserviceActivejobtimeoutLabel = cqDamScene7UploadserviceActivejobtimeoutLabel;
  }

    
  @JsonProperty("cq.dam.scene7.uploadservice.connectionmaxperroute.label")
  public ConfigNodePropertyInteger getCqDamScene7UploadserviceConnectionmaxperrouteLabel() {
    return cqDamScene7UploadserviceConnectionmaxperrouteLabel;
  }
  public void setCqDamScene7UploadserviceConnectionmaxperrouteLabel(ConfigNodePropertyInteger cqDamScene7UploadserviceConnectionmaxperrouteLabel) {
    this.cqDamScene7UploadserviceConnectionmaxperrouteLabel = cqDamScene7UploadserviceConnectionmaxperrouteLabel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamScene7ImplScene7UploadServiceImplProperties comDayCqDamScene7ImplScene7UploadServiceImplProperties = (ComDayCqDamScene7ImplScene7UploadServiceImplProperties) o;
    return Objects.equals(cqDamScene7UploadserviceActivejobtimeoutLabel, comDayCqDamScene7ImplScene7UploadServiceImplProperties.cqDamScene7UploadserviceActivejobtimeoutLabel) &&
        Objects.equals(cqDamScene7UploadserviceConnectionmaxperrouteLabel, comDayCqDamScene7ImplScene7UploadServiceImplProperties.cqDamScene7UploadserviceConnectionmaxperrouteLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamScene7UploadserviceActivejobtimeoutLabel, cqDamScene7UploadserviceConnectionmaxperrouteLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamScene7ImplScene7UploadServiceImplProperties {\n");
    
    sb.append("    cqDamScene7UploadserviceActivejobtimeoutLabel: ").append(toIndentedString(cqDamScene7UploadserviceActivejobtimeoutLabel)).append("\n");
    sb.append("    cqDamScene7UploadserviceConnectionmaxperrouteLabel: ").append(toIndentedString(cqDamScene7UploadserviceConnectionmaxperrouteLabel)).append("\n");
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
