using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo:  IEquatable<OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo>
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
        public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties Properties { get; private set; }

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
        /// Use OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo()
        {
        }

        private OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfoBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfoBuilder</returns>
        public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo left, OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo left, OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfoBuilder Properties(OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo</returns>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo(
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