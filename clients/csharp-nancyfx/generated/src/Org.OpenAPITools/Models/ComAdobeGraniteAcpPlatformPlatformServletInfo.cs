using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAcpPlatformPlatformServletInfo
    /// </summary>
    public sealed class ComAdobeGraniteAcpPlatformPlatformServletInfo:  IEquatable<ComAdobeGraniteAcpPlatformPlatformServletInfo>
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
        public ComAdobeGraniteAcpPlatformPlatformServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAcpPlatformPlatformServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAcpPlatformPlatformServletInfo()
        {
        }

        private ComAdobeGraniteAcpPlatformPlatformServletInfo(string Pid, string Title, string Description, ComAdobeGraniteAcpPlatformPlatformServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAcpPlatformPlatformServletInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAcpPlatformPlatformServletInfoBuilder</returns>
        public static ComAdobeGraniteAcpPlatformPlatformServletInfoBuilder Builder()
        {
            return new ComAdobeGraniteAcpPlatformPlatformServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAcpPlatformPlatformServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAcpPlatformPlatformServletInfoBuilder</returns>
        public ComAdobeGraniteAcpPlatformPlatformServletInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteAcpPlatformPlatformServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAcpPlatformPlatformServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAcpPlatformPlatformServletInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAcpPlatformPlatformServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAcpPlatformPlatformServletInfo left, ComAdobeGraniteAcpPlatformPlatformServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAcpPlatformPlatformServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAcpPlatformPlatformServletInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAcpPlatformPlatformServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAcpPlatformPlatformServletInfo left, ComAdobeGraniteAcpPlatformPlatformServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAcpPlatformPlatformServletInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAcpPlatformPlatformServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAcpPlatformPlatformServletProperties _Properties;

            internal ComAdobeGraniteAcpPlatformPlatformServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAcpPlatformPlatformServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAcpPlatformPlatformServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAcpPlatformPlatformServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAcpPlatformPlatformServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAcpPlatformPlatformServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAcpPlatformPlatformServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAcpPlatformPlatformServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAcpPlatformPlatformServletInfoBuilder Properties(ComAdobeGraniteAcpPlatformPlatformServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAcpPlatformPlatformServletInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAcpPlatformPlatformServletInfo</returns>
            public ComAdobeGraniteAcpPlatformPlatformServletInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAcpPlatformPlatformServletInfo(
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