using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties:  IEquatable<ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties()
        {
        }

        private ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties(ConfigNodePropertyArray HcTags)
        {
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckPropertiesBuilder With()
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

        public bool Equals(ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties left, ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties left, ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties</returns>
            public ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties(
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}