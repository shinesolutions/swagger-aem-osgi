using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo:  IEquatable<ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo>
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
        public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo()
        {
        }

        private ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo(string Pid, string Title, string Description, ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfoBuilder</returns>
        public static ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfoBuilder</returns>
        public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo left, ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo left, ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties _Properties;

            internal ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfoBuilder Properties(ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo</returns>
            public ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo(
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