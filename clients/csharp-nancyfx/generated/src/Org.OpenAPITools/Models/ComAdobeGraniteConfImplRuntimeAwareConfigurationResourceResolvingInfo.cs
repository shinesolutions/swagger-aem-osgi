using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo
    /// </summary>
    public sealed class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo:  IEquatable<ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo>
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
        public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo()
        {
        }

        private ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo(string Pid, string Title, string Description, ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfoBuilder</returns>
        public static ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfoBuilder Builder()
        {
            return new ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfoBuilder</returns>
        public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo left, ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo left, ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo.
        /// </summary>
        public sealed class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties _Properties;

            internal ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfoBuilder Properties(ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo</returns>
            public ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo Build()
            {
                Validate();
                return new ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo(
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