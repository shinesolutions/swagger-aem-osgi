using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties
    /// </summary>
    public sealed class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties:  IEquatable<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties>
    { 
        /// <summary>
        /// CqSocialReportingAnalyticsPollingImporterInterval
        /// </summary>
        public ConfigNodePropertyInteger CqSocialReportingAnalyticsPollingImporterInterval { get; private set; }

        /// <summary>
        /// CqSocialReportingAnalyticsPollingImporterPageSize
        /// </summary>
        public ConfigNodePropertyInteger CqSocialReportingAnalyticsPollingImporterPageSize { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties()
        {
        }

        private ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties(ConfigNodePropertyInteger CqSocialReportingAnalyticsPollingImporterInterval, ConfigNodePropertyInteger CqSocialReportingAnalyticsPollingImporterPageSize)
        {
            
            this.CqSocialReportingAnalyticsPollingImporterInterval = CqSocialReportingAnalyticsPollingImporterInterval;
            
            this.CqSocialReportingAnalyticsPollingImporterPageSize = CqSocialReportingAnalyticsPollingImporterPageSize;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPropertiesBuilder</returns>
        public static ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPropertiesBuilder</returns>
        public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPropertiesBuilder With()
        {
            return Builder()
                .CqSocialReportingAnalyticsPollingImporterInterval(CqSocialReportingAnalyticsPollingImporterInterval)
                .CqSocialReportingAnalyticsPollingImporterPageSize(CqSocialReportingAnalyticsPollingImporterPageSize);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties left, ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties left, ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPropertiesBuilder
        {
            private ConfigNodePropertyInteger _CqSocialReportingAnalyticsPollingImporterInterval;
            private ConfigNodePropertyInteger _CqSocialReportingAnalyticsPollingImporterPageSize;

            internal ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.CqSocialReportingAnalyticsPollingImporterInterval property.
            /// </summary>
            /// <param name="value">CqSocialReportingAnalyticsPollingImporterInterval</param>
            public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPropertiesBuilder CqSocialReportingAnalyticsPollingImporterInterval(ConfigNodePropertyInteger value)
            {
                _CqSocialReportingAnalyticsPollingImporterInterval = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.CqSocialReportingAnalyticsPollingImporterPageSize property.
            /// </summary>
            /// <param name="value">CqSocialReportingAnalyticsPollingImporterPageSize</param>
            public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPropertiesBuilder CqSocialReportingAnalyticsPollingImporterPageSize(ConfigNodePropertyInteger value)
            {
                _CqSocialReportingAnalyticsPollingImporterPageSize = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties</returns>
            public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties(
                    CqSocialReportingAnalyticsPollingImporterInterval: _CqSocialReportingAnalyticsPollingImporterInterval,
                    CqSocialReportingAnalyticsPollingImporterPageSize: _CqSocialReportingAnalyticsPollingImporterPageSize
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}