using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingServletsResolverSlingServletResolverInfo
    /// </summary>
    public sealed class OrgApacheSlingServletsResolverSlingServletResolverInfo:  IEquatable<OrgApacheSlingServletsResolverSlingServletResolverInfo>
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
        public OrgApacheSlingServletsResolverSlingServletResolverProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingServletsResolverSlingServletResolverInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingServletsResolverSlingServletResolverInfo()
        {
        }

        private OrgApacheSlingServletsResolverSlingServletResolverInfo(string Pid, string Title, string Description, OrgApacheSlingServletsResolverSlingServletResolverProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingServletsResolverSlingServletResolverInfo.
        /// </summary>
        /// <returns>OrgApacheSlingServletsResolverSlingServletResolverInfoBuilder</returns>
        public static OrgApacheSlingServletsResolverSlingServletResolverInfoBuilder Builder()
        {
            return new OrgApacheSlingServletsResolverSlingServletResolverInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingServletsResolverSlingServletResolverInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingServletsResolverSlingServletResolverInfoBuilder</returns>
        public OrgApacheSlingServletsResolverSlingServletResolverInfoBuilder With()
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

        public bool Equals(OrgApacheSlingServletsResolverSlingServletResolverInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingServletsResolverSlingServletResolverInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServletsResolverSlingServletResolverInfo</param>
        /// <param name="right">Compared (OrgApacheSlingServletsResolverSlingServletResolverInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingServletsResolverSlingServletResolverInfo left, OrgApacheSlingServletsResolverSlingServletResolverInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingServletsResolverSlingServletResolverInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServletsResolverSlingServletResolverInfo</param>
        /// <param name="right">Compared (OrgApacheSlingServletsResolverSlingServletResolverInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingServletsResolverSlingServletResolverInfo left, OrgApacheSlingServletsResolverSlingServletResolverInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingServletsResolverSlingServletResolverInfo.
        /// </summary>
        public sealed class OrgApacheSlingServletsResolverSlingServletResolverInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingServletsResolverSlingServletResolverProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingServletsResolverSlingServletResolverInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsResolverSlingServletResolverInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingServletsResolverSlingServletResolverInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsResolverSlingServletResolverInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingServletsResolverSlingServletResolverInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsResolverSlingServletResolverInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingServletsResolverSlingServletResolverInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsResolverSlingServletResolverInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingServletsResolverSlingServletResolverInfoBuilder Properties(OrgApacheSlingServletsResolverSlingServletResolverProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsResolverSlingServletResolverInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingServletsResolverSlingServletResolverInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsResolverSlingServletResolverInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingServletsResolverSlingServletResolverInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingServletsResolverSlingServletResolverInfo.
            /// </summary>
            /// <returns>OrgApacheSlingServletsResolverSlingServletResolverInfo</returns>
            public OrgApacheSlingServletsResolverSlingServletResolverInfo Build()
            {
                Validate();
                return new OrgApacheSlingServletsResolverSlingServletResolverInfo(
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