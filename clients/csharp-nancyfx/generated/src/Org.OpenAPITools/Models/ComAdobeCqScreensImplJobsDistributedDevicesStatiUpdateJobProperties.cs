using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties
    /// </summary>
    public sealed class ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties:  IEquatable<ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties>
    { 
        /// <summary>
        /// SchedulerExpression
        /// </summary>
        public ConfigNodePropertyString SchedulerExpression { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties()
        {
        }

        private ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties(ConfigNodePropertyString SchedulerExpression)
        {
            
            this.SchedulerExpression = SchedulerExpression;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties.
        /// </summary>
        /// <returns>ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobPropertiesBuilder</returns>
        public static ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobPropertiesBuilder Builder()
        {
            return new ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobPropertiesBuilder</returns>
        public ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobPropertiesBuilder With()
        {
            return Builder()
                .SchedulerExpression(SchedulerExpression);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties left, ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties left, ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties.
        /// </summary>
        public sealed class ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobPropertiesBuilder
        {
            private ConfigNodePropertyString _SchedulerExpression;

            internal ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties.SchedulerExpression property.
            /// </summary>
            /// <param name="value">SchedulerExpression</param>
            public ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobPropertiesBuilder SchedulerExpression(ConfigNodePropertyString value)
            {
                _SchedulerExpression = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties.
            /// </summary>
            /// <returns>ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties</returns>
            public ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties Build()
            {
                Validate();
                return new ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties(
                    SchedulerExpression: _SchedulerExpression
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}