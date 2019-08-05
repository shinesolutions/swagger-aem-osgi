using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties:  IEquatable<ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }

        /// <summary>
        /// DiskSpaceWarnThreshold
        /// </summary>
        public ConfigNodePropertyInteger DiskSpaceWarnThreshold { get; private set; }

        /// <summary>
        /// DiskSpaceErrorThreshold
        /// </summary>
        public ConfigNodePropertyInteger DiskSpaceErrorThreshold { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties()
        {
        }

        private ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties(ConfigNodePropertyArray HcTags, ConfigNodePropertyInteger DiskSpaceWarnThreshold, ConfigNodePropertyInteger DiskSpaceErrorThreshold)
        {
            
            this.HcTags = HcTags;
            
            this.DiskSpaceWarnThreshold = DiskSpaceWarnThreshold;
            
            this.DiskSpaceErrorThreshold = DiskSpaceErrorThreshold;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesBuilder With()
        {
            return Builder()
                .HcTags(HcTags)
                .DiskSpaceWarnThreshold(DiskSpaceWarnThreshold)
                .DiskSpaceErrorThreshold(DiskSpaceErrorThreshold);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties left, ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties left, ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;
            private ConfigNodePropertyInteger _DiskSpaceWarnThreshold;
            private ConfigNodePropertyInteger _DiskSpaceErrorThreshold;

            internal ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.DiskSpaceWarnThreshold property.
            /// </summary>
            /// <param name="value">DiskSpaceWarnThreshold</param>
            public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesBuilder DiskSpaceWarnThreshold(ConfigNodePropertyInteger value)
            {
                _DiskSpaceWarnThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.DiskSpaceErrorThreshold property.
            /// </summary>
            /// <param name="value">DiskSpaceErrorThreshold</param>
            public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesBuilder DiskSpaceErrorThreshold(ConfigNodePropertyInteger value)
            {
                _DiskSpaceErrorThreshold = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties</returns>
            public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties(
                    HcTags: _HcTags,
                    DiskSpaceWarnThreshold: _DiskSpaceWarnThreshold,
                    DiskSpaceErrorThreshold: _DiskSpaceErrorThreshold
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}