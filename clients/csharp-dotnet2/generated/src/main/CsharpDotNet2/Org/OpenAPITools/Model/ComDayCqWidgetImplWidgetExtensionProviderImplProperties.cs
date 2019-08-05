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
  public class ComDayCqWidgetImplWidgetExtensionProviderImplProperties {
    /// <summary>
    /// Gets or Sets ExtendableWidgets
    /// </summary>
    [DataMember(Name="extendable.widgets", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "extendable.widgets")]
    public ConfigNodePropertyArray ExtendableWidgets { get; set; }

    /// <summary>
    /// Gets or Sets WidgetextensionproviderDebug
    /// </summary>
    [DataMember(Name="widgetextensionprovider.debug", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "widgetextensionprovider.debug")]
    public ConfigNodePropertyBoolean WidgetextensionproviderDebug { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWidgetImplWidgetExtensionProviderImplProperties {\n");
      sb.Append("  ExtendableWidgets: ").Append(ExtendableWidgets).Append("\n");
      sb.Append("  WidgetextensionproviderDebug: ").Append(WidgetextensionproviderDebug).Append("\n");
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
