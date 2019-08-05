using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties
    /// </summary>
    public sealed class ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties:  IEquatable<ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties>
    { 
        /// <summary>
        /// ReportFetchAttempts
        /// </summary>
        public ConfigNodePropertyInteger ReportFetchAttempts { get; private set; }

        /// <summary>
        /// ReportFetchDelay
        /// </summary>
        public ConfigNodePropertyInteger ReportFetchDelay { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties()
        {
        }

        private ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties(ConfigNodePropertyInteger ReportFetchAttempts, ConfigNodePropertyInteger ReportFetchDelay)
        {
            
            this.ReportFetchAttempts = ReportFetchAttempts;
            
            this.ReportFetchDelay = ReportFetchDelay;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsSitecatalystImplImporterReportImporterPropertiesBuilder</returns>
        public static ComDayCqAnalyticsSitecatalystImplImporterReportImporterPropertiesBuilder Builder()
        {
            return new ComDayCqAnalyticsSitecatalystImplImporterReportImporterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsSitecatalystImplImporterReportImporterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsSitecatalystImplImporterReportImporterPropertiesBuilder</returns>
        public ComDayCqAnalyticsSitecatalystImplImporterReportImporterPropertiesBuilder With()
        {
            return Builder()
                .ReportFetchAttempts(ReportFetchAttempts)
                .ReportFetchDelay(ReportFetchDelay);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties left, ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties left, ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties.
        /// </summary>
        public sealed class ComDayCqAnalyticsSitecatalystImplImporterReportImporterPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ReportFetchAttempts;
            private ConfigNodePropertyInteger _ReportFetchDelay;

            internal ComDayCqAnalyticsSitecatalystImplImporterReportImporterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties.ReportFetchAttempts property.
            /// </summary>
            /// <param name="value">ReportFetchAttempts</param>
            public ComDayCqAnalyticsSitecatalystImplImporterReportImporterPropertiesBuilder ReportFetchAttempts(ConfigNodePropertyInteger value)
            {
                _ReportFetchAttempts = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties.ReportFetchDelay property.
            /// </summary>
            /// <param name="value">ReportFetchDelay</param>
            public ComDayCqAnalyticsSitecatalystImplImporterReportImporterPropertiesBuilder ReportFetchDelay(ConfigNodePropertyInteger value)
            {
                _ReportFetchDelay = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties.
            /// </summary>
            /// <returns>ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties</returns>
            public ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties Build()
            {
                Validate();
                return new ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties(
                    ReportFetchAttempts: _ReportFetchAttempts,
                    ReportFetchDelay: _ReportFetchDelay
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}