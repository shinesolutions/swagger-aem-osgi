package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
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



@JsonTypeName("comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties   {
  private ConfigNodePropertyArray cqAnalyticsSitecatalystServiceDatacenterUrl;
  private ConfigNodePropertyArray devhostnamepatterns;
  private ConfigNodePropertyInteger connectionTimeout;
  private ConfigNodePropertyInteger socketTimeout;

  public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties() {
  }

  /**
   **/
  public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties cqAnalyticsSitecatalystServiceDatacenterUrl(ConfigNodePropertyArray cqAnalyticsSitecatalystServiceDatacenterUrl) {
    this.cqAnalyticsSitecatalystServiceDatacenterUrl = cqAnalyticsSitecatalystServiceDatacenterUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.analytics.sitecatalyst.service.datacenter.url")
  @Valid public ConfigNodePropertyArray getCqAnalyticsSitecatalystServiceDatacenterUrl() {
    return cqAnalyticsSitecatalystServiceDatacenterUrl;
  }

  @JsonProperty("cq.analytics.sitecatalyst.service.datacenter.url")
  public void setCqAnalyticsSitecatalystServiceDatacenterUrl(ConfigNodePropertyArray cqAnalyticsSitecatalystServiceDatacenterUrl) {
    this.cqAnalyticsSitecatalystServiceDatacenterUrl = cqAnalyticsSitecatalystServiceDatacenterUrl;
  }

  /**
   **/
  public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties devhostnamepatterns(ConfigNodePropertyArray devhostnamepatterns) {
    this.devhostnamepatterns = devhostnamepatterns;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("devhostnamepatterns")
  @Valid public ConfigNodePropertyArray getDevhostnamepatterns() {
    return devhostnamepatterns;
  }

  @JsonProperty("devhostnamepatterns")
  public void setDevhostnamepatterns(ConfigNodePropertyArray devhostnamepatterns) {
    this.devhostnamepatterns = devhostnamepatterns;
  }

  /**
   **/
  public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties connectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("connection.timeout")
  @Valid public ConfigNodePropertyInteger getConnectionTimeout() {
    return connectionTimeout;
  }

  @JsonProperty("connection.timeout")
  public void setConnectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  /**
   **/
  public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties socketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("socket.timeout")
  @Valid public ConfigNodePropertyInteger getSocketTimeout() {
    return socketTimeout;
  }

  @JsonProperty("socket.timeout")
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
    return Objects.equals(this.cqAnalyticsSitecatalystServiceDatacenterUrl, comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.cqAnalyticsSitecatalystServiceDatacenterUrl) &&
        Objects.equals(this.devhostnamepatterns, comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.devhostnamepatterns) &&
        Objects.equals(this.connectionTimeout, comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.connectionTimeout) &&
        Objects.equals(this.socketTimeout, comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.socketTimeout);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
