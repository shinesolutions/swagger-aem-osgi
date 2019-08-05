using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRestImplServletDefaultGETServletProperties
    /// </summary>
    public sealed class ComAdobeGraniteRestImplServletDefaultGETServletProperties:  IEquatable<ComAdobeGraniteRestImplServletDefaultGETServletProperties>
    { 
        /// <summary>
        /// DefaultLimit
        /// </summary>
        public ConfigNodePropertyInteger DefaultLimit { get; private set; }

        /// <summary>
        /// UseAbsoluteUri
        /// </summary>
        public ConfigNodePropertyBoolean UseAbsoluteUri { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRestImplServletDefaultGETServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRestImplServletDefaultGETServletProperties()
        {
        }

        private ComAdobeGraniteRestImplServletDefaultGETServletProperties(ConfigNodePropertyInteger DefaultLimit, ConfigNodePropertyBoolean UseAbsoluteUri)
        {
            
            this.DefaultLimit = DefaultLimit;
            
            this.UseAbsoluteUri = UseAbsoluteUri;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRestImplServletDefaultGETServletProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteRestImplServletDefaultGETServletPropertiesBuilder</returns>
        public static ComAdobeGraniteRestImplServletDefaultGETServletPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteRestImplServletDefaultGETServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRestImplServletDefaultGETServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRestImplServletDefaultGETServletPropertiesBuilder</returns>
        public ComAdobeGraniteRestImplServletDefaultGETServletPropertiesBuilder With()
        {
            return Builder()
                .DefaultLimit(DefaultLimit)
                .UseAbsoluteUri(UseAbsoluteUri);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteRestImplServletDefaultGETServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRestImplServletDefaultGETServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRestImplServletDefaultGETServletProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRestImplServletDefaultGETServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRestImplServletDefaultGETServletProperties left, ComAdobeGraniteRestImplServletDefaultGETServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRestImplServletDefaultGETServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRestImplServletDefaultGETServletProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRestImplServletDefaultGETServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRestImplServletDefaultGETServletProperties left, ComAdobeGraniteRestImplServletDefaultGETServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRestImplServletDefaultGETServletProperties.
        /// </summary>
        public sealed class ComAdobeGraniteRestImplServletDefaultGETServletPropertiesBuilder
        {
            private ConfigNodePropertyInteger _DefaultLimit;
            private ConfigNodePropertyBoolean _UseAbsoluteUri;

            internal ComAdobeGraniteRestImplServletDefaultGETServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRestImplServletDefaultGETServletProperties.DefaultLimit property.
            /// </summary>
            /// <param name="value">DefaultLimit</param>
            public ComAdobeGraniteRestImplServletDefaultGETServletPropertiesBuilder DefaultLimit(ConfigNodePropertyInteger value)
            {
                _DefaultLimit = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRestImplServletDefaultGETServletProperties.UseAbsoluteUri property.
            /// </summary>
            /// <param name="value">UseAbsoluteUri</param>
            public ComAdobeGraniteRestImplServletDefaultGETServletPropertiesBuilder UseAbsoluteUri(ConfigNodePropertyBoolean value)
            {
                _UseAbsoluteUri = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRestImplServletDefaultGETServletProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteRestImplServletDefaultGETServletProperties</returns>
            public ComAdobeGraniteRestImplServletDefaultGETServletProperties Build()
            {
                Validate();
                return new ComAdobeGraniteRestImplServletDefaultGETServletProperties(
                    DefaultLimit: _DefaultLimit,
                    UseAbsoluteUri: _UseAbsoluteUri
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}