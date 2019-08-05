using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties
    /// </summary>
    public sealed class ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties:  IEquatable<ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties>
    { 
        /// <summary>
        /// CqSocialConsoleAnalyticsSitesMapping
        /// </summary>
        public ConfigNodePropertyArray CqSocialConsoleAnalyticsSitesMapping { get; private set; }

        /// <summary>
        /// Priority
        /// </summary>
        public ConfigNodePropertyInteger Priority { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties()
        {
        }

        private ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties(ConfigNodePropertyArray CqSocialConsoleAnalyticsSitesMapping, ConfigNodePropertyInteger Priority)
        {
            
            this.CqSocialConsoleAnalyticsSitesMapping = CqSocialConsoleAnalyticsSitesMapping;
            
            this.Priority = Priority;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPropertiesBuilder</returns>
        public static ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPropertiesBuilder</returns>
        public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPropertiesBuilder With()
        {
            return Builder()
                .CqSocialConsoleAnalyticsSitesMapping(CqSocialConsoleAnalyticsSitesMapping)
                .Priority(Priority);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties left, ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties left, ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqSocialConsoleAnalyticsSitesMapping;
            private ConfigNodePropertyInteger _Priority;

            internal ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties.CqSocialConsoleAnalyticsSitesMapping property.
            /// </summary>
            /// <param name="value">CqSocialConsoleAnalyticsSitesMapping</param>
            public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPropertiesBuilder CqSocialConsoleAnalyticsSitesMapping(ConfigNodePropertyArray value)
            {
                _CqSocialConsoleAnalyticsSitesMapping = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties.Priority property.
            /// </summary>
            /// <param name="value">Priority</param>
            public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPropertiesBuilder Priority(ConfigNodePropertyInteger value)
            {
                _Priority = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties</returns>
            public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties(
                    CqSocialConsoleAnalyticsSitesMapping: _CqSocialConsoleAnalyticsSitesMapping,
                    Priority: _Priority
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}