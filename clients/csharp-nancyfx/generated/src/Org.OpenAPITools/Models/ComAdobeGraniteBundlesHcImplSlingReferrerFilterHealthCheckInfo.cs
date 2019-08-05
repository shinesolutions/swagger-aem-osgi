using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo:  IEquatable<ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo>
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
        public ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo()
        {
        }

        private ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo(string Pid, string Title, string Description, ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfoBuilder</returns>
        public static ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfoBuilder</returns>
        public ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo left, ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo left, ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties _Properties;

            internal ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfoBuilder Properties(ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo</returns>
            public ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo(
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