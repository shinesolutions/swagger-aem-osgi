using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo
    /// </summary>
    public sealed class ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo:  IEquatable<ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo>
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
        public ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo()
        {
        }

        private ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo(string Pid, string Title, string Description, ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfoBuilder</returns>
        public static ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfoBuilder Builder()
        {
            return new ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfoBuilder</returns>
        public ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo left, ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo left, ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo.
        /// </summary>
        public sealed class ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties _Properties;

            internal ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfoBuilder Properties(ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo</returns>
            public ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo Build()
            {
                Validate();
                return new ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo(
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