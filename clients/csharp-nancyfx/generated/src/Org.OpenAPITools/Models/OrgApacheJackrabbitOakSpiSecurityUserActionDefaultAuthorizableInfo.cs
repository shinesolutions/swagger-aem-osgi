using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo:  IEquatable<OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo>
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
        public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties Properties { get; private set; }

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
        /// Use OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo()
        {
        }

        private OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfoBuilder</returns>
        public static OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfoBuilder</returns>
        public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo left, OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo left, OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfoBuilder Properties(OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo</returns>
            public OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo(
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