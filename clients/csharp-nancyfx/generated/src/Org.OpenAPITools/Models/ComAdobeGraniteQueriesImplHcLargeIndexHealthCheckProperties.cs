using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties:  IEquatable<ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties>
    { 
        /// <summary>
        /// LargeIndexCriticalThreshold
        /// </summary>
        public ConfigNodePropertyInteger LargeIndexCriticalThreshold { get; private set; }

        /// <summary>
        /// LargeIndexWarnThreshold
        /// </summary>
        public ConfigNodePropertyInteger LargeIndexWarnThreshold { get; private set; }

        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties()
        {
        }

        private ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties(ConfigNodePropertyInteger LargeIndexCriticalThreshold, ConfigNodePropertyInteger LargeIndexWarnThreshold, ConfigNodePropertyArray HcTags)
        {
            
            this.LargeIndexCriticalThreshold = LargeIndexCriticalThreshold;
            
            this.LargeIndexWarnThreshold = LargeIndexWarnThreshold;
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesBuilder With()
        {
            return Builder()
                .LargeIndexCriticalThreshold(LargeIndexCriticalThreshold)
                .LargeIndexWarnThreshold(LargeIndexWarnThreshold)
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

        public bool Equals(ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties left, ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties left, ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyInteger _LargeIndexCriticalThreshold;
            private ConfigNodePropertyInteger _LargeIndexWarnThreshold;
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.LargeIndexCriticalThreshold property.
            /// </summary>
            /// <param name="value">LargeIndexCriticalThreshold</param>
            public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesBuilder LargeIndexCriticalThreshold(ConfigNodePropertyInteger value)
            {
                _LargeIndexCriticalThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.LargeIndexWarnThreshold property.
            /// </summary>
            /// <param name="value">LargeIndexWarnThreshold</param>
            public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesBuilder LargeIndexWarnThreshold(ConfigNodePropertyInteger value)
            {
                _LargeIndexWarnThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties</returns>
            public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties(
                    LargeIndexCriticalThreshold: _LargeIndexCriticalThreshold,
                    LargeIndexWarnThreshold: _LargeIndexWarnThreshold,
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}