using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo
    /// </summary>
    public sealed class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo:  IEquatable<OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo>
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
        public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties Properties { get; private set; }

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
        /// Use OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo()
        {
        }

        private OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo(string Pid, string Title, string Description, OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo.
        /// </summary>
        /// <returns>OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoBuilder</returns>
        public static OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoBuilder Builder()
        {
            return new OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoBuilder</returns>
        public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoBuilder With()
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

        public bool Equals(OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo left, OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo left, OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo.
        /// </summary>
        public sealed class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoBuilder Properties(OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo.
            /// </summary>
            /// <returns>OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo</returns>
            public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo Build()
            {
                Validate();
                return new OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo(
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