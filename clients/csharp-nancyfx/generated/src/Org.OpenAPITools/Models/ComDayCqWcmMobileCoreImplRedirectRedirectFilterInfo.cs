using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo
    /// </summary>
    public sealed class ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo:  IEquatable<ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo>
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
        public ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties Properties { get; private set; }

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
        /// Use ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo()
        {
        }

        private ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo(string Pid, string Title, string Description, ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo.
        /// </summary>
        /// <returns>ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfoBuilder</returns>
        public static ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfoBuilder Builder()
        {
            return new ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfoBuilder</returns>
        public ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfoBuilder With()
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

        public bool Equals(ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo</param>
        /// <param name="right">Compared (ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo left, ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo</param>
        /// <param name="right">Compared (ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo left, ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo.
        /// </summary>
        public sealed class ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfoBuilder Properties(ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo.
            /// </summary>
            /// <returns>ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo</returns>
            public ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo Build()
            {
                Validate();
                return new ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo(
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