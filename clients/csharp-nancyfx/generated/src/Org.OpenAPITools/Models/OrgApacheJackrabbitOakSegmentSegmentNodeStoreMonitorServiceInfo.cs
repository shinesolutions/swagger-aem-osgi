using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo:  IEquatable<OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo>
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
        public OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties Properties { get; private set; }

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
        /// Use OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo()
        {
        }

        private OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfoBuilder</returns>
        public static OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfoBuilder</returns>
        public OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo left, OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo left, OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfoBuilder Properties(OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo</returns>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo(
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