using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCommonsLogLogManagerInfo
    /// </summary>
    public sealed class OrgApacheSlingCommonsLogLogManagerInfo:  IEquatable<OrgApacheSlingCommonsLogLogManagerInfo>
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
        public OrgApacheSlingCommonsLogLogManagerProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingCommonsLogLogManagerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCommonsLogLogManagerInfo()
        {
        }

        private OrgApacheSlingCommonsLogLogManagerInfo(string Pid, string Title, string Description, OrgApacheSlingCommonsLogLogManagerProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCommonsLogLogManagerInfo.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsLogLogManagerInfoBuilder</returns>
        public static OrgApacheSlingCommonsLogLogManagerInfoBuilder Builder()
        {
            return new OrgApacheSlingCommonsLogLogManagerInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCommonsLogLogManagerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsLogLogManagerInfoBuilder</returns>
        public OrgApacheSlingCommonsLogLogManagerInfoBuilder With()
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

        public bool Equals(OrgApacheSlingCommonsLogLogManagerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCommonsLogLogManagerInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsLogLogManagerInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsLogLogManagerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCommonsLogLogManagerInfo left, OrgApacheSlingCommonsLogLogManagerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCommonsLogLogManagerInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsLogLogManagerInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsLogLogManagerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCommonsLogLogManagerInfo left, OrgApacheSlingCommonsLogLogManagerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCommonsLogLogManagerInfo.
        /// </summary>
        public sealed class OrgApacheSlingCommonsLogLogManagerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingCommonsLogLogManagerProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingCommonsLogLogManagerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingCommonsLogLogManagerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingCommonsLogLogManagerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingCommonsLogLogManagerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingCommonsLogLogManagerInfoBuilder Properties(OrgApacheSlingCommonsLogLogManagerProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingCommonsLogLogManagerInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsLogLogManagerInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingCommonsLogLogManagerInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCommonsLogLogManagerInfo.
            /// </summary>
            /// <returns>OrgApacheSlingCommonsLogLogManagerInfo</returns>
            public OrgApacheSlingCommonsLogLogManagerInfo Build()
            {
                Validate();
                return new OrgApacheSlingCommonsLogLogManagerInfo(
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