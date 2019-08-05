using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo
    /// </summary>
    public sealed class ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo:  IEquatable<ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo>
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
        public ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo()
        {
        }

        private ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo(string Pid, string Title, string Description, ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo.
        /// </summary>
        /// <returns>ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfoBuilder</returns>
        public static ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfoBuilder Builder()
        {
            return new ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfoBuilder</returns>
        public ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfoBuilder With()
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

        public bool Equals(ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo</param>
        /// <param name="right">Compared (ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo left, ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo</param>
        /// <param name="right">Compared (ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo left, ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo.
        /// </summary>
        public sealed class ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties _Properties;

            internal ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfoBuilder Properties(ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo.
            /// </summary>
            /// <returns>ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo</returns>
            public ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo Build()
            {
                Validate();
                return new ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo(
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