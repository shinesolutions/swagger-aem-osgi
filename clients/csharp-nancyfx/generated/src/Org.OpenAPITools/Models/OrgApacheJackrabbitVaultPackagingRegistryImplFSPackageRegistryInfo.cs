using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo:  IEquatable<OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo>
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
        public OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo()
        {
        }

        private OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo(string Pid, string Title, string Description, OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfoBuilder</returns>
        public static OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfoBuilder</returns>
        public OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo left, OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo left, OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties _Properties;

            internal OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfoBuilder Properties(OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo</returns>
            public OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo(
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