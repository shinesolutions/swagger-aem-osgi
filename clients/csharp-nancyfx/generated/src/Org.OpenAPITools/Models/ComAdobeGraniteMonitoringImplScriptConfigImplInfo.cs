using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteMonitoringImplScriptConfigImplInfo
    /// </summary>
    public sealed class ComAdobeGraniteMonitoringImplScriptConfigImplInfo:  IEquatable<ComAdobeGraniteMonitoringImplScriptConfigImplInfo>
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
        public ComAdobeGraniteMonitoringImplScriptConfigImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteMonitoringImplScriptConfigImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteMonitoringImplScriptConfigImplInfo()
        {
        }

        private ComAdobeGraniteMonitoringImplScriptConfigImplInfo(string Pid, string Title, string Description, ComAdobeGraniteMonitoringImplScriptConfigImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteMonitoringImplScriptConfigImplInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteMonitoringImplScriptConfigImplInfoBuilder</returns>
        public static ComAdobeGraniteMonitoringImplScriptConfigImplInfoBuilder Builder()
        {
            return new ComAdobeGraniteMonitoringImplScriptConfigImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteMonitoringImplScriptConfigImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteMonitoringImplScriptConfigImplInfoBuilder</returns>
        public ComAdobeGraniteMonitoringImplScriptConfigImplInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteMonitoringImplScriptConfigImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteMonitoringImplScriptConfigImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteMonitoringImplScriptConfigImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteMonitoringImplScriptConfigImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteMonitoringImplScriptConfigImplInfo left, ComAdobeGraniteMonitoringImplScriptConfigImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteMonitoringImplScriptConfigImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteMonitoringImplScriptConfigImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteMonitoringImplScriptConfigImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteMonitoringImplScriptConfigImplInfo left, ComAdobeGraniteMonitoringImplScriptConfigImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteMonitoringImplScriptConfigImplInfo.
        /// </summary>
        public sealed class ComAdobeGraniteMonitoringImplScriptConfigImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteMonitoringImplScriptConfigImplProperties _Properties;

            internal ComAdobeGraniteMonitoringImplScriptConfigImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMonitoringImplScriptConfigImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteMonitoringImplScriptConfigImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMonitoringImplScriptConfigImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteMonitoringImplScriptConfigImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMonitoringImplScriptConfigImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteMonitoringImplScriptConfigImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMonitoringImplScriptConfigImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteMonitoringImplScriptConfigImplInfoBuilder Properties(ComAdobeGraniteMonitoringImplScriptConfigImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteMonitoringImplScriptConfigImplInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteMonitoringImplScriptConfigImplInfo</returns>
            public ComAdobeGraniteMonitoringImplScriptConfigImplInfo Build()
            {
                Validate();
                return new ComAdobeGraniteMonitoringImplScriptConfigImplInfo(
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