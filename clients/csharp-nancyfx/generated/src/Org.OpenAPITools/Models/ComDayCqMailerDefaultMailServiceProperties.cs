using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMailerDefaultMailServiceProperties
    /// </summary>
    public sealed class ComDayCqMailerDefaultMailServiceProperties:  IEquatable<ComDayCqMailerDefaultMailServiceProperties>
    { 
        /// <summary>
        /// SmtpHost
        /// </summary>
        public ConfigNodePropertyString SmtpHost { get; private set; }

        /// <summary>
        /// SmtpPort
        /// </summary>
        public ConfigNodePropertyInteger SmtpPort { get; private set; }

        /// <summary>
        /// SmtpUser
        /// </summary>
        public ConfigNodePropertyString SmtpUser { get; private set; }

        /// <summary>
        /// SmtpPassword
        /// </summary>
        public ConfigNodePropertyString SmtpPassword { get; private set; }

        /// <summary>
        /// FromAddress
        /// </summary>
        public ConfigNodePropertyString FromAddress { get; private set; }

        /// <summary>
        /// SmtpSsl
        /// </summary>
        public ConfigNodePropertyBoolean SmtpSsl { get; private set; }

        /// <summary>
        /// SmtpStarttls
        /// </summary>
        public ConfigNodePropertyBoolean SmtpStarttls { get; private set; }

        /// <summary>
        /// DebugEmail
        /// </summary>
        public ConfigNodePropertyBoolean DebugEmail { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqMailerDefaultMailServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMailerDefaultMailServiceProperties()
        {
        }

        private ComDayCqMailerDefaultMailServiceProperties(ConfigNodePropertyString SmtpHost, ConfigNodePropertyInteger SmtpPort, ConfigNodePropertyString SmtpUser, ConfigNodePropertyString SmtpPassword, ConfigNodePropertyString FromAddress, ConfigNodePropertyBoolean SmtpSsl, ConfigNodePropertyBoolean SmtpStarttls, ConfigNodePropertyBoolean DebugEmail)
        {
            
            this.SmtpHost = SmtpHost;
            
            this.SmtpPort = SmtpPort;
            
            this.SmtpUser = SmtpUser;
            
            this.SmtpPassword = SmtpPassword;
            
            this.FromAddress = FromAddress;
            
            this.SmtpSsl = SmtpSsl;
            
            this.SmtpStarttls = SmtpStarttls;
            
            this.DebugEmail = DebugEmail;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMailerDefaultMailServiceProperties.
        /// </summary>
        /// <returns>ComDayCqMailerDefaultMailServicePropertiesBuilder</returns>
        public static ComDayCqMailerDefaultMailServicePropertiesBuilder Builder()
        {
            return new ComDayCqMailerDefaultMailServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMailerDefaultMailServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMailerDefaultMailServicePropertiesBuilder</returns>
        public ComDayCqMailerDefaultMailServicePropertiesBuilder With()
        {
            return Builder()
                .SmtpHost(SmtpHost)
                .SmtpPort(SmtpPort)
                .SmtpUser(SmtpUser)
                .SmtpPassword(SmtpPassword)
                .FromAddress(FromAddress)
                .SmtpSsl(SmtpSsl)
                .SmtpStarttls(SmtpStarttls)
                .DebugEmail(DebugEmail);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqMailerDefaultMailServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMailerDefaultMailServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMailerDefaultMailServiceProperties</param>
        /// <param name="right">Compared (ComDayCqMailerDefaultMailServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMailerDefaultMailServiceProperties left, ComDayCqMailerDefaultMailServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMailerDefaultMailServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMailerDefaultMailServiceProperties</param>
        /// <param name="right">Compared (ComDayCqMailerDefaultMailServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMailerDefaultMailServiceProperties left, ComDayCqMailerDefaultMailServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMailerDefaultMailServiceProperties.
        /// </summary>
        public sealed class ComDayCqMailerDefaultMailServicePropertiesBuilder
        {
            private ConfigNodePropertyString _SmtpHost;
            private ConfigNodePropertyInteger _SmtpPort;
            private ConfigNodePropertyString _SmtpUser;
            private ConfigNodePropertyString _SmtpPassword;
            private ConfigNodePropertyString _FromAddress;
            private ConfigNodePropertyBoolean _SmtpSsl;
            private ConfigNodePropertyBoolean _SmtpStarttls;
            private ConfigNodePropertyBoolean _DebugEmail;

            internal ComDayCqMailerDefaultMailServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMailerDefaultMailServiceProperties.SmtpHost property.
            /// </summary>
            /// <param name="value">SmtpHost</param>
            public ComDayCqMailerDefaultMailServicePropertiesBuilder SmtpHost(ConfigNodePropertyString value)
            {
                _SmtpHost = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMailerDefaultMailServiceProperties.SmtpPort property.
            /// </summary>
            /// <param name="value">SmtpPort</param>
            public ComDayCqMailerDefaultMailServicePropertiesBuilder SmtpPort(ConfigNodePropertyInteger value)
            {
                _SmtpPort = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMailerDefaultMailServiceProperties.SmtpUser property.
            /// </summary>
            /// <param name="value">SmtpUser</param>
            public ComDayCqMailerDefaultMailServicePropertiesBuilder SmtpUser(ConfigNodePropertyString value)
            {
                _SmtpUser = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMailerDefaultMailServiceProperties.SmtpPassword property.
            /// </summary>
            /// <param name="value">SmtpPassword</param>
            public ComDayCqMailerDefaultMailServicePropertiesBuilder SmtpPassword(ConfigNodePropertyString value)
            {
                _SmtpPassword = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMailerDefaultMailServiceProperties.FromAddress property.
            /// </summary>
            /// <param name="value">FromAddress</param>
            public ComDayCqMailerDefaultMailServicePropertiesBuilder FromAddress(ConfigNodePropertyString value)
            {
                _FromAddress = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMailerDefaultMailServiceProperties.SmtpSsl property.
            /// </summary>
            /// <param name="value">SmtpSsl</param>
            public ComDayCqMailerDefaultMailServicePropertiesBuilder SmtpSsl(ConfigNodePropertyBoolean value)
            {
                _SmtpSsl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMailerDefaultMailServiceProperties.SmtpStarttls property.
            /// </summary>
            /// <param name="value">SmtpStarttls</param>
            public ComDayCqMailerDefaultMailServicePropertiesBuilder SmtpStarttls(ConfigNodePropertyBoolean value)
            {
                _SmtpStarttls = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMailerDefaultMailServiceProperties.DebugEmail property.
            /// </summary>
            /// <param name="value">DebugEmail</param>
            public ComDayCqMailerDefaultMailServicePropertiesBuilder DebugEmail(ConfigNodePropertyBoolean value)
            {
                _DebugEmail = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMailerDefaultMailServiceProperties.
            /// </summary>
            /// <returns>ComDayCqMailerDefaultMailServiceProperties</returns>
            public ComDayCqMailerDefaultMailServiceProperties Build()
            {
                Validate();
                return new ComDayCqMailerDefaultMailServiceProperties(
                    SmtpHost: _SmtpHost,
                    SmtpPort: _SmtpPort,
                    SmtpUser: _SmtpUser,
                    SmtpPassword: _SmtpPassword,
                    FromAddress: _FromAddress,
                    SmtpSsl: _SmtpSsl,
                    SmtpStarttls: _SmtpStarttls,
                    DebugEmail: _DebugEmail
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}