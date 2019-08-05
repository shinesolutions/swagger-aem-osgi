using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo:  IEquatable<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo>
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
        public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo()
        {
        }

        private ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo(string Pid, string Title, string Description, ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfoBuilder</returns>
        public static ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfoBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfoBuilder</returns>
        public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo left, ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo left, ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties _Properties;

            internal ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfoBuilder Properties(ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo</returns>
            public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo(
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