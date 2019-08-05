using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo
    /// </summary>
    public sealed class ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo:  IEquatable<ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo>
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
        public ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo()
        {
        }

        private ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo(string Pid, string Title, string Description, ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfoBuilder</returns>
        public static ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfoBuilder Builder()
        {
            return new ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfoBuilder</returns>
        public ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo left, ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo left, ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties _Properties;

            internal ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfoBuilder Properties(ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo</returns>
            public ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo(
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