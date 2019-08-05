using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingSecurityImplContentDispositionFilterInfo
    /// </summary>
    public sealed class OrgApacheSlingSecurityImplContentDispositionFilterInfo:  IEquatable<OrgApacheSlingSecurityImplContentDispositionFilterInfo>
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
        public OrgApacheSlingSecurityImplContentDispositionFilterProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingSecurityImplContentDispositionFilterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingSecurityImplContentDispositionFilterInfo()
        {
        }

        private OrgApacheSlingSecurityImplContentDispositionFilterInfo(string Pid, string Title, string Description, OrgApacheSlingSecurityImplContentDispositionFilterProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingSecurityImplContentDispositionFilterInfo.
        /// </summary>
        /// <returns>OrgApacheSlingSecurityImplContentDispositionFilterInfoBuilder</returns>
        public static OrgApacheSlingSecurityImplContentDispositionFilterInfoBuilder Builder()
        {
            return new OrgApacheSlingSecurityImplContentDispositionFilterInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingSecurityImplContentDispositionFilterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingSecurityImplContentDispositionFilterInfoBuilder</returns>
        public OrgApacheSlingSecurityImplContentDispositionFilterInfoBuilder With()
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

        public bool Equals(OrgApacheSlingSecurityImplContentDispositionFilterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingSecurityImplContentDispositionFilterInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingSecurityImplContentDispositionFilterInfo</param>
        /// <param name="right">Compared (OrgApacheSlingSecurityImplContentDispositionFilterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingSecurityImplContentDispositionFilterInfo left, OrgApacheSlingSecurityImplContentDispositionFilterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingSecurityImplContentDispositionFilterInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingSecurityImplContentDispositionFilterInfo</param>
        /// <param name="right">Compared (OrgApacheSlingSecurityImplContentDispositionFilterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingSecurityImplContentDispositionFilterInfo left, OrgApacheSlingSecurityImplContentDispositionFilterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingSecurityImplContentDispositionFilterInfo.
        /// </summary>
        public sealed class OrgApacheSlingSecurityImplContentDispositionFilterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingSecurityImplContentDispositionFilterProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingSecurityImplContentDispositionFilterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSecurityImplContentDispositionFilterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingSecurityImplContentDispositionFilterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSecurityImplContentDispositionFilterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingSecurityImplContentDispositionFilterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSecurityImplContentDispositionFilterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingSecurityImplContentDispositionFilterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSecurityImplContentDispositionFilterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingSecurityImplContentDispositionFilterInfoBuilder Properties(OrgApacheSlingSecurityImplContentDispositionFilterProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSecurityImplContentDispositionFilterInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingSecurityImplContentDispositionFilterInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSecurityImplContentDispositionFilterInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingSecurityImplContentDispositionFilterInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingSecurityImplContentDispositionFilterInfo.
            /// </summary>
            /// <returns>OrgApacheSlingSecurityImplContentDispositionFilterInfo</returns>
            public OrgApacheSlingSecurityImplContentDispositionFilterInfo Build()
            {
                Validate();
                return new OrgApacheSlingSecurityImplContentDispositionFilterInfo(
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