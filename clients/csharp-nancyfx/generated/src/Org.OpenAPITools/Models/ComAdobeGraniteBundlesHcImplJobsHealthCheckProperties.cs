using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties:  IEquatable<ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }

        /// <summary>
        /// MaxQueuedJobs
        /// </summary>
        public ConfigNodePropertyInteger MaxQueuedJobs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties()
        {
        }

        private ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties(ConfigNodePropertyArray HcTags, ConfigNodePropertyInteger MaxQueuedJobs)
        {
            
            this.HcTags = HcTags;
            
            this.MaxQueuedJobs = MaxQueuedJobs;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesBuilder With()
        {
            return Builder()
                .HcTags(HcTags)
                .MaxQueuedJobs(MaxQueuedJobs);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties left, ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties left, ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;
            private ConfigNodePropertyInteger _MaxQueuedJobs;

            internal ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties.MaxQueuedJobs property.
            /// </summary>
            /// <param name="value">MaxQueuedJobs</param>
            public ComAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesBuilder MaxQueuedJobs(ConfigNodePropertyInteger value)
            {
                _MaxQueuedJobs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties</returns>
            public ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties(
                    HcTags: _HcTags,
                    MaxQueuedJobs: _MaxQueuedJobs
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}