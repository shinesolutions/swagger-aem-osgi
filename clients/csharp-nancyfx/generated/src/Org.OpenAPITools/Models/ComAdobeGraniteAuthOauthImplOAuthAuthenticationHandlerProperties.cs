using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties:  IEquatable<ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties>
    { 
        /// <summary>
        /// Path
        /// </summary>
        public ConfigNodePropertyString Path { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties()
        {
        }

        private ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties(ConfigNodePropertyString Path)
        {
            
            this.Path = Path;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerPropertiesBuilder</returns>
        public ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerPropertiesBuilder With()
        {
            return Builder()
                .Path(Path);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties left, ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties left, ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerPropertiesBuilder
        {
            private ConfigNodePropertyString _Path;

            internal ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerPropertiesBuilder Path(ConfigNodePropertyString value)
            {
                _Path = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties</returns>
            public ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties(
                    Path: _Path
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}