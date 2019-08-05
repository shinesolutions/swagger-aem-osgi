using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties
    /// </summary>
    public sealed class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties:  IEquatable<ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties>
    { 
        /// <summary>
        /// ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath
        /// </summary>
        public ConfigNodePropertyArray ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath { get; private set; }

        /// <summary>
        /// ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency { get; private set; }

        /// <summary>
        /// ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout
        /// </summary>
        public ConfigNodePropertyInteger ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout { get; private set; }

        /// <summary>
        /// ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients { get; private set; }

        /// <summary>
        /// ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver { get; private set; }

        /// <summary>
        /// ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport
        /// </summary>
        public ConfigNodePropertyInteger ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport { get; private set; }

        /// <summary>
        /// ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls
        /// </summary>
        public ConfigNodePropertyBoolean ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls { get; private set; }

        /// <summary>
        /// ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername { get; private set; }

        /// <summary>
        /// ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties()
        {
        }

        private ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties(ConfigNodePropertyArray ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath, ConfigNodePropertyString ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency, ConfigNodePropertyInteger ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout, ConfigNodePropertyString ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients, ConfigNodePropertyString ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver, ConfigNodePropertyInteger ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport, ConfigNodePropertyBoolean ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls, ConfigNodePropertyString ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername, ConfigNodePropertyString ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword)
        {
            
            this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath = ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath;
            
            this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency = ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency;
            
            this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout = ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout;
            
            this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients = ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients;
            
            this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver = ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver;
            
            this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport = ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport;
            
            this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls = ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls;
            
            this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername = ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername;
            
            this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword = ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder</returns>
        public static ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder</returns>
        public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder With()
        {
            return Builder()
                .ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath)
                .ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency)
                .ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout)
                .ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients)
                .ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver)
                .ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport)
                .ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls)
                .ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername)
                .ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties left, ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties left, ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.
        /// </summary>
        public sealed class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath;
            private ConfigNodePropertyString _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency;
            private ConfigNodePropertyInteger _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout;
            private ConfigNodePropertyString _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients;
            private ConfigNodePropertyString _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver;
            private ConfigNodePropertyInteger _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport;
            private ConfigNodePropertyBoolean _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls;
            private ConfigNodePropertyString _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername;
            private ConfigNodePropertyString _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword;

            internal ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath property.
            /// </summary>
            /// <param name="value">ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath</param>
            public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath(ConfigNodePropertyArray value)
            {
                _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency property.
            /// </summary>
            /// <param name="value">ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency</param>
            public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency(ConfigNodePropertyString value)
            {
                _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout property.
            /// </summary>
            /// <param name="value">ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout</param>
            public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout(ConfigNodePropertyInteger value)
            {
                _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients property.
            /// </summary>
            /// <param name="value">ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients</param>
            public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients(ConfigNodePropertyString value)
            {
                _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver property.
            /// </summary>
            /// <param name="value">ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver</param>
            public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver(ConfigNodePropertyString value)
            {
                _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport property.
            /// </summary>
            /// <param name="value">ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport</param>
            public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport(ConfigNodePropertyInteger value)
            {
                _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls property.
            /// </summary>
            /// <param name="value">ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls</param>
            public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls(ConfigNodePropertyBoolean value)
            {
                _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername property.
            /// </summary>
            /// <param name="value">ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername</param>
            public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername(ConfigNodePropertyString value)
            {
                _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword property.
            /// </summary>
            /// <param name="value">ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword</param>
            public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesBuilder ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword(ConfigNodePropertyString value)
            {
                _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties</returns>
            public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties Build()
            {
                Validate();
                return new ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties(
                    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath: _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath,
                    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency: _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency,
                    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout: _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout,
                    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients: _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients,
                    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver: _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver,
                    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport: _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport,
                    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls: _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls,
                    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername: _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername,
                    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword: _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}