using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo
    /// </summary>
    public sealed class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo:  IEquatable<ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo>
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
        public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo()
        {
        }

        private ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo(string Pid, string Title, string Description, ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfoBuilder</returns>
        public static ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfoBuilder Builder()
        {
            return new ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfoBuilder</returns>
        public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo left, ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo left, ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties _Properties;

            internal ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfoBuilder Properties(ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo</returns>
            public ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo(
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