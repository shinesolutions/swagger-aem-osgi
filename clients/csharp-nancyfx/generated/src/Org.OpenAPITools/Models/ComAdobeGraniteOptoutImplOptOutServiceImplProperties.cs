using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOptoutImplOptOutServiceImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteOptoutImplOptOutServiceImplProperties:  IEquatable<ComAdobeGraniteOptoutImplOptOutServiceImplProperties>
    { 
        /// <summary>
        /// OptoutCookies
        /// </summary>
        public ConfigNodePropertyArray OptoutCookies { get; private set; }

        /// <summary>
        /// OptoutHeaders
        /// </summary>
        public ConfigNodePropertyArray OptoutHeaders { get; private set; }

        /// <summary>
        /// OptoutWhitelistCookies
        /// </summary>
        public ConfigNodePropertyArray OptoutWhitelistCookies { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteOptoutImplOptOutServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOptoutImplOptOutServiceImplProperties()
        {
        }

        private ComAdobeGraniteOptoutImplOptOutServiceImplProperties(ConfigNodePropertyArray OptoutCookies, ConfigNodePropertyArray OptoutHeaders, ConfigNodePropertyArray OptoutWhitelistCookies)
        {
            
            this.OptoutCookies = OptoutCookies;
            
            this.OptoutHeaders = OptoutHeaders;
            
            this.OptoutWhitelistCookies = OptoutWhitelistCookies;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOptoutImplOptOutServiceImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesBuilder</returns>
        public static ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesBuilder</returns>
        public ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesBuilder With()
        {
            return Builder()
                .OptoutCookies(OptoutCookies)
                .OptoutHeaders(OptoutHeaders)
                .OptoutWhitelistCookies(OptoutWhitelistCookies);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteOptoutImplOptOutServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOptoutImplOptOutServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOptoutImplOptOutServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOptoutImplOptOutServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOptoutImplOptOutServiceImplProperties left, ComAdobeGraniteOptoutImplOptOutServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOptoutImplOptOutServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOptoutImplOptOutServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOptoutImplOptOutServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOptoutImplOptOutServiceImplProperties left, ComAdobeGraniteOptoutImplOptOutServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOptoutImplOptOutServiceImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _OptoutCookies;
            private ConfigNodePropertyArray _OptoutHeaders;
            private ConfigNodePropertyArray _OptoutWhitelistCookies;

            internal ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOptoutImplOptOutServiceImplProperties.OptoutCookies property.
            /// </summary>
            /// <param name="value">OptoutCookies</param>
            public ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesBuilder OptoutCookies(ConfigNodePropertyArray value)
            {
                _OptoutCookies = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOptoutImplOptOutServiceImplProperties.OptoutHeaders property.
            /// </summary>
            /// <param name="value">OptoutHeaders</param>
            public ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesBuilder OptoutHeaders(ConfigNodePropertyArray value)
            {
                _OptoutHeaders = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOptoutImplOptOutServiceImplProperties.OptoutWhitelistCookies property.
            /// </summary>
            /// <param name="value">OptoutWhitelistCookies</param>
            public ComAdobeGraniteOptoutImplOptOutServiceImplPropertiesBuilder OptoutWhitelistCookies(ConfigNodePropertyArray value)
            {
                _OptoutWhitelistCookies = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOptoutImplOptOutServiceImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteOptoutImplOptOutServiceImplProperties</returns>
            public ComAdobeGraniteOptoutImplOptOutServiceImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteOptoutImplOptOutServiceImplProperties(
                    OptoutCookies: _OptoutCookies,
                    OptoutHeaders: _OptoutHeaders,
                    OptoutWhitelistCookies: _OptoutWhitelistCookies
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}