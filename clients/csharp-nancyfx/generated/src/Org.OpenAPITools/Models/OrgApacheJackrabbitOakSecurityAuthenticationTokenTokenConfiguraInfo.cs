using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo:  IEquatable<OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo>
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
        public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties Properties { get; private set; }

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
        /// Use OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo()
        {
        }

        private OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfoBuilder</returns>
        public static OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfoBuilder</returns>
        public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo left, OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo left, OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfoBuilder Properties(OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo</returns>
            public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo(
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