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
  public class ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties {
    /// <summary>
    /// Gets or Sets ServiceRanking
    /// </summary>
    [DataMember(Name="service.ranking", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service.ranking")]
    public ConfigNodePropertyInteger ServiceRanking { get; set; }

    /// <summary>
    /// Gets or Sets PathPrefix
    /// </summary>
    [DataMember(Name="pathPrefix", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pathPrefix")]
    public ConfigNodePropertyString PathPrefix { get; set; }

    /// <summary>
    /// Gets or Sets CreateVersion
    /// </summary>
    [DataMember(Name="createVersion", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "createVersion")]
    public ConfigNodePropertyBoolean CreateVersion { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties {\n");
      sb.Append("  ServiceRanking: ").Append(ServiceRanking).Append("\n");
      sb.Append("  PathPrefix: ").Append(PathPrefix).Append("\n");
      sb.Append("  CreateVersion: ").Append(CreateVersion).Append("\n");
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
