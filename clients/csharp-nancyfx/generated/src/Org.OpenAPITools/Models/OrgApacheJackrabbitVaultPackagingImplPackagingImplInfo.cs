using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo:  IEquatable<OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo>
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
        public OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo()
        {
        }

        private OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo(string Pid, string Title, string Description, OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitVaultPackagingImplPackagingImplInfoBuilder</returns>
        public static OrgApacheJackrabbitVaultPackagingImplPackagingImplInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitVaultPackagingImplPackagingImplInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitVaultPackagingImplPackagingImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitVaultPackagingImplPackagingImplInfoBuilder</returns>
        public OrgApacheJackrabbitVaultPackagingImplPackagingImplInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo left, OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo left, OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitVaultPackagingImplPackagingImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties _Properties;

            internal OrgApacheJackrabbitVaultPackagingImplPackagingImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitVaultPackagingImplPackagingImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitVaultPackagingImplPackagingImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitVaultPackagingImplPackagingImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitVaultPackagingImplPackagingImplInfoBuilder Properties(OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo</returns>
            public OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo(
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