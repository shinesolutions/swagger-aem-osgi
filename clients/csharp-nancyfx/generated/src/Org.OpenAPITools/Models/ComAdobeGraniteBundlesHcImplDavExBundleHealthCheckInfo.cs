using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo:  IEquatable<ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo>
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
        public ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo()
        {
        }

        private ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo(string Pid, string Title, string Description, ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfoBuilder</returns>
        public static ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfoBuilder</returns>
        public ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo left, ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo left, ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties _Properties;

            internal ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfoBuilder Properties(ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo</returns>
            public ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo(
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