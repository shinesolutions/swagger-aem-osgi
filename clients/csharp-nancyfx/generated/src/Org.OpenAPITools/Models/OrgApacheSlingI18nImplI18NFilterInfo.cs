using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingI18nImplI18NFilterInfo
    /// </summary>
    public sealed class OrgApacheSlingI18nImplI18NFilterInfo:  IEquatable<OrgApacheSlingI18nImplI18NFilterInfo>
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
        public OrgApacheSlingI18nImplI18NFilterProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingI18nImplI18NFilterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingI18nImplI18NFilterInfo()
        {
        }

        private OrgApacheSlingI18nImplI18NFilterInfo(string Pid, string Title, string Description, OrgApacheSlingI18nImplI18NFilterProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingI18nImplI18NFilterInfo.
        /// </summary>
        /// <returns>OrgApacheSlingI18nImplI18NFilterInfoBuilder</returns>
        public static OrgApacheSlingI18nImplI18NFilterInfoBuilder Builder()
        {
            return new OrgApacheSlingI18nImplI18NFilterInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingI18nImplI18NFilterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingI18nImplI18NFilterInfoBuilder</returns>
        public OrgApacheSlingI18nImplI18NFilterInfoBuilder With()
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

        public bool Equals(OrgApacheSlingI18nImplI18NFilterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingI18nImplI18NFilterInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingI18nImplI18NFilterInfo</param>
        /// <param name="right">Compared (OrgApacheSlingI18nImplI18NFilterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingI18nImplI18NFilterInfo left, OrgApacheSlingI18nImplI18NFilterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingI18nImplI18NFilterInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingI18nImplI18NFilterInfo</param>
        /// <param name="right">Compared (OrgApacheSlingI18nImplI18NFilterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingI18nImplI18NFilterInfo left, OrgApacheSlingI18nImplI18NFilterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingI18nImplI18NFilterInfo.
        /// </summary>
        public sealed class OrgApacheSlingI18nImplI18NFilterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingI18nImplI18NFilterProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingI18nImplI18NFilterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingI18nImplI18NFilterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingI18nImplI18NFilterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingI18nImplI18NFilterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingI18nImplI18NFilterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingI18nImplI18NFilterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingI18nImplI18NFilterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingI18nImplI18NFilterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingI18nImplI18NFilterInfoBuilder Properties(OrgApacheSlingI18nImplI18NFilterProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingI18nImplI18NFilterInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingI18nImplI18NFilterInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingI18nImplI18NFilterInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingI18nImplI18NFilterInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingI18nImplI18NFilterInfo.
            /// </summary>
            /// <returns>OrgApacheSlingI18nImplI18NFilterInfo</returns>
            public OrgApacheSlingI18nImplI18NFilterInfo Build()
            {
                Validate();
                return new OrgApacheSlingI18nImplI18NFilterInfo(
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