using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo
    /// </summary>
    public sealed class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo:  IEquatable<OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo>
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
        public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo()
        {
        }

        private OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo(string Pid, string Title, string Description, OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfoBuilder</returns>
        public static OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfoBuilder Builder()
        {
            return new OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfoBuilder</returns>
        public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfoBuilder With()
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

        public bool Equals(OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo left, OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo left, OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo.
        /// </summary>
        public sealed class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties _Properties;

            internal OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfoBuilder Properties(OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo.
            /// </summary>
            /// <returns>OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo</returns>
            public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo Build()
            {
                Validate();
                return new OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo(
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