using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo:  IEquatable<OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo>
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
        public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties Properties { get; private set; }

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
        /// Use OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo()
        {
        }

        private OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfoBuilder</returns>
        public static OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfoBuilder</returns>
        public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo left, OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo left, OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfoBuilder Properties(OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo</returns>
            public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo(
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