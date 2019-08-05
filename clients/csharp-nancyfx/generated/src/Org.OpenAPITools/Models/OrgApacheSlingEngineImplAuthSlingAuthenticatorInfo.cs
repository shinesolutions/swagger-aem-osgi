using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo
    /// </summary>
    public sealed class OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo:  IEquatable<OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo>
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
        public OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo()
        {
        }

        private OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo(string Pid, string Title, string Description, OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo.
        /// </summary>
        /// <returns>OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoBuilder</returns>
        public static OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoBuilder Builder()
        {
            return new OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoBuilder</returns>
        public OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoBuilder With()
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

        public bool Equals(OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo</param>
        /// <param name="right">Compared (OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo left, OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo</param>
        /// <param name="right">Compared (OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo left, OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo.
        /// </summary>
        public sealed class OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoBuilder Properties(OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingEngineImplAuthSlingAuthenticatorInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo.
            /// </summary>
            /// <returns>OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo</returns>
            public OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo Build()
            {
                Validate();
                return new OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo(
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