using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties
    /// </summary>
    public sealed class ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties:  IEquatable<ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties>
    { 
        /// <summary>
        /// Disabled
        /// </summary>
        public ConfigNodePropertyBoolean Disabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties()
        {
        }

        private ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties(ConfigNodePropertyBoolean Disabled)
        {
            
            this.Disabled = Disabled;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAnalyzerBaseSystemStatusServletPropertiesBuilder</returns>
        public static ComAdobeGraniteAnalyzerBaseSystemStatusServletPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAnalyzerBaseSystemStatusServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAnalyzerBaseSystemStatusServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAnalyzerBaseSystemStatusServletPropertiesBuilder</returns>
        public ComAdobeGraniteAnalyzerBaseSystemStatusServletPropertiesBuilder With()
        {
            return Builder()
                .Disabled(Disabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties left, ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties left, ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAnalyzerBaseSystemStatusServletPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Disabled;

            internal ComAdobeGraniteAnalyzerBaseSystemStatusServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties.Disabled property.
            /// </summary>
            /// <param name="value">Disabled</param>
            public ComAdobeGraniteAnalyzerBaseSystemStatusServletPropertiesBuilder Disabled(ConfigNodePropertyBoolean value)
            {
                _Disabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties</returns>
            public ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties(
                    Disabled: _Disabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}