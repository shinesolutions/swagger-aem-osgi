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
  public class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties {
    /// <summary>
    /// Gets or Sets FelixInventoryPrinterName
    /// </summary>
    [DataMember(Name="felix.inventory.printer.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "felix.inventory.printer.name")]
    public ConfigNodePropertyString FelixInventoryPrinterName { get; set; }

    /// <summary>
    /// Gets or Sets FelixInventoryPrinterTitle
    /// </summary>
    [DataMember(Name="felix.inventory.printer.title", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "felix.inventory.printer.title")]
    public ConfigNodePropertyString FelixInventoryPrinterTitle { get; set; }

    /// <summary>
    /// Gets or Sets Path
    /// </summary>
    [DataMember(Name="path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "path")]
    public ConfigNodePropertyString Path { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties {\n");
      sb.Append("  FelixInventoryPrinterName: ").Append(FelixInventoryPrinterName).Append("\n");
      sb.Append("  FelixInventoryPrinterTitle: ").Append(FelixInventoryPrinterTitle).Append("\n");
      sb.Append("  Path: ").Append(Path).Append("\n");
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
