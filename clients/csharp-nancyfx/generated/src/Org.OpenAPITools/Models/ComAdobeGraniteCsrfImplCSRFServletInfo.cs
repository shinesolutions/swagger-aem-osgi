using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteCsrfImplCSRFServletInfo
    /// </summary>
    public sealed class ComAdobeGraniteCsrfImplCSRFServletInfo:  IEquatable<ComAdobeGraniteCsrfImplCSRFServletInfo>
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
        public ComAdobeGraniteCsrfImplCSRFServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteCsrfImplCSRFServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteCsrfImplCSRFServletInfo()
        {
        }

        private ComAdobeGraniteCsrfImplCSRFServletInfo(string Pid, string Title, string Description, ComAdobeGraniteCsrfImplCSRFServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteCsrfImplCSRFServletInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteCsrfImplCSRFServletInfoBuilder</returns>
        public static ComAdobeGraniteCsrfImplCSRFServletInfoBuilder Builder()
        {
            return new ComAdobeGraniteCsrfImplCSRFServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteCsrfImplCSRFServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteCsrfImplCSRFServletInfoBuilder</returns>
        public ComAdobeGraniteCsrfImplCSRFServletInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteCsrfImplCSRFServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteCsrfImplCSRFServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCsrfImplCSRFServletInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteCsrfImplCSRFServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteCsrfImplCSRFServletInfo left, ComAdobeGraniteCsrfImplCSRFServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteCsrfImplCSRFServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCsrfImplCSRFServletInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteCsrfImplCSRFServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteCsrfImplCSRFServletInfo left, ComAdobeGraniteCsrfImplCSRFServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteCsrfImplCSRFServletInfo.
        /// </summary>
        public sealed class ComAdobeGraniteCsrfImplCSRFServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteCsrfImplCSRFServletProperties _Properties;

            internal ComAdobeGraniteCsrfImplCSRFServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCsrfImplCSRFServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteCsrfImplCSRFServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCsrfImplCSRFServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteCsrfImplCSRFServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCsrfImplCSRFServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteCsrfImplCSRFServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCsrfImplCSRFServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteCsrfImplCSRFServletInfoBuilder Properties(ComAdobeGraniteCsrfImplCSRFServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteCsrfImplCSRFServletInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteCsrfImplCSRFServletInfo</returns>
            public ComAdobeGraniteCsrfImplCSRFServletInfo Build()
            {
                Validate();
                return new ComAdobeGraniteCsrfImplCSRFServletInfo(
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