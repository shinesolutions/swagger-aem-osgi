using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties:  IEquatable<ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties>
    { 
        /// <summary>
        /// JobTopics
        /// </summary>
        public ConfigNodePropertyString JobTopics { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties()
        {
        }

        private ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties(ConfigNodePropertyString JobTopics)
        {
            
            this.JobTopics = JobTopics;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumPropertiesBuilder</returns>
        public static ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumPropertiesBuilder</returns>
        public ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumPropertiesBuilder With()
        {
            return Builder()
                .JobTopics(JobTopics);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties left, ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties left, ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumPropertiesBuilder
        {
            private ConfigNodePropertyString _JobTopics;

            internal ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties.JobTopics property.
            /// </summary>
            /// <param name="value">JobTopics</param>
            public ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumPropertiesBuilder JobTopics(ConfigNodePropertyString value)
            {
                _JobTopics = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties</returns>
            public ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties(
                    JobTopics: _JobTopics
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}