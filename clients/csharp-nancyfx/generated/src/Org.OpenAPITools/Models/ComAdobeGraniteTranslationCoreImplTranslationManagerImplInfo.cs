using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo
    /// </summary>
    public sealed class ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo:  IEquatable<ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo>
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
        public ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo()
        {
        }

        private ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo(string Pid, string Title, string Description, ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfoBuilder</returns>
        public static ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfoBuilder Builder()
        {
            return new ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfoBuilder</returns>
        public ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo left, ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo left, ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo.
        /// </summary>
        public sealed class ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties _Properties;

            internal ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfoBuilder Properties(ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo</returns>
            public ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo Build()
            {
                Validate();
                return new ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo(
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