using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo
    /// </summary>
    public sealed class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo:  IEquatable<ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo>
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
        public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo()
        {
        }

        private ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo(string Pid, string Title, string Description, ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoBuilder</returns>
        public static ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoBuilder Builder()
        {
            return new ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoBuilder</returns>
        public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo left, ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo left, ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.
        /// </summary>
        public sealed class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties _Properties;

            internal ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoBuilder Properties(ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo</returns>
            public ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo Build()
            {
                Validate();
                return new ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo(
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