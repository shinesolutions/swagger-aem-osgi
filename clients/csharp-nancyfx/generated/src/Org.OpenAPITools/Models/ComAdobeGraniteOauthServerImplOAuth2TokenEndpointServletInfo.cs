using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo
    /// </summary>
    public sealed class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo:  IEquatable<ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo>
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
        public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo()
        {
        }

        private ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo(string Pid, string Title, string Description, ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfoBuilder</returns>
        public static ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfoBuilder Builder()
        {
            return new ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfoBuilder</returns>
        public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo left, ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo left, ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo.
        /// </summary>
        public sealed class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties _Properties;

            internal ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfoBuilder Properties(ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo</returns>
            public ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo Build()
            {
                Validate();
                return new ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo(
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