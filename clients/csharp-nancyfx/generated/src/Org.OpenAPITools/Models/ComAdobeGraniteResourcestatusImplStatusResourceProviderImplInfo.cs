using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo
    /// </summary>
    public sealed class ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo:  IEquatable<ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo>
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
        public ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo()
        {
        }

        private ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo(string Pid, string Title, string Description, ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfoBuilder</returns>
        public static ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfoBuilder Builder()
        {
            return new ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfoBuilder</returns>
        public ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo left, ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo left, ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo.
        /// </summary>
        public sealed class ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties _Properties;

            internal ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfoBuilder Properties(ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo</returns>
            public ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo Build()
            {
                Validate();
                return new ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo(
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