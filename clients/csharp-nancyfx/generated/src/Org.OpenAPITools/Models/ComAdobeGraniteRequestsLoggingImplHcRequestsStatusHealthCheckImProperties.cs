using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties
    /// </summary>
    public sealed class ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties:  IEquatable<ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties()
        {
        }

        private ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties(ConfigNodePropertyArray HcTags)
        {
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImPropertiesBuilder</returns>
        public static ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImPropertiesBuilder</returns>
        public ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImPropertiesBuilder With()
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

        public bool Equals(ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties left, ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties left, ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties.
        /// </summary>
        public sealed class ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties</returns>
            public ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties Build()
            {
                Validate();
                return new ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties(
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}