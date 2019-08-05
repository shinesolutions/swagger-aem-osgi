using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo
    /// </summary>
    public sealed class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo:  IEquatable<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo>
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
        public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo()
        {
        }

        private OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo(string Pid, string Title, string Description, OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo.
        /// </summary>
        /// <returns>OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfoBuilder</returns>
        public static OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfoBuilder Builder()
        {
            return new OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfoBuilder</returns>
        public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfoBuilder With()
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

        public bool Equals(OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo left, OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo left, OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo.
        /// </summary>
        public sealed class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties _Properties;

            internal OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfoBuilder Properties(OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo.
            /// </summary>
            /// <returns>OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo</returns>
            public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo Build()
            {
                Validate();
                return new OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo(
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