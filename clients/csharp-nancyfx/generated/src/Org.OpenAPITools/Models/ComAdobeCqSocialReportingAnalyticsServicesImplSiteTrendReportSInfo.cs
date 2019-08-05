using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo
    /// </summary>
    public sealed class ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo:  IEquatable<ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo>
    { 
        /// <summary>
        /// Pid
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo()
        {
        }

        private ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo(string Pid, string Title, string Description, ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfoBuilder</returns>
        public static ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfoBuilder Builder()
        {
            return new ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfoBuilder</returns>
        public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo left, ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo left, ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties _Properties;

            internal ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfoBuilder Properties(ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo</returns>
            public ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}