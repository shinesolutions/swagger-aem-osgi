using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreMvtMVTStatisticsImplInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreMvtMVTStatisticsImplInfo:  IEquatable<ComDayCqWcmCoreMvtMVTStatisticsImplInfo>
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
        public ComDayCqWcmCoreMvtMVTStatisticsImplProperties Properties { get; private set; }

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
        /// Use ComDayCqWcmCoreMvtMVTStatisticsImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreMvtMVTStatisticsImplInfo()
        {
        }

        private ComDayCqWcmCoreMvtMVTStatisticsImplInfo(string Pid, string Title, string Description, ComDayCqWcmCoreMvtMVTStatisticsImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreMvtMVTStatisticsImplInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreMvtMVTStatisticsImplInfoBuilder</returns>
        public static ComDayCqWcmCoreMvtMVTStatisticsImplInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreMvtMVTStatisticsImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreMvtMVTStatisticsImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreMvtMVTStatisticsImplInfoBuilder</returns>
        public ComDayCqWcmCoreMvtMVTStatisticsImplInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreMvtMVTStatisticsImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreMvtMVTStatisticsImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreMvtMVTStatisticsImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreMvtMVTStatisticsImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreMvtMVTStatisticsImplInfo left, ComDayCqWcmCoreMvtMVTStatisticsImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreMvtMVTStatisticsImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreMvtMVTStatisticsImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreMvtMVTStatisticsImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreMvtMVTStatisticsImplInfo left, ComDayCqWcmCoreMvtMVTStatisticsImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreMvtMVTStatisticsImplInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreMvtMVTStatisticsImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreMvtMVTStatisticsImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqWcmCoreMvtMVTStatisticsImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreMvtMVTStatisticsImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreMvtMVTStatisticsImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreMvtMVTStatisticsImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreMvtMVTStatisticsImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreMvtMVTStatisticsImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreMvtMVTStatisticsImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreMvtMVTStatisticsImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreMvtMVTStatisticsImplInfoBuilder Properties(ComDayCqWcmCoreMvtMVTStatisticsImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreMvtMVTStatisticsImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqWcmCoreMvtMVTStatisticsImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreMvtMVTStatisticsImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqWcmCoreMvtMVTStatisticsImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreMvtMVTStatisticsImplInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreMvtMVTStatisticsImplInfo</returns>
            public ComDayCqWcmCoreMvtMVTStatisticsImplInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreMvtMVTStatisticsImplInfo(
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