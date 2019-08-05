using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo:  IEquatable<ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo>
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
        public ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo()
        {
        }

        private ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo(string Pid, string Title, string Description, ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplFacebookProviderImplInfoBuilder</returns>
        public static ComAdobeGraniteAuthOauthImplFacebookProviderImplInfoBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthImplFacebookProviderImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthImplFacebookProviderImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplFacebookProviderImplInfoBuilder</returns>
        public ComAdobeGraniteAuthOauthImplFacebookProviderImplInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo left, ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo left, ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthImplFacebookProviderImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties _Properties;

            internal ComAdobeGraniteAuthOauthImplFacebookProviderImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAuthOauthImplFacebookProviderImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAuthOauthImplFacebookProviderImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAuthOauthImplFacebookProviderImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAuthOauthImplFacebookProviderImplInfoBuilder Properties(ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo</returns>
            public ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo(
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