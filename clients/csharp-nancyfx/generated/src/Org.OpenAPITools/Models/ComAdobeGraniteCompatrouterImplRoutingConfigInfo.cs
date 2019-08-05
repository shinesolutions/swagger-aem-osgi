using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteCompatrouterImplRoutingConfigInfo
    /// </summary>
    public sealed class ComAdobeGraniteCompatrouterImplRoutingConfigInfo:  IEquatable<ComAdobeGraniteCompatrouterImplRoutingConfigInfo>
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
        public ComAdobeGraniteCompatrouterImplRoutingConfigProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteCompatrouterImplRoutingConfigInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteCompatrouterImplRoutingConfigInfo()
        {
        }

        private ComAdobeGraniteCompatrouterImplRoutingConfigInfo(string Pid, string Title, string Description, ComAdobeGraniteCompatrouterImplRoutingConfigProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteCompatrouterImplRoutingConfigInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteCompatrouterImplRoutingConfigInfoBuilder</returns>
        public static ComAdobeGraniteCompatrouterImplRoutingConfigInfoBuilder Builder()
        {
            return new ComAdobeGraniteCompatrouterImplRoutingConfigInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteCompatrouterImplRoutingConfigInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteCompatrouterImplRoutingConfigInfoBuilder</returns>
        public ComAdobeGraniteCompatrouterImplRoutingConfigInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteCompatrouterImplRoutingConfigInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteCompatrouterImplRoutingConfigInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCompatrouterImplRoutingConfigInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteCompatrouterImplRoutingConfigInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteCompatrouterImplRoutingConfigInfo left, ComAdobeGraniteCompatrouterImplRoutingConfigInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteCompatrouterImplRoutingConfigInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCompatrouterImplRoutingConfigInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteCompatrouterImplRoutingConfigInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteCompatrouterImplRoutingConfigInfo left, ComAdobeGraniteCompatrouterImplRoutingConfigInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteCompatrouterImplRoutingConfigInfo.
        /// </summary>
        public sealed class ComAdobeGraniteCompatrouterImplRoutingConfigInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteCompatrouterImplRoutingConfigProperties _Properties;

            internal ComAdobeGraniteCompatrouterImplRoutingConfigInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCompatrouterImplRoutingConfigInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteCompatrouterImplRoutingConfigInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCompatrouterImplRoutingConfigInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteCompatrouterImplRoutingConfigInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCompatrouterImplRoutingConfigInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteCompatrouterImplRoutingConfigInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCompatrouterImplRoutingConfigInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteCompatrouterImplRoutingConfigInfoBuilder Properties(ComAdobeGraniteCompatrouterImplRoutingConfigProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteCompatrouterImplRoutingConfigInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteCompatrouterImplRoutingConfigInfo</returns>
            public ComAdobeGraniteCompatrouterImplRoutingConfigInfo Build()
            {
                Validate();
                return new ComAdobeGraniteCompatrouterImplRoutingConfigInfo(
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