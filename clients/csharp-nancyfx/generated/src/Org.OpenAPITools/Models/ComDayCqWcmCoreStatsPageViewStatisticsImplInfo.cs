using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreStatsPageViewStatisticsImplInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreStatsPageViewStatisticsImplInfo:  IEquatable<ComDayCqWcmCoreStatsPageViewStatisticsImplInfo>
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
        public ComDayCqWcmCoreStatsPageViewStatisticsImplProperties Properties { get; private set; }

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
        /// Use ComDayCqWcmCoreStatsPageViewStatisticsImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreStatsPageViewStatisticsImplInfo()
        {
        }

        private ComDayCqWcmCoreStatsPageViewStatisticsImplInfo(string Pid, string Title, string Description, ComDayCqWcmCoreStatsPageViewStatisticsImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreStatsPageViewStatisticsImplInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreStatsPageViewStatisticsImplInfoBuilder</returns>
        public static ComDayCqWcmCoreStatsPageViewStatisticsImplInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreStatsPageViewStatisticsImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreStatsPageViewStatisticsImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreStatsPageViewStatisticsImplInfoBuilder</returns>
        public ComDayCqWcmCoreStatsPageViewStatisticsImplInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreStatsPageViewStatisticsImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreStatsPageViewStatisticsImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreStatsPageViewStatisticsImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreStatsPageViewStatisticsImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreStatsPageViewStatisticsImplInfo left, ComDayCqWcmCoreStatsPageViewStatisticsImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreStatsPageViewStatisticsImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreStatsPageViewStatisticsImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreStatsPageViewStatisticsImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreStatsPageViewStatisticsImplInfo left, ComDayCqWcmCoreStatsPageViewStatisticsImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreStatsPageViewStatisticsImplInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreStatsPageViewStatisticsImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreStatsPageViewStatisticsImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqWcmCoreStatsPageViewStatisticsImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreStatsPageViewStatisticsImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreStatsPageViewStatisticsImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreStatsPageViewStatisticsImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreStatsPageViewStatisticsImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreStatsPageViewStatisticsImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreStatsPageViewStatisticsImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreStatsPageViewStatisticsImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreStatsPageViewStatisticsImplInfoBuilder Properties(ComDayCqWcmCoreStatsPageViewStatisticsImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreStatsPageViewStatisticsImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqWcmCoreStatsPageViewStatisticsImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreStatsPageViewStatisticsImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqWcmCoreStatsPageViewStatisticsImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreStatsPageViewStatisticsImplInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreStatsPageViewStatisticsImplInfo</returns>
            public ComDayCqWcmCoreStatsPageViewStatisticsImplInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreStatsPageViewStatisticsImplInfo(
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