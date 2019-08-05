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
  public class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties {
    /// <summary>
    /// Gets or Sets EventFilter
    /// </summary>
    [DataMember(Name="event.filter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "event.filter")]
    public ConfigNodePropertyString EventFilter { get; set; }

    /// <summary>
    /// Gets or Sets FontmgrSystemFontDir
    /// </summary>
    [DataMember(Name="fontmgr.system.font.dir", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fontmgr.system.font.dir")]
    public ConfigNodePropertyArray FontmgrSystemFontDir { get; set; }

    /// <summary>
    /// Gets or Sets FontmgrAdobeFontDir
    /// </summary>
    [DataMember(Name="fontmgr.adobe.font.dir", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fontmgr.adobe.font.dir")]
    public ConfigNodePropertyString FontmgrAdobeFontDir { get; set; }

    /// <summary>
    /// Gets or Sets FontmgrCustomerFontDir
    /// </summary>
    [DataMember(Name="fontmgr.customer.font.dir", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fontmgr.customer.font.dir")]
    public ConfigNodePropertyString FontmgrCustomerFontDir { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties {\n");
      sb.Append("  EventFilter: ").Append(EventFilter).Append("\n");
      sb.Append("  FontmgrSystemFontDir: ").Append(FontmgrSystemFontDir).Append("\n");
      sb.Append("  FontmgrAdobeFontDir: ").Append(FontmgrAdobeFontDir).Append("\n");
      sb.Append("  FontmgrCustomerFontDir: ").Append(FontmgrCustomerFontDir).Append("\n");
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
