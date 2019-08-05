using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo
    /// </summary>
    public sealed class OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo:  IEquatable<OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo>
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
        public OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo()
        {
        }

        private OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo(string Pid, string Title, string Description, OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfoBuilder</returns>
        public static OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfoBuilder Builder()
        {
            return new OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfoBuilder</returns>
        public OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfoBuilder With()
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

        public bool Equals(OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo left, OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo left, OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo.
        /// </summary>
        public sealed class OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties _Properties;

            internal OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfoBuilder Properties(OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo.
            /// </summary>
            /// <returns>OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo</returns>
            public OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo Build()
            {
                Validate();
                return new OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo(
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