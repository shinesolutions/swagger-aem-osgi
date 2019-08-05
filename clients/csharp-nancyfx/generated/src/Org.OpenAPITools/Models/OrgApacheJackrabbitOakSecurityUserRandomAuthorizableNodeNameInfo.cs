using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo:  IEquatable<OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo>
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
        public OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties Properties { get; private set; }

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
        /// Use OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo()
        {
        }

        private OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfoBuilder</returns>
        public static OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfoBuilder</returns>
        public OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo left, OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo left, OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfoBuilder Properties(OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo</returns>
            public OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo(
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