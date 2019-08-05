using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo
    /// </summary>
    public sealed class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo:  IEquatable<ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo>
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
        public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties Properties { get; private set; }

        /// <summary>
        /// BundleLocation
        /// </summary>
        public string BundleLocation { get; private set; }

        /// <summary>
        /// ServiceLocation
        /// </summary>
        public string ServiceLocation { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo()
        {
        }

        private ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo(string Pid, string Title, string Description, ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoBuilder</returns>
        public static ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoBuilder Builder()
        {
            return new ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoBuilder</returns>
        public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties)
                .BundleLocation(BundleLocation)
                .ServiceLocation(ServiceLocation);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo left, ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo left, ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoBuilder Properties(ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo</returns>
            public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties,
                    BundleLocation: _BundleLocation,
                    ServiceLocation: _ServiceLocation
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}