using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo
    /// </summary>
    public sealed class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo:  IEquatable<OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo>
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
        public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo()
        {
        }

        private OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo(string Pid, string Title, string Description, OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfoBuilder</returns>
        public static OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfoBuilder Builder()
        {
            return new OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfoBuilder</returns>
        public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfoBuilder With()
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

        public bool Equals(OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo left, OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo left, OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo.
        /// </summary>
        public sealed class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfoBuilder Properties(OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo.
            /// </summary>
            /// <returns>OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo</returns>
            public OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo Build()
            {
                Validate();
                return new OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo(
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