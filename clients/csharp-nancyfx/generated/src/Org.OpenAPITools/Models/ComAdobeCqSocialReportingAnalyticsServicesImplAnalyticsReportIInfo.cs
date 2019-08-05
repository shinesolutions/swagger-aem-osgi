using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo
    /// </summary>
    public sealed class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo:  IEquatable<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo>
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
        public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo()
        {
        }

        private ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo(string Pid, string Title, string Description, ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfoBuilder</returns>
        public static ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfoBuilder Builder()
        {
            return new ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfoBuilder</returns>
        public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo left, ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo left, ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties _Properties;

            internal ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfoBuilder Properties(ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo</returns>
            public ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo(
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