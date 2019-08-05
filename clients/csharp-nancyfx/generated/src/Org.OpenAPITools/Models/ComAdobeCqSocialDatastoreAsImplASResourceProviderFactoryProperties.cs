using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties
    /// </summary>
    public sealed class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties:  IEquatable<ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties>
    { 
        /// <summary>
        /// VersionId
        /// </summary>
        public ConfigNodePropertyString VersionId { get; private set; }

        /// <summary>
        /// CacheOn
        /// </summary>
        public ConfigNodePropertyBoolean CacheOn { get; private set; }

        /// <summary>
        /// ConcurrencyLevel
        /// </summary>
        public ConfigNodePropertyInteger ConcurrencyLevel { get; private set; }

        /// <summary>
        /// CacheStartSize
        /// </summary>
        public ConfigNodePropertyInteger CacheStartSize { get; private set; }

        /// <summary>
        /// CacheTtl
        /// </summary>
        public ConfigNodePropertyInteger CacheTtl { get; private set; }

        /// <summary>
        /// CacheSize
        /// </summary>
        public ConfigNodePropertyInteger CacheSize { get; private set; }

        /// <summary>
        /// TimeLimit
        /// </summary>
        public ConfigNodePropertyInteger TimeLimit { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties()
        {
        }

        private ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties(ConfigNodePropertyString VersionId, ConfigNodePropertyBoolean CacheOn, ConfigNodePropertyInteger ConcurrencyLevel, ConfigNodePropertyInteger CacheStartSize, ConfigNodePropertyInteger CacheTtl, ConfigNodePropertyInteger CacheSize, ConfigNodePropertyInteger TimeLimit)
        {
            
            this.VersionId = VersionId;
            
            this.CacheOn = CacheOn;
            
            this.ConcurrencyLevel = ConcurrencyLevel;
            
            this.CacheStartSize = CacheStartSize;
            
            this.CacheTtl = CacheTtl;
            
            this.CacheSize = CacheSize;
            
            this.TimeLimit = TimeLimit;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesBuilder</returns>
        public static ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesBuilder</returns>
        public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesBuilder With()
        {
            return Builder()
                .VersionId(VersionId)
                .CacheOn(CacheOn)
                .ConcurrencyLevel(ConcurrencyLevel)
                .CacheStartSize(CacheStartSize)
                .CacheTtl(CacheTtl)
                .CacheSize(CacheSize)
                .TimeLimit(TimeLimit);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties left, ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties left, ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesBuilder
        {
            private ConfigNodePropertyString _VersionId;
            private ConfigNodePropertyBoolean _CacheOn;
            private ConfigNodePropertyInteger _ConcurrencyLevel;
            private ConfigNodePropertyInteger _CacheStartSize;
            private ConfigNodePropertyInteger _CacheTtl;
            private ConfigNodePropertyInteger _CacheSize;
            private ConfigNodePropertyInteger _TimeLimit;

            internal ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.VersionId property.
            /// </summary>
            /// <param name="value">VersionId</param>
            public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesBuilder VersionId(ConfigNodePropertyString value)
            {
                _VersionId = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.CacheOn property.
            /// </summary>
            /// <param name="value">CacheOn</param>
            public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesBuilder CacheOn(ConfigNodePropertyBoolean value)
            {
                _CacheOn = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.ConcurrencyLevel property.
            /// </summary>
            /// <param name="value">ConcurrencyLevel</param>
            public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesBuilder ConcurrencyLevel(ConfigNodePropertyInteger value)
            {
                _ConcurrencyLevel = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.CacheStartSize property.
            /// </summary>
            /// <param name="value">CacheStartSize</param>
            public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesBuilder CacheStartSize(ConfigNodePropertyInteger value)
            {
                _CacheStartSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.CacheTtl property.
            /// </summary>
            /// <param name="value">CacheTtl</param>
            public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesBuilder CacheTtl(ConfigNodePropertyInteger value)
            {
                _CacheTtl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.CacheSize property.
            /// </summary>
            /// <param name="value">CacheSize</param>
            public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesBuilder CacheSize(ConfigNodePropertyInteger value)
            {
                _CacheSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.TimeLimit property.
            /// </summary>
            /// <param name="value">TimeLimit</param>
            public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesBuilder TimeLimit(ConfigNodePropertyInteger value)
            {
                _TimeLimit = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties</returns>
            public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties(
                    VersionId: _VersionId,
                    CacheOn: _CacheOn,
                    ConcurrencyLevel: _ConcurrencyLevel,
                    CacheStartSize: _CacheStartSize,
                    CacheTtl: _CacheTtl,
                    CacheSize: _CacheSize,
                    TimeLimit: _TimeLimit
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}