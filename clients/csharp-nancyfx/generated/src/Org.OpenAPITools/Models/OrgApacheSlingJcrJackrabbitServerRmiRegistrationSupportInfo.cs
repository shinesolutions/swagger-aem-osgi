using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo
    /// </summary>
    public sealed class OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo:  IEquatable<OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo>
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
        public OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo()
        {
        }

        private OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo(string Pid, string Title, string Description, OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo.
        /// </summary>
        /// <returns>OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfoBuilder</returns>
        public static OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfoBuilder Builder()
        {
            return new OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfoBuilder</returns>
        public OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfoBuilder With()
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

        public bool Equals(OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo left, OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo left, OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo.
        /// </summary>
        public sealed class OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties _Properties;

            internal OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfoBuilder Properties(OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo.
            /// </summary>
            /// <returns>OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo</returns>
            public OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo Build()
            {
                Validate();
                return new OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo(
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