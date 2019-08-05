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
  public class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties {
    /// <summary>
    /// Gets or Sets AccountName
    /// </summary>
    [DataMember(Name="accountName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accountName")]
    public ConfigNodePropertyString AccountName { get; set; }

    /// <summary>
    /// Gets or Sets ContainerName
    /// </summary>
    [DataMember(Name="containerName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "containerName")]
    public ConfigNodePropertyString ContainerName { get; set; }

    /// <summary>
    /// Gets or Sets AccessKey
    /// </summary>
    [DataMember(Name="accessKey", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accessKey")]
    public ConfigNodePropertyString AccessKey { get; set; }

    /// <summary>
    /// Gets or Sets RootPath
    /// </summary>
    [DataMember(Name="rootPath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rootPath")]
    public ConfigNodePropertyString RootPath { get; set; }

    /// <summary>
    /// Gets or Sets ConnectionURL
    /// </summary>
    [DataMember(Name="connectionURL", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "connectionURL")]
    public ConfigNodePropertyString ConnectionURL { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties {\n");
      sb.Append("  AccountName: ").Append(AccountName).Append("\n");
      sb.Append("  ContainerName: ").Append(ContainerName).Append("\n");
      sb.Append("  AccessKey: ").Append(AccessKey).Append("\n");
      sb.Append("  RootPath: ").Append(RootPath).Append("\n");
      sb.Append("  ConnectionURL: ").Append(ConnectionURL).Append("\n");
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
