using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo:  IEquatable<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo>
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
        public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo()
        {
        }

        private OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoBuilder</returns>
        public static OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoBuilder</returns>
        public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo left, OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo left, OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties _Properties;

            internal OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoBuilder Properties(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo</returns>
            public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo(
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