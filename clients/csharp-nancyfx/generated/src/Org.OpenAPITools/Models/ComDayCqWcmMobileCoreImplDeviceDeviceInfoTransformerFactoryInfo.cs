using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo
    /// </summary>
    public sealed class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo:  IEquatable<ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo>
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
        public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties Properties { get; private set; }

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
        /// Use ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo()
        {
        }

        private ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo(string Pid, string Title, string Description, ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo.
        /// </summary>
        /// <returns>ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfoBuilder</returns>
        public static ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfoBuilder Builder()
        {
            return new ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfoBuilder</returns>
        public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfoBuilder With()
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

        public bool Equals(ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo</param>
        /// <param name="right">Compared (ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo left, ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo</param>
        /// <param name="right">Compared (ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo left, ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo.
        /// </summary>
        public sealed class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfoBuilder Properties(ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo.
            /// </summary>
            /// <returns>ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo</returns>
            public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo Build()
            {
                Validate();
                return new ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo(
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