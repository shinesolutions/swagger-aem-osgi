using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties
    /// </summary>
    public sealed class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties:  IEquatable<ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties>
    { 
        /// <summary>
        /// OauthClientRevocationActive
        /// </summary>
        public ConfigNodePropertyBoolean OauthClientRevocationActive { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties()
        {
        }

        private ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties(ConfigNodePropertyBoolean OauthClientRevocationActive)
        {
            
            this.OauthClientRevocationActive = OauthClientRevocationActive;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletPropertiesBuilder</returns>
        public static ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletPropertiesBuilder</returns>
        public ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletPropertiesBuilder With()
        {
            return Builder()
                .OauthClientRevocationActive(OauthClientRevocationActive);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties left, ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties left, ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.
        /// </summary>
        public sealed class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _OauthClientRevocationActive;

            internal ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.OauthClientRevocationActive property.
            /// </summary>
            /// <param name="value">OauthClientRevocationActive</param>
            public ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletPropertiesBuilder OauthClientRevocationActive(ConfigNodePropertyBoolean value)
            {
                _OauthClientRevocationActive = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties</returns>
            public ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties Build()
            {
                Validate();
                return new ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties(
                    OauthClientRevocationActive: _OauthClientRevocationActive
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}