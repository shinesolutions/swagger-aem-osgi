using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties
    /// </summary>
    public sealed class ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties:  IEquatable<ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties>
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
        /// Use ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties()
        {
        }

        private ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties(ConfigNodePropertyString SolrZkTimeout, ConfigNodePropertyString SolrCommit, ConfigNodePropertyBoolean CacheOn, ConfigNodePropertyInteger ConcurrencyLevel, ConfigNodePropertyInteger CacheStartSize, ConfigNodePropertyInteger CacheTtl, ConfigNodePropertyInteger CacheSize)
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
        /// Returns builder of ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesBuilder</returns>
        public static ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesBuilder</returns>
        public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties left, ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties left, ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesBuilder
        {
            private ConfigNodePropertyString _SolrZkTimeout;
            private ConfigNodePropertyString _SolrCommit;
            private ConfigNodePropertyBoolean _CacheOn;
            private ConfigNodePropertyInteger _ConcurrencyLevel;
            private ConfigNodePropertyInteger _CacheStartSize;
            private ConfigNodePropertyInteger _CacheTtl;
            private ConfigNodePropertyInteger _CacheSize;

            internal ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.SolrZkTimeout property.
            /// </summary>
            /// <param name="value">SolrZkTimeout</param>
            public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesBuilder SolrZkTimeout(ConfigNodePropertyString value)
            {
                _SolrZkTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.SolrCommit property.
            /// </summary>
            /// <param name="value">SolrCommit</param>
            public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesBuilder SolrCommit(ConfigNodePropertyString value)
            {
                _SolrCommit = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.CacheOn property.
            /// </summary>
            /// <param name="value">CacheOn</param>
            public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesBuilder CacheOn(ConfigNodePropertyBoolean value)
            {
                _CacheOn = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.ConcurrencyLevel property.
            /// </summary>
            /// <param name="value">ConcurrencyLevel</param>
            public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesBuilder ConcurrencyLevel(ConfigNodePropertyInteger value)
            {
                _ConcurrencyLevel = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.CacheStartSize property.
            /// </summary>
            /// <param name="value">CacheStartSize</param>
            public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesBuilder CacheStartSize(ConfigNodePropertyInteger value)
            {
                _CacheStartSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.CacheTtl property.
            /// </summary>
            /// <param name="value">CacheTtl</param>
            public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesBuilder CacheTtl(ConfigNodePropertyInteger value)
            {
                _CacheTtl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.CacheSize property.
            /// </summary>
            /// <param name="value">CacheSize</param>
            public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesBuilder CacheSize(ConfigNodePropertyInteger value)
            {
                _CacheSize = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties</returns>
            public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties(
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