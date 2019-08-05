using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWidgetImplWidgetExtensionProviderImplInfo
    /// </summary>
    public sealed class ComDayCqWidgetImplWidgetExtensionProviderImplInfo:  IEquatable<ComDayCqWidgetImplWidgetExtensionProviderImplInfo>
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
        public ComDayCqWidgetImplWidgetExtensionProviderImplProperties Properties { get; private set; }

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
        /// Use ComDayCqWidgetImplWidgetExtensionProviderImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWidgetImplWidgetExtensionProviderImplInfo()
        {
        }

        private ComDayCqWidgetImplWidgetExtensionProviderImplInfo(string Pid, string Title, string Description, ComDayCqWidgetImplWidgetExtensionProviderImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWidgetImplWidgetExtensionProviderImplInfo.
        /// </summary>
        /// <returns>ComDayCqWidgetImplWidgetExtensionProviderImplInfoBuilder</returns>
        public static ComDayCqWidgetImplWidgetExtensionProviderImplInfoBuilder Builder()
        {
            return new ComDayCqWidgetImplWidgetExtensionProviderImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWidgetImplWidgetExtensionProviderImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWidgetImplWidgetExtensionProviderImplInfoBuilder</returns>
        public ComDayCqWidgetImplWidgetExtensionProviderImplInfoBuilder With()
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

        public bool Equals(ComDayCqWidgetImplWidgetExtensionProviderImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWidgetImplWidgetExtensionProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWidgetImplWidgetExtensionProviderImplInfo</param>
        /// <param name="right">Compared (ComDayCqWidgetImplWidgetExtensionProviderImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWidgetImplWidgetExtensionProviderImplInfo left, ComDayCqWidgetImplWidgetExtensionProviderImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWidgetImplWidgetExtensionProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWidgetImplWidgetExtensionProviderImplInfo</param>
        /// <param name="right">Compared (ComDayCqWidgetImplWidgetExtensionProviderImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWidgetImplWidgetExtensionProviderImplInfo left, ComDayCqWidgetImplWidgetExtensionProviderImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWidgetImplWidgetExtensionProviderImplInfo.
        /// </summary>
        public sealed class ComDayCqWidgetImplWidgetExtensionProviderImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWidgetImplWidgetExtensionProviderImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqWidgetImplWidgetExtensionProviderImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplWidgetExtensionProviderImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWidgetImplWidgetExtensionProviderImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplWidgetExtensionProviderImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWidgetImplWidgetExtensionProviderImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplWidgetExtensionProviderImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWidgetImplWidgetExtensionProviderImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplWidgetExtensionProviderImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWidgetImplWidgetExtensionProviderImplInfoBuilder Properties(ComDayCqWidgetImplWidgetExtensionProviderImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplWidgetExtensionProviderImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqWidgetImplWidgetExtensionProviderImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplWidgetExtensionProviderImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqWidgetImplWidgetExtensionProviderImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWidgetImplWidgetExtensionProviderImplInfo.
            /// </summary>
            /// <returns>ComDayCqWidgetImplWidgetExtensionProviderImplInfo</returns>
            public ComDayCqWidgetImplWidgetExtensionProviderImplInfo Build()
            {
                Validate();
                return new ComDayCqWidgetImplWidgetExtensionProviderImplInfo(
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