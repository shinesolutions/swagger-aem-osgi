using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties:  IEquatable<ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties>
    { 
        /// <summary>
        /// ProviderRoots
        /// </summary>
        public ConfigNodePropertyString ProviderRoots { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties()
        {
        }

        private ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties(ConfigNodePropertyString ProviderRoots)
        {
            
            this.ProviderRoots = ProviderRoots;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplPropertiesBuilder</returns>
        public static ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplPropertiesBuilder</returns>
        public ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplPropertiesBuilder With()
        {
            return Builder()
                .ProviderRoots(ProviderRoots);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties left, ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties left, ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplPropertiesBuilder
        {
            private ConfigNodePropertyString _ProviderRoots;

            internal ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties.ProviderRoots property.
            /// </summary>
            /// <param name="value">ProviderRoots</param>
            public ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplPropertiesBuilder ProviderRoots(ConfigNodePropertyString value)
            {
                _ProviderRoots = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties</returns>
            public ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties(
                    ProviderRoots: _ProviderRoots
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}