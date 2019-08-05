using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo
    /// </summary>
    public sealed class OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo:  IEquatable<OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo>
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
        public OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo()
        {
        }

        private OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo(string Pid, string Title, string Description, OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfoBuilder</returns>
        public static OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfoBuilder Builder()
        {
            return new OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfoBuilder</returns>
        public OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfoBuilder With()
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

        public bool Equals(OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo left, OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo left, OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo.
        /// </summary>
        public sealed class OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties _Properties;

            internal OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfoBuilder Properties(OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo.
            /// </summary>
            /// <returns>OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo</returns>
            public OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo Build()
            {
                Validate();
                return new OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo(
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