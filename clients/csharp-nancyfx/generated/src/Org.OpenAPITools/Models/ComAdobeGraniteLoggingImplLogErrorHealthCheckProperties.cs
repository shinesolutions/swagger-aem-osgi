using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties:  IEquatable<ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties()
        {
        }

        private ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties(ConfigNodePropertyArray HcTags)
        {
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteLoggingImplLogErrorHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteLoggingImplLogErrorHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteLoggingImplLogErrorHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteLoggingImplLogErrorHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteLoggingImplLogErrorHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteLoggingImplLogErrorHealthCheckPropertiesBuilder With()
        {
            return Builder()
                .HcTags(HcTags);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties left, ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties left, ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteLoggingImplLogErrorHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeGraniteLoggingImplLogErrorHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteLoggingImplLogErrorHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties</returns>
            public ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties(
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}