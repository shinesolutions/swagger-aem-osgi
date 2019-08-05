using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo:  IEquatable<OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo>
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
        public OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties Properties { get; private set; }

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
        /// Use OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo()
        {
        }

        private OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfoBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfoBuilder</returns>
        public OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo left, OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo left, OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfoBuilder Properties(OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo</returns>
            public OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo(
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