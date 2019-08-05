using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo
    /// </summary>
    public sealed class ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo:  IEquatable<ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo>
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
        public ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo()
        {
        }

        private ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo(string Pid, string Title, string Description, ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfoBuilder</returns>
        public static ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfoBuilder Builder()
        {
            return new ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfoBuilder</returns>
        public ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo left, ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo left, ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties _Properties;

            internal ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfoBuilder Properties(ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo</returns>
            public ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo(
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