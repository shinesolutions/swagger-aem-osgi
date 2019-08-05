using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo
    /// </summary>
    public sealed class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo:  IEquatable<ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo>
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
        public ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo()
        {
        }

        private ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo(string Pid, string Title, string Description, ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfoBuilder</returns>
        public static ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfoBuilder Builder()
        {
            return new ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfoBuilder</returns>
        public ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo left, ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo left, ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo.
        /// </summary>
        public sealed class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties _Properties;

            internal ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfoBuilder Properties(ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo</returns>
            public ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo Build()
            {
                Validate();
                return new ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo(
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