using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties:  IEquatable<ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties>
    { 
        /// <summary>
        /// OauthProviderId
        /// </summary>
        public ConfigNodePropertyString OauthProviderId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties()
        {
        }

        private ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties(ConfigNodePropertyString OauthProviderId)
        {
            
            this.OauthProviderId = OauthProviderId;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionPropertiesBuilder</returns>
        public ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionPropertiesBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties left, ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties left, ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionPropertiesBuilder
        {
            private ConfigNodePropertyString _OauthProviderId;

            internal ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties.OauthProviderId property.
            /// </summary>
            /// <param name="value">OauthProviderId</param>
            public ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionPropertiesBuilder OauthProviderId(ConfigNodePropertyString value)
            {
                _OauthProviderId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties</returns>
            public ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties(
                    OauthProviderId: _OauthProviderId
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}