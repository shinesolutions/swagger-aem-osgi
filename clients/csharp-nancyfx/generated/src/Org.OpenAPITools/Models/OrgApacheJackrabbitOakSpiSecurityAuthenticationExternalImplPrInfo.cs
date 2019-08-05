using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo:  IEquatable<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo>
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
        public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo()
        {
        }

        private OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfoBuilder</returns>
        public static OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfoBuilder</returns>
        public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo left, OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo left, OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties _Properties;

            internal OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfoBuilder Properties(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo</returns>
            public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo(
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