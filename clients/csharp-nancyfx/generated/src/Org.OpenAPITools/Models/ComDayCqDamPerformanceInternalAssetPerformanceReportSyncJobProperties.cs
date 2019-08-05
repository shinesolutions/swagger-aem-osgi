using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties
    /// </summary>
    public sealed class ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties:  IEquatable<ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties>
    { 
        /// <summary>
        /// SchedulerExpression
        /// </summary>
        public ConfigNodePropertyString SchedulerExpression { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties()
        {
        }

        private ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties(ConfigNodePropertyString SchedulerExpression)
        {
            
            this.SchedulerExpression = SchedulerExpression;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties.
        /// </summary>
        /// <returns>ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobPropertiesBuilder</returns>
        public static ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobPropertiesBuilder Builder()
        {
            return new ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobPropertiesBuilder</returns>
        public ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobPropertiesBuilder With()
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

        public bool Equals(ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties</param>
        /// <param name="right">Compared (ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties left, ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties</param>
        /// <param name="right">Compared (ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties left, ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties.
        /// </summary>
        public sealed class ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobPropertiesBuilder
        {
            private ConfigNodePropertyString _SchedulerExpression;

            internal ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties.SchedulerExpression property.
            /// </summary>
            /// <param name="value">SchedulerExpression</param>
            public ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobPropertiesBuilder SchedulerExpression(ConfigNodePropertyString value)
            {
                _SchedulerExpression = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties.
            /// </summary>
            /// <returns>ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties</returns>
            public ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties Build()
            {
                Validate();
                return new ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties(
                    SchedulerExpression: _SchedulerExpression
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}