using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo
    /// </summary>
    public sealed class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo:  IEquatable<ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo>
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
        public ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo()
        {
        }

        private ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo(string Pid, string Title, string Description, ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfoBuilder</returns>
        public static ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfoBuilder Builder()
        {
            return new ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfoBuilder</returns>
        public ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo left, ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo left, ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo.
        /// </summary>
        public sealed class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties _Properties;

            internal ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfoBuilder Properties(ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo</returns>
            public ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo Build()
            {
                Validate();
                return new ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo(
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