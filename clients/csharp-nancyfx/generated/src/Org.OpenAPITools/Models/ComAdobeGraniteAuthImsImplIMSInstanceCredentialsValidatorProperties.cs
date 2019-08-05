using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties:  IEquatable<ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties>
    { 
        /// <summary>
        /// OauthProviderId
        /// </summary>
        public ConfigNodePropertyString OauthProviderId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties()
        {
        }

        private ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties(ConfigNodePropertyString OauthProviderId)
        {
            
            this.OauthProviderId = OauthProviderId;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorPropertiesBuilder</returns>
        public ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorPropertiesBuilder With()
        {
            return Builder()
                .OauthProviderId(OauthProviderId);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties left, ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties left, ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorPropertiesBuilder
        {
            private ConfigNodePropertyString _OauthProviderId;

            internal ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties.OauthProviderId property.
            /// </summary>
            /// <param name="value">OauthProviderId</param>
            public ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorPropertiesBuilder OauthProviderId(ConfigNodePropertyString value)
            {
                _OauthProviderId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties</returns>
            public ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties(
                    OauthProviderId: _OauthProviderId
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}