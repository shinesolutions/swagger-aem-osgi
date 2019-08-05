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
  public class ComDayCqPollingImporterImplManagedPollConfigImplProperties {
    /// <summary>
    /// Gets or Sets Id
    /// </summary>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public ConfigNodePropertyString Id { get; set; }

    /// <summary>
    /// Gets or Sets Enabled
    /// </summary>
    [DataMember(Name="enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enabled")]
    public ConfigNodePropertyBoolean Enabled { get; set; }

    /// <summary>
    /// Gets or Sets Reference
    /// </summary>
    [DataMember(Name="reference", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "reference")]
    public ConfigNodePropertyBoolean Reference { get; set; }

    /// <summary>
    /// Gets or Sets Interval
    /// </summary>
    [DataMember(Name="interval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "interval")]
    public ConfigNodePropertyInteger Interval { get; set; }

    /// <summary>
    /// Gets or Sets Expression
    /// </summary>
    [DataMember(Name="expression", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "expression")]
    public ConfigNodePropertyString Expression { get; set; }

    /// <summary>
    /// Gets or Sets Source
    /// </summary>
    [DataMember(Name="source", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "source")]
    public ConfigNodePropertyString Source { get; set; }

    /// <summary>
    /// Gets or Sets Target
    /// </summary>
    [DataMember(Name="target", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "target")]
    public ConfigNodePropertyString Target { get; set; }

    /// <summary>
    /// Gets or Sets Login
    /// </summary>
    [DataMember(Name="login", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "login")]
    public ConfigNodePropertyString Login { get; set; }

    /// <summary>
    /// Gets or Sets Password
    /// </summary>
    [DataMember(Name="password", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "password")]
    public ConfigNodePropertyString Password { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqPollingImporterImplManagedPollConfigImplProperties {\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  Enabled: ").Append(Enabled).Append("\n");
      sb.Append("  Reference: ").Append(Reference).Append("\n");
      sb.Append("  Interval: ").Append(Interval).Append("\n");
      sb.Append("  Expression: ").Append(Expression).Append("\n");
      sb.Append("  Source: ").Append(Source).Append("\n");
      sb.Append("  Target: ").Append(Target).Append("\n");
      sb.Append("  Login: ").Append(Login).Append("\n");
      sb.Append("  Password: ").Append(Password).Append("\n");
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
