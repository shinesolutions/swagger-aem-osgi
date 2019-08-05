using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties:  IEquatable<ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties>
    { 
        /// <summary>
        /// AuthTokenValidatorType
        /// </summary>
        public ConfigNodePropertyString AuthTokenValidatorType { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties()
        {
        }

        private ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties(ConfigNodePropertyString AuthTokenValidatorType)
        {
            
            this.AuthTokenValidatorType = AuthTokenValidatorType;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplPropertiesBuilder</returns>
        public ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplPropertiesBuilder With()
        {
            return Builder()
                .AuthTokenValidatorType(AuthTokenValidatorType);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties left, ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties left, ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplPropertiesBuilder
        {
            private ConfigNodePropertyString _AuthTokenValidatorType;

            internal ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties.AuthTokenValidatorType property.
            /// </summary>
            /// <param name="value">AuthTokenValidatorType</param>
            public ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplPropertiesBuilder AuthTokenValidatorType(ConfigNodePropertyString value)
            {
                _AuthTokenValidatorType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties</returns>
            public ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties(
                    AuthTokenValidatorType: _AuthTokenValidatorType
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}