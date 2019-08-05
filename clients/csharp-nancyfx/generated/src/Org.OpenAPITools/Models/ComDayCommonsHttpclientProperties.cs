using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCommonsHttpclientProperties
    /// </summary>
    public sealed class ComDayCommonsHttpclientProperties:  IEquatable<ComDayCommonsHttpclientProperties>
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
        /// ProxyUser
        /// </summary>
        public ConfigNodePropertyString ProxyUser { get; private set; }

        /// <summary>
        /// ProxyPassword
        /// </summary>
        public ConfigNodePropertyString ProxyPassword { get; private set; }

        /// <summary>
        /// ProxyNtlmHost
        /// </summary>
        public ConfigNodePropertyString ProxyNtlmHost { get; private set; }

        /// <summary>
        /// ProxyNtlmDomain
        /// </summary>
        public ConfigNodePropertyString ProxyNtlmDomain { get; private set; }

        /// <summary>
        /// ProxyExceptions
        /// </summary>
        public ConfigNodePropertyArray ProxyExceptions { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCommonsHttpclientProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCommonsHttpclientProperties()
        {
        }

        private ComDayCommonsHttpclientProperties(ConfigNodePropertyBoolean ProxyEnabled, ConfigNodePropertyString ProxyHost, ConfigNodePropertyString ProxyUser, ConfigNodePropertyString ProxyPassword, ConfigNodePropertyString ProxyNtlmHost, ConfigNodePropertyString ProxyNtlmDomain, ConfigNodePropertyArray ProxyExceptions)
        {
            
            this.ProxyEnabled = ProxyEnabled;
            
            this.ProxyHost = ProxyHost;
            
            this.ProxyUser = ProxyUser;
            
            this.ProxyPassword = ProxyPassword;
            
            this.ProxyNtlmHost = ProxyNtlmHost;
            
            this.ProxyNtlmDomain = ProxyNtlmDomain;
            
            this.ProxyExceptions = ProxyExceptions;
            
        }

        /// <summary>
        /// Returns builder of ComDayCommonsHttpclientProperties.
        /// </summary>
        /// <returns>ComDayCommonsHttpclientPropertiesBuilder</returns>
        public static ComDayCommonsHttpclientPropertiesBuilder Builder()
        {
            return new ComDayCommonsHttpclientPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCommonsHttpclientPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCommonsHttpclientPropertiesBuilder</returns>
        public ComDayCommonsHttpclientPropertiesBuilder With()
        {
            return Builder()
                .ProxyEnabled(ProxyEnabled)
                .ProxyHost(ProxyHost)
                .ProxyUser(ProxyUser)
                .ProxyPassword(ProxyPassword)
                .ProxyNtlmHost(ProxyNtlmHost)
                .ProxyNtlmDomain(ProxyNtlmDomain)
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

        public bool Equals(ComDayCommonsHttpclientProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCommonsHttpclientProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCommonsHttpclientProperties</param>
        /// <param name="right">Compared (ComDayCommonsHttpclientProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCommonsHttpclientProperties left, ComDayCommonsHttpclientProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCommonsHttpclientProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCommonsHttpclientProperties</param>
        /// <param name="right">Compared (ComDayCommonsHttpclientProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCommonsHttpclientProperties left, ComDayCommonsHttpclientProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCommonsHttpclientProperties.
        /// </summary>
        public sealed class ComDayCommonsHttpclientPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _ProxyEnabled;
            private ConfigNodePropertyString _ProxyHost;
            private ConfigNodePropertyString _ProxyUser;
            private ConfigNodePropertyString _ProxyPassword;
            private ConfigNodePropertyString _ProxyNtlmHost;
            private ConfigNodePropertyString _ProxyNtlmDomain;
            private ConfigNodePropertyArray _ProxyExceptions;

            internal ComDayCommonsHttpclientPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCommonsHttpclientProperties.ProxyEnabled property.
            /// </summary>
            /// <param name="value">ProxyEnabled</param>
            public ComDayCommonsHttpclientPropertiesBuilder ProxyEnabled(ConfigNodePropertyBoolean value)
            {
                _ProxyEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsHttpclientProperties.ProxyHost property.
            /// </summary>
            /// <param name="value">ProxyHost</param>
            public ComDayCommonsHttpclientPropertiesBuilder ProxyHost(ConfigNodePropertyString value)
            {
                _ProxyHost = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsHttpclientProperties.ProxyUser property.
            /// </summary>
            /// <param name="value">ProxyUser</param>
            public ComDayCommonsHttpclientPropertiesBuilder ProxyUser(ConfigNodePropertyString value)
            {
                _ProxyUser = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsHttpclientProperties.ProxyPassword property.
            /// </summary>
            /// <param name="value">ProxyPassword</param>
            public ComDayCommonsHttpclientPropertiesBuilder ProxyPassword(ConfigNodePropertyString value)
            {
                _ProxyPassword = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsHttpclientProperties.ProxyNtlmHost property.
            /// </summary>
            /// <param name="value">ProxyNtlmHost</param>
            public ComDayCommonsHttpclientPropertiesBuilder ProxyNtlmHost(ConfigNodePropertyString value)
            {
                _ProxyNtlmHost = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsHttpclientProperties.ProxyNtlmDomain property.
            /// </summary>
            /// <param name="value">ProxyNtlmDomain</param>
            public ComDayCommonsHttpclientPropertiesBuilder ProxyNtlmDomain(ConfigNodePropertyString value)
            {
                _ProxyNtlmDomain = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCommonsHttpclientProperties.ProxyExceptions property.
            /// </summary>
            /// <param name="value">ProxyExceptions</param>
            public ComDayCommonsHttpclientPropertiesBuilder ProxyExceptions(ConfigNodePropertyArray value)
            {
                _ProxyExceptions = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCommonsHttpclientProperties.
            /// </summary>
            /// <returns>ComDayCommonsHttpclientProperties</returns>
            public ComDayCommonsHttpclientProperties Build()
            {
                Validate();
                return new ComDayCommonsHttpclientProperties(
                    ProxyEnabled: _ProxyEnabled,
                    ProxyHost: _ProxyHost,
                    ProxyUser: _ProxyUser,
                    ProxyPassword: _ProxyPassword,
                    ProxyNtlmHost: _ProxyNtlmHost,
                    ProxyNtlmDomain: _ProxyNtlmDomain,
                    ProxyExceptions: _ProxyExceptions
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}