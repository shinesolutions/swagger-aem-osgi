using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties:  IEquatable<ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties>
    { 
        /// <summary>
        /// OmnisearchSuggestionRequiretextMin
        /// </summary>
        public ConfigNodePropertyInteger OmnisearchSuggestionRequiretextMin { get; private set; }

        /// <summary>
        /// OmnisearchSuggestionSpellcheckRequire
        /// </summary>
        public ConfigNodePropertyBoolean OmnisearchSuggestionSpellcheckRequire { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties()
        {
        }

        private ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties(ConfigNodePropertyInteger OmnisearchSuggestionRequiretextMin, ConfigNodePropertyBoolean OmnisearchSuggestionSpellcheckRequire)
        {
            
            this.OmnisearchSuggestionRequiretextMin = OmnisearchSuggestionRequiretextMin;
            
            this.OmnisearchSuggestionSpellcheckRequire = OmnisearchSuggestionSpellcheckRequire;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplPropertiesBuilder</returns>
        public static ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplPropertiesBuilder</returns>
        public ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplPropertiesBuilder With()
        {
            return Builder()
                .OmnisearchSuggestionRequiretextMin(OmnisearchSuggestionRequiretextMin)
                .OmnisearchSuggestionSpellcheckRequire(OmnisearchSuggestionSpellcheckRequire);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties left, ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties left, ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _OmnisearchSuggestionRequiretextMin;
            private ConfigNodePropertyBoolean _OmnisearchSuggestionSpellcheckRequire;

            internal ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties.OmnisearchSuggestionRequiretextMin property.
            /// </summary>
            /// <param name="value">OmnisearchSuggestionRequiretextMin</param>
            public ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplPropertiesBuilder OmnisearchSuggestionRequiretextMin(ConfigNodePropertyInteger value)
            {
                _OmnisearchSuggestionRequiretextMin = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties.OmnisearchSuggestionSpellcheckRequire property.
            /// </summary>
            /// <param name="value">OmnisearchSuggestionSpellcheckRequire</param>
            public ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplPropertiesBuilder OmnisearchSuggestionSpellcheckRequire(ConfigNodePropertyBoolean value)
            {
                _OmnisearchSuggestionSpellcheckRequire = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties</returns>
            public ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties(
                    OmnisearchSuggestionRequiretextMin: _OmnisearchSuggestionRequiretextMin,
                    OmnisearchSuggestionSpellcheckRequire: _OmnisearchSuggestionSpellcheckRequire
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}