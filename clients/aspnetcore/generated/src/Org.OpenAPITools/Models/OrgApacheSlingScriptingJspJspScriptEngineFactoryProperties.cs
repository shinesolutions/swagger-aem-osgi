/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties : IEquatable<OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties>
    { 
        /// <summary>
        /// Gets or Sets JasperCompilerTargetVM
        /// </summary>
        [DataMember(Name="jasper.compilerTargetVM")]
        public ConfigNodePropertyString JasperCompilerTargetVM { get; set; }

        /// <summary>
        /// Gets or Sets JasperCompilerSourceVM
        /// </summary>
        [DataMember(Name="jasper.compilerSourceVM")]
        public ConfigNodePropertyString JasperCompilerSourceVM { get; set; }

        /// <summary>
        /// Gets or Sets JasperClassdebuginfo
        /// </summary>
        [DataMember(Name="jasper.classdebuginfo")]
        public ConfigNodePropertyBoolean JasperClassdebuginfo { get; set; }

        /// <summary>
        /// Gets or Sets JasperEnablePooling
        /// </summary>
        [DataMember(Name="jasper.enablePooling")]
        public ConfigNodePropertyBoolean JasperEnablePooling { get; set; }

        /// <summary>
        /// Gets or Sets JasperIeClassId
        /// </summary>
        [DataMember(Name="jasper.ieClassId")]
        public ConfigNodePropertyString JasperIeClassId { get; set; }

        /// <summary>
        /// Gets or Sets JasperGenStringAsCharArray
        /// </summary>
        [DataMember(Name="jasper.genStringAsCharArray")]
        public ConfigNodePropertyBoolean JasperGenStringAsCharArray { get; set; }

        /// <summary>
        /// Gets or Sets JasperKeepgenerated
        /// </summary>
        [DataMember(Name="jasper.keepgenerated")]
        public ConfigNodePropertyBoolean JasperKeepgenerated { get; set; }

        /// <summary>
        /// Gets or Sets JasperMappedfile
        /// </summary>
        [DataMember(Name="jasper.mappedfile")]
        public ConfigNodePropertyBoolean JasperMappedfile { get; set; }

        /// <summary>
        /// Gets or Sets JasperTrimSpaces
        /// </summary>
        [DataMember(Name="jasper.trimSpaces")]
        public ConfigNodePropertyBoolean JasperTrimSpaces { get; set; }

        /// <summary>
        /// Gets or Sets JasperDisplaySourceFragments
        /// </summary>
        [DataMember(Name="jasper.displaySourceFragments")]
        public ConfigNodePropertyBoolean JasperDisplaySourceFragments { get; set; }

        /// <summary>
        /// Gets or Sets DefaultIsSession
        /// </summary>
        [DataMember(Name="default.is.session")]
        public ConfigNodePropertyBoolean DefaultIsSession { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties {\n");
            sb.Append("  JasperCompilerTargetVM: ").Append(JasperCompilerTargetVM).Append("\n");
            sb.Append("  JasperCompilerSourceVM: ").Append(JasperCompilerSourceVM).Append("\n");
            sb.Append("  JasperClassdebuginfo: ").Append(JasperClassdebuginfo).Append("\n");
            sb.Append("  JasperEnablePooling: ").Append(JasperEnablePooling).Append("\n");
            sb.Append("  JasperIeClassId: ").Append(JasperIeClassId).Append("\n");
            sb.Append("  JasperGenStringAsCharArray: ").Append(JasperGenStringAsCharArray).Append("\n");
            sb.Append("  JasperKeepgenerated: ").Append(JasperKeepgenerated).Append("\n");
            sb.Append("  JasperMappedfile: ").Append(JasperMappedfile).Append("\n");
            sb.Append("  JasperTrimSpaces: ").Append(JasperTrimSpaces).Append("\n");
            sb.Append("  JasperDisplaySourceFragments: ").Append(JasperDisplaySourceFragments).Append("\n");
            sb.Append("  DefaultIsSession: ").Append(DefaultIsSession).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties)obj);
        }

        /// <summary>
        /// Returns true if OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties instances are equal
        /// </summary>
        /// <param name="other">Instance of OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    JasperCompilerTargetVM == other.JasperCompilerTargetVM ||
                    JasperCompilerTargetVM != null &&
                    JasperCompilerTargetVM.Equals(other.JasperCompilerTargetVM)
                ) && 
                (
                    JasperCompilerSourceVM == other.JasperCompilerSourceVM ||
                    JasperCompilerSourceVM != null &&
                    JasperCompilerSourceVM.Equals(other.JasperCompilerSourceVM)
                ) && 
                (
                    JasperClassdebuginfo == other.JasperClassdebuginfo ||
                    JasperClassdebuginfo != null &&
                    JasperClassdebuginfo.Equals(other.JasperClassdebuginfo)
                ) && 
                (
                    JasperEnablePooling == other.JasperEnablePooling ||
                    JasperEnablePooling != null &&
                    JasperEnablePooling.Equals(other.JasperEnablePooling)
                ) && 
                (
                    JasperIeClassId == other.JasperIeClassId ||
                    JasperIeClassId != null &&
                    JasperIeClassId.Equals(other.JasperIeClassId)
                ) && 
                (
                    JasperGenStringAsCharArray == other.JasperGenStringAsCharArray ||
                    JasperGenStringAsCharArray != null &&
                    JasperGenStringAsCharArray.Equals(other.JasperGenStringAsCharArray)
                ) && 
                (
                    JasperKeepgenerated == other.JasperKeepgenerated ||
                    JasperKeepgenerated != null &&
                    JasperKeepgenerated.Equals(other.JasperKeepgenerated)
                ) && 
                (
                    JasperMappedfile == other.JasperMappedfile ||
                    JasperMappedfile != null &&
                    JasperMappedfile.Equals(other.JasperMappedfile)
                ) && 
                (
                    JasperTrimSpaces == other.JasperTrimSpaces ||
                    JasperTrimSpaces != null &&
                    JasperTrimSpaces.Equals(other.JasperTrimSpaces)
                ) && 
                (
                    JasperDisplaySourceFragments == other.JasperDisplaySourceFragments ||
                    JasperDisplaySourceFragments != null &&
                    JasperDisplaySourceFragments.Equals(other.JasperDisplaySourceFragments)
                ) && 
                (
                    DefaultIsSession == other.DefaultIsSession ||
                    DefaultIsSession != null &&
                    DefaultIsSession.Equals(other.DefaultIsSession)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (JasperCompilerTargetVM != null)
                    hashCode = hashCode * 59 + JasperCompilerTargetVM.GetHashCode();
                    if (JasperCompilerSourceVM != null)
                    hashCode = hashCode * 59 + JasperCompilerSourceVM.GetHashCode();
                    if (JasperClassdebuginfo != null)
                    hashCode = hashCode * 59 + JasperClassdebuginfo.GetHashCode();
                    if (JasperEnablePooling != null)
                    hashCode = hashCode * 59 + JasperEnablePooling.GetHashCode();
                    if (JasperIeClassId != null)
                    hashCode = hashCode * 59 + JasperIeClassId.GetHashCode();
                    if (JasperGenStringAsCharArray != null)
                    hashCode = hashCode * 59 + JasperGenStringAsCharArray.GetHashCode();
                    if (JasperKeepgenerated != null)
                    hashCode = hashCode * 59 + JasperKeepgenerated.GetHashCode();
                    if (JasperMappedfile != null)
                    hashCode = hashCode * 59 + JasperMappedfile.GetHashCode();
                    if (JasperTrimSpaces != null)
                    hashCode = hashCode * 59 + JasperTrimSpaces.GetHashCode();
                    if (JasperDisplaySourceFragments != null)
                    hashCode = hashCode * 59 + JasperDisplaySourceFragments.GetHashCode();
                    if (DefaultIsSession != null)
                    hashCode = hashCode * 59 + DefaultIsSession.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties left, OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties left, OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}