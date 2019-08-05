using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties:  IEquatable<ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties>
    { 
        /// <summary>
        /// IndexingCriticalThreshold
        /// </summary>
        public ConfigNodePropertyInteger IndexingCriticalThreshold { get; private set; }

        /// <summary>
        /// IndexingWarnThreshold
        /// </summary>
        public ConfigNodePropertyInteger IndexingWarnThreshold { get; private set; }

        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties()
        {
        }

        private ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties(ConfigNodePropertyInteger IndexingCriticalThreshold, ConfigNodePropertyInteger IndexingWarnThreshold, ConfigNodePropertyArray HcTags)
        {
            
            this.IndexingCriticalThreshold = IndexingCriticalThreshold;
            
            this.IndexingWarnThreshold = IndexingWarnThreshold;
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesBuilder With()
        {
            return Builder()
                .IndexingCriticalThreshold(IndexingCriticalThreshold)
                .IndexingWarnThreshold(IndexingWarnThreshold)
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

        public bool Equals(ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties left, ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties left, ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyInteger _IndexingCriticalThreshold;
            private ConfigNodePropertyInteger _IndexingWarnThreshold;
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.IndexingCriticalThreshold property.
            /// </summary>
            /// <param name="value">IndexingCriticalThreshold</param>
            public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesBuilder IndexingCriticalThreshold(ConfigNodePropertyInteger value)
            {
                _IndexingCriticalThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.IndexingWarnThreshold property.
            /// </summary>
            /// <param name="value">IndexingWarnThreshold</param>
            public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesBuilder IndexingWarnThreshold(ConfigNodePropertyInteger value)
            {
                _IndexingWarnThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties</returns>
            public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties(
                    IndexingCriticalThreshold: _IndexingCriticalThreshold,
                    IndexingWarnThreshold: _IndexingWarnThreshold,
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}