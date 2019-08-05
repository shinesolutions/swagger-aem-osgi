using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo
    /// </summary>
    public sealed class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo:  IEquatable<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo>
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
        public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo()
        {
        }

        private OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo(string Pid, string Title, string Description, OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo.
        /// </summary>
        /// <returns>OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfoBuilder</returns>
        public static OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfoBuilder Builder()
        {
            return new OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfoBuilder</returns>
        public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfoBuilder With()
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

        public bool Equals(OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo left, OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo left, OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo.
        /// </summary>
        public sealed class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties _Properties;

            internal OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfoBuilder Properties(OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo.
            /// </summary>
            /// <returns>OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo</returns>
            public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo Build()
            {
                Validate();
                return new OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo(
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