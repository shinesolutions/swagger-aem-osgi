using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties
    /// </summary>
    public sealed class ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties:  IEquatable<ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties>
    { 
        /// <summary>
        /// ReportingservicesUrl
        /// </summary>
        public ConfigNodePropertyString ReportingservicesUrl { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties()
        {
        }

        private ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties(ConfigNodePropertyString ReportingservicesUrl)
        {
            
            this.ReportingservicesUrl = ReportingservicesUrl;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties.
        /// </summary>
        /// <returns>ComAdobeCqContentinsightImplReportingServicesSettingsProviderPropertiesBuilder</returns>
        public static ComAdobeCqContentinsightImplReportingServicesSettingsProviderPropertiesBuilder Builder()
        {
            return new ComAdobeCqContentinsightImplReportingServicesSettingsProviderPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqContentinsightImplReportingServicesSettingsProviderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqContentinsightImplReportingServicesSettingsProviderPropertiesBuilder</returns>
        public ComAdobeCqContentinsightImplReportingServicesSettingsProviderPropertiesBuilder With()
        {
            return Builder()
                .ReportingservicesUrl(ReportingservicesUrl);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties</param>
        /// <param name="right">Compared (ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties left, ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties</param>
        /// <param name="right">Compared (ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties left, ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties.
        /// </summary>
        public sealed class ComAdobeCqContentinsightImplReportingServicesSettingsProviderPropertiesBuilder
        {
            private ConfigNodePropertyString _ReportingservicesUrl;

            internal ComAdobeCqContentinsightImplReportingServicesSettingsProviderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties.ReportingservicesUrl property.
            /// </summary>
            /// <param name="value">ReportingservicesUrl</param>
            public ComAdobeCqContentinsightImplReportingServicesSettingsProviderPropertiesBuilder ReportingservicesUrl(ConfigNodePropertyString value)
            {
                _ReportingservicesUrl = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties.
            /// </summary>
            /// <returns>ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties</returns>
            public ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties Build()
            {
                Validate();
                return new ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties(
                    ReportingservicesUrl: _ReportingservicesUrl
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}