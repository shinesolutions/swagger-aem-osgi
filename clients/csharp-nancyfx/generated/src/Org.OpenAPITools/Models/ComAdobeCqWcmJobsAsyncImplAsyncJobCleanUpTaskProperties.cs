using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties
    /// </summary>
    public sealed class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties:  IEquatable<ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties>
    { 
        /// <summary>
        /// SchedulerExpression
        /// </summary>
        public ConfigNodePropertyString SchedulerExpression { get; private set; }

        /// <summary>
        /// JobPurgeThreshold
        /// </summary>
        public ConfigNodePropertyInteger JobPurgeThreshold { get; private set; }

        /// <summary>
        /// JobPurgeMaxJobs
        /// </summary>
        public ConfigNodePropertyInteger JobPurgeMaxJobs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties()
        {
        }

        private ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties(ConfigNodePropertyString SchedulerExpression, ConfigNodePropertyInteger JobPurgeThreshold, ConfigNodePropertyInteger JobPurgeMaxJobs)
        {
            
            this.SchedulerExpression = SchedulerExpression;
            
            this.JobPurgeThreshold = JobPurgeThreshold;
            
            this.JobPurgeMaxJobs = JobPurgeMaxJobs;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.
        /// </summary>
        /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesBuilder</returns>
        public static ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesBuilder Builder()
        {
            return new ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesBuilder</returns>
        public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesBuilder With()
        {
            return Builder()
                .SchedulerExpression(SchedulerExpression)
                .JobPurgeThreshold(JobPurgeThreshold)
                .JobPurgeMaxJobs(JobPurgeMaxJobs);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties</param>
        /// <param name="right">Compared (ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties left, ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties</param>
        /// <param name="right">Compared (ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties left, ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.
        /// </summary>
        public sealed class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesBuilder
        {
            private ConfigNodePropertyString _SchedulerExpression;
            private ConfigNodePropertyInteger _JobPurgeThreshold;
            private ConfigNodePropertyInteger _JobPurgeMaxJobs;

            internal ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.SchedulerExpression property.
            /// </summary>
            /// <param name="value">SchedulerExpression</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesBuilder SchedulerExpression(ConfigNodePropertyString value)
            {
                _SchedulerExpression = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.JobPurgeThreshold property.
            /// </summary>
            /// <param name="value">JobPurgeThreshold</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesBuilder JobPurgeThreshold(ConfigNodePropertyInteger value)
            {
                _JobPurgeThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.JobPurgeMaxJobs property.
            /// </summary>
            /// <param name="value">JobPurgeMaxJobs</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesBuilder JobPurgeMaxJobs(ConfigNodePropertyInteger value)
            {
                _JobPurgeMaxJobs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.
            /// </summary>
            /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties</returns>
            public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties Build()
            {
                Validate();
                return new ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties(
                    SchedulerExpression: _SchedulerExpression,
                    JobPurgeThreshold: _JobPurgeThreshold,
                    JobPurgeMaxJobs: _JobPurgeMaxJobs
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}