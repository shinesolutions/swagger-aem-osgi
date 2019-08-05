using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties
    /// </summary>
    public sealed class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties:  IEquatable<ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties>
    { 
        /// <summary>
        /// SolrZkTimeout
        /// </summary>
        public ConfigNodePropertyString SolrZkTimeout { get; private set; }

        /// <summary>
        /// SolrCommit
        /// </summary>
        public ConfigNodePropertyString SolrCommit { get; private set; }

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
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties()
        {
        }

        private ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties(ConfigNodePropertyString SolrZkTimeout, ConfigNodePropertyString SolrCommit, ConfigNodePropertyBoolean CacheOn, ConfigNodePropertyInteger ConcurrencyLevel, ConfigNodePropertyInteger CacheStartSize, ConfigNodePropertyInteger CacheTtl, ConfigNodePropertyInteger CacheSize)
        {
            
            this.SolrZkTimeout = SolrZkTimeout;
            
            this.SolrCommit = SolrCommit;
            
            this.CacheOn = CacheOn;
            
            this.ConcurrencyLevel = ConcurrencyLevel;
            
            this.CacheStartSize = CacheStartSize;
            
            this.CacheTtl = CacheTtl;
            
            this.CacheSize = CacheSize;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesBuilder</returns>
        public static ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesBuilder</returns>
        public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesBuilder With()
        {
            return Builder()
                .SolrZkTimeout(SolrZkTimeout)
                .SolrCommit(SolrCommit)
                .CacheOn(CacheOn)
                .ConcurrencyLevel(ConcurrencyLevel)
                .CacheStartSize(CacheStartSize)
                .CacheTtl(CacheTtl)
                .CacheSize(CacheSize);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties left, ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties left, ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesBuilder
        {
            private ConfigNodePropertyString _SolrZkTimeout;
            private ConfigNodePropertyString _SolrCommit;
            private ConfigNodePropertyBoolean _CacheOn;
            private ConfigNodePropertyInteger _ConcurrencyLevel;
            private ConfigNodePropertyInteger _CacheStartSize;
            private ConfigNodePropertyInteger _CacheTtl;
            private ConfigNodePropertyInteger _CacheSize;

            internal ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.SolrZkTimeout property.
            /// </summary>
            /// <param name="value">SolrZkTimeout</param>
            public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesBuilder SolrZkTimeout(ConfigNodePropertyString value)
            {
                _SolrZkTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.SolrCommit property.
            /// </summary>
            /// <param name="value">SolrCommit</param>
            public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesBuilder SolrCommit(ConfigNodePropertyString value)
            {
                _SolrCommit = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.CacheOn property.
            /// </summary>
            /// <param name="value">CacheOn</param>
            public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesBuilder CacheOn(ConfigNodePropertyBoolean value)
            {
                _CacheOn = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.ConcurrencyLevel property.
            /// </summary>
            /// <param name="value">ConcurrencyLevel</param>
            public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesBuilder ConcurrencyLevel(ConfigNodePropertyInteger value)
            {
                _ConcurrencyLevel = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.CacheStartSize property.
            /// </summary>
            /// <param name="value">CacheStartSize</param>
            public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesBuilder CacheStartSize(ConfigNodePropertyInteger value)
            {
                _CacheStartSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.CacheTtl property.
            /// </summary>
            /// <param name="value">CacheTtl</param>
            public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesBuilder CacheTtl(ConfigNodePropertyInteger value)
            {
                _CacheTtl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.CacheSize property.
            /// </summary>
            /// <param name="value">CacheSize</param>
            public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesBuilder CacheSize(ConfigNodePropertyInteger value)
            {
                _CacheSize = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties</returns>
            public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties(
                    SolrZkTimeout: _SolrZkTimeout,
                    SolrCommit: _SolrCommit,
                    CacheOn: _CacheOn,
                    ConcurrencyLevel: _ConcurrencyLevel,
                    CacheStartSize: _CacheStartSize,
                    CacheTtl: _CacheTtl,
                    CacheSize: _CacheSize
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}