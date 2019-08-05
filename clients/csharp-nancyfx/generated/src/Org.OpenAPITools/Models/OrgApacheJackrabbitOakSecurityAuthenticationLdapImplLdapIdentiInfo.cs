using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo:  IEquatable<OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo>
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
        public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo()
        {
        }

        private OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfoBuilder</returns>
        public static OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfoBuilder</returns>
        public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo left, OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo left, OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties _Properties;

            internal OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfoBuilder Properties(OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo</returns>
            public OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo(
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