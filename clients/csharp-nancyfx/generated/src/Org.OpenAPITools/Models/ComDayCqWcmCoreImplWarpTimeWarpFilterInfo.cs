using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplWarpTimeWarpFilterInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplWarpTimeWarpFilterInfo:  IEquatable<ComDayCqWcmCoreImplWarpTimeWarpFilterInfo>
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
        public ComDayCqWcmCoreImplWarpTimeWarpFilterProperties Properties { get; private set; }

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
        /// Use ComDayCqWcmCoreImplWarpTimeWarpFilterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplWarpTimeWarpFilterInfo()
        {
        }

        private ComDayCqWcmCoreImplWarpTimeWarpFilterInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplWarpTimeWarpFilterProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplWarpTimeWarpFilterInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplWarpTimeWarpFilterInfoBuilder</returns>
        public static ComDayCqWcmCoreImplWarpTimeWarpFilterInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplWarpTimeWarpFilterInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplWarpTimeWarpFilterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplWarpTimeWarpFilterInfoBuilder</returns>
        public ComDayCqWcmCoreImplWarpTimeWarpFilterInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplWarpTimeWarpFilterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplWarpTimeWarpFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplWarpTimeWarpFilterInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplWarpTimeWarpFilterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplWarpTimeWarpFilterInfo left, ComDayCqWcmCoreImplWarpTimeWarpFilterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplWarpTimeWarpFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplWarpTimeWarpFilterInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplWarpTimeWarpFilterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplWarpTimeWarpFilterInfo left, ComDayCqWcmCoreImplWarpTimeWarpFilterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplWarpTimeWarpFilterInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplWarpTimeWarpFilterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplWarpTimeWarpFilterProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqWcmCoreImplWarpTimeWarpFilterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWarpTimeWarpFilterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplWarpTimeWarpFilterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWarpTimeWarpFilterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplWarpTimeWarpFilterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWarpTimeWarpFilterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplWarpTimeWarpFilterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWarpTimeWarpFilterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplWarpTimeWarpFilterInfoBuilder Properties(ComDayCqWcmCoreImplWarpTimeWarpFilterProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWarpTimeWarpFilterInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqWcmCoreImplWarpTimeWarpFilterInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWarpTimeWarpFilterInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqWcmCoreImplWarpTimeWarpFilterInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplWarpTimeWarpFilterInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplWarpTimeWarpFilterInfo</returns>
            public ComDayCqWcmCoreImplWarpTimeWarpFilterInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplWarpTimeWarpFilterInfo(
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