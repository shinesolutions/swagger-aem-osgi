using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties:  IEquatable<ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties()
        {
        }

        private ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties(ConfigNodePropertyArray HcTags)
        {
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckPropertiesBuilder With()
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

        public bool Equals(ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties left, ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties left, ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties</returns>
            public ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties(
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}