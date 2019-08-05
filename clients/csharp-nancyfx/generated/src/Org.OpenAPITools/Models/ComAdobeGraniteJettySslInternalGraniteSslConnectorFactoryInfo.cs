using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo
    /// </summary>
    public sealed class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo:  IEquatable<ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo>
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
        public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties Properties { get; private set; }

        /// <summary>
        /// AdditionalProperties
        /// </summary>
        public string AdditionalProperties { get; private set; }

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
        /// Use ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo()
        {
        }

        private ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo(string Pid, string Title, string Description, ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties Properties, string AdditionalProperties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.AdditionalProperties = AdditionalProperties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBuilder</returns>
        public static ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBuilder Builder()
        {
            return new ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBuilder</returns>
        public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties)
                .AdditionalProperties(AdditionalProperties)
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

        public bool Equals(ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo left, ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo left, ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.
        /// </summary>
        public sealed class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties _Properties;
            private string _AdditionalProperties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBuilder Properties(ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.AdditionalProperties property.
            /// </summary>
            /// <param name="value">AdditionalProperties</param>
            public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBuilder AdditionalProperties(string value)
            {
                _AdditionalProperties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo</returns>
            public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo Build()
            {
                Validate();
                return new ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties,
                    AdditionalProperties: _AdditionalProperties,
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