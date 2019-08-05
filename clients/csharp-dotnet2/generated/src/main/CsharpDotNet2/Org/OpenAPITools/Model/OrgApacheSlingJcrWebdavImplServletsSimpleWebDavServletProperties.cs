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
  public class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties {
    /// <summary>
    /// Gets or Sets DavRoot
    /// </summary>
    [DataMember(Name="dav.root", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dav.root")]
    public ConfigNodePropertyString DavRoot { get; set; }

    /// <summary>
    /// Gets or Sets DavCreateAbsoluteUri
    /// </summary>
    [DataMember(Name="dav.create-absolute-uri", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dav.create-absolute-uri")]
    public ConfigNodePropertyBoolean DavCreateAbsoluteUri { get; set; }

    /// <summary>
    /// Gets or Sets DavRealm
    /// </summary>
    [DataMember(Name="dav.realm", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dav.realm")]
    public ConfigNodePropertyString DavRealm { get; set; }

    /// <summary>
    /// Gets or Sets CollectionTypes
    /// </summary>
    [DataMember(Name="collection.types", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "collection.types")]
    public ConfigNodePropertyArray CollectionTypes { get; set; }

    /// <summary>
    /// Gets or Sets FilterPrefixes
    /// </summary>
    [DataMember(Name="filter.prefixes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "filter.prefixes")]
    public ConfigNodePropertyArray FilterPrefixes { get; set; }

    /// <summary>
    /// Gets or Sets FilterTypes
    /// </summary>
    [DataMember(Name="filter.types", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "filter.types")]
    public ConfigNodePropertyString FilterTypes { get; set; }

    /// <summary>
    /// Gets or Sets FilterUris
    /// </summary>
    [DataMember(Name="filter.uris", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "filter.uris")]
    public ConfigNodePropertyString FilterUris { get; set; }

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
      sb.Append("class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties {\n");
      sb.Append("  DavRoot: ").Append(DavRoot).Append("\n");
      sb.Append("  DavCreateAbsoluteUri: ").Append(DavCreateAbsoluteUri).Append("\n");
      sb.Append("  DavRealm: ").Append(DavRealm).Append("\n");
      sb.Append("  CollectionTypes: ").Append(CollectionTypes).Append("\n");
      sb.Append("  FilterPrefixes: ").Append(FilterPrefixes).Append("\n");
      sb.Append("  FilterTypes: ").Append(FilterTypes).Append("\n");
      sb.Append("  FilterUris: ").Append(FilterUris).Append("\n");
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
