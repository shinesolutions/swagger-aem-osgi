using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingServletsGetDefaultGetServletInfo
    /// </summary>
    public sealed class OrgApacheSlingServletsGetDefaultGetServletInfo:  IEquatable<OrgApacheSlingServletsGetDefaultGetServletInfo>
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
        public OrgApacheSlingServletsGetDefaultGetServletProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingServletsGetDefaultGetServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingServletsGetDefaultGetServletInfo()
        {
        }

        private OrgApacheSlingServletsGetDefaultGetServletInfo(string Pid, string Title, string Description, OrgApacheSlingServletsGetDefaultGetServletProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingServletsGetDefaultGetServletInfo.
        /// </summary>
        /// <returns>OrgApacheSlingServletsGetDefaultGetServletInfoBuilder</returns>
        public static OrgApacheSlingServletsGetDefaultGetServletInfoBuilder Builder()
        {
            return new OrgApacheSlingServletsGetDefaultGetServletInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingServletsGetDefaultGetServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingServletsGetDefaultGetServletInfoBuilder</returns>
        public OrgApacheSlingServletsGetDefaultGetServletInfoBuilder With()
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

        public bool Equals(OrgApacheSlingServletsGetDefaultGetServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingServletsGetDefaultGetServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServletsGetDefaultGetServletInfo</param>
        /// <param name="right">Compared (OrgApacheSlingServletsGetDefaultGetServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingServletsGetDefaultGetServletInfo left, OrgApacheSlingServletsGetDefaultGetServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingServletsGetDefaultGetServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServletsGetDefaultGetServletInfo</param>
        /// <param name="right">Compared (OrgApacheSlingServletsGetDefaultGetServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingServletsGetDefaultGetServletInfo left, OrgApacheSlingServletsGetDefaultGetServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingServletsGetDefaultGetServletInfo.
        /// </summary>
        public sealed class OrgApacheSlingServletsGetDefaultGetServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingServletsGetDefaultGetServletProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingServletsGetDefaultGetServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetDefaultGetServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingServletsGetDefaultGetServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetDefaultGetServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingServletsGetDefaultGetServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetDefaultGetServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingServletsGetDefaultGetServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetDefaultGetServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingServletsGetDefaultGetServletInfoBuilder Properties(OrgApacheSlingServletsGetDefaultGetServletProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetDefaultGetServletInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingServletsGetDefaultGetServletInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetDefaultGetServletInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingServletsGetDefaultGetServletInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingServletsGetDefaultGetServletInfo.
            /// </summary>
            /// <returns>OrgApacheSlingServletsGetDefaultGetServletInfo</returns>
            public OrgApacheSlingServletsGetDefaultGetServletInfo Build()
            {
                Validate();
                return new OrgApacheSlingServletsGetDefaultGetServletInfo(
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