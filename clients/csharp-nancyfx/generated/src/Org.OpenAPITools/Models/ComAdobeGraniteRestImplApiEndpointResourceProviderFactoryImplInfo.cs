using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo
    /// </summary>
    public sealed class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo:  IEquatable<ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo>
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
        public ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo()
        {
        }

        private ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo(string Pid, string Title, string Description, ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfoBuilder</returns>
        public static ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfoBuilder Builder()
        {
            return new ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfoBuilder</returns>
        public ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo left, ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo left, ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo.
        /// </summary>
        public sealed class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties _Properties;

            internal ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfoBuilder Properties(ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo</returns>
            public ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo Build()
            {
                Validate();
                return new ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo(
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