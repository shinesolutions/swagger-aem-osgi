using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo
    /// </summary>
    public sealed class OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo:  IEquatable<OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo>
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
        public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo()
        {
        }

        private OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo(string Pid, string Title, string Description, OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo.
        /// </summary>
        /// <returns>OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfoBuilder</returns>
        public static OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfoBuilder Builder()
        {
            return new OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfoBuilder</returns>
        public OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfoBuilder With()
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

        public bool Equals(OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo</param>
        /// <param name="right">Compared (OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo left, OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo</param>
        /// <param name="right">Compared (OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo left, OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo.
        /// </summary>
        public sealed class OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfoBuilder Properties(OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo.
            /// </summary>
            /// <returns>OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo</returns>
            public OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo Build()
            {
                Validate();
                return new OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo(
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