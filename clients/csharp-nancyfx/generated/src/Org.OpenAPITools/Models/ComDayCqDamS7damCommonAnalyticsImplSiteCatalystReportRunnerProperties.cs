using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties
    /// </summary>
    public sealed class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties:  IEquatable<ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties>
    { 
        /// <summary>
        /// SchedulerExpression
        /// </summary>
        public ConfigNodePropertyString SchedulerExpression { get; private set; }

        /// <summary>
        /// SchedulerConcurrent
        /// </summary>
        public ConfigNodePropertyBoolean SchedulerConcurrent { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties()
        {
        }

        private ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties(ConfigNodePropertyString SchedulerExpression, ConfigNodePropertyBoolean SchedulerConcurrent)
        {
            
            this.SchedulerExpression = SchedulerExpression;
            
            this.SchedulerConcurrent = SchedulerConcurrent;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerPropertiesBuilder</returns>
        public static ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerPropertiesBuilder Builder()
        {
            return new ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerPropertiesBuilder</returns>
        public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerPropertiesBuilder With()
        {
            return Builder()
                .SchedulerExpression(SchedulerExpression)
                .SchedulerConcurrent(SchedulerConcurrent);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties left, ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties left, ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.
        /// </summary>
        public sealed class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerPropertiesBuilder
        {
            private ConfigNodePropertyString _SchedulerExpression;
            private ConfigNodePropertyBoolean _SchedulerConcurrent;

            internal ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.SchedulerExpression property.
            /// </summary>
            /// <param name="value">SchedulerExpression</param>
            public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerPropertiesBuilder SchedulerExpression(ConfigNodePropertyString value)
            {
                _SchedulerExpression = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.SchedulerConcurrent property.
            /// </summary>
            /// <param name="value">SchedulerConcurrent</param>
            public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerPropertiesBuilder SchedulerConcurrent(ConfigNodePropertyBoolean value)
            {
                _SchedulerConcurrent = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.
            /// </summary>
            /// <returns>ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties</returns>
            public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties Build()
            {
                Validate();
                return new ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties(
                    SchedulerExpression: _SchedulerExpression,
                    SchedulerConcurrent: _SchedulerConcurrent
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}