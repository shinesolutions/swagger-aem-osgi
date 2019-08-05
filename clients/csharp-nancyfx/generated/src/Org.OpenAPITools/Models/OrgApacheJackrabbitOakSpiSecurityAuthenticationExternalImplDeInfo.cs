using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo:  IEquatable<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo>
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
        public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo()
        {
        }

        private OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfoBuilder</returns>
        public static OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfoBuilder</returns>
        public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo left, OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo left, OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties _Properties;

            internal OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfoBuilder Properties(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo</returns>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo(
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