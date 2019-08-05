using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties:  IEquatable<ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties>
    { 
        /// <summary>
        /// OauthProviderId
        /// </summary>
        public ConfigNodePropertyString OauthProviderId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties()
        {
        }

        private ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties(ConfigNodePropertyString OauthProviderId)
        {
            
            this.OauthProviderId = OauthProviderId;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplTwitterProviderImplPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthOauthImplTwitterProviderImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthImplTwitterProviderImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthImplTwitterProviderImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplTwitterProviderImplPropertiesBuilder</returns>
        public ComAdobeGraniteAuthOauthImplTwitterProviderImplPropertiesBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties left, ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties left, ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthImplTwitterProviderImplPropertiesBuilder
        {
            private ConfigNodePropertyString _OauthProviderId;

            internal ComAdobeGraniteAuthOauthImplTwitterProviderImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties.OauthProviderId property.
            /// </summary>
            /// <param name="value">OauthProviderId</param>
            public ComAdobeGraniteAuthOauthImplTwitterProviderImplPropertiesBuilder OauthProviderId(ConfigNodePropertyString value)
            {
                _OauthProviderId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties</returns>
            public ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties(
                    OauthProviderId: _OauthProviderId
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}