package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties   {
  

  private ConfigNodePropertyArray cqAnalyticsSitecatalystServiceDatacenterUrl = null;

  private ConfigNodePropertyArray devhostnamepatterns = null;

  private ConfigNodePropertyInteger connectionTimeout = null;

  private ConfigNodePropertyInteger socketTimeout = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.analytics.sitecatalyst.service.datacenter.url")
  public ConfigNodePropertyArray getCqAnalyticsSitecatalystServiceDatacenterUrl() {
    return cqAnalyticsSitecatalystServiceDatacenterUrl;
  }
  public void setCqAnalyticsSitecatalystServiceDatacenterUrl(ConfigNodePropertyArray cqAnalyticsSitecatalystServiceDatacenterUrl) {
    this.cqAnalyticsSitecatalystServiceDatacenterUrl = cqAnalyticsSitecatalystServiceDatacenterUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("devhostnamepatterns")
  public ConfigNodePropertyArray getDevhostnamepatterns() {
    return devhostnamepatterns;
  }
  public void setDevhostnamepatterns(ConfigNodePropertyArray devhostnamepatterns) {
    this.devhostnamepatterns = devhostnamepatterns;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connection.timeout")
  public ConfigNodePropertyInteger getConnectionTimeout() {
    return connectionTimeout;
  }
  public void setConnectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("socket.timeout")
  public ConfigNodePropertyInteger getSocketTimeout() {
    return socketTimeout;
  }
  public void setSocketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties = (ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties) o;
    return Objects.equals(cqAnalyticsSitecatalystServiceDatacenterUrl, comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.cqAnalyticsSitecatalystServiceDatacenterUrl) &&
        Objects.equals(devhostnamepatterns, comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.devhostnamepatterns) &&
        Objects.equals(connectionTimeout, comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.connectionTimeout) &&
        Objects.equals(socketTimeout, comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.socketTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqAnalyticsSitecatalystServiceDatacenterUrl, devhostnamepatterns, connectionTimeout, socketTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties {\n");
    
    sb.append("    cqAnalyticsSitecatalystServiceDatacenterUrl: ").append(toIndentedString(cqAnalyticsSitecatalystServiceDatacenterUrl)).append("\n");
    sb.append("    devhostnamepatterns: ").append(toIndentedString(devhostnamepatterns)).append("\n");
    sb.append("    connectionTimeout: ").append(toIndentedString(connectionTimeout)).append("\n");
    sb.append("    socketTimeout: ").append(toIndentedString(socketTimeout)).append("\n");
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

