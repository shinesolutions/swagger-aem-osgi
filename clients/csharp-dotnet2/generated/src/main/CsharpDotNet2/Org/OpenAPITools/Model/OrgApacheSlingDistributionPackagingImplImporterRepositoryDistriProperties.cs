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
  public class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties {
    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public ConfigNodePropertyString Name { get; set; }

    /// <summary>
    /// Gets or Sets ServiceName
    /// </summary>
    [DataMember(Name="service.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service.name")]
    public ConfigNodePropertyString ServiceName { get; set; }

    /// <summary>
    /// Gets or Sets Path
    /// </summary>
    [DataMember(Name="path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "path")]
    public ConfigNodePropertyString Path { get; set; }

    /// <summary>
    /// Gets or Sets PrivilegeName
    /// </summary>
    [DataMember(Name="privilege.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "privilege.name")]
    public ConfigNodePropertyString PrivilegeName { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties {\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  ServiceName: ").Append(ServiceName).Append("\n");
      sb.Append("  Path: ").Append(Path).Append("\n");
      sb.Append("  PrivilegeName: ").Append(PrivilegeName).Append("\n");
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
