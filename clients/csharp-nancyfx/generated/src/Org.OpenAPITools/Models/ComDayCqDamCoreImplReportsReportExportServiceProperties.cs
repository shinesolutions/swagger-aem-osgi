using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplReportsReportExportServiceProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplReportsReportExportServiceProperties:  IEquatable<ComDayCqDamCoreImplReportsReportExportServiceProperties>
    { 
        /// <summary>
        /// QueryBatchSize
        /// </summary>
        public ConfigNodePropertyInteger QueryBatchSize { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplReportsReportExportServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplReportsReportExportServiceProperties()
        {
        }

        private ComDayCqDamCoreImplReportsReportExportServiceProperties(ConfigNodePropertyInteger QueryBatchSize)
        {
            
            this.QueryBatchSize = QueryBatchSize;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplReportsReportExportServiceProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplReportsReportExportServicePropertiesBuilder</returns>
        public static ComDayCqDamCoreImplReportsReportExportServicePropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplReportsReportExportServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplReportsReportExportServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplReportsReportExportServicePropertiesBuilder</returns>
        public ComDayCqDamCoreImplReportsReportExportServicePropertiesBuilder With()
        {
            return Builder()
                .QueryBatchSize(QueryBatchSize);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplReportsReportExportServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplReportsReportExportServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplReportsReportExportServiceProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplReportsReportExportServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplReportsReportExportServiceProperties left, ComDayCqDamCoreImplReportsReportExportServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplReportsReportExportServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplReportsReportExportServiceProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplReportsReportExportServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplReportsReportExportServiceProperties left, ComDayCqDamCoreImplReportsReportExportServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplReportsReportExportServiceProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplReportsReportExportServicePropertiesBuilder
        {
            private ConfigNodePropertyInteger _QueryBatchSize;

            internal ComDayCqDamCoreImplReportsReportExportServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplReportsReportExportServiceProperties.QueryBatchSize property.
            /// </summary>
            /// <param name="value">QueryBatchSize</param>
            public ComDayCqDamCoreImplReportsReportExportServicePropertiesBuilder QueryBatchSize(ConfigNodePropertyInteger value)
            {
                _QueryBatchSize = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplReportsReportExportServiceProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplReportsReportExportServiceProperties</returns>
            public ComDayCqDamCoreImplReportsReportExportServiceProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplReportsReportExportServiceProperties(
                    QueryBatchSize: _QueryBatchSize
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}