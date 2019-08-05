using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties:  IEquatable<ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties>
    { 
        /// <summary>
        /// NumberOfRetriesAllowed
        /// </summary>
        public ConfigNodePropertyInteger NumberOfRetriesAllowed { get; private set; }

        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties()
        {
        }

        private ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties(ConfigNodePropertyInteger NumberOfRetriesAllowed, ConfigNodePropertyArray HcTags)
        {
            
            this.NumberOfRetriesAllowed = NumberOfRetriesAllowed;
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPropertiesBuilder With()
        {
            return Builder()
                .NumberOfRetriesAllowed(NumberOfRetriesAllowed)
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

        public bool Equals(ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties left, ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties left, ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyInteger _NumberOfRetriesAllowed;
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.NumberOfRetriesAllowed property.
            /// </summary>
            /// <param name="value">NumberOfRetriesAllowed</param>
            public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPropertiesBuilder NumberOfRetriesAllowed(ConfigNodePropertyInteger value)
            {
                _NumberOfRetriesAllowed = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties</returns>
            public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties(
                    NumberOfRetriesAllowed: _NumberOfRetriesAllowed,
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}