using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplWCMDebugFilterInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplWCMDebugFilterInfo:  IEquatable<ComDayCqWcmCoreImplWCMDebugFilterInfo>
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
        public ComDayCqWcmCoreImplWCMDebugFilterProperties Properties { get; private set; }

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
        /// Use ComDayCqWcmCoreImplWCMDebugFilterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplWCMDebugFilterInfo()
        {
        }

        private ComDayCqWcmCoreImplWCMDebugFilterInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplWCMDebugFilterProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplWCMDebugFilterInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplWCMDebugFilterInfoBuilder</returns>
        public static ComDayCqWcmCoreImplWCMDebugFilterInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplWCMDebugFilterInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplWCMDebugFilterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplWCMDebugFilterInfoBuilder</returns>
        public ComDayCqWcmCoreImplWCMDebugFilterInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplWCMDebugFilterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplWCMDebugFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplWCMDebugFilterInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplWCMDebugFilterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplWCMDebugFilterInfo left, ComDayCqWcmCoreImplWCMDebugFilterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplWCMDebugFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplWCMDebugFilterInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplWCMDebugFilterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplWCMDebugFilterInfo left, ComDayCqWcmCoreImplWCMDebugFilterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplWCMDebugFilterInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplWCMDebugFilterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplWCMDebugFilterProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqWcmCoreImplWCMDebugFilterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWCMDebugFilterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplWCMDebugFilterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWCMDebugFilterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplWCMDebugFilterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWCMDebugFilterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplWCMDebugFilterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWCMDebugFilterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplWCMDebugFilterInfoBuilder Properties(ComDayCqWcmCoreImplWCMDebugFilterProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWCMDebugFilterInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqWcmCoreImplWCMDebugFilterInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWCMDebugFilterInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqWcmCoreImplWCMDebugFilterInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplWCMDebugFilterInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplWCMDebugFilterInfo</returns>
            public ComDayCqWcmCoreImplWCMDebugFilterInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplWCMDebugFilterInfo(
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