using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo:  IEquatable<OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo>
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
        public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties Properties { get; private set; }

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
        /// Use OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo()
        {
        }

        private OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoBuilder</returns>
        public static OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoBuilder</returns>
        public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo left, OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo left, OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoBuilder Properties(OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo</returns>
            public OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo(
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