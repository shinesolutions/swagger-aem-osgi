using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDiscoveryOakConfigProperties
    /// </summary>
    public sealed class OrgApacheSlingDiscoveryOakConfigProperties:  IEquatable<OrgApacheSlingDiscoveryOakConfigProperties>
    { 
        /// <summary>
        /// ConnectorPingTimeout
        /// </summary>
        public ConfigNodePropertyInteger ConnectorPingTimeout { get; private set; }

        /// <summary>
        /// ConnectorPingInterval
        /// </summary>
        public ConfigNodePropertyInteger ConnectorPingInterval { get; private set; }

        /// <summary>
        /// DiscoveryLiteCheckInterval
        /// </summary>
        public ConfigNodePropertyInteger DiscoveryLiteCheckInterval { get; private set; }

        /// <summary>
        /// ClusterSyncServiceTimeout
        /// </summary>
        public ConfigNodePropertyInteger ClusterSyncServiceTimeout { get; private set; }

        /// <summary>
        /// ClusterSyncServiceInterval
        /// </summary>
        public ConfigNodePropertyInteger ClusterSyncServiceInterval { get; private set; }

        /// <summary>
        /// EnableSyncToken
        /// </summary>
        public ConfigNodePropertyBoolean EnableSyncToken { get; private set; }

        /// <summary>
        /// MinEventDelay
        /// </summary>
        public ConfigNodePropertyInteger MinEventDelay { get; private set; }

        /// <summary>
        /// SocketConnectTimeout
        /// </summary>
        public ConfigNodePropertyInteger SocketConnectTimeout { get; private set; }

        /// <summary>
        /// SoTimeout
        /// </summary>
        public ConfigNodePropertyInteger SoTimeout { get; private set; }

        /// <summary>
        /// TopologyConnectorUrls
        /// </summary>
        public ConfigNodePropertyArray TopologyConnectorUrls { get; private set; }

        /// <summary>
        /// TopologyConnectorWhitelist
        /// </summary>
        public ConfigNodePropertyArray TopologyConnectorWhitelist { get; private set; }

        /// <summary>
        /// AutoStopLocalLoopEnabled
        /// </summary>
        public ConfigNodePropertyBoolean AutoStopLocalLoopEnabled { get; private set; }

        /// <summary>
        /// GzipConnectorRequestsEnabled
        /// </summary>
        public ConfigNodePropertyBoolean GzipConnectorRequestsEnabled { get; private set; }

        /// <summary>
        /// HmacEnabled
        /// </summary>
        public ConfigNodePropertyBoolean HmacEnabled { get; private set; }

        /// <summary>
        /// EnableEncryption
        /// </summary>
        public ConfigNodePropertyBoolean EnableEncryption { get; private set; }

        /// <summary>
        /// SharedKey
        /// </summary>
        public ConfigNodePropertyString SharedKey { get; private set; }

        /// <summary>
        /// HmacSharedKeyTTL
        /// </summary>
        public ConfigNodePropertyInteger HmacSharedKeyTTL { get; private set; }

        /// <summary>
        /// BackoffStandbyFactor
        /// </summary>
        public ConfigNodePropertyString BackoffStandbyFactor { get; private set; }

        /// <summary>
        /// BackoffStableFactor
        /// </summary>
        public ConfigNodePropertyString BackoffStableFactor { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDiscoveryOakConfigProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDiscoveryOakConfigProperties()
        {
        }

        private OrgApacheSlingDiscoveryOakConfigProperties(ConfigNodePropertyInteger ConnectorPingTimeout, ConfigNodePropertyInteger ConnectorPingInterval, ConfigNodePropertyInteger DiscoveryLiteCheckInterval, ConfigNodePropertyInteger ClusterSyncServiceTimeout, ConfigNodePropertyInteger ClusterSyncServiceInterval, ConfigNodePropertyBoolean EnableSyncToken, ConfigNodePropertyInteger MinEventDelay, ConfigNodePropertyInteger SocketConnectTimeout, ConfigNodePropertyInteger SoTimeout, ConfigNodePropertyArray TopologyConnectorUrls, ConfigNodePropertyArray TopologyConnectorWhitelist, ConfigNodePropertyBoolean AutoStopLocalLoopEnabled, ConfigNodePropertyBoolean GzipConnectorRequestsEnabled, ConfigNodePropertyBoolean HmacEnabled, ConfigNodePropertyBoolean EnableEncryption, ConfigNodePropertyString SharedKey, ConfigNodePropertyInteger HmacSharedKeyTTL, ConfigNodePropertyString BackoffStandbyFactor, ConfigNodePropertyString BackoffStableFactor)
        {
            
            this.ConnectorPingTimeout = ConnectorPingTimeout;
            
            this.ConnectorPingInterval = ConnectorPingInterval;
            
            this.DiscoveryLiteCheckInterval = DiscoveryLiteCheckInterval;
            
            this.ClusterSyncServiceTimeout = ClusterSyncServiceTimeout;
            
            this.ClusterSyncServiceInterval = ClusterSyncServiceInterval;
            
            this.EnableSyncToken = EnableSyncToken;
            
            this.MinEventDelay = MinEventDelay;
            
            this.SocketConnectTimeout = SocketConnectTimeout;
            
            this.SoTimeout = SoTimeout;
            
            this.TopologyConnectorUrls = TopologyConnectorUrls;
            
            this.TopologyConnectorWhitelist = TopologyConnectorWhitelist;
            
            this.AutoStopLocalLoopEnabled = AutoStopLocalLoopEnabled;
            
            this.GzipConnectorRequestsEnabled = GzipConnectorRequestsEnabled;
            
            this.HmacEnabled = HmacEnabled;
            
            this.EnableEncryption = EnableEncryption;
            
            this.SharedKey = SharedKey;
            
            this.HmacSharedKeyTTL = HmacSharedKeyTTL;
            
            this.BackoffStandbyFactor = BackoffStandbyFactor;
            
            this.BackoffStableFactor = BackoffStableFactor;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDiscoveryOakConfigProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDiscoveryOakConfigPropertiesBuilder</returns>
        public static OrgApacheSlingDiscoveryOakConfigPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDiscoveryOakConfigPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDiscoveryOakConfigPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDiscoveryOakConfigPropertiesBuilder</returns>
        public OrgApacheSlingDiscoveryOakConfigPropertiesBuilder With()
        {
            return Builder()
                .ConnectorPingTimeout(ConnectorPingTimeout)
                .ConnectorPingInterval(ConnectorPingInterval)
                .DiscoveryLiteCheckInterval(DiscoveryLiteCheckInterval)
                .ClusterSyncServiceTimeout(ClusterSyncServiceTimeout)
                .ClusterSyncServiceInterval(ClusterSyncServiceInterval)
                .EnableSyncToken(EnableSyncToken)
                .MinEventDelay(MinEventDelay)
                .SocketConnectTimeout(SocketConnectTimeout)
                .SoTimeout(SoTimeout)
                .TopologyConnectorUrls(TopologyConnectorUrls)
                .TopologyConnectorWhitelist(TopologyConnectorWhitelist)
                .AutoStopLocalLoopEnabled(AutoStopLocalLoopEnabled)
                .GzipConnectorRequestsEnabled(GzipConnectorRequestsEnabled)
                .HmacEnabled(HmacEnabled)
                .EnableEncryption(EnableEncryption)
                .SharedKey(SharedKey)
                .HmacSharedKeyTTL(HmacSharedKeyTTL)
                .BackoffStandbyFactor(BackoffStandbyFactor)
                .BackoffStableFactor(BackoffStableFactor);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDiscoveryOakConfigProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDiscoveryOakConfigProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDiscoveryOakConfigProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDiscoveryOakConfigProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDiscoveryOakConfigProperties left, OrgApacheSlingDiscoveryOakConfigProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDiscoveryOakConfigProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDiscoveryOakConfigProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDiscoveryOakConfigProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDiscoveryOakConfigProperties left, OrgApacheSlingDiscoveryOakConfigProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDiscoveryOakConfigProperties.
        /// </summary>
        public sealed class OrgApacheSlingDiscoveryOakConfigPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ConnectorPingTimeout;
            private ConfigNodePropertyInteger _ConnectorPingInterval;
            private ConfigNodePropertyInteger _DiscoveryLiteCheckInterval;
            private ConfigNodePropertyInteger _ClusterSyncServiceTimeout;
            private ConfigNodePropertyInteger _ClusterSyncServiceInterval;
            private ConfigNodePropertyBoolean _EnableSyncToken;
            private ConfigNodePropertyInteger _MinEventDelay;
            private ConfigNodePropertyInteger _SocketConnectTimeout;
            private ConfigNodePropertyInteger _SoTimeout;
            private ConfigNodePropertyArray _TopologyConnectorUrls;
            private ConfigNodePropertyArray _TopologyConnectorWhitelist;
            private ConfigNodePropertyBoolean _AutoStopLocalLoopEnabled;
            private ConfigNodePropertyBoolean _GzipConnectorRequestsEnabled;
            private ConfigNodePropertyBoolean _HmacEnabled;
            private ConfigNodePropertyBoolean _EnableEncryption;
            private ConfigNodePropertyString _SharedKey;
            private ConfigNodePropertyInteger _HmacSharedKeyTTL;
            private ConfigNodePropertyString _BackoffStandbyFactor;
            private ConfigNodePropertyString _BackoffStableFactor;

            internal OrgApacheSlingDiscoveryOakConfigPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigProperties.ConnectorPingTimeout property.
            /// </summary>
            /// <param name="value">ConnectorPingTimeout</param>
            public OrgApacheSlingDiscoveryOakConfigPropertiesBuilder ConnectorPingTimeout(ConfigNodePropertyInteger value)
            {
                _ConnectorPingTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigProperties.ConnectorPingInterval property.
            /// </summary>
            /// <param name="value">ConnectorPingInterval</param>
            public OrgApacheSlingDiscoveryOakConfigPropertiesBuilder ConnectorPingInterval(ConfigNodePropertyInteger value)
            {
                _ConnectorPingInterval = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigProperties.DiscoveryLiteCheckInterval property.
            /// </summary>
            /// <param name="value">DiscoveryLiteCheckInterval</param>
            public OrgApacheSlingDiscoveryOakConfigPropertiesBuilder DiscoveryLiteCheckInterval(ConfigNodePropertyInteger value)
            {
                _DiscoveryLiteCheckInterval = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigProperties.ClusterSyncServiceTimeout property.
            /// </summary>
            /// <param name="value">ClusterSyncServiceTimeout</param>
            public OrgApacheSlingDiscoveryOakConfigPropertiesBuilder ClusterSyncServiceTimeout(ConfigNodePropertyInteger value)
            {
                _ClusterSyncServiceTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigProperties.ClusterSyncServiceInterval property.
            /// </summary>
            /// <param name="value">ClusterSyncServiceInterval</param>
            public OrgApacheSlingDiscoveryOakConfigPropertiesBuilder ClusterSyncServiceInterval(ConfigNodePropertyInteger value)
            {
                _ClusterSyncServiceInterval = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigProperties.EnableSyncToken property.
            /// </summary>
            /// <param name="value">EnableSyncToken</param>
            public OrgApacheSlingDiscoveryOakConfigPropertiesBuilder EnableSyncToken(ConfigNodePropertyBoolean value)
            {
                _EnableSyncToken = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigProperties.MinEventDelay property.
            /// </summary>
            /// <param name="value">MinEventDelay</param>
            public OrgApacheSlingDiscoveryOakConfigPropertiesBuilder MinEventDelay(ConfigNodePropertyInteger value)
            {
                _MinEventDelay = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigProperties.SocketConnectTimeout property.
            /// </summary>
            /// <param name="value">SocketConnectTimeout</param>
            public OrgApacheSlingDiscoveryOakConfigPropertiesBuilder SocketConnectTimeout(ConfigNodePropertyInteger value)
            {
                _SocketConnectTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigProperties.SoTimeout property.
            /// </summary>
            /// <param name="value">SoTimeout</param>
            public OrgApacheSlingDiscoveryOakConfigPropertiesBuilder SoTimeout(ConfigNodePropertyInteger value)
            {
                _SoTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigProperties.TopologyConnectorUrls property.
            /// </summary>
            /// <param name="value">TopologyConnectorUrls</param>
            public OrgApacheSlingDiscoveryOakConfigPropertiesBuilder TopologyConnectorUrls(ConfigNodePropertyArray value)
            {
                _TopologyConnectorUrls = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigProperties.TopologyConnectorWhitelist property.
            /// </summary>
            /// <param name="value">TopologyConnectorWhitelist</param>
            public OrgApacheSlingDiscoveryOakConfigPropertiesBuilder TopologyConnectorWhitelist(ConfigNodePropertyArray value)
            {
                _TopologyConnectorWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigProperties.AutoStopLocalLoopEnabled property.
            /// </summary>
            /// <param name="value">AutoStopLocalLoopEnabled</param>
            public OrgApacheSlingDiscoveryOakConfigPropertiesBuilder AutoStopLocalLoopEnabled(ConfigNodePropertyBoolean value)
            {
                _AutoStopLocalLoopEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigProperties.GzipConnectorRequestsEnabled property.
            /// </summary>
            /// <param name="value">GzipConnectorRequestsEnabled</param>
            public OrgApacheSlingDiscoveryOakConfigPropertiesBuilder GzipConnectorRequestsEnabled(ConfigNodePropertyBoolean value)
            {
                _GzipConnectorRequestsEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigProperties.HmacEnabled property.
            /// </summary>
            /// <param name="value">HmacEnabled</param>
            public OrgApacheSlingDiscoveryOakConfigPropertiesBuilder HmacEnabled(ConfigNodePropertyBoolean value)
            {
                _HmacEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigProperties.EnableEncryption property.
            /// </summary>
            /// <param name="value">EnableEncryption</param>
            public OrgApacheSlingDiscoveryOakConfigPropertiesBuilder EnableEncryption(ConfigNodePropertyBoolean value)
            {
                _EnableEncryption = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigProperties.SharedKey property.
            /// </summary>
            /// <param name="value">SharedKey</param>
            public OrgApacheSlingDiscoveryOakConfigPropertiesBuilder SharedKey(ConfigNodePropertyString value)
            {
                _SharedKey = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigProperties.HmacSharedKeyTTL property.
            /// </summary>
            /// <param name="value">HmacSharedKeyTTL</param>
            public OrgApacheSlingDiscoveryOakConfigPropertiesBuilder HmacSharedKeyTTL(ConfigNodePropertyInteger value)
            {
                _HmacSharedKeyTTL = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigProperties.BackoffStandbyFactor property.
            /// </summary>
            /// <param name="value">BackoffStandbyFactor</param>
            public OrgApacheSlingDiscoveryOakConfigPropertiesBuilder BackoffStandbyFactor(ConfigNodePropertyString value)
            {
                _BackoffStandbyFactor = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigProperties.BackoffStableFactor property.
            /// </summary>
            /// <param name="value">BackoffStableFactor</param>
            public OrgApacheSlingDiscoveryOakConfigPropertiesBuilder BackoffStableFactor(ConfigNodePropertyString value)
            {
                _BackoffStableFactor = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDiscoveryOakConfigProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDiscoveryOakConfigProperties</returns>
            public OrgApacheSlingDiscoveryOakConfigProperties Build()
            {
                Validate();
                return new OrgApacheSlingDiscoveryOakConfigProperties(
                    ConnectorPingTimeout: _ConnectorPingTimeout,
                    ConnectorPingInterval: _ConnectorPingInterval,
                    DiscoveryLiteCheckInterval: _DiscoveryLiteCheckInterval,
                    ClusterSyncServiceTimeout: _ClusterSyncServiceTimeout,
                    ClusterSyncServiceInterval: _ClusterSyncServiceInterval,
                    EnableSyncToken: _EnableSyncToken,
                    MinEventDelay: _MinEventDelay,
                    SocketConnectTimeout: _SocketConnectTimeout,
                    SoTimeout: _SoTimeout,
                    TopologyConnectorUrls: _TopologyConnectorUrls,
                    TopologyConnectorWhitelist: _TopologyConnectorWhitelist,
                    AutoStopLocalLoopEnabled: _AutoStopLocalLoopEnabled,
                    GzipConnectorRequestsEnabled: _GzipConnectorRequestsEnabled,
                    HmacEnabled: _HmacEnabled,
                    EnableEncryption: _EnableEncryption,
                    SharedKey: _SharedKey,
                    HmacSharedKeyTTL: _HmacSharedKeyTTL,
                    BackoffStandbyFactor: _BackoffStandbyFactor,
                    BackoffStableFactor: _BackoffStableFactor
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}