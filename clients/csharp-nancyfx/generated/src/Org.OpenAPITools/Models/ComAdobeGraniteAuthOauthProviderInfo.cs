using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthProviderInfo
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthProviderInfo:  IEquatable<ComAdobeGraniteAuthOauthProviderInfo>
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
        public ComAdobeGraniteAuthOauthProviderProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthOauthProviderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthProviderInfo()
        {
        }

        private ComAdobeGraniteAuthOauthProviderInfo(string Pid, string Title, string Description, ComAdobeGraniteAuthOauthProviderProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthProviderInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthProviderInfoBuilder</returns>
        public static ComAdobeGraniteAuthOauthProviderInfoBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthProviderInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthProviderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthProviderInfoBuilder</returns>
        public ComAdobeGraniteAuthOauthProviderInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthOauthProviderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthProviderInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthProviderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthProviderInfo left, ComAdobeGraniteAuthOauthProviderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthProviderInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthProviderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthProviderInfo left, ComAdobeGraniteAuthOauthProviderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthProviderInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthProviderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAuthOauthProviderProperties _Properties;

            internal ComAdobeGraniteAuthOauthProviderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthProviderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAuthOauthProviderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthProviderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAuthOauthProviderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthProviderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAuthOauthProviderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthProviderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAuthOauthProviderInfoBuilder Properties(ComAdobeGraniteAuthOauthProviderProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthProviderInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthProviderInfo</returns>
            public ComAdobeGraniteAuthOauthProviderInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthProviderInfo(
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