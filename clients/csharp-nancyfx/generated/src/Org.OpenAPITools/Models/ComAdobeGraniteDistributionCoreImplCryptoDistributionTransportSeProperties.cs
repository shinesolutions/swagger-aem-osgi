using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties
    /// </summary>
    public sealed class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties:  IEquatable<ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties>
    { 
        /// <summary>
        /// Name
        /// </summary>
        public ConfigNodePropertyString Name { get; private set; }

        /// <summary>
        /// Username
        /// </summary>
        public ConfigNodePropertyString Username { get; private set; }

        /// <summary>
        /// EncryptedPassword
        /// </summary>
        public ConfigNodePropertyString EncryptedPassword { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties()
        {
        }

        private ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties(ConfigNodePropertyString Name, ConfigNodePropertyString Username, ConfigNodePropertyString EncryptedPassword)
        {
            
            this.Name = Name;
            
            this.Username = Username;
            
            this.EncryptedPassword = EncryptedPassword;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesBuilder</returns>
        public static ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesBuilder Builder()
        {
            return new ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesBuilder</returns>
        public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Username(Username)
                .EncryptedPassword(EncryptedPassword);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties left, ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties left, ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.
        /// </summary>
        public sealed class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _Username;
            private ConfigNodePropertyString _EncryptedPassword;

            internal ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.Username property.
            /// </summary>
            /// <param name="value">Username</param>
            public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesBuilder Username(ConfigNodePropertyString value)
            {
                _Username = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.EncryptedPassword property.
            /// </summary>
            /// <param name="value">EncryptedPassword</param>
            public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesBuilder EncryptedPassword(ConfigNodePropertyString value)
            {
                _EncryptedPassword = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties</returns>
            public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties Build()
            {
                Validate();
                return new ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties(
                    Name: _Name,
                    Username: _Username,
                    EncryptedPassword: _EncryptedPassword
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}