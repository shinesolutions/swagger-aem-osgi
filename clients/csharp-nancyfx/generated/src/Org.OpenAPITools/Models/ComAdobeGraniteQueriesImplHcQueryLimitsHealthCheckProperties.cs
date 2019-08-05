using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties:  IEquatable<ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties()
        {
        }

        private ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties(ConfigNodePropertyArray HcTags)
        {
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckPropertiesBuilder With()
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

        public bool Equals(ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties left, ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties left, ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties</returns>
            public ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties(
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}