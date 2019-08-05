using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo:  IEquatable<ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo>
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
        public ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo()
        {
        }

        private ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo(string Pid, string Title, string Description, ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfoBuilder</returns>
        public static ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfoBuilder</returns>
        public ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo left, ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo left, ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties _Properties;

            internal ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfoBuilder Properties(ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo</returns>
            public ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo(
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