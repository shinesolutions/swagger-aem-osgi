using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteFragsImplRandomFeatureProperties
    /// </summary>
    public sealed class ComAdobeGraniteFragsImplRandomFeatureProperties:  IEquatable<ComAdobeGraniteFragsImplRandomFeatureProperties>
    { 
        /// <summary>
        /// FeatureName
        /// </summary>
        public ConfigNodePropertyString FeatureName { get; private set; }

        /// <summary>
        /// FeatureDescription
        /// </summary>
        public ConfigNodePropertyString FeatureDescription { get; private set; }

        /// <summary>
        /// ActivePercentage
        /// </summary>
        public ConfigNodePropertyString ActivePercentage { get; private set; }

        /// <summary>
        /// CookieName
        /// </summary>
        public ConfigNodePropertyString CookieName { get; private set; }

        /// <summary>
        /// CookieMaxAge
        /// </summary>
        public ConfigNodePropertyInteger CookieMaxAge { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteFragsImplRandomFeatureProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteFragsImplRandomFeatureProperties()
        {
        }

        private ComAdobeGraniteFragsImplRandomFeatureProperties(ConfigNodePropertyString FeatureName, ConfigNodePropertyString FeatureDescription, ConfigNodePropertyString ActivePercentage, ConfigNodePropertyString CookieName, ConfigNodePropertyInteger CookieMaxAge)
        {
            
            this.FeatureName = FeatureName;
            
            this.FeatureDescription = FeatureDescription;
            
            this.ActivePercentage = ActivePercentage;
            
            this.CookieName = CookieName;
            
            this.CookieMaxAge = CookieMaxAge;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteFragsImplRandomFeatureProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteFragsImplRandomFeaturePropertiesBuilder</returns>
        public static ComAdobeGraniteFragsImplRandomFeaturePropertiesBuilder Builder()
        {
            return new ComAdobeGraniteFragsImplRandomFeaturePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteFragsImplRandomFeaturePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteFragsImplRandomFeaturePropertiesBuilder</returns>
        public ComAdobeGraniteFragsImplRandomFeaturePropertiesBuilder With()
        {
            return Builder()
                .FeatureName(FeatureName)
                .FeatureDescription(FeatureDescription)
                .ActivePercentage(ActivePercentage)
                .CookieName(CookieName)
                .CookieMaxAge(CookieMaxAge);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteFragsImplRandomFeatureProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteFragsImplRandomFeatureProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteFragsImplRandomFeatureProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteFragsImplRandomFeatureProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteFragsImplRandomFeatureProperties left, ComAdobeGraniteFragsImplRandomFeatureProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteFragsImplRandomFeatureProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteFragsImplRandomFeatureProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteFragsImplRandomFeatureProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteFragsImplRandomFeatureProperties left, ComAdobeGraniteFragsImplRandomFeatureProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteFragsImplRandomFeatureProperties.
        /// </summary>
        public sealed class ComAdobeGraniteFragsImplRandomFeaturePropertiesBuilder
        {
            private ConfigNodePropertyString _FeatureName;
            private ConfigNodePropertyString _FeatureDescription;
            private ConfigNodePropertyString _ActivePercentage;
            private ConfigNodePropertyString _CookieName;
            private ConfigNodePropertyInteger _CookieMaxAge;

            internal ComAdobeGraniteFragsImplRandomFeaturePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteFragsImplRandomFeatureProperties.FeatureName property.
            /// </summary>
            /// <param name="value">FeatureName</param>
            public ComAdobeGraniteFragsImplRandomFeaturePropertiesBuilder FeatureName(ConfigNodePropertyString value)
            {
                _FeatureName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteFragsImplRandomFeatureProperties.FeatureDescription property.
            /// </summary>
            /// <param name="value">FeatureDescription</param>
            public ComAdobeGraniteFragsImplRandomFeaturePropertiesBuilder FeatureDescription(ConfigNodePropertyString value)
            {
                _FeatureDescription = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteFragsImplRandomFeatureProperties.ActivePercentage property.
            /// </summary>
            /// <param name="value">ActivePercentage</param>
            public ComAdobeGraniteFragsImplRandomFeaturePropertiesBuilder ActivePercentage(ConfigNodePropertyString value)
            {
                _ActivePercentage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteFragsImplRandomFeatureProperties.CookieName property.
            /// </summary>
            /// <param name="value">CookieName</param>
            public ComAdobeGraniteFragsImplRandomFeaturePropertiesBuilder CookieName(ConfigNodePropertyString value)
            {
                _CookieName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteFragsImplRandomFeatureProperties.CookieMaxAge property.
            /// </summary>
            /// <param name="value">CookieMaxAge</param>
            public ComAdobeGraniteFragsImplRandomFeaturePropertiesBuilder CookieMaxAge(ConfigNodePropertyInteger value)
            {
                _CookieMaxAge = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteFragsImplRandomFeatureProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteFragsImplRandomFeatureProperties</returns>
            public ComAdobeGraniteFragsImplRandomFeatureProperties Build()
            {
                Validate();
                return new ComAdobeGraniteFragsImplRandomFeatureProperties(
                    FeatureName: _FeatureName,
                    FeatureDescription: _FeatureDescription,
                    ActivePercentage: _ActivePercentage,
                    CookieName: _CookieName,
                    CookieMaxAge: _CookieMaxAge
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}