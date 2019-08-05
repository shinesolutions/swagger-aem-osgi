using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties:  IEquatable<ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties>
    { 
        /// <summary>
        /// SchedulerExpression
        /// </summary>
        public ConfigNodePropertyString SchedulerExpression { get; private set; }

        /// <summary>
        /// JmxObjectname
        /// </summary>
        public ConfigNodePropertyString JmxObjectname { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties()
        {
        }

        private ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties(ConfigNodePropertyString SchedulerExpression, ConfigNodePropertyString JmxObjectname)
        {
            
            this.SchedulerExpression = SchedulerExpression;
            
            this.JmxObjectname = JmxObjectname;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertiesBuilder</returns>
        public static ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertiesBuilder</returns>
        public ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertiesBuilder With()
        {
            return Builder()
                .SchedulerExpression(SchedulerExpression)
                .JmxObjectname(JmxObjectname);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties left, ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties left, ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertiesBuilder
        {
            private ConfigNodePropertyString _SchedulerExpression;
            private ConfigNodePropertyString _JmxObjectname;

            internal ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties.SchedulerExpression property.
            /// </summary>
            /// <param name="value">SchedulerExpression</param>
            public ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertiesBuilder SchedulerExpression(ConfigNodePropertyString value)
            {
                _SchedulerExpression = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties.JmxObjectname property.
            /// </summary>
            /// <param name="value">JmxObjectname</param>
            public ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertiesBuilder JmxObjectname(ConfigNodePropertyString value)
            {
                _JmxObjectname = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties</returns>
            public ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties(
                    SchedulerExpression: _SchedulerExpression,
                    JmxObjectname: _JmxObjectname
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}