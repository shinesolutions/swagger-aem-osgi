using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo:  IEquatable<ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo>
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
        public ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo()
        {
        }

        private ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo(string Pid, string Title, string Description, ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplJobsHealthCheckInfoBuilder</returns>
        public static ComAdobeGraniteBundlesHcImplJobsHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeGraniteBundlesHcImplJobsHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteBundlesHcImplJobsHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplJobsHealthCheckInfoBuilder</returns>
        public ComAdobeGraniteBundlesHcImplJobsHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo left, ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo left, ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeGraniteBundlesHcImplJobsHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties _Properties;

            internal ComAdobeGraniteBundlesHcImplJobsHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteBundlesHcImplJobsHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteBundlesHcImplJobsHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteBundlesHcImplJobsHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteBundlesHcImplJobsHealthCheckInfoBuilder Properties(ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo</returns>
            public ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo(
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