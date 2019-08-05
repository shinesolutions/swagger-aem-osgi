using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo:  IEquatable<ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo>
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
        public ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo()
        {
        }

        private ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo(string Pid, string Title, string Description, ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfoBuilder</returns>
        public static ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfoBuilder</returns>
        public ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo left, ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo left, ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties _Properties;

            internal ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfoBuilder Properties(ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo</returns>
            public ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo(
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