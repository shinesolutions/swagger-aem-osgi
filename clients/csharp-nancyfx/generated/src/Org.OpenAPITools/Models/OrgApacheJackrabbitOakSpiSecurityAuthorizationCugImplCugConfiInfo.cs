using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo:  IEquatable<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo>
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
        public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties Properties { get; private set; }

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
        /// Use OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo()
        {
        }

        private OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoBuilder</returns>
        public static OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoBuilder</returns>
        public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo left, OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo left, OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoBuilder Properties(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo</returns>
            public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo(
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