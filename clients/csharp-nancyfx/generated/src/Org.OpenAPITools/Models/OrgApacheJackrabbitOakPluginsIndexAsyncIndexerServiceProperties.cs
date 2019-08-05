using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties:  IEquatable<OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties>
    { 
        /// <summary>
        /// AsyncConfigs
        /// </summary>
        public ConfigNodePropertyArray AsyncConfigs { get; private set; }

        /// <summary>
        /// LeaseTimeOutMinutes
        /// </summary>
        public ConfigNodePropertyInteger LeaseTimeOutMinutes { get; private set; }

        /// <summary>
        /// FailingIndexTimeoutSeconds
        /// </summary>
        public ConfigNodePropertyInteger FailingIndexTimeoutSeconds { get; private set; }

        /// <summary>
        /// ErrorWarnIntervalSeconds
        /// </summary>
        public ConfigNodePropertyInteger ErrorWarnIntervalSeconds { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties()
        {
        }

        private OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties(ConfigNodePropertyArray AsyncConfigs, ConfigNodePropertyInteger LeaseTimeOutMinutes, ConfigNodePropertyInteger FailingIndexTimeoutSeconds, ConfigNodePropertyInteger ErrorWarnIntervalSeconds)
        {
            
            this.AsyncConfigs = AsyncConfigs;
            
            this.LeaseTimeOutMinutes = LeaseTimeOutMinutes;
            
            this.FailingIndexTimeoutSeconds = FailingIndexTimeoutSeconds;
            
            this.ErrorWarnIntervalSeconds = ErrorWarnIntervalSeconds;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesBuilder</returns>
        public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesBuilder With()
        {
            return Builder()
                .AsyncConfigs(AsyncConfigs)
                .LeaseTimeOutMinutes(LeaseTimeOutMinutes)
                .FailingIndexTimeoutSeconds(FailingIndexTimeoutSeconds)
                .ErrorWarnIntervalSeconds(ErrorWarnIntervalSeconds);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties left, OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties left, OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesBuilder
        {
            private ConfigNodePropertyArray _AsyncConfigs;
            private ConfigNodePropertyInteger _LeaseTimeOutMinutes;
            private ConfigNodePropertyInteger _FailingIndexTimeoutSeconds;
            private ConfigNodePropertyInteger _ErrorWarnIntervalSeconds;

            internal OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.AsyncConfigs property.
            /// </summary>
            /// <param name="value">AsyncConfigs</param>
            public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesBuilder AsyncConfigs(ConfigNodePropertyArray value)
            {
                _AsyncConfigs = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.LeaseTimeOutMinutes property.
            /// </summary>
            /// <param name="value">LeaseTimeOutMinutes</param>
            public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesBuilder LeaseTimeOutMinutes(ConfigNodePropertyInteger value)
            {
                _LeaseTimeOutMinutes = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.FailingIndexTimeoutSeconds property.
            /// </summary>
            /// <param name="value">FailingIndexTimeoutSeconds</param>
            public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesBuilder FailingIndexTimeoutSeconds(ConfigNodePropertyInteger value)
            {
                _FailingIndexTimeoutSeconds = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.ErrorWarnIntervalSeconds property.
            /// </summary>
            /// <param name="value">ErrorWarnIntervalSeconds</param>
            public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesBuilder ErrorWarnIntervalSeconds(ConfigNodePropertyInteger value)
            {
                _ErrorWarnIntervalSeconds = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties</returns>
            public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties(
                    AsyncConfigs: _AsyncConfigs,
                    LeaseTimeOutMinutes: _LeaseTimeOutMinutes,
                    FailingIndexTimeoutSeconds: _FailingIndexTimeoutSeconds,
                    ErrorWarnIntervalSeconds: _ErrorWarnIntervalSeconds
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}