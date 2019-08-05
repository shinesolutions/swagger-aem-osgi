package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties   {
  @JsonProperty("cq.analytics.sitecatalyst.service.datacenter.url")
  private ConfigNodePropertyArray cqAnalyticsSitecatalystServiceDatacenterUrl = null;

  @JsonProperty("devhostnamepatterns")
  private ConfigNodePropertyArray devhostnamepatterns = null;

  @JsonProperty("connection.timeout")
  private ConfigNodePropertyInteger connectionTimeout = null;

  @JsonProperty("socket.timeout")
  private ConfigNodePropertyInteger socketTimeout = null;

  /**
   **/
  public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties cqAnalyticsSitecatalystServiceDatacenterUrl(ConfigNodePropertyArray cqAnalyticsSitecatalystServiceDatacenterUrl) {
    this.cqAnalyticsSitecatalystServiceDatacenterUrl = cqAnalyticsSitecatalystServiceDatacenterUrl;
    return this;
  }

  
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
  public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties devhostnamepatterns(ConfigNodePropertyArray devhostnamepatterns) {
    this.devhostnamepatterns = devhostnamepatterns;
    return this;
  }

  
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
  public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties connectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
    return this;
  }

  
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
  public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties socketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("socket.timeout")
  public ConfigNodePropertyInteger getSocketTimeout() {
    return socketTimeout;
  }
  public void setSocketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

