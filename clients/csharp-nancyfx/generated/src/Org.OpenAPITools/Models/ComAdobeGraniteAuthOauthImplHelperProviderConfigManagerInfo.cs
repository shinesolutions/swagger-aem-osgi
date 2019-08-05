using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo
    /// </summary>
    public sealed class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo:  IEquatable<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo>
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
        public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties Properties { get; private set; }

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
        /// Use ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo()
        {
        }

        private ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo(string Pid, string Title, string Description, ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoBuilder</returns>
        public static ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoBuilder Builder()
        {
            return new ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoBuilder</returns>
        public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo left, ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo left, ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoBuilder Properties(ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo</returns>
            public ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo(
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