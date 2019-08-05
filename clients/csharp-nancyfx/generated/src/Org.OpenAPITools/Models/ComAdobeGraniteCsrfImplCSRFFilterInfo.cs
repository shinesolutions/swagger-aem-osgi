using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteCsrfImplCSRFFilterInfo
    /// </summary>
    public sealed class ComAdobeGraniteCsrfImplCSRFFilterInfo:  IEquatable<ComAdobeGraniteCsrfImplCSRFFilterInfo>
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
        public ComAdobeGraniteCsrfImplCSRFFilterProperties Properties { get; private set; }

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
        /// Use ComAdobeGraniteCsrfImplCSRFFilterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteCsrfImplCSRFFilterInfo()
        {
        }

        private ComAdobeGraniteCsrfImplCSRFFilterInfo(string Pid, string Title, string Description, ComAdobeGraniteCsrfImplCSRFFilterProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteCsrfImplCSRFFilterInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteCsrfImplCSRFFilterInfoBuilder</returns>
        public static ComAdobeGraniteCsrfImplCSRFFilterInfoBuilder Builder()
        {
            return new ComAdobeGraniteCsrfImplCSRFFilterInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteCsrfImplCSRFFilterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteCsrfImplCSRFFilterInfoBuilder</returns>
        public ComAdobeGraniteCsrfImplCSRFFilterInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteCsrfImplCSRFFilterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteCsrfImplCSRFFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCsrfImplCSRFFilterInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteCsrfImplCSRFFilterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteCsrfImplCSRFFilterInfo left, ComAdobeGraniteCsrfImplCSRFFilterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteCsrfImplCSRFFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCsrfImplCSRFFilterInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteCsrfImplCSRFFilterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteCsrfImplCSRFFilterInfo left, ComAdobeGraniteCsrfImplCSRFFilterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteCsrfImplCSRFFilterInfo.
        /// </summary>
        public sealed class ComAdobeGraniteCsrfImplCSRFFilterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteCsrfImplCSRFFilterProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeGraniteCsrfImplCSRFFilterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCsrfImplCSRFFilterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteCsrfImplCSRFFilterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCsrfImplCSRFFilterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteCsrfImplCSRFFilterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCsrfImplCSRFFilterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteCsrfImplCSRFFilterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCsrfImplCSRFFilterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteCsrfImplCSRFFilterInfoBuilder Properties(ComAdobeGraniteCsrfImplCSRFFilterProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCsrfImplCSRFFilterInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeGraniteCsrfImplCSRFFilterInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCsrfImplCSRFFilterInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeGraniteCsrfImplCSRFFilterInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteCsrfImplCSRFFilterInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteCsrfImplCSRFFilterInfo</returns>
            public ComAdobeGraniteCsrfImplCSRFFilterInfo Build()
            {
                Validate();
                return new ComAdobeGraniteCsrfImplCSRFFilterInfo(
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