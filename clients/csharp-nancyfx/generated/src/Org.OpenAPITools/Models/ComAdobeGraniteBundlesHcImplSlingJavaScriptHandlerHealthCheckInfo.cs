using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo:  IEquatable<ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo>
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
        public ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo()
        {
        }

        private ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo(string Pid, string Title, string Description, ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfoBuilder</returns>
        public static ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfoBuilder</returns>
        public ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo left, ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo left, ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties _Properties;

            internal ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfoBuilder Properties(ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo</returns>
            public ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo(
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