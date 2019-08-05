using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteInfocollectorInfoCollectorInfo
    /// </summary>
    public sealed class ComAdobeGraniteInfocollectorInfoCollectorInfo:  IEquatable<ComAdobeGraniteInfocollectorInfoCollectorInfo>
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
        public ComAdobeGraniteInfocollectorInfoCollectorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteInfocollectorInfoCollectorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteInfocollectorInfoCollectorInfo()
        {
        }

        private ComAdobeGraniteInfocollectorInfoCollectorInfo(string Pid, string Title, string Description, ComAdobeGraniteInfocollectorInfoCollectorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteInfocollectorInfoCollectorInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteInfocollectorInfoCollectorInfoBuilder</returns>
        public static ComAdobeGraniteInfocollectorInfoCollectorInfoBuilder Builder()
        {
            return new ComAdobeGraniteInfocollectorInfoCollectorInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteInfocollectorInfoCollectorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteInfocollectorInfoCollectorInfoBuilder</returns>
        public ComAdobeGraniteInfocollectorInfoCollectorInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteInfocollectorInfoCollectorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteInfocollectorInfoCollectorInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteInfocollectorInfoCollectorInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteInfocollectorInfoCollectorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteInfocollectorInfoCollectorInfo left, ComAdobeGraniteInfocollectorInfoCollectorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteInfocollectorInfoCollectorInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteInfocollectorInfoCollectorInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteInfocollectorInfoCollectorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteInfocollectorInfoCollectorInfo left, ComAdobeGraniteInfocollectorInfoCollectorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteInfocollectorInfoCollectorInfo.
        /// </summary>
        public sealed class ComAdobeGraniteInfocollectorInfoCollectorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteInfocollectorInfoCollectorProperties _Properties;

            internal ComAdobeGraniteInfocollectorInfoCollectorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteInfocollectorInfoCollectorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteInfocollectorInfoCollectorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteInfocollectorInfoCollectorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteInfocollectorInfoCollectorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteInfocollectorInfoCollectorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteInfocollectorInfoCollectorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteInfocollectorInfoCollectorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteInfocollectorInfoCollectorInfoBuilder Properties(ComAdobeGraniteInfocollectorInfoCollectorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteInfocollectorInfoCollectorInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteInfocollectorInfoCollectorInfo</returns>
            public ComAdobeGraniteInfocollectorInfoCollectorInfo Build()
            {
                Validate();
                return new ComAdobeGraniteInfocollectorInfoCollectorInfo(
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