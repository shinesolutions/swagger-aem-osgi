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
  public class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties {
    /// <summary>
    /// Gets or Sets GetCacheExpirationUnit
    /// </summary>
    [DataMember(Name="getCacheExpirationUnit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "getCacheExpirationUnit")]
    public ConfigNodePropertyDropDown GetCacheExpirationUnit { get; set; }

    /// <summary>
    /// Gets or Sets GetCacheExpirationValue
    /// </summary>
    [DataMember(Name="getCacheExpirationValue", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "getCacheExpirationValue")]
    public ConfigNodePropertyInteger GetCacheExpirationValue { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties {\n");
      sb.Append("  GetCacheExpirationUnit: ").Append(GetCacheExpirationUnit).Append("\n");
      sb.Append("  GetCacheExpirationValue: ").Append(GetCacheExpirationValue).Append("\n");
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
