using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties:  IEquatable<OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties>
    { 
        /// <summary>
        /// SolrHttpUrl
        /// </summary>
        public ConfigNodePropertyString SolrHttpUrl { get; private set; }

        /// <summary>
        /// SolrZkHost
        /// </summary>
        public ConfigNodePropertyString SolrZkHost { get; private set; }

        /// <summary>
        /// SolrCollection
        /// </summary>
        public ConfigNodePropertyString SolrCollection { get; private set; }

        /// <summary>
        /// SolrSocketTimeout
        /// </summary>
        public ConfigNodePropertyInteger SolrSocketTimeout { get; private set; }

        /// <summary>
        /// SolrConnectionTimeout
        /// </summary>
        public ConfigNodePropertyInteger SolrConnectionTimeout { get; private set; }

        /// <summary>
        /// SolrShardsNo
        /// </summary>
        public ConfigNodePropertyInteger SolrShardsNo { get; private set; }

        /// <summary>
        /// SolrReplicationFactor
        /// </summary>
        public ConfigNodePropertyInteger SolrReplicationFactor { get; private set; }

        /// <summary>
        /// SolrConfDir
        /// </summary>
        public ConfigNodePropertyString SolrConfDir { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties()
        {
        }

        private OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties(ConfigNodePropertyString SolrHttpUrl, ConfigNodePropertyString SolrZkHost, ConfigNodePropertyString SolrCollection, ConfigNodePropertyInteger SolrSocketTimeout, ConfigNodePropertyInteger SolrConnectionTimeout, ConfigNodePropertyInteger SolrShardsNo, ConfigNodePropertyInteger SolrReplicationFactor, ConfigNodePropertyString SolrConfDir)
        {
            
            this.SolrHttpUrl = SolrHttpUrl;
            
            this.SolrZkHost = SolrZkHost;
            
            this.SolrCollection = SolrCollection;
            
            this.SolrSocketTimeout = SolrSocketTimeout;
            
            this.SolrConnectionTimeout = SolrConnectionTimeout;
            
            this.SolrShardsNo = SolrShardsNo;
            
            this.SolrReplicationFactor = SolrReplicationFactor;
            
            this.SolrConfDir = SolrConfDir;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder With()
        {
            return Builder()
                .SolrHttpUrl(SolrHttpUrl)
                .SolrZkHost(SolrZkHost)
                .SolrCollection(SolrCollection)
                .SolrSocketTimeout(SolrSocketTimeout)
                .SolrConnectionTimeout(SolrConnectionTimeout)
                .SolrShardsNo(SolrShardsNo)
                .SolrReplicationFactor(SolrReplicationFactor)
                .SolrConfDir(SolrConfDir);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder
        {
            private ConfigNodePropertyString _SolrHttpUrl;
            private ConfigNodePropertyString _SolrZkHost;
            private ConfigNodePropertyString _SolrCollection;
            private ConfigNodePropertyInteger _SolrSocketTimeout;
            private ConfigNodePropertyInteger _SolrConnectionTimeout;
            private ConfigNodePropertyInteger _SolrShardsNo;
            private ConfigNodePropertyInteger _SolrReplicationFactor;
            private ConfigNodePropertyString _SolrConfDir;

            internal OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.SolrHttpUrl property.
            /// </summary>
            /// <param name="value">SolrHttpUrl</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder SolrHttpUrl(ConfigNodePropertyString value)
            {
                _SolrHttpUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.SolrZkHost property.
            /// </summary>
            /// <param name="value">SolrZkHost</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder SolrZkHost(ConfigNodePropertyString value)
            {
                _SolrZkHost = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.SolrCollection property.
            /// </summary>
            /// <param name="value">SolrCollection</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder SolrCollection(ConfigNodePropertyString value)
            {
                _SolrCollection = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.SolrSocketTimeout property.
            /// </summary>
            /// <param name="value">SolrSocketTimeout</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder SolrSocketTimeout(ConfigNodePropertyInteger value)
            {
                _SolrSocketTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.SolrConnectionTimeout property.
            /// </summary>
            /// <param name="value">SolrConnectionTimeout</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder SolrConnectionTimeout(ConfigNodePropertyInteger value)
            {
                _SolrConnectionTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.SolrShardsNo property.
            /// </summary>
            /// <param name="value">SolrShardsNo</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder SolrShardsNo(ConfigNodePropertyInteger value)
            {
                _SolrShardsNo = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.SolrReplicationFactor property.
            /// </summary>
            /// <param name="value">SolrReplicationFactor</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder SolrReplicationFactor(ConfigNodePropertyInteger value)
            {
                _SolrReplicationFactor = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.SolrConfDir property.
            /// </summary>
            /// <param name="value">SolrConfDir</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesBuilder SolrConfDir(ConfigNodePropertyString value)
            {
                _SolrConfDir = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties</returns>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties(
                    SolrHttpUrl: _SolrHttpUrl,
                    SolrZkHost: _SolrZkHost,
                    SolrCollection: _SolrCollection,
                    SolrSocketTimeout: _SolrSocketTimeout,
                    SolrConnectionTimeout: _SolrConnectionTimeout,
                    SolrShardsNo: _SolrShardsNo,
                    SolrReplicationFactor: _SolrReplicationFactor,
                    SolrConfDir: _SolrConfDir
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}