using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties
    /// </summary>
    public sealed class ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties:  IEquatable<ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties>
    { 
        /// <summary>
        /// GetPeriod
        /// </summary>
        public ConfigNodePropertyInteger GetPeriod { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties()
        {
        }

        private ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties(ConfigNodePropertyInteger GetPeriod)
        {
            
            this.GetPeriod = GetPeriod;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsPropertiesBuilder</returns>
        public static ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsPropertiesBuilder</returns>
        public ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsPropertiesBuilder With()
        {
            return Builder()
                .GetPeriod(GetPeriod);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties left, ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties left, ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties.
        /// </summary>
        public sealed class ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsPropertiesBuilder
        {
            private ConfigNodePropertyInteger _GetPeriod;

            internal ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties.GetPeriod property.
            /// </summary>
            /// <param name="value">GetPeriod</param>
            public ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsPropertiesBuilder GetPeriod(ConfigNodePropertyInteger value)
            {
                _GetPeriod = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties</returns>
            public ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties Build()
            {
                Validate();
                return new ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties(
                    GetPeriod: _GetPeriod
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}