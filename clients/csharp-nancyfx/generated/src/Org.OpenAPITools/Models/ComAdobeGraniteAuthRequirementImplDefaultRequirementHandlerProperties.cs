using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties:  IEquatable<ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties>
    { 
        /// <summary>
        /// SupportedPaths
        /// </summary>
        public ConfigNodePropertyArray SupportedPaths { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties()
        {
        }

        private ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties(ConfigNodePropertyArray SupportedPaths)
        {
            
            this.SupportedPaths = SupportedPaths;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesBuilder</returns>
        public ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesBuilder With()
        {
            return Builder()
                .SupportedPaths(SupportedPaths);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties left, ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties left, ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesBuilder
        {
            private ConfigNodePropertyArray _SupportedPaths;

            internal ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties.SupportedPaths property.
            /// </summary>
            /// <param name="value">SupportedPaths</param>
            public ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesBuilder SupportedPaths(ConfigNodePropertyArray value)
            {
                _SupportedPaths = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties</returns>
            public ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties(
                    SupportedPaths: _SupportedPaths
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}