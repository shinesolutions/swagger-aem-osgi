using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo:  IEquatable<ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo>
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
        public ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo()
        {
        }

        private ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo(string Pid, string Title, string Description, ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfoBuilder</returns>
        public static ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfoBuilder</returns>
        public ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo left, ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo left, ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties _Properties;

            internal ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfoBuilder Properties(ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo</returns>
            public ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo(
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