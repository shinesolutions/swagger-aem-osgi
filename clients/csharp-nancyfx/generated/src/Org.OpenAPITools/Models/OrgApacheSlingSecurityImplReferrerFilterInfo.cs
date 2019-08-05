using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingSecurityImplReferrerFilterInfo
    /// </summary>
    public sealed class OrgApacheSlingSecurityImplReferrerFilterInfo:  IEquatable<OrgApacheSlingSecurityImplReferrerFilterInfo>
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
        public OrgApacheSlingSecurityImplReferrerFilterProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingSecurityImplReferrerFilterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingSecurityImplReferrerFilterInfo()
        {
        }

        private OrgApacheSlingSecurityImplReferrerFilterInfo(string Pid, string Title, string Description, OrgApacheSlingSecurityImplReferrerFilterProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingSecurityImplReferrerFilterInfo.
        /// </summary>
        /// <returns>OrgApacheSlingSecurityImplReferrerFilterInfoBuilder</returns>
        public static OrgApacheSlingSecurityImplReferrerFilterInfoBuilder Builder()
        {
            return new OrgApacheSlingSecurityImplReferrerFilterInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingSecurityImplReferrerFilterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingSecurityImplReferrerFilterInfoBuilder</returns>
        public OrgApacheSlingSecurityImplReferrerFilterInfoBuilder With()
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

        public bool Equals(OrgApacheSlingSecurityImplReferrerFilterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingSecurityImplReferrerFilterInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingSecurityImplReferrerFilterInfo</param>
        /// <param name="right">Compared (OrgApacheSlingSecurityImplReferrerFilterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingSecurityImplReferrerFilterInfo left, OrgApacheSlingSecurityImplReferrerFilterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingSecurityImplReferrerFilterInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingSecurityImplReferrerFilterInfo</param>
        /// <param name="right">Compared (OrgApacheSlingSecurityImplReferrerFilterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingSecurityImplReferrerFilterInfo left, OrgApacheSlingSecurityImplReferrerFilterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingSecurityImplReferrerFilterInfo.
        /// </summary>
        public sealed class OrgApacheSlingSecurityImplReferrerFilterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingSecurityImplReferrerFilterProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingSecurityImplReferrerFilterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSecurityImplReferrerFilterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingSecurityImplReferrerFilterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSecurityImplReferrerFilterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingSecurityImplReferrerFilterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSecurityImplReferrerFilterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingSecurityImplReferrerFilterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSecurityImplReferrerFilterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingSecurityImplReferrerFilterInfoBuilder Properties(OrgApacheSlingSecurityImplReferrerFilterProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSecurityImplReferrerFilterInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingSecurityImplReferrerFilterInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSecurityImplReferrerFilterInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingSecurityImplReferrerFilterInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingSecurityImplReferrerFilterInfo.
            /// </summary>
            /// <returns>OrgApacheSlingSecurityImplReferrerFilterInfo</returns>
            public OrgApacheSlingSecurityImplReferrerFilterInfo Build()
            {
                Validate();
                return new OrgApacheSlingSecurityImplReferrerFilterInfo(
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