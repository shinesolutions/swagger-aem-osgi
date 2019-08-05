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
  public class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties {
    /// <summary>
    /// Gets or Sets ServiceRanking
    /// </summary>
    [DataMember(Name="service.ranking", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service.ranking")]
    public ConfigNodePropertyInteger ServiceRanking { get; set; }

    /// <summary>
    /// Gets or Sets TypeCollections
    /// </summary>
    [DataMember(Name="type.collections", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type.collections")]
    public ConfigNodePropertyString TypeCollections { get; set; }

    /// <summary>
    /// Gets or Sets TypeNoncollections
    /// </summary>
    [DataMember(Name="type.noncollections", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type.noncollections")]
    public ConfigNodePropertyString TypeNoncollections { get; set; }

    /// <summary>
    /// Gets or Sets TypeContent
    /// </summary>
    [DataMember(Name="type.content", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type.content")]
    public ConfigNodePropertyString TypeContent { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties {\n");
      sb.Append("  ServiceRanking: ").Append(ServiceRanking).Append("\n");
      sb.Append("  TypeCollections: ").Append(TypeCollections).Append("\n");
      sb.Append("  TypeNoncollections: ").Append(TypeNoncollections).Append("\n");
      sb.Append("  TypeContent: ").Append(TypeContent).Append("\n");
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
