using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo
    /// </summary>
    public sealed class OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo:  IEquatable<OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo>
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
        public OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo()
        {
        }

        private OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo(string Pid, string Title, string Description, OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo.
        /// </summary>
        /// <returns>OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfoBuilder</returns>
        public static OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfoBuilder Builder()
        {
            return new OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfoBuilder</returns>
        public OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo left, OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo left, OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo.
        /// </summary>
        public sealed class OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties _Properties;

            internal OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfoBuilder Properties(OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo.
            /// </summary>
            /// <returns>OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo</returns>
            public OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo Build()
            {
                Validate();
                return new OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}