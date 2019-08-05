using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties
    /// </summary>
    public sealed class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties:  IEquatable<ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties>
    { 
        /// <summary>
        /// PreserveHierarchyNodes
        /// </summary>
        public ConfigNodePropertyBoolean PreserveHierarchyNodes { get; private set; }

        /// <summary>
        /// IgnoreVersioning
        /// </summary>
        public ConfigNodePropertyBoolean IgnoreVersioning { get; private set; }

        /// <summary>
        /// ImportAcl
        /// </summary>
        public ConfigNodePropertyBoolean ImportAcl { get; private set; }

        /// <summary>
        /// SaveThreshold
        /// </summary>
        public ConfigNodePropertyInteger SaveThreshold { get; private set; }

        /// <summary>
        /// PreserveUserPaths
        /// </summary>
        public ConfigNodePropertyBoolean PreserveUserPaths { get; private set; }

        /// <summary>
        /// PreserveUuid
        /// </summary>
        public ConfigNodePropertyBoolean PreserveUuid { get; private set; }

        /// <summary>
        /// PreserveUuidNodetypes
        /// </summary>
        public ConfigNodePropertyArray PreserveUuidNodetypes { get; private set; }

        /// <summary>
        /// PreserveUuidSubtrees
        /// </summary>
        public ConfigNodePropertyArray PreserveUuidSubtrees { get; private set; }

        /// <summary>
        /// AutoCommit
        /// </summary>
        public ConfigNodePropertyBoolean AutoCommit { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties()
        {
        }

        private ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties(ConfigNodePropertyBoolean PreserveHierarchyNodes, ConfigNodePropertyBoolean IgnoreVersioning, ConfigNodePropertyBoolean ImportAcl, ConfigNodePropertyInteger SaveThreshold, ConfigNodePropertyBoolean PreserveUserPaths, ConfigNodePropertyBoolean PreserveUuid, ConfigNodePropertyArray PreserveUuidNodetypes, ConfigNodePropertyArray PreserveUuidSubtrees, ConfigNodePropertyBoolean AutoCommit)
        {
            
            this.PreserveHierarchyNodes = PreserveHierarchyNodes;
            
            this.IgnoreVersioning = IgnoreVersioning;
            
            this.ImportAcl = ImportAcl;
            
            this.SaveThreshold = SaveThreshold;
            
            this.PreserveUserPaths = PreserveUserPaths;
            
            this.PreserveUuid = PreserveUuid;
            
            this.PreserveUuidNodetypes = PreserveUuidNodetypes;
            
            this.PreserveUuidSubtrees = PreserveUuidSubtrees;
            
            this.AutoCommit = AutoCommit;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder</returns>
        public static ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder Builder()
        {
            return new ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder</returns>
        public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder With()
        {
            return Builder()
                .PreserveHierarchyNodes(PreserveHierarchyNodes)
                .IgnoreVersioning(IgnoreVersioning)
                .ImportAcl(ImportAcl)
                .SaveThreshold(SaveThreshold)
                .PreserveUserPaths(PreserveUserPaths)
                .PreserveUuid(PreserveUuid)
                .PreserveUuidNodetypes(PreserveUuidNodetypes)
                .PreserveUuidSubtrees(PreserveUuidSubtrees)
                .AutoCommit(AutoCommit);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties left, ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties left, ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.
        /// </summary>
        public sealed class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _PreserveHierarchyNodes;
            private ConfigNodePropertyBoolean _IgnoreVersioning;
            private ConfigNodePropertyBoolean _ImportAcl;
            private ConfigNodePropertyInteger _SaveThreshold;
            private ConfigNodePropertyBoolean _PreserveUserPaths;
            private ConfigNodePropertyBoolean _PreserveUuid;
            private ConfigNodePropertyArray _PreserveUuidNodetypes;
            private ConfigNodePropertyArray _PreserveUuidSubtrees;
            private ConfigNodePropertyBoolean _AutoCommit;

            internal ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.PreserveHierarchyNodes property.
            /// </summary>
            /// <param name="value">PreserveHierarchyNodes</param>
            public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder PreserveHierarchyNodes(ConfigNodePropertyBoolean value)
            {
                _PreserveHierarchyNodes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.IgnoreVersioning property.
            /// </summary>
            /// <param name="value">IgnoreVersioning</param>
            public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder IgnoreVersioning(ConfigNodePropertyBoolean value)
            {
                _IgnoreVersioning = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.ImportAcl property.
            /// </summary>
            /// <param name="value">ImportAcl</param>
            public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder ImportAcl(ConfigNodePropertyBoolean value)
            {
                _ImportAcl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.SaveThreshold property.
            /// </summary>
            /// <param name="value">SaveThreshold</param>
            public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder SaveThreshold(ConfigNodePropertyInteger value)
            {
                _SaveThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.PreserveUserPaths property.
            /// </summary>
            /// <param name="value">PreserveUserPaths</param>
            public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder PreserveUserPaths(ConfigNodePropertyBoolean value)
            {
                _PreserveUserPaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.PreserveUuid property.
            /// </summary>
            /// <param name="value">PreserveUuid</param>
            public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder PreserveUuid(ConfigNodePropertyBoolean value)
            {
                _PreserveUuid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.PreserveUuidNodetypes property.
            /// </summary>
            /// <param name="value">PreserveUuidNodetypes</param>
            public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder PreserveUuidNodetypes(ConfigNodePropertyArray value)
            {
                _PreserveUuidNodetypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.PreserveUuidSubtrees property.
            /// </summary>
            /// <param name="value">PreserveUuidSubtrees</param>
            public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder PreserveUuidSubtrees(ConfigNodePropertyArray value)
            {
                _PreserveUuidSubtrees = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.AutoCommit property.
            /// </summary>
            /// <param name="value">AutoCommit</param>
            public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder AutoCommit(ConfigNodePropertyBoolean value)
            {
                _AutoCommit = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.
            /// </summary>
            /// <returns>ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties</returns>
            public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties Build()
            {
                Validate();
                return new ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties(
                    PreserveHierarchyNodes: _PreserveHierarchyNodes,
                    IgnoreVersioning: _IgnoreVersioning,
                    ImportAcl: _ImportAcl,
                    SaveThreshold: _SaveThreshold,
                    PreserveUserPaths: _PreserveUserPaths,
                    PreserveUuid: _PreserveUuid,
                    PreserveUuidNodetypes: _PreserveUuidNodetypes,
                    PreserveUuidSubtrees: _PreserveUuidSubtrees,
                    AutoCommit: _AutoCommit
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}