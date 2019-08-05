using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo
    /// </summary>
    public sealed class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo:  IEquatable<OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo>
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
        public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo()
        {
        }

        private OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo(string Pid, string Title, string Description, OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoBuilder</returns>
        public static OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoBuilder Builder()
        {
            return new OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoBuilder</returns>
        public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoBuilder With()
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

        public bool Equals(OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo left, OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo left, OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo.
        /// </summary>
        public sealed class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoBuilder Properties(OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo.
            /// </summary>
            /// <returns>OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo</returns>
            public OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo Build()
            {
                Validate();
                return new OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo(
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