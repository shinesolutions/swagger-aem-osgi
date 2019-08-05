using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo:  IEquatable<OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo>
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
        public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties Properties { get; private set; }

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
        /// Use OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo()
        {
        }

        private OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfoBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfoBuilder</returns>
        public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo left, OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo left, OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfoBuilder Properties(OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo</returns>
            public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo(
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