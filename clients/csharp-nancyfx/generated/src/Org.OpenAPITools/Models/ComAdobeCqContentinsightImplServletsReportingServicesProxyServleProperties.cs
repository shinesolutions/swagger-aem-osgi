using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties
    /// </summary>
    public sealed class ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties:  IEquatable<ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties>
    { 
        /// <summary>
        /// ReportingservicesProxyWhitelist
        /// </summary>
        public ConfigNodePropertyArray ReportingservicesProxyWhitelist { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties()
        {
        }

        private ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties(ConfigNodePropertyArray ReportingservicesProxyWhitelist)
        {
            
            this.ReportingservicesProxyWhitelist = ReportingservicesProxyWhitelist;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties.
        /// </summary>
        /// <returns>ComAdobeCqContentinsightImplServletsReportingServicesProxyServlePropertiesBuilder</returns>
        public static ComAdobeCqContentinsightImplServletsReportingServicesProxyServlePropertiesBuilder Builder()
        {
            return new ComAdobeCqContentinsightImplServletsReportingServicesProxyServlePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqContentinsightImplServletsReportingServicesProxyServlePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqContentinsightImplServletsReportingServicesProxyServlePropertiesBuilder</returns>
        public ComAdobeCqContentinsightImplServletsReportingServicesProxyServlePropertiesBuilder With()
        {
            return Builder()
                .ReportingservicesProxyWhitelist(ReportingservicesProxyWhitelist);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties</param>
        /// <param name="right">Compared (ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties left, ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties</param>
        /// <param name="right">Compared (ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties left, ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties.
        /// </summary>
        public sealed class ComAdobeCqContentinsightImplServletsReportingServicesProxyServlePropertiesBuilder
        {
            private ConfigNodePropertyArray _ReportingservicesProxyWhitelist;

            internal ComAdobeCqContentinsightImplServletsReportingServicesProxyServlePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties.ReportingservicesProxyWhitelist property.
            /// </summary>
            /// <param name="value">ReportingservicesProxyWhitelist</param>
            public ComAdobeCqContentinsightImplServletsReportingServicesProxyServlePropertiesBuilder ReportingservicesProxyWhitelist(ConfigNodePropertyArray value)
            {
                _ReportingservicesProxyWhitelist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties.
            /// </summary>
            /// <returns>ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties</returns>
            public ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties Build()
            {
                Validate();
                return new ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties(
                    ReportingservicesProxyWhitelist: _ReportingservicesProxyWhitelist
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}