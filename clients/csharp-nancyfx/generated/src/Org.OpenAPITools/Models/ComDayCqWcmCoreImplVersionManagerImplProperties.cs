using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplVersionManagerImplProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplVersionManagerImplProperties:  IEquatable<ComDayCqWcmCoreImplVersionManagerImplProperties>
    { 
        /// <summary>
        /// VersionmanagerCreateVersionOnActivation
        /// </summary>
        public ConfigNodePropertyBoolean VersionmanagerCreateVersionOnActivation { get; private set; }

        /// <summary>
        /// VersionmanagerPurgingEnabled
        /// </summary>
        public ConfigNodePropertyBoolean VersionmanagerPurgingEnabled { get; private set; }

        /// <summary>
        /// VersionmanagerPurgePaths
        /// </summary>
        public ConfigNodePropertyArray VersionmanagerPurgePaths { get; private set; }

        /// <summary>
        /// VersionmanagerIvPaths
        /// </summary>
        public ConfigNodePropertyArray VersionmanagerIvPaths { get; private set; }

        /// <summary>
        /// VersionmanagerMaxAgeDays
        /// </summary>
        public ConfigNodePropertyInteger VersionmanagerMaxAgeDays { get; private set; }

        /// <summary>
        /// VersionmanagerMaxNumberVersions
        /// </summary>
        public ConfigNodePropertyInteger VersionmanagerMaxNumberVersions { get; private set; }

        /// <summary>
        /// VersionmanagerMinNumberVersions
        /// </summary>
        public ConfigNodePropertyInteger VersionmanagerMinNumberVersions { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplVersionManagerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplVersionManagerImplProperties()
        {
        }

        private ComDayCqWcmCoreImplVersionManagerImplProperties(ConfigNodePropertyBoolean VersionmanagerCreateVersionOnActivation, ConfigNodePropertyBoolean VersionmanagerPurgingEnabled, ConfigNodePropertyArray VersionmanagerPurgePaths, ConfigNodePropertyArray VersionmanagerIvPaths, ConfigNodePropertyInteger VersionmanagerMaxAgeDays, ConfigNodePropertyInteger VersionmanagerMaxNumberVersions, ConfigNodePropertyInteger VersionmanagerMinNumberVersions)
        {
            
            this.VersionmanagerCreateVersionOnActivation = VersionmanagerCreateVersionOnActivation;
            
            this.VersionmanagerPurgingEnabled = VersionmanagerPurgingEnabled;
            
            this.VersionmanagerPurgePaths = VersionmanagerPurgePaths;
            
            this.VersionmanagerIvPaths = VersionmanagerIvPaths;
            
            this.VersionmanagerMaxAgeDays = VersionmanagerMaxAgeDays;
            
            this.VersionmanagerMaxNumberVersions = VersionmanagerMaxNumberVersions;
            
            this.VersionmanagerMinNumberVersions = VersionmanagerMinNumberVersions;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplVersionManagerImplProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplVersionManagerImplPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplVersionManagerImplPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplVersionManagerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplVersionManagerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplVersionManagerImplPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplVersionManagerImplPropertiesBuilder With()
        {
            return Builder()
                .VersionmanagerCreateVersionOnActivation(VersionmanagerCreateVersionOnActivation)
                .VersionmanagerPurgingEnabled(VersionmanagerPurgingEnabled)
                .VersionmanagerPurgePaths(VersionmanagerPurgePaths)
                .VersionmanagerIvPaths(VersionmanagerIvPaths)
                .VersionmanagerMaxAgeDays(VersionmanagerMaxAgeDays)
                .VersionmanagerMaxNumberVersions(VersionmanagerMaxNumberVersions)
                .VersionmanagerMinNumberVersions(VersionmanagerMinNumberVersions);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplVersionManagerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplVersionManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplVersionManagerImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplVersionManagerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplVersionManagerImplProperties left, ComDayCqWcmCoreImplVersionManagerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplVersionManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplVersionManagerImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplVersionManagerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplVersionManagerImplProperties left, ComDayCqWcmCoreImplVersionManagerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplVersionManagerImplProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplVersionManagerImplPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _VersionmanagerCreateVersionOnActivation;
            private ConfigNodePropertyBoolean _VersionmanagerPurgingEnabled;
            private ConfigNodePropertyArray _VersionmanagerPurgePaths;
            private ConfigNodePropertyArray _VersionmanagerIvPaths;
            private ConfigNodePropertyInteger _VersionmanagerMaxAgeDays;
            private ConfigNodePropertyInteger _VersionmanagerMaxNumberVersions;
            private ConfigNodePropertyInteger _VersionmanagerMinNumberVersions;

            internal ComDayCqWcmCoreImplVersionManagerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVersionManagerImplProperties.VersionmanagerCreateVersionOnActivation property.
            /// </summary>
            /// <param name="value">VersionmanagerCreateVersionOnActivation</param>
            public ComDayCqWcmCoreImplVersionManagerImplPropertiesBuilder VersionmanagerCreateVersionOnActivation(ConfigNodePropertyBoolean value)
            {
                _VersionmanagerCreateVersionOnActivation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVersionManagerImplProperties.VersionmanagerPurgingEnabled property.
            /// </summary>
            /// <param name="value">VersionmanagerPurgingEnabled</param>
            public ComDayCqWcmCoreImplVersionManagerImplPropertiesBuilder VersionmanagerPurgingEnabled(ConfigNodePropertyBoolean value)
            {
                _VersionmanagerPurgingEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVersionManagerImplProperties.VersionmanagerPurgePaths property.
            /// </summary>
            /// <param name="value">VersionmanagerPurgePaths</param>
            public ComDayCqWcmCoreImplVersionManagerImplPropertiesBuilder VersionmanagerPurgePaths(ConfigNodePropertyArray value)
            {
                _VersionmanagerPurgePaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVersionManagerImplProperties.VersionmanagerIvPaths property.
            /// </summary>
            /// <param name="value">VersionmanagerIvPaths</param>
            public ComDayCqWcmCoreImplVersionManagerImplPropertiesBuilder VersionmanagerIvPaths(ConfigNodePropertyArray value)
            {
                _VersionmanagerIvPaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVersionManagerImplProperties.VersionmanagerMaxAgeDays property.
            /// </summary>
            /// <param name="value">VersionmanagerMaxAgeDays</param>
            public ComDayCqWcmCoreImplVersionManagerImplPropertiesBuilder VersionmanagerMaxAgeDays(ConfigNodePropertyInteger value)
            {
                _VersionmanagerMaxAgeDays = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVersionManagerImplProperties.VersionmanagerMaxNumberVersions property.
            /// </summary>
            /// <param name="value">VersionmanagerMaxNumberVersions</param>
            public ComDayCqWcmCoreImplVersionManagerImplPropertiesBuilder VersionmanagerMaxNumberVersions(ConfigNodePropertyInteger value)
            {
                _VersionmanagerMaxNumberVersions = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVersionManagerImplProperties.VersionmanagerMinNumberVersions property.
            /// </summary>
            /// <param name="value">VersionmanagerMinNumberVersions</param>
            public ComDayCqWcmCoreImplVersionManagerImplPropertiesBuilder VersionmanagerMinNumberVersions(ConfigNodePropertyInteger value)
            {
                _VersionmanagerMinNumberVersions = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplVersionManagerImplProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplVersionManagerImplProperties</returns>
            public ComDayCqWcmCoreImplVersionManagerImplProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplVersionManagerImplProperties(
                    VersionmanagerCreateVersionOnActivation: _VersionmanagerCreateVersionOnActivation,
                    VersionmanagerPurgingEnabled: _VersionmanagerPurgingEnabled,
                    VersionmanagerPurgePaths: _VersionmanagerPurgePaths,
                    VersionmanagerIvPaths: _VersionmanagerIvPaths,
                    VersionmanagerMaxAgeDays: _VersionmanagerMaxAgeDays,
                    VersionmanagerMaxNumberVersions: _VersionmanagerMaxNumberVersions,
                    VersionmanagerMinNumberVersions: _VersionmanagerMinNumberVersions
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}