using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties
    /// </summary>
    public sealed class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties:  IEquatable<ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties>
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
        /// HttpHeaderName
        /// </summary>
        public ConfigNodePropertyString HttpHeaderName { get; private set; }

        /// <summary>
        /// HttpHeaderValuepattern
        /// </summary>
        public ConfigNodePropertyString HttpHeaderValuepattern { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties()
        {
        }

        private ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties(ConfigNodePropertyString FeatureName, ConfigNodePropertyString FeatureDescription, ConfigNodePropertyString HttpHeaderName, ConfigNodePropertyString HttpHeaderValuepattern)
        {
            
            this.FeatureName = FeatureName;
            
            this.FeatureDescription = FeatureDescription;
            
            this.HttpHeaderName = HttpHeaderName;
            
            this.HttpHeaderValuepattern = HttpHeaderValuepattern;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesBuilder</returns>
        public static ComAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesBuilder</returns>
        public ComAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesBuilder With()
        {
            return Builder()
                .FeatureName(FeatureName)
                .FeatureDescription(FeatureDescription)
                .HttpHeaderName(HttpHeaderName)
                .HttpHeaderValuepattern(HttpHeaderValuepattern);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties left, ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties left, ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.
        /// </summary>
        public sealed class ComAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesBuilder
        {
            private ConfigNodePropertyString _FeatureName;
            private ConfigNodePropertyString _FeatureDescription;
            private ConfigNodePropertyString _HttpHeaderName;
            private ConfigNodePropertyString _HttpHeaderValuepattern;

            internal ComAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.FeatureName property.
            /// </summary>
            /// <param name="value">FeatureName</param>
            public ComAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesBuilder FeatureName(ConfigNodePropertyString value)
            {
                _FeatureName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.FeatureDescription property.
            /// </summary>
            /// <param name="value">FeatureDescription</param>
            public ComAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesBuilder FeatureDescription(ConfigNodePropertyString value)
            {
                _FeatureDescription = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.HttpHeaderName property.
            /// </summary>
            /// <param name="value">HttpHeaderName</param>
            public ComAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesBuilder HttpHeaderName(ConfigNodePropertyString value)
            {
                _HttpHeaderName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.HttpHeaderValuepattern property.
            /// </summary>
            /// <param name="value">HttpHeaderValuepattern</param>
            public ComAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesBuilder HttpHeaderValuepattern(ConfigNodePropertyString value)
            {
                _HttpHeaderValuepattern = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties</returns>
            public ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties Build()
            {
                Validate();
                return new ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties(
                    FeatureName: _FeatureName,
                    FeatureDescription: _FeatureDescription,
                    HttpHeaderName: _HttpHeaderName,
                    HttpHeaderValuepattern: _HttpHeaderValuepattern
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}