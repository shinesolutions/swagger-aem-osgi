using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDiscoveryOakConfigInfo
    /// </summary>
    public sealed class OrgApacheSlingDiscoveryOakConfigInfo:  IEquatable<OrgApacheSlingDiscoveryOakConfigInfo>
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
        public OrgApacheSlingDiscoveryOakConfigProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingDiscoveryOakConfigInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDiscoveryOakConfigInfo()
        {
        }

        private OrgApacheSlingDiscoveryOakConfigInfo(string Pid, string Title, string Description, OrgApacheSlingDiscoveryOakConfigProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDiscoveryOakConfigInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDiscoveryOakConfigInfoBuilder</returns>
        public static OrgApacheSlingDiscoveryOakConfigInfoBuilder Builder()
        {
            return new OrgApacheSlingDiscoveryOakConfigInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDiscoveryOakConfigInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDiscoveryOakConfigInfoBuilder</returns>
        public OrgApacheSlingDiscoveryOakConfigInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDiscoveryOakConfigInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDiscoveryOakConfigInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDiscoveryOakConfigInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDiscoveryOakConfigInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDiscoveryOakConfigInfo left, OrgApacheSlingDiscoveryOakConfigInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDiscoveryOakConfigInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDiscoveryOakConfigInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDiscoveryOakConfigInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDiscoveryOakConfigInfo left, OrgApacheSlingDiscoveryOakConfigInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDiscoveryOakConfigInfo.
        /// </summary>
        public sealed class OrgApacheSlingDiscoveryOakConfigInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDiscoveryOakConfigProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingDiscoveryOakConfigInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDiscoveryOakConfigInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDiscoveryOakConfigInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDiscoveryOakConfigInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDiscoveryOakConfigInfoBuilder Properties(OrgApacheSlingDiscoveryOakConfigProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingDiscoveryOakConfigInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDiscoveryOakConfigInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingDiscoveryOakConfigInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDiscoveryOakConfigInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDiscoveryOakConfigInfo</returns>
            public OrgApacheSlingDiscoveryOakConfigInfo Build()
            {
                Validate();
                return new OrgApacheSlingDiscoveryOakConfigInfo(
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