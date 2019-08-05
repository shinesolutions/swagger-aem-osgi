using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties
    /// </summary>
    public sealed class ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties:  IEquatable<ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties>
    { 
        /// <summary>
        /// PseudoPatterns
        /// </summary>
        public ConfigNodePropertyArray PseudoPatterns { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties()
        {
        }

        private ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties(ConfigNodePropertyArray PseudoPatterns)
        {
            
            this.PseudoPatterns = PseudoPatterns;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteI18nImplBundlePseudoTranslationsPropertiesBuilder</returns>
        public static ComAdobeGraniteI18nImplBundlePseudoTranslationsPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteI18nImplBundlePseudoTranslationsPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteI18nImplBundlePseudoTranslationsPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteI18nImplBundlePseudoTranslationsPropertiesBuilder</returns>
        public ComAdobeGraniteI18nImplBundlePseudoTranslationsPropertiesBuilder With()
        {
            return Builder()
                .PseudoPatterns(PseudoPatterns);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties left, ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties left, ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties.
        /// </summary>
        public sealed class ComAdobeGraniteI18nImplBundlePseudoTranslationsPropertiesBuilder
        {
            private ConfigNodePropertyArray _PseudoPatterns;

            internal ComAdobeGraniteI18nImplBundlePseudoTranslationsPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties.PseudoPatterns property.
            /// </summary>
            /// <param name="value">PseudoPatterns</param>
            public ComAdobeGraniteI18nImplBundlePseudoTranslationsPropertiesBuilder PseudoPatterns(ConfigNodePropertyArray value)
            {
                _PseudoPatterns = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties</returns>
            public ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties Build()
            {
                Validate();
                return new ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties(
                    PseudoPatterns: _PseudoPatterns
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}