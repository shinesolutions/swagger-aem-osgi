using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthAccesstokenProviderInfo
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthAccesstokenProviderInfo:  IEquatable<ComAdobeGraniteAuthOauthAccesstokenProviderInfo>
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
        public ComAdobeGraniteAuthOauthAccesstokenProviderProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthOauthAccesstokenProviderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthAccesstokenProviderInfo()
        {
        }

        private ComAdobeGraniteAuthOauthAccesstokenProviderInfo(string Pid, string Title, string Description, ComAdobeGraniteAuthOauthAccesstokenProviderProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthAccesstokenProviderInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthAccesstokenProviderInfoBuilder</returns>
        public static ComAdobeGraniteAuthOauthAccesstokenProviderInfoBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthAccesstokenProviderInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthAccesstokenProviderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthAccesstokenProviderInfoBuilder</returns>
        public ComAdobeGraniteAuthOauthAccesstokenProviderInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthOauthAccesstokenProviderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthAccesstokenProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthAccesstokenProviderInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthAccesstokenProviderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthAccesstokenProviderInfo left, ComAdobeGraniteAuthOauthAccesstokenProviderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthAccesstokenProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthAccesstokenProviderInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthAccesstokenProviderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthAccesstokenProviderInfo left, ComAdobeGraniteAuthOauthAccesstokenProviderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthAccesstokenProviderInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthAccesstokenProviderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAuthOauthAccesstokenProviderProperties _Properties;

            internal ComAdobeGraniteAuthOauthAccesstokenProviderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthAccesstokenProviderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAuthOauthAccesstokenProviderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthAccesstokenProviderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAuthOauthAccesstokenProviderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthAccesstokenProviderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAuthOauthAccesstokenProviderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthAccesstokenProviderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAuthOauthAccesstokenProviderInfoBuilder Properties(ComAdobeGraniteAuthOauthAccesstokenProviderProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthAccesstokenProviderInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthAccesstokenProviderInfo</returns>
            public ComAdobeGraniteAuthOauthAccesstokenProviderInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthAccesstokenProviderInfo(
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