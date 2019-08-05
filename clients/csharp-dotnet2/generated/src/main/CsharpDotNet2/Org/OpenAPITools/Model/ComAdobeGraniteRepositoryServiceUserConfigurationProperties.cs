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
  public class ComAdobeGraniteRepositoryServiceUserConfigurationProperties {
    /// <summary>
    /// Gets or Sets ServiceRanking
    /// </summary>
    [DataMember(Name="service.ranking", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service.ranking")]
    public ConfigNodePropertyInteger ServiceRanking { get; set; }

    /// <summary>
    /// Gets or Sets ServiceusersSimpleSubjectPopulation
    /// </summary>
    [DataMember(Name="serviceusers.simpleSubjectPopulation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "serviceusers.simpleSubjectPopulation")]
    public ConfigNodePropertyBoolean ServiceusersSimpleSubjectPopulation { get; set; }

    /// <summary>
    /// Gets or Sets ServiceusersList
    /// </summary>
    [DataMember(Name="serviceusers.list", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "serviceusers.list")]
    public ConfigNodePropertyArray ServiceusersList { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteRepositoryServiceUserConfigurationProperties {\n");
      sb.Append("  ServiceRanking: ").Append(ServiceRanking).Append("\n");
      sb.Append("  ServiceusersSimpleSubjectPopulation: ").Append(ServiceusersSimpleSubjectPopulation).Append("\n");
      sb.Append("  ServiceusersList: ").Append(ServiceusersList).Append("\n");
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
