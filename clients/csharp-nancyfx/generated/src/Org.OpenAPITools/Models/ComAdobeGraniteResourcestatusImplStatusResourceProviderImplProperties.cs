using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties:  IEquatable<ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties>
    { 
        /// <summary>
        /// ProviderRoot
        /// </summary>
        public ConfigNodePropertyString ProviderRoot { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties()
        {
        }

        private ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties(ConfigNodePropertyString ProviderRoot)
        {
            
            this.ProviderRoot = ProviderRoot;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteResourcestatusImplStatusResourceProviderImplPropertiesBuilder</returns>
        public static ComAdobeGraniteResourcestatusImplStatusResourceProviderImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteResourcestatusImplStatusResourceProviderImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteResourcestatusImplStatusResourceProviderImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteResourcestatusImplStatusResourceProviderImplPropertiesBuilder</returns>
        public ComAdobeGraniteResourcestatusImplStatusResourceProviderImplPropertiesBuilder With()
        {
            return Builder()
                .ProviderRoot(ProviderRoot);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties left, ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties left, ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteResourcestatusImplStatusResourceProviderImplPropertiesBuilder
        {
            private ConfigNodePropertyString _ProviderRoot;

            internal ComAdobeGraniteResourcestatusImplStatusResourceProviderImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties.ProviderRoot property.
            /// </summary>
            /// <param name="value">ProviderRoot</param>
            public ComAdobeGraniteResourcestatusImplStatusResourceProviderImplPropertiesBuilder ProviderRoot(ConfigNodePropertyString value)
            {
                _ProviderRoot = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties</returns>
            public ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties(
                    ProviderRoot: _ProviderRoot
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}