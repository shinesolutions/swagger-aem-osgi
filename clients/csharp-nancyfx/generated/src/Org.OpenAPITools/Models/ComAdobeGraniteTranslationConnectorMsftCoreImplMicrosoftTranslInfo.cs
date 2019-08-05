using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo
    /// </summary>
    public sealed class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo:  IEquatable<ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo>
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
        public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo()
        {
        }

        private ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo(string Pid, string Title, string Description, ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfoBuilder</returns>
        public static ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfoBuilder Builder()
        {
            return new ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfoBuilder</returns>
        public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo left, ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo left, ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo.
        /// </summary>
        public sealed class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties _Properties;

            internal ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfoBuilder Properties(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo</returns>
            public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo Build()
            {
                Validate();
                return new ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo(
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