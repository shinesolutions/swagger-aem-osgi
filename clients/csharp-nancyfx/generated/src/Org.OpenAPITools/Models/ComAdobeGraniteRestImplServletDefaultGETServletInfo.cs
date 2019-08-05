using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRestImplServletDefaultGETServletInfo
    /// </summary>
    public sealed class ComAdobeGraniteRestImplServletDefaultGETServletInfo:  IEquatable<ComAdobeGraniteRestImplServletDefaultGETServletInfo>
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
        public ComAdobeGraniteRestImplServletDefaultGETServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRestImplServletDefaultGETServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRestImplServletDefaultGETServletInfo()
        {
        }

        private ComAdobeGraniteRestImplServletDefaultGETServletInfo(string Pid, string Title, string Description, ComAdobeGraniteRestImplServletDefaultGETServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRestImplServletDefaultGETServletInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteRestImplServletDefaultGETServletInfoBuilder</returns>
        public static ComAdobeGraniteRestImplServletDefaultGETServletInfoBuilder Builder()
        {
            return new ComAdobeGraniteRestImplServletDefaultGETServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRestImplServletDefaultGETServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRestImplServletDefaultGETServletInfoBuilder</returns>
        public ComAdobeGraniteRestImplServletDefaultGETServletInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteRestImplServletDefaultGETServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRestImplServletDefaultGETServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRestImplServletDefaultGETServletInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRestImplServletDefaultGETServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRestImplServletDefaultGETServletInfo left, ComAdobeGraniteRestImplServletDefaultGETServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRestImplServletDefaultGETServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRestImplServletDefaultGETServletInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRestImplServletDefaultGETServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRestImplServletDefaultGETServletInfo left, ComAdobeGraniteRestImplServletDefaultGETServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRestImplServletDefaultGETServletInfo.
        /// </summary>
        public sealed class ComAdobeGraniteRestImplServletDefaultGETServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteRestImplServletDefaultGETServletProperties _Properties;

            internal ComAdobeGraniteRestImplServletDefaultGETServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRestImplServletDefaultGETServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteRestImplServletDefaultGETServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRestImplServletDefaultGETServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteRestImplServletDefaultGETServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRestImplServletDefaultGETServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteRestImplServletDefaultGETServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRestImplServletDefaultGETServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteRestImplServletDefaultGETServletInfoBuilder Properties(ComAdobeGraniteRestImplServletDefaultGETServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRestImplServletDefaultGETServletInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteRestImplServletDefaultGETServletInfo</returns>
            public ComAdobeGraniteRestImplServletDefaultGETServletInfo Build()
            {
                Validate();
                return new ComAdobeGraniteRestImplServletDefaultGETServletInfo(
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