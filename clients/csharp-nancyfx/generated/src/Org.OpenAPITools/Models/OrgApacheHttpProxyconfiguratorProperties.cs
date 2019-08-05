using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheHttpProxyconfiguratorProperties
    /// </summary>
    public sealed class OrgApacheHttpProxyconfiguratorProperties:  IEquatable<OrgApacheHttpProxyconfiguratorProperties>
    { 
        /// <summary>
        /// ProxyEnabled
        /// </summary>
        public ConfigNodePropertyBoolean ProxyEnabled { get; private set; }

        /// <summary>
        /// ProxyHost
        /// </summary>
        public ConfigNodePropertyString ProxyHost { get; private set; }

        /// <summary>
        /// ProxyPort
        /// </summary>
        public ConfigNodePropertyInteger ProxyPort { get; private set; }

        /// <summary>
        /// ProxyUser
        /// </summary>
        public ConfigNodePropertyString ProxyUser { get; private set; }

        /// <summary>
        /// ProxyPassword
        /// </summary>
        public ConfigNodePropertyString ProxyPassword { get; private set; }

        /// <summary>
        /// ProxyExceptions
        /// </summary>
        public ConfigNodePropertyArray ProxyExceptions { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheHttpProxyconfiguratorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheHttpProxyconfiguratorProperties()
        {
        }

        private OrgApacheHttpProxyconfiguratorProperties(ConfigNodePropertyBoolean ProxyEnabled, ConfigNodePropertyString ProxyHost, ConfigNodePropertyInteger ProxyPort, ConfigNodePropertyString ProxyUser, ConfigNodePropertyString ProxyPassword, ConfigNodePropertyArray ProxyExceptions)
        {
            
            this.ProxyEnabled = ProxyEnabled;
            
            this.ProxyHost = ProxyHost;
            
            this.ProxyPort = ProxyPort;
            
            this.ProxyUser = ProxyUser;
            
            this.ProxyPassword = ProxyPassword;
            
            this.ProxyExceptions = ProxyExceptions;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheHttpProxyconfiguratorProperties.
        /// </summary>
        /// <returns>OrgApacheHttpProxyconfiguratorPropertiesBuilder</returns>
        public static OrgApacheHttpProxyconfiguratorPropertiesBuilder Builder()
        {
            return new OrgApacheHttpProxyconfiguratorPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheHttpProxyconfiguratorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheHttpProxyconfiguratorPropertiesBuilder</returns>
        public OrgApacheHttpProxyconfiguratorPropertiesBuilder With()
        {
            return Builder()
                .ProxyEnabled(ProxyEnabled)
                .ProxyHost(ProxyHost)
                .ProxyPort(ProxyPort)
                .ProxyUser(ProxyUser)
                .ProxyPassword(ProxyPassword)
                .ProxyExceptions(ProxyExceptions);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheHttpProxyconfiguratorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheHttpProxyconfiguratorProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheHttpProxyconfiguratorProperties</param>
        /// <param name="right">Compared (OrgApacheHttpProxyconfiguratorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheHttpProxyconfiguratorProperties left, OrgApacheHttpProxyconfiguratorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheHttpProxyconfiguratorProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheHttpProxyconfiguratorProperties</param>
        /// <param name="right">Compared (OrgApacheHttpProxyconfiguratorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheHttpProxyconfiguratorProperties left, OrgApacheHttpProxyconfiguratorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheHttpProxyconfiguratorProperties.
        /// </summary>
        public sealed class OrgApacheHttpProxyconfiguratorPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _ProxyEnabled;
            private ConfigNodePropertyString _ProxyHost;
            private ConfigNodePropertyInteger _ProxyPort;
            private ConfigNodePropertyString _ProxyUser;
            private ConfigNodePropertyString _ProxyPassword;
            private ConfigNodePropertyArray _ProxyExceptions;

            internal OrgApacheHttpProxyconfiguratorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheHttpProxyconfiguratorProperties.ProxyEnabled property.
            /// </summary>
            /// <param name="value">ProxyEnabled</param>
            public OrgApacheHttpProxyconfiguratorPropertiesBuilder ProxyEnabled(ConfigNodePropertyBoolean value)
            {
                _ProxyEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheHttpProxyconfiguratorProperties.ProxyHost property.
            /// </summary>
            /// <param name="value">ProxyHost</param>
            public OrgApacheHttpProxyconfiguratorPropertiesBuilder ProxyHost(ConfigNodePropertyString value)
            {
                _ProxyHost = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheHttpProxyconfiguratorProperties.ProxyPort property.
            /// </summary>
            /// <param name="value">ProxyPort</param>
            public OrgApacheHttpProxyconfiguratorPropertiesBuilder ProxyPort(ConfigNodePropertyInteger value)
            {
                _ProxyPort = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheHttpProxyconfiguratorProperties.ProxyUser property.
            /// </summary>
            /// <param name="value">ProxyUser</param>
            public OrgApacheHttpProxyconfiguratorPropertiesBuilder ProxyUser(ConfigNodePropertyString value)
            {
                _ProxyUser = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheHttpProxyconfiguratorProperties.ProxyPassword property.
            /// </summary>
            /// <param name="value">ProxyPassword</param>
            public OrgApacheHttpProxyconfiguratorPropertiesBuilder ProxyPassword(ConfigNodePropertyString value)
            {
                _ProxyPassword = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheHttpProxyconfiguratorProperties.ProxyExceptions property.
            /// </summary>
            /// <param name="value">ProxyExceptions</param>
            public OrgApacheHttpProxyconfiguratorPropertiesBuilder ProxyExceptions(ConfigNodePropertyArray value)
            {
                _ProxyExceptions = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheHttpProxyconfiguratorProperties.
            /// </summary>
            /// <returns>OrgApacheHttpProxyconfiguratorProperties</returns>
            public OrgApacheHttpProxyconfiguratorProperties Build()
            {
                Validate();
                return new OrgApacheHttpProxyconfiguratorProperties(
                    ProxyEnabled: _ProxyEnabled,
                    ProxyHost: _ProxyHost,
                    ProxyPort: _ProxyPort,
                    ProxyUser: _ProxyUser,
                    ProxyPassword: _ProxyPassword,
                    ProxyExceptions: _ProxyExceptions
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}