using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties:  IEquatable<ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties>
    { 
        /// <summary>
        /// OauthProviderId
        /// </summary>
        public ConfigNodePropertyString OauthProviderId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties()
        {
        }

        private ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties(ConfigNodePropertyString OauthProviderId)
        {
            
            this.OauthProviderId = OauthProviderId;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplFacebookProviderImplPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthOauthImplFacebookProviderImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthImplFacebookProviderImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthImplFacebookProviderImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplFacebookProviderImplPropertiesBuilder</returns>
        public ComAdobeGraniteAuthOauthImplFacebookProviderImplPropertiesBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties left, ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties left, ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthImplFacebookProviderImplPropertiesBuilder
        {
            private ConfigNodePropertyString _OauthProviderId;

            internal ComAdobeGraniteAuthOauthImplFacebookProviderImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties.OauthProviderId property.
            /// </summary>
            /// <param name="value">OauthProviderId</param>
            public ComAdobeGraniteAuthOauthImplFacebookProviderImplPropertiesBuilder OauthProviderId(ConfigNodePropertyString value)
            {
                _OauthProviderId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties</returns>
            public ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties(
                    OauthProviderId: _OauthProviderId
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}