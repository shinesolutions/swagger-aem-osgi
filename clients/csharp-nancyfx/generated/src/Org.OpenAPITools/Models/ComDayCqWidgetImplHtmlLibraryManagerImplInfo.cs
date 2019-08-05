using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWidgetImplHtmlLibraryManagerImplInfo
    /// </summary>
    public sealed class ComDayCqWidgetImplHtmlLibraryManagerImplInfo:  IEquatable<ComDayCqWidgetImplHtmlLibraryManagerImplInfo>
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
        public ComDayCqWidgetImplHtmlLibraryManagerImplProperties Properties { get; private set; }

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
        /// Use ComDayCqWidgetImplHtmlLibraryManagerImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWidgetImplHtmlLibraryManagerImplInfo()
        {
        }

        private ComDayCqWidgetImplHtmlLibraryManagerImplInfo(string Pid, string Title, string Description, ComDayCqWidgetImplHtmlLibraryManagerImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWidgetImplHtmlLibraryManagerImplInfo.
        /// </summary>
        /// <returns>ComDayCqWidgetImplHtmlLibraryManagerImplInfoBuilder</returns>
        public static ComDayCqWidgetImplHtmlLibraryManagerImplInfoBuilder Builder()
        {
            return new ComDayCqWidgetImplHtmlLibraryManagerImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWidgetImplHtmlLibraryManagerImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWidgetImplHtmlLibraryManagerImplInfoBuilder</returns>
        public ComDayCqWidgetImplHtmlLibraryManagerImplInfoBuilder With()
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

        public bool Equals(ComDayCqWidgetImplHtmlLibraryManagerImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWidgetImplHtmlLibraryManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWidgetImplHtmlLibraryManagerImplInfo</param>
        /// <param name="right">Compared (ComDayCqWidgetImplHtmlLibraryManagerImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWidgetImplHtmlLibraryManagerImplInfo left, ComDayCqWidgetImplHtmlLibraryManagerImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWidgetImplHtmlLibraryManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWidgetImplHtmlLibraryManagerImplInfo</param>
        /// <param name="right">Compared (ComDayCqWidgetImplHtmlLibraryManagerImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWidgetImplHtmlLibraryManagerImplInfo left, ComDayCqWidgetImplHtmlLibraryManagerImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWidgetImplHtmlLibraryManagerImplInfo.
        /// </summary>
        public sealed class ComDayCqWidgetImplHtmlLibraryManagerImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWidgetImplHtmlLibraryManagerImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqWidgetImplHtmlLibraryManagerImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplHtmlLibraryManagerImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWidgetImplHtmlLibraryManagerImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplHtmlLibraryManagerImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWidgetImplHtmlLibraryManagerImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplHtmlLibraryManagerImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWidgetImplHtmlLibraryManagerImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplHtmlLibraryManagerImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWidgetImplHtmlLibraryManagerImplInfoBuilder Properties(ComDayCqWidgetImplHtmlLibraryManagerImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplHtmlLibraryManagerImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqWidgetImplHtmlLibraryManagerImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplHtmlLibraryManagerImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqWidgetImplHtmlLibraryManagerImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWidgetImplHtmlLibraryManagerImplInfo.
            /// </summary>
            /// <returns>ComDayCqWidgetImplHtmlLibraryManagerImplInfo</returns>
            public ComDayCqWidgetImplHtmlLibraryManagerImplInfo Build()
            {
                Validate();
                return new ComDayCqWidgetImplHtmlLibraryManagerImplInfo(
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