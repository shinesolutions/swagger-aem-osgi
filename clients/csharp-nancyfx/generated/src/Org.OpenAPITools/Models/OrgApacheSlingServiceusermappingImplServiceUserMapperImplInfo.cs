using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo
    /// </summary>
    public sealed class OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo:  IEquatable<OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo>
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
        public OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo()
        {
        }

        private OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo(string Pid, string Title, string Description, OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo.
        /// </summary>
        /// <returns>OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfoBuilder</returns>
        public static OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfoBuilder Builder()
        {
            return new OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfoBuilder</returns>
        public OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfoBuilder With()
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

        public bool Equals(OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo</param>
        /// <param name="right">Compared (OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo left, OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo</param>
        /// <param name="right">Compared (OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo left, OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo.
        /// </summary>
        public sealed class OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfoBuilder Properties(OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo.
            /// </summary>
            /// <returns>OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo</returns>
            public OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo Build()
            {
                Validate();
                return new OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo(
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