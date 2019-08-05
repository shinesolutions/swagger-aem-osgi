using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties:  IEquatable<ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties>
    { 
        /// <summary>
        /// AuthImsClientSecret
        /// </summary>
        public ConfigNodePropertyString AuthImsClientSecret { get; private set; }

        /// <summary>
        /// CustomizerType
        /// </summary>
        public ConfigNodePropertyString CustomizerType { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties()
        {
        }

        private ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties(ConfigNodePropertyString AuthImsClientSecret, ConfigNodePropertyString CustomizerType)
        {
            
            this.AuthImsClientSecret = AuthImsClientSecret;
            
            this.CustomizerType = CustomizerType;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPropertiesBuilder</returns>
        public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPropertiesBuilder With()
        {
            return Builder()
                .AuthImsClientSecret(AuthImsClientSecret)
                .CustomizerType(CustomizerType);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties left, ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties left, ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPropertiesBuilder
        {
            private ConfigNodePropertyString _AuthImsClientSecret;
            private ConfigNodePropertyString _CustomizerType;

            internal ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.AuthImsClientSecret property.
            /// </summary>
            /// <param name="value">AuthImsClientSecret</param>
            public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPropertiesBuilder AuthImsClientSecret(ConfigNodePropertyString value)
            {
                _AuthImsClientSecret = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.CustomizerType property.
            /// </summary>
            /// <param name="value">CustomizerType</param>
            public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPropertiesBuilder CustomizerType(ConfigNodePropertyString value)
            {
                _CustomizerType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties</returns>
            public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties(
                    AuthImsClientSecret: _AuthImsClientSecret,
                    CustomizerType: _CustomizerType
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}