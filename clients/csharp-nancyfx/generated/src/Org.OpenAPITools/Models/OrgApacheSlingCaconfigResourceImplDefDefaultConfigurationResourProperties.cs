using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties
    /// </summary>
    public sealed class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties:  IEquatable<OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties>
    { 
        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }

        /// <summary>
        /// ConfigPath
        /// </summary>
        public ConfigNodePropertyString ConfigPath { get; private set; }

        /// <summary>
        /// FallbackPaths
        /// </summary>
        public ConfigNodePropertyArray FallbackPaths { get; private set; }

        /// <summary>
        /// ConfigCollectionInheritancePropertyNames
        /// </summary>
        public ConfigNodePropertyArray ConfigCollectionInheritancePropertyNames { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties()
        {
        }

        private OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties(ConfigNodePropertyBoolean Enabled, ConfigNodePropertyString ConfigPath, ConfigNodePropertyArray FallbackPaths, ConfigNodePropertyArray ConfigCollectionInheritancePropertyNames)
        {
            
            this.Enabled = Enabled;
            
            this.ConfigPath = ConfigPath;
            
            this.FallbackPaths = FallbackPaths;
            
            this.ConfigCollectionInheritancePropertyNames = ConfigCollectionInheritancePropertyNames;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesBuilder</returns>
        public static OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesBuilder Builder()
        {
            return new OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesBuilder</returns>
        public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesBuilder With()
        {
            return Builder()
                .Enabled(Enabled)
                .ConfigPath(ConfigPath)
                .FallbackPaths(FallbackPaths)
                .ConfigCollectionInheritancePropertyNames(ConfigCollectionInheritancePropertyNames);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties left, OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties left, OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.
        /// </summary>
        public sealed class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Enabled;
            private ConfigNodePropertyString _ConfigPath;
            private ConfigNodePropertyArray _FallbackPaths;
            private ConfigNodePropertyArray _ConfigCollectionInheritancePropertyNames;

            internal OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.ConfigPath property.
            /// </summary>
            /// <param name="value">ConfigPath</param>
            public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesBuilder ConfigPath(ConfigNodePropertyString value)
            {
                _ConfigPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.FallbackPaths property.
            /// </summary>
            /// <param name="value">FallbackPaths</param>
            public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesBuilder FallbackPaths(ConfigNodePropertyArray value)
            {
                _FallbackPaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.ConfigCollectionInheritancePropertyNames property.
            /// </summary>
            /// <param name="value">ConfigCollectionInheritancePropertyNames</param>
            public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesBuilder ConfigCollectionInheritancePropertyNames(ConfigNodePropertyArray value)
            {
                _ConfigCollectionInheritancePropertyNames = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.
            /// </summary>
            /// <returns>OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties</returns>
            public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties Build()
            {
                Validate();
                return new OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties(
                    Enabled: _Enabled,
                    ConfigPath: _ConfigPath,
                    FallbackPaths: _FallbackPaths,
                    ConfigCollectionInheritancePropertyNames: _ConfigCollectionInheritancePropertyNames
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}