using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo
    /// </summary>
    public sealed class ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo:  IEquatable<ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo>
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
        public ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo()
        {
        }

        private ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo(string Pid, string Title, string Description, ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteI18nImplBundlePseudoTranslationsInfoBuilder</returns>
        public static ComAdobeGraniteI18nImplBundlePseudoTranslationsInfoBuilder Builder()
        {
            return new ComAdobeGraniteI18nImplBundlePseudoTranslationsInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteI18nImplBundlePseudoTranslationsInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteI18nImplBundlePseudoTranslationsInfoBuilder</returns>
        public ComAdobeGraniteI18nImplBundlePseudoTranslationsInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo left, ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo left, ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.
        /// </summary>
        public sealed class ComAdobeGraniteI18nImplBundlePseudoTranslationsInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties _Properties;

            internal ComAdobeGraniteI18nImplBundlePseudoTranslationsInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteI18nImplBundlePseudoTranslationsInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteI18nImplBundlePseudoTranslationsInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteI18nImplBundlePseudoTranslationsInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteI18nImplBundlePseudoTranslationsInfoBuilder Properties(ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo</returns>
            public ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo Build()
            {
                Validate();
                return new ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo(
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