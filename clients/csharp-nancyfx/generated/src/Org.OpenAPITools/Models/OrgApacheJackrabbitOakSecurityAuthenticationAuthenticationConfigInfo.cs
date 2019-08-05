using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo:  IEquatable<OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo>
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
        public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo()
        {
        }

        private OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfoBuilder</returns>
        public static OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfoBuilder</returns>
        public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo left, OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo left, OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties _Properties;

            internal OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfoBuilder Properties(OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo</returns>
            public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo(
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