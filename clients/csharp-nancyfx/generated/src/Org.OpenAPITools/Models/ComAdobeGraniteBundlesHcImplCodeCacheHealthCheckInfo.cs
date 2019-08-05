using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo:  IEquatable<ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo>
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
        public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo()
        {
        }

        private ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo(string Pid, string Title, string Description, ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoBuilder</returns>
        public static ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoBuilder</returns>
        public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo left, ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo left, ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties _Properties;

            internal ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoBuilder Properties(ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo</returns>
            public ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo(
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