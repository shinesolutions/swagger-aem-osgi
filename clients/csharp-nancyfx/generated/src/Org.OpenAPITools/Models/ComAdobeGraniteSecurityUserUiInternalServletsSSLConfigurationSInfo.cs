using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo
    /// </summary>
    public sealed class ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo:  IEquatable<ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo>
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
        public ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo()
        {
        }

        private ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo(string Pid, string Title, string Description, ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfoBuilder</returns>
        public static ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfoBuilder Builder()
        {
            return new ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfoBuilder</returns>
        public ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo left, ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo left, ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo.
        /// </summary>
        public sealed class ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties _Properties;

            internal ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfoBuilder Properties(ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo</returns>
            public ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo Build()
            {
                Validate();
                return new ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo(
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