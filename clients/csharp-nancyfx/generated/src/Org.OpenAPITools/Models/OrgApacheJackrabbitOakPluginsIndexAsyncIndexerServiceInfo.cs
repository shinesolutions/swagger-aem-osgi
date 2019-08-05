using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo:  IEquatable<OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo>
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
        public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties Properties { get; private set; }

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
        /// Use OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo()
        {
        }

        private OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoBuilder</returns>
        public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo left, OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo left, OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoBuilder Properties(OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo</returns>
            public OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo(
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