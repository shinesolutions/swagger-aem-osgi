using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthImplGraniteProviderInfo
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthImplGraniteProviderInfo:  IEquatable<ComAdobeGraniteAuthOauthImplGraniteProviderInfo>
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
        public ComAdobeGraniteAuthOauthImplGraniteProviderProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthOauthImplGraniteProviderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthImplGraniteProviderInfo()
        {
        }

        private ComAdobeGraniteAuthOauthImplGraniteProviderInfo(string Pid, string Title, string Description, ComAdobeGraniteAuthOauthImplGraniteProviderProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthImplGraniteProviderInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplGraniteProviderInfoBuilder</returns>
        public static ComAdobeGraniteAuthOauthImplGraniteProviderInfoBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthImplGraniteProviderInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthImplGraniteProviderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplGraniteProviderInfoBuilder</returns>
        public ComAdobeGraniteAuthOauthImplGraniteProviderInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthOauthImplGraniteProviderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthImplGraniteProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplGraniteProviderInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplGraniteProviderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthImplGraniteProviderInfo left, ComAdobeGraniteAuthOauthImplGraniteProviderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthImplGraniteProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplGraniteProviderInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplGraniteProviderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthImplGraniteProviderInfo left, ComAdobeGraniteAuthOauthImplGraniteProviderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthImplGraniteProviderInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthImplGraniteProviderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAuthOauthImplGraniteProviderProperties _Properties;

            internal ComAdobeGraniteAuthOauthImplGraniteProviderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplGraniteProviderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAuthOauthImplGraniteProviderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplGraniteProviderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAuthOauthImplGraniteProviderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplGraniteProviderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAuthOauthImplGraniteProviderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplGraniteProviderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAuthOauthImplGraniteProviderInfoBuilder Properties(ComAdobeGraniteAuthOauthImplGraniteProviderProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthImplGraniteProviderInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthImplGraniteProviderInfo</returns>
            public ComAdobeGraniteAuthOauthImplGraniteProviderInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthImplGraniteProviderInfo(
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