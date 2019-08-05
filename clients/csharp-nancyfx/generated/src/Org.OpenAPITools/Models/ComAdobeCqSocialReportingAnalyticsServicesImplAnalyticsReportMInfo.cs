using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo
    /// </summary>
    public sealed class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo:  IEquatable<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo>
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
        public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo()
        {
        }

        private ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo(string Pid, string Title, string Description, ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfoBuilder</returns>
        public static ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfoBuilder Builder()
        {
            return new ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfoBuilder</returns>
        public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo left, ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo left, ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties _Properties;

            internal ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfoBuilder Properties(ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo</returns>
            public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo(
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