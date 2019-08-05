using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteContexthubImplContextHubImplInfo
    /// </summary>
    public sealed class ComAdobeGraniteContexthubImplContextHubImplInfo:  IEquatable<ComAdobeGraniteContexthubImplContextHubImplInfo>
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
        public ComAdobeGraniteContexthubImplContextHubImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteContexthubImplContextHubImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteContexthubImplContextHubImplInfo()
        {
        }

        private ComAdobeGraniteContexthubImplContextHubImplInfo(string Pid, string Title, string Description, ComAdobeGraniteContexthubImplContextHubImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteContexthubImplContextHubImplInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteContexthubImplContextHubImplInfoBuilder</returns>
        public static ComAdobeGraniteContexthubImplContextHubImplInfoBuilder Builder()
        {
            return new ComAdobeGraniteContexthubImplContextHubImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteContexthubImplContextHubImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteContexthubImplContextHubImplInfoBuilder</returns>
        public ComAdobeGraniteContexthubImplContextHubImplInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteContexthubImplContextHubImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteContexthubImplContextHubImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteContexthubImplContextHubImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteContexthubImplContextHubImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteContexthubImplContextHubImplInfo left, ComAdobeGraniteContexthubImplContextHubImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteContexthubImplContextHubImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteContexthubImplContextHubImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteContexthubImplContextHubImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteContexthubImplContextHubImplInfo left, ComAdobeGraniteContexthubImplContextHubImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteContexthubImplContextHubImplInfo.
        /// </summary>
        public sealed class ComAdobeGraniteContexthubImplContextHubImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteContexthubImplContextHubImplProperties _Properties;

            internal ComAdobeGraniteContexthubImplContextHubImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteContexthubImplContextHubImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteContexthubImplContextHubImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteContexthubImplContextHubImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteContexthubImplContextHubImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteContexthubImplContextHubImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteContexthubImplContextHubImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteContexthubImplContextHubImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteContexthubImplContextHubImplInfoBuilder Properties(ComAdobeGraniteContexthubImplContextHubImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteContexthubImplContextHubImplInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteContexthubImplContextHubImplInfo</returns>
            public ComAdobeGraniteContexthubImplContextHubImplInfo Build()
            {
                Validate();
                return new ComAdobeGraniteContexthubImplContextHubImplInfo(
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