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
    public partial class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties : IEquatable<ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties>
    { 
        /// <summary>
        /// Gets or Sets PreserveHierarchyNodes
        /// </summary>
        [DataMember(Name="preserve.hierarchy.nodes")]
        public ConfigNodePropertyBoolean PreserveHierarchyNodes { get; set; }

        /// <summary>
        /// Gets or Sets IgnoreVersioning
        /// </summary>
        [DataMember(Name="ignore.versioning")]
        public ConfigNodePropertyBoolean IgnoreVersioning { get; set; }

        /// <summary>
        /// Gets or Sets ImportAcl
        /// </summary>
        [DataMember(Name="import.acl")]
        public ConfigNodePropertyBoolean ImportAcl { get; set; }

        /// <summary>
        /// Gets or Sets SaveThreshold
        /// </summary>
        [DataMember(Name="save.threshold")]
        public ConfigNodePropertyInteger SaveThreshold { get; set; }

        /// <summary>
        /// Gets or Sets PreserveUserPaths
        /// </summary>
        [DataMember(Name="preserve.user.paths")]
        public ConfigNodePropertyBoolean PreserveUserPaths { get; set; }

        /// <summary>
        /// Gets or Sets PreserveUuid
        /// </summary>
        [DataMember(Name="preserve.uuid")]
        public ConfigNodePropertyBoolean PreserveUuid { get; set; }

        /// <summary>
        /// Gets or Sets PreserveUuidNodetypes
        /// </summary>
        [DataMember(Name="preserve.uuid.nodetypes")]
        public ConfigNodePropertyArray PreserveUuidNodetypes { get; set; }

        /// <summary>
        /// Gets or Sets PreserveUuidSubtrees
        /// </summary>
        [DataMember(Name="preserve.uuid.subtrees")]
        public ConfigNodePropertyArray PreserveUuidSubtrees { get; set; }

        /// <summary>
        /// Gets or Sets AutoCommit
        /// </summary>
        [DataMember(Name="auto.commit")]
        public ConfigNodePropertyBoolean AutoCommit { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties {\n");
            sb.Append("  PreserveHierarchyNodes: ").Append(PreserveHierarchyNodes).Append("\n");
            sb.Append("  IgnoreVersioning: ").Append(IgnoreVersioning).Append("\n");
            sb.Append("  ImportAcl: ").Append(ImportAcl).Append("\n");
            sb.Append("  SaveThreshold: ").Append(SaveThreshold).Append("\n");
            sb.Append("  PreserveUserPaths: ").Append(PreserveUserPaths).Append("\n");
            sb.Append("  PreserveUuid: ").Append(PreserveUuid).Append("\n");
            sb.Append("  PreserveUuidNodetypes: ").Append(PreserveUuidNodetypes).Append("\n");
            sb.Append("  PreserveUuidSubtrees: ").Append(PreserveUuidSubtrees).Append("\n");
            sb.Append("  AutoCommit: ").Append(AutoCommit).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties)obj);
        }

        /// <summary>
        /// Returns true if ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties instances are equal
        /// </summary>
        /// <param name="other">Instance of ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    PreserveHierarchyNodes == other.PreserveHierarchyNodes ||
                    PreserveHierarchyNodes != null &&
                    PreserveHierarchyNodes.Equals(other.PreserveHierarchyNodes)
                ) && 
                (
                    IgnoreVersioning == other.IgnoreVersioning ||
                    IgnoreVersioning != null &&
                    IgnoreVersioning.Equals(other.IgnoreVersioning)
                ) && 
                (
                    ImportAcl == other.ImportAcl ||
                    ImportAcl != null &&
                    ImportAcl.Equals(other.ImportAcl)
                ) && 
                (
                    SaveThreshold == other.SaveThreshold ||
                    SaveThreshold != null &&
                    SaveThreshold.Equals(other.SaveThreshold)
                ) && 
                (
                    PreserveUserPaths == other.PreserveUserPaths ||
                    PreserveUserPaths != null &&
                    PreserveUserPaths.Equals(other.PreserveUserPaths)
                ) && 
                (
                    PreserveUuid == other.PreserveUuid ||
                    PreserveUuid != null &&
                    PreserveUuid.Equals(other.PreserveUuid)
                ) && 
                (
                    PreserveUuidNodetypes == other.PreserveUuidNodetypes ||
                    PreserveUuidNodetypes != null &&
                    PreserveUuidNodetypes.Equals(other.PreserveUuidNodetypes)
                ) && 
                (
                    PreserveUuidSubtrees == other.PreserveUuidSubtrees ||
                    PreserveUuidSubtrees != null &&
                    PreserveUuidSubtrees.Equals(other.PreserveUuidSubtrees)
                ) && 
                (
                    AutoCommit == other.AutoCommit ||
                    AutoCommit != null &&
                    AutoCommit.Equals(other.AutoCommit)
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
                    if (PreserveHierarchyNodes != null)
                    hashCode = hashCode * 59 + PreserveHierarchyNodes.GetHashCode();
                    if (IgnoreVersioning != null)
                    hashCode = hashCode * 59 + IgnoreVersioning.GetHashCode();
                    if (ImportAcl != null)
                    hashCode = hashCode * 59 + ImportAcl.GetHashCode();
                    if (SaveThreshold != null)
                    hashCode = hashCode * 59 + SaveThreshold.GetHashCode();
                    if (PreserveUserPaths != null)
                    hashCode = hashCode * 59 + PreserveUserPaths.GetHashCode();
                    if (PreserveUuid != null)
                    hashCode = hashCode * 59 + PreserveUuid.GetHashCode();
                    if (PreserveUuidNodetypes != null)
                    hashCode = hashCode * 59 + PreserveUuidNodetypes.GetHashCode();
                    if (PreserveUuidSubtrees != null)
                    hashCode = hashCode * 59 + PreserveUuidSubtrees.GetHashCode();
                    if (AutoCommit != null)
                    hashCode = hashCode * 59 + AutoCommit.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties left, ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties left, ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}