using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties
    /// </summary>
    public sealed class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties:  IEquatable<ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties>
    { 
        /// <summary>
        /// ComAdobeGraniteJettySslPort
        /// </summary>
        public ConfigNodePropertyInteger ComAdobeGraniteJettySslPort { get; private set; }

        /// <summary>
        /// ComAdobeGraniteJettySslKeystoreUser
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteJettySslKeystoreUser { get; private set; }

        /// <summary>
        /// ComAdobeGraniteJettySslKeystorePassword
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteJettySslKeystorePassword { get; private set; }

        /// <summary>
        /// ComAdobeGraniteJettySslCiphersuitesExcluded
        /// </summary>
        public ConfigNodePropertyArray ComAdobeGraniteJettySslCiphersuitesExcluded { get; private set; }

        /// <summary>
        /// ComAdobeGraniteJettySslCiphersuitesIncluded
        /// </summary>
        public ConfigNodePropertyArray ComAdobeGraniteJettySslCiphersuitesIncluded { get; private set; }

        /// <summary>
        /// ComAdobeGraniteJettySslClientCertificate
        /// </summary>
        public ConfigNodePropertyDropDown ComAdobeGraniteJettySslClientCertificate { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties()
        {
        }

        private ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties(ConfigNodePropertyInteger ComAdobeGraniteJettySslPort, ConfigNodePropertyString ComAdobeGraniteJettySslKeystoreUser, ConfigNodePropertyString ComAdobeGraniteJettySslKeystorePassword, ConfigNodePropertyArray ComAdobeGraniteJettySslCiphersuitesExcluded, ConfigNodePropertyArray ComAdobeGraniteJettySslCiphersuitesIncluded, ConfigNodePropertyDropDown ComAdobeGraniteJettySslClientCertificate)
        {
            
            this.ComAdobeGraniteJettySslPort = ComAdobeGraniteJettySslPort;
            
            this.ComAdobeGraniteJettySslKeystoreUser = ComAdobeGraniteJettySslKeystoreUser;
            
            this.ComAdobeGraniteJettySslKeystorePassword = ComAdobeGraniteJettySslKeystorePassword;
            
            this.ComAdobeGraniteJettySslCiphersuitesExcluded = ComAdobeGraniteJettySslCiphersuitesExcluded;
            
            this.ComAdobeGraniteJettySslCiphersuitesIncluded = ComAdobeGraniteJettySslCiphersuitesIncluded;
            
            this.ComAdobeGraniteJettySslClientCertificate = ComAdobeGraniteJettySslClientCertificate;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesBuilder</returns>
        public static ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesBuilder</returns>
        public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesBuilder With()
        {
            return Builder()
                .ComAdobeGraniteJettySslPort(ComAdobeGraniteJettySslPort)
                .ComAdobeGraniteJettySslKeystoreUser(ComAdobeGraniteJettySslKeystoreUser)
                .ComAdobeGraniteJettySslKeystorePassword(ComAdobeGraniteJettySslKeystorePassword)
                .ComAdobeGraniteJettySslCiphersuitesExcluded(ComAdobeGraniteJettySslCiphersuitesExcluded)
                .ComAdobeGraniteJettySslCiphersuitesIncluded(ComAdobeGraniteJettySslCiphersuitesIncluded)
                .ComAdobeGraniteJettySslClientCertificate(ComAdobeGraniteJettySslClientCertificate);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties left, ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties left, ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.
        /// </summary>
        public sealed class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ComAdobeGraniteJettySslPort;
            private ConfigNodePropertyString _ComAdobeGraniteJettySslKeystoreUser;
            private ConfigNodePropertyString _ComAdobeGraniteJettySslKeystorePassword;
            private ConfigNodePropertyArray _ComAdobeGraniteJettySslCiphersuitesExcluded;
            private ConfigNodePropertyArray _ComAdobeGraniteJettySslCiphersuitesIncluded;
            private ConfigNodePropertyDropDown _ComAdobeGraniteJettySslClientCertificate;

            internal ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.ComAdobeGraniteJettySslPort property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteJettySslPort</param>
            public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesBuilder ComAdobeGraniteJettySslPort(ConfigNodePropertyInteger value)
            {
                _ComAdobeGraniteJettySslPort = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.ComAdobeGraniteJettySslKeystoreUser property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteJettySslKeystoreUser</param>
            public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesBuilder ComAdobeGraniteJettySslKeystoreUser(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteJettySslKeystoreUser = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.ComAdobeGraniteJettySslKeystorePassword property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteJettySslKeystorePassword</param>
            public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesBuilder ComAdobeGraniteJettySslKeystorePassword(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteJettySslKeystorePassword = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.ComAdobeGraniteJettySslCiphersuitesExcluded property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteJettySslCiphersuitesExcluded</param>
            public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesBuilder ComAdobeGraniteJettySslCiphersuitesExcluded(ConfigNodePropertyArray value)
            {
                _ComAdobeGraniteJettySslCiphersuitesExcluded = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.ComAdobeGraniteJettySslCiphersuitesIncluded property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteJettySslCiphersuitesIncluded</param>
            public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesBuilder ComAdobeGraniteJettySslCiphersuitesIncluded(ConfigNodePropertyArray value)
            {
                _ComAdobeGraniteJettySslCiphersuitesIncluded = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.ComAdobeGraniteJettySslClientCertificate property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteJettySslClientCertificate</param>
            public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesBuilder ComAdobeGraniteJettySslClientCertificate(ConfigNodePropertyDropDown value)
            {
                _ComAdobeGraniteJettySslClientCertificate = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties</returns>
            public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties Build()
            {
                Validate();
                return new ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties(
                    ComAdobeGraniteJettySslPort: _ComAdobeGraniteJettySslPort,
                    ComAdobeGraniteJettySslKeystoreUser: _ComAdobeGraniteJettySslKeystoreUser,
                    ComAdobeGraniteJettySslKeystorePassword: _ComAdobeGraniteJettySslKeystorePassword,
                    ComAdobeGraniteJettySslCiphersuitesExcluded: _ComAdobeGraniteJettySslCiphersuitesExcluded,
                    ComAdobeGraniteJettySslCiphersuitesIncluded: _ComAdobeGraniteJettySslCiphersuitesIncluded,
                    ComAdobeGraniteJettySslClientCertificate: _ComAdobeGraniteJettySslClientCertificate
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}