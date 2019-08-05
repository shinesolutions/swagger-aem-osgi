using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixEventadminImplEventAdminInfo
    /// </summary>
    public sealed class OrgApacheFelixEventadminImplEventAdminInfo:  IEquatable<OrgApacheFelixEventadminImplEventAdminInfo>
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
        public OrgApacheFelixEventadminImplEventAdminProperties Properties { get; private set; }

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
        /// Use OrgApacheFelixEventadminImplEventAdminInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixEventadminImplEventAdminInfo()
        {
        }

        private OrgApacheFelixEventadminImplEventAdminInfo(string Pid, string Title, string Description, OrgApacheFelixEventadminImplEventAdminProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixEventadminImplEventAdminInfo.
        /// </summary>
        /// <returns>OrgApacheFelixEventadminImplEventAdminInfoBuilder</returns>
        public static OrgApacheFelixEventadminImplEventAdminInfoBuilder Builder()
        {
            return new OrgApacheFelixEventadminImplEventAdminInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixEventadminImplEventAdminInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixEventadminImplEventAdminInfoBuilder</returns>
        public OrgApacheFelixEventadminImplEventAdminInfoBuilder With()
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

        public bool Equals(OrgApacheFelixEventadminImplEventAdminInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixEventadminImplEventAdminInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixEventadminImplEventAdminInfo</param>
        /// <param name="right">Compared (OrgApacheFelixEventadminImplEventAdminInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixEventadminImplEventAdminInfo left, OrgApacheFelixEventadminImplEventAdminInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixEventadminImplEventAdminInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixEventadminImplEventAdminInfo</param>
        /// <param name="right">Compared (OrgApacheFelixEventadminImplEventAdminInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixEventadminImplEventAdminInfo left, OrgApacheFelixEventadminImplEventAdminInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixEventadminImplEventAdminInfo.
        /// </summary>
        public sealed class OrgApacheFelixEventadminImplEventAdminInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheFelixEventadminImplEventAdminProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheFelixEventadminImplEventAdminInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixEventadminImplEventAdminInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheFelixEventadminImplEventAdminInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixEventadminImplEventAdminInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheFelixEventadminImplEventAdminInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixEventadminImplEventAdminInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheFelixEventadminImplEventAdminInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixEventadminImplEventAdminInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheFelixEventadminImplEventAdminInfoBuilder Properties(OrgApacheFelixEventadminImplEventAdminProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixEventadminImplEventAdminInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheFelixEventadminImplEventAdminInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixEventadminImplEventAdminInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheFelixEventadminImplEventAdminInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixEventadminImplEventAdminInfo.
            /// </summary>
            /// <returns>OrgApacheFelixEventadminImplEventAdminInfo</returns>
            public OrgApacheFelixEventadminImplEventAdminInfo Build()
            {
                Validate();
                return new OrgApacheFelixEventadminImplEventAdminInfo(
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