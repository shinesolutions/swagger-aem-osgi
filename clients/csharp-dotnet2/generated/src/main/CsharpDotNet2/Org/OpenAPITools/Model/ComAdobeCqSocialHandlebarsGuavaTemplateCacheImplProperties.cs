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
  public class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties {
    /// <summary>
    /// Gets or Sets ParameterGuavaCacheEnabled
    /// </summary>
    [DataMember(Name="parameter.guava.cache.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "parameter.guava.cache.enabled")]
    public ConfigNodePropertyBoolean ParameterGuavaCacheEnabled { get; set; }

    /// <summary>
    /// Gets or Sets ParameterGuavaCacheParams
    /// </summary>
    [DataMember(Name="parameter.guava.cache.params", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "parameter.guava.cache.params")]
    public ConfigNodePropertyString ParameterGuavaCacheParams { get; set; }

    /// <summary>
    /// Gets or Sets ParameterGuavaCacheReload
    /// </summary>
    [DataMember(Name="parameter.guava.cache.reload", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "parameter.guava.cache.reload")]
    public ConfigNodePropertyBoolean ParameterGuavaCacheReload { get; set; }

    /// <summary>
    /// Gets or Sets ServiceRanking
    /// </summary>
    [DataMember(Name="service.ranking", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service.ranking")]
    public ConfigNodePropertyInteger ServiceRanking { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties {\n");
      sb.Append("  ParameterGuavaCacheEnabled: ").Append(ParameterGuavaCacheEnabled).Append("\n");
      sb.Append("  ParameterGuavaCacheParams: ").Append(ParameterGuavaCacheParams).Append("\n");
      sb.Append("  ParameterGuavaCacheReload: ").Append(ParameterGuavaCacheReload).Append("\n");
      sb.Append("  ServiceRanking: ").Append(ServiceRanking).Append("\n");
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
