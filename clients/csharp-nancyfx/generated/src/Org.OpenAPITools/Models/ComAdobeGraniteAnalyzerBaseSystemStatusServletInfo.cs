using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo
    /// </summary>
    public sealed class ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo:  IEquatable<ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo>
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
        public ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties Properties { get; private set; }

        /// <summary>
        /// BundleLocation
        /// </summary>
        public string BundleLocation { get; private set; }

        /// <summary>
        /// ServiceLocation
        /// </summary>
        public string ServiceLocation { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo()
        {
        }

        private ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo(string Pid, string Title, string Description, ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAnalyzerBaseSystemStatusServletInfoBuilder</returns>
        public static ComAdobeGraniteAnalyzerBaseSystemStatusServletInfoBuilder Builder()
        {
            return new ComAdobeGraniteAnalyzerBaseSystemStatusServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAnalyzerBaseSystemStatusServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAnalyzerBaseSystemStatusServletInfoBuilder</returns>
        public ComAdobeGraniteAnalyzerBaseSystemStatusServletInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties)
                .BundleLocation(BundleLocation)
                .ServiceLocation(ServiceLocation);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo left, ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo left, ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAnalyzerBaseSystemStatusServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeGraniteAnalyzerBaseSystemStatusServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAnalyzerBaseSystemStatusServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAnalyzerBaseSystemStatusServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAnalyzerBaseSystemStatusServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAnalyzerBaseSystemStatusServletInfoBuilder Properties(ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeGraniteAnalyzerBaseSystemStatusServletInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeGraniteAnalyzerBaseSystemStatusServletInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo</returns>
            public ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties,
                    BundleLocation: _BundleLocation,
                    ServiceLocation: _ServiceLocation
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}