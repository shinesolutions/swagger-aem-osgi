using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo
    /// </summary>
    public sealed class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo:  IEquatable<ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo>
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
        public ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo()
        {
        }

        private ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo(string Pid, string Title, string Description, ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoBuilder</returns>
        public static ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoBuilder Builder()
        {
            return new ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoBuilder</returns>
        public ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo left, ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo left, ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo.
        /// </summary>
        public sealed class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties _Properties;

            internal ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoBuilder Properties(ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo</returns>
            public ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo Build()
            {
                Validate();
                return new ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo(
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