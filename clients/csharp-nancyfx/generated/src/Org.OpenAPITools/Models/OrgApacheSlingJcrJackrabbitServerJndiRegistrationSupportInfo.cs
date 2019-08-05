using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo
    /// </summary>
    public sealed class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo:  IEquatable<OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo>
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
        public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo()
        {
        }

        private OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo(string Pid, string Title, string Description, OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo.
        /// </summary>
        /// <returns>OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfoBuilder</returns>
        public static OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfoBuilder Builder()
        {
            return new OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfoBuilder</returns>
        public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfoBuilder With()
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

        public bool Equals(OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo left, OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo left, OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo.
        /// </summary>
        public sealed class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties _Properties;

            internal OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfoBuilder Properties(OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo.
            /// </summary>
            /// <returns>OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo</returns>
            public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo Build()
            {
                Validate();
                return new OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo(
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