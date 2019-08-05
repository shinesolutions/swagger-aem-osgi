using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo
    /// </summary>
    public sealed class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo:  IEquatable<ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo>
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
        public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties Properties { get; private set; }

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
        /// Use ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo()
        {
        }

        private ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo(string Pid, string Title, string Description, ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfoBuilder</returns>
        public static ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfoBuilder Builder()
        {
            return new ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfoBuilder</returns>
        public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo left, ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo left, ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo.
        /// </summary>
        public sealed class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfoBuilder Properties(ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo</returns>
            public ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo Build()
            {
                Validate();
                return new ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo(
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