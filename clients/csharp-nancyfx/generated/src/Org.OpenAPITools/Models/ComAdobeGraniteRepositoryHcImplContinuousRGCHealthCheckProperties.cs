using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties:  IEquatable<ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties()
        {
        }

        private ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties(ConfigNodePropertyArray HcTags)
        {
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckPropertiesBuilder With()
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

        public bool Equals(ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties left, ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties left, ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties</returns>
            public ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties(
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}