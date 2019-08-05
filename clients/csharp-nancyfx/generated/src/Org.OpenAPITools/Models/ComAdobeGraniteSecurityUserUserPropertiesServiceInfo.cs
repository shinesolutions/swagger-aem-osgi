using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteSecurityUserUserPropertiesServiceInfo
    /// </summary>
    public sealed class ComAdobeGraniteSecurityUserUserPropertiesServiceInfo:  IEquatable<ComAdobeGraniteSecurityUserUserPropertiesServiceInfo>
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
        public ComAdobeGraniteSecurityUserUserPropertiesServiceProperties Properties { get; private set; }

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
        /// Use ComAdobeGraniteSecurityUserUserPropertiesServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteSecurityUserUserPropertiesServiceInfo()
        {
        }

        private ComAdobeGraniteSecurityUserUserPropertiesServiceInfo(string Pid, string Title, string Description, ComAdobeGraniteSecurityUserUserPropertiesServiceProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteSecurityUserUserPropertiesServiceInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteSecurityUserUserPropertiesServiceInfoBuilder</returns>
        public static ComAdobeGraniteSecurityUserUserPropertiesServiceInfoBuilder Builder()
        {
            return new ComAdobeGraniteSecurityUserUserPropertiesServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteSecurityUserUserPropertiesServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteSecurityUserUserPropertiesServiceInfoBuilder</returns>
        public ComAdobeGraniteSecurityUserUserPropertiesServiceInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteSecurityUserUserPropertiesServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteSecurityUserUserPropertiesServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteSecurityUserUserPropertiesServiceInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteSecurityUserUserPropertiesServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteSecurityUserUserPropertiesServiceInfo left, ComAdobeGraniteSecurityUserUserPropertiesServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteSecurityUserUserPropertiesServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteSecurityUserUserPropertiesServiceInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteSecurityUserUserPropertiesServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteSecurityUserUserPropertiesServiceInfo left, ComAdobeGraniteSecurityUserUserPropertiesServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteSecurityUserUserPropertiesServiceInfo.
        /// </summary>
        public sealed class ComAdobeGraniteSecurityUserUserPropertiesServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteSecurityUserUserPropertiesServiceProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeGraniteSecurityUserUserPropertiesServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSecurityUserUserPropertiesServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteSecurityUserUserPropertiesServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSecurityUserUserPropertiesServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteSecurityUserUserPropertiesServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSecurityUserUserPropertiesServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteSecurityUserUserPropertiesServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSecurityUserUserPropertiesServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteSecurityUserUserPropertiesServiceInfoBuilder Properties(ComAdobeGraniteSecurityUserUserPropertiesServiceProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSecurityUserUserPropertiesServiceInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeGraniteSecurityUserUserPropertiesServiceInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSecurityUserUserPropertiesServiceInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeGraniteSecurityUserUserPropertiesServiceInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteSecurityUserUserPropertiesServiceInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteSecurityUserUserPropertiesServiceInfo</returns>
            public ComAdobeGraniteSecurityUserUserPropertiesServiceInfo Build()
            {
                Validate();
                return new ComAdobeGraniteSecurityUserUserPropertiesServiceInfo(
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