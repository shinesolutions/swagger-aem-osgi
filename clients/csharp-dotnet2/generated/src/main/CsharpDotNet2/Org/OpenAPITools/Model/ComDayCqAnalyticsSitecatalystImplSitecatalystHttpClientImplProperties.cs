using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties {
    /// <summary>
    /// Gets or Sets CqAnalyticsSitecatalystServiceDatacenterUrl
    /// </summary>
    [DataMember(Name="cq.analytics.sitecatalyst.service.datacenter.url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.analytics.sitecatalyst.service.datacenter.url")]
    public ConfigNodePropertyArray CqAnalyticsSitecatalystServiceDatacenterUrl { get; set; }

    /// <summary>
    /// Gets or Sets Devhostnamepatterns
    /// </summary>
    [DataMember(Name="devhostnamepatterns", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "devhostnamepatterns")]
    public ConfigNodePropertyArray Devhostnamepatterns { get; set; }

    /// <summary>
    /// Gets or Sets ConnectionTimeout
    /// </summary>
    [DataMember(Name="connection.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "connection.timeout")]
    public ConfigNodePropertyInteger ConnectionTimeout { get; set; }

    /// <summary>
    /// Gets or Sets SocketTimeout
    /// </summary>
    [DataMember(Name="socket.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "socket.timeout")]
    public ConfigNodePropertyInteger SocketTimeout { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties {\n");
      sb.Append("  CqAnalyticsSitecatalystServiceDatacenterUrl: ").Append(CqAnalyticsSitecatalystServiceDatacenterUrl).Append("\n");
      sb.Append("  Devhostnamepatterns: ").Append(Devhostnamepatterns).Append("\n");
      sb.Append("  ConnectionTimeout: ").Append(ConnectionTimeout).Append("\n");
      sb.Append("  SocketTimeout: ").Append(SocketTimeout).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
