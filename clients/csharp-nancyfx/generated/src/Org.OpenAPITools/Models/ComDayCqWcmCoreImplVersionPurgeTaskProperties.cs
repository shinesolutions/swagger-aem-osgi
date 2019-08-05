using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplVersionPurgeTaskProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplVersionPurgeTaskProperties:  IEquatable<ComDayCqWcmCoreImplVersionPurgeTaskProperties>
    { 
        /// <summary>
        /// VersionpurgePaths
        /// </summary>
        public ConfigNodePropertyArray VersionpurgePaths { get; private set; }

        /// <summary>
        /// VersionpurgeRecursive
        /// </summary>
        public ConfigNodePropertyBoolean VersionpurgeRecursive { get; private set; }

        /// <summary>
        /// VersionpurgeMaxVersions
        /// </summary>
        public ConfigNodePropertyInteger VersionpurgeMaxVersions { get; private set; }

        /// <summary>
        /// VersionpurgeMinVersions
        /// </summary>
        public ConfigNodePropertyInteger VersionpurgeMinVersions { get; private set; }

        /// <summary>
        /// VersionpurgeMaxAgeDays
        /// </summary>
        public ConfigNodePropertyInteger VersionpurgeMaxAgeDays { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplVersionPurgeTaskProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplVersionPurgeTaskProperties()
        {
        }

        private ComDayCqWcmCoreImplVersionPurgeTaskProperties(ConfigNodePropertyArray VersionpurgePaths, ConfigNodePropertyBoolean VersionpurgeRecursive, ConfigNodePropertyInteger VersionpurgeMaxVersions, ConfigNodePropertyInteger VersionpurgeMinVersions, ConfigNodePropertyInteger VersionpurgeMaxAgeDays)
        {
            
            this.VersionpurgePaths = VersionpurgePaths;
            
            this.VersionpurgeRecursive = VersionpurgeRecursive;
            
            this.VersionpurgeMaxVersions = VersionpurgeMaxVersions;
            
            this.VersionpurgeMinVersions = VersionpurgeMinVersions;
            
            this.VersionpurgeMaxAgeDays = VersionpurgeMaxAgeDays;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplVersionPurgeTaskProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplVersionPurgeTaskPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplVersionPurgeTaskPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplVersionPurgeTaskPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplVersionPurgeTaskPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplVersionPurgeTaskPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplVersionPurgeTaskPropertiesBuilder With()
        {
            return Builder()
                .VersionpurgePaths(VersionpurgePaths)
                .VersionpurgeRecursive(VersionpurgeRecursive)
                .VersionpurgeMaxVersions(VersionpurgeMaxVersions)
                .VersionpurgeMinVersions(VersionpurgeMinVersions)
                .VersionpurgeMaxAgeDays(VersionpurgeMaxAgeDays);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplVersionPurgeTaskProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplVersionPurgeTaskProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplVersionPurgeTaskProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplVersionPurgeTaskProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplVersionPurgeTaskProperties left, ComDayCqWcmCoreImplVersionPurgeTaskProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplVersionPurgeTaskProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplVersionPurgeTaskProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplVersionPurgeTaskProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplVersionPurgeTaskProperties left, ComDayCqWcmCoreImplVersionPurgeTaskProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplVersionPurgeTaskProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplVersionPurgeTaskPropertiesBuilder
        {
            private ConfigNodePropertyArray _VersionpurgePaths;
            private ConfigNodePropertyBoolean _VersionpurgeRecursive;
            private ConfigNodePropertyInteger _VersionpurgeMaxVersions;
            private ConfigNodePropertyInteger _VersionpurgeMinVersions;
            private ConfigNodePropertyInteger _VersionpurgeMaxAgeDays;

            internal ComDayCqWcmCoreImplVersionPurgeTaskPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVersionPurgeTaskProperties.VersionpurgePaths property.
            /// </summary>
            /// <param name="value">VersionpurgePaths</param>
            public ComDayCqWcmCoreImplVersionPurgeTaskPropertiesBuilder VersionpurgePaths(ConfigNodePropertyArray value)
            {
                _VersionpurgePaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVersionPurgeTaskProperties.VersionpurgeRecursive property.
            /// </summary>
            /// <param name="value">VersionpurgeRecursive</param>
            public ComDayCqWcmCoreImplVersionPurgeTaskPropertiesBuilder VersionpurgeRecursive(ConfigNodePropertyBoolean value)
            {
                _VersionpurgeRecursive = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVersionPurgeTaskProperties.VersionpurgeMaxVersions property.
            /// </summary>
            /// <param name="value">VersionpurgeMaxVersions</param>
            public ComDayCqWcmCoreImplVersionPurgeTaskPropertiesBuilder VersionpurgeMaxVersions(ConfigNodePropertyInteger value)
            {
                _VersionpurgeMaxVersions = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVersionPurgeTaskProperties.VersionpurgeMinVersions property.
            /// </summary>
            /// <param name="value">VersionpurgeMinVersions</param>
            public ComDayCqWcmCoreImplVersionPurgeTaskPropertiesBuilder VersionpurgeMinVersions(ConfigNodePropertyInteger value)
            {
                _VersionpurgeMinVersions = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVersionPurgeTaskProperties.VersionpurgeMaxAgeDays property.
            /// </summary>
            /// <param name="value">VersionpurgeMaxAgeDays</param>
            public ComDayCqWcmCoreImplVersionPurgeTaskPropertiesBuilder VersionpurgeMaxAgeDays(ConfigNodePropertyInteger value)
            {
                _VersionpurgeMaxAgeDays = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplVersionPurgeTaskProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplVersionPurgeTaskProperties</returns>
            public ComDayCqWcmCoreImplVersionPurgeTaskProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplVersionPurgeTaskProperties(
                    VersionpurgePaths: _VersionpurgePaths,
                    VersionpurgeRecursive: _VersionpurgeRecursive,
                    VersionpurgeMaxVersions: _VersionpurgeMaxVersions,
                    VersionpurgeMinVersions: _VersionpurgeMinVersions,
                    VersionpurgeMaxAgeDays: _VersionpurgeMaxAgeDays
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}