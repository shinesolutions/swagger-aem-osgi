using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo
    /// </summary>
    public sealed class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo:  IEquatable<OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo>
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
        public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo()
        {
        }

        private OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo(string Pid, string Title, string Description, OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfoBuilder</returns>
        public static OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfoBuilder Builder()
        {
            return new OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfoBuilder</returns>
        public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfoBuilder With()
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

        public bool Equals(OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo left, OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo left, OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo.
        /// </summary>
        public sealed class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfoBuilder Properties(OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo.
            /// </summary>
            /// <returns>OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo</returns>
            public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo Build()
            {
                Validate();
                return new OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo(
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