using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplReportsReportPurgeServiceProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplReportsReportPurgeServiceProperties:  IEquatable<ComDayCqDamCoreImplReportsReportPurgeServiceProperties>
    { 
        /// <summary>
        /// SchedulerExpression
        /// </summary>
        public ConfigNodePropertyString SchedulerExpression { get; private set; }

        /// <summary>
        /// MaxSavedReports
        /// </summary>
        public ConfigNodePropertyInteger MaxSavedReports { get; private set; }

        /// <summary>
        /// TimeDuration
        /// </summary>
        public ConfigNodePropertyInteger TimeDuration { get; private set; }

        /// <summary>
        /// EnableReportPurge
        /// </summary>
        public ConfigNodePropertyBoolean EnableReportPurge { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplReportsReportPurgeServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplReportsReportPurgeServiceProperties()
        {
        }

        private ComDayCqDamCoreImplReportsReportPurgeServiceProperties(ConfigNodePropertyString SchedulerExpression, ConfigNodePropertyInteger MaxSavedReports, ConfigNodePropertyInteger TimeDuration, ConfigNodePropertyBoolean EnableReportPurge)
        {
            
            this.SchedulerExpression = SchedulerExpression;
            
            this.MaxSavedReports = MaxSavedReports;
            
            this.TimeDuration = TimeDuration;
            
            this.EnableReportPurge = EnableReportPurge;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplReportsReportPurgeServiceProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplReportsReportPurgeServicePropertiesBuilder</returns>
        public static ComDayCqDamCoreImplReportsReportPurgeServicePropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplReportsReportPurgeServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplReportsReportPurgeServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplReportsReportPurgeServicePropertiesBuilder</returns>
        public ComDayCqDamCoreImplReportsReportPurgeServicePropertiesBuilder With()
        {
            return Builder()
                .SchedulerExpression(SchedulerExpression)
                .MaxSavedReports(MaxSavedReports)
                .TimeDuration(TimeDuration)
                .EnableReportPurge(EnableReportPurge);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplReportsReportPurgeServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplReportsReportPurgeServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplReportsReportPurgeServiceProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplReportsReportPurgeServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplReportsReportPurgeServiceProperties left, ComDayCqDamCoreImplReportsReportPurgeServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplReportsReportPurgeServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplReportsReportPurgeServiceProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplReportsReportPurgeServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplReportsReportPurgeServiceProperties left, ComDayCqDamCoreImplReportsReportPurgeServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplReportsReportPurgeServiceProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplReportsReportPurgeServicePropertiesBuilder
        {
            private ConfigNodePropertyString _SchedulerExpression;
            private ConfigNodePropertyInteger _MaxSavedReports;
            private ConfigNodePropertyInteger _TimeDuration;
            private ConfigNodePropertyBoolean _EnableReportPurge;

            internal ComDayCqDamCoreImplReportsReportPurgeServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplReportsReportPurgeServiceProperties.SchedulerExpression property.
            /// </summary>
            /// <param name="value">SchedulerExpression</param>
            public ComDayCqDamCoreImplReportsReportPurgeServicePropertiesBuilder SchedulerExpression(ConfigNodePropertyString value)
            {
                _SchedulerExpression = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplReportsReportPurgeServiceProperties.MaxSavedReports property.
            /// </summary>
            /// <param name="value">MaxSavedReports</param>
            public ComDayCqDamCoreImplReportsReportPurgeServicePropertiesBuilder MaxSavedReports(ConfigNodePropertyInteger value)
            {
                _MaxSavedReports = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplReportsReportPurgeServiceProperties.TimeDuration property.
            /// </summary>
            /// <param name="value">TimeDuration</param>
            public ComDayCqDamCoreImplReportsReportPurgeServicePropertiesBuilder TimeDuration(ConfigNodePropertyInteger value)
            {
                _TimeDuration = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplReportsReportPurgeServiceProperties.EnableReportPurge property.
            /// </summary>
            /// <param name="value">EnableReportPurge</param>
            public ComDayCqDamCoreImplReportsReportPurgeServicePropertiesBuilder EnableReportPurge(ConfigNodePropertyBoolean value)
            {
                _EnableReportPurge = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplReportsReportPurgeServiceProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplReportsReportPurgeServiceProperties</returns>
            public ComDayCqDamCoreImplReportsReportPurgeServiceProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplReportsReportPurgeServiceProperties(
                    SchedulerExpression: _SchedulerExpression,
                    MaxSavedReports: _MaxSavedReports,
                    TimeDuration: _TimeDuration,
                    EnableReportPurge: _EnableReportPurge
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}