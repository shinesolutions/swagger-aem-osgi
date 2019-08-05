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
  public class ComDayCqDamScene7ImplScene7APIClientImplProperties {
    /// <summary>
    /// Gets or Sets CqDamScene7ApiclientRecordsperpageNofilterName
    /// </summary>
    [DataMember(Name="cq.dam.scene7.apiclient.recordsperpage.nofilter.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.scene7.apiclient.recordsperpage.nofilter.name")]
    public ConfigNodePropertyInteger CqDamScene7ApiclientRecordsperpageNofilterName { get; set; }

    /// <summary>
    /// Gets or Sets CqDamScene7ApiclientRecordsperpageWithfilterName
    /// </summary>
    [DataMember(Name="cq.dam.scene7.apiclient.recordsperpage.withfilter.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.scene7.apiclient.recordsperpage.withfilter.name")]
    public ConfigNodePropertyInteger CqDamScene7ApiclientRecordsperpageWithfilterName { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamScene7ImplScene7APIClientImplProperties {\n");
      sb.Append("  CqDamScene7ApiclientRecordsperpageNofilterName: ").Append(CqDamScene7ApiclientRecordsperpageNofilterName).Append("\n");
      sb.Append("  CqDamScene7ApiclientRecordsperpageWithfilterName: ").Append(CqDamScene7ApiclientRecordsperpageWithfilterName).Append("\n");
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
