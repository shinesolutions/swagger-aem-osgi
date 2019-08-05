using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties
    /// </summary>
    public sealed class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties:  IEquatable<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties>
    { 
        /// <summary>
        /// ReportFetchDelay
        /// </summary>
        public ConfigNodePropertyInteger ReportFetchDelay { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties()
        {
        }

        private ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties(ConfigNodePropertyInteger ReportFetchDelay)
        {
            
            this.ReportFetchDelay = ReportFetchDelay;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMPropertiesBuilder</returns>
        public static ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMPropertiesBuilder</returns>
        public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMPropertiesBuilder With()
        {
            return Builder()
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

        public bool Equals(ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties left, ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties left, ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ReportFetchDelay;

            internal ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties.ReportFetchDelay property.
            /// </summary>
            /// <param name="value">ReportFetchDelay</param>
            public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMPropertiesBuilder ReportFetchDelay(ConfigNodePropertyInteger value)
            {
                _ReportFetchDelay = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties</returns>
            public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties(
                    ReportFetchDelay: _ReportFetchDelay
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}