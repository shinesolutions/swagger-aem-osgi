using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo:  IEquatable<ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo>
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
        public ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo()
        {
        }

        private ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo(string Pid, string Title, string Description, ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteLoggingImplLogErrorHealthCheckInfoBuilder</returns>
        public static ComAdobeGraniteLoggingImplLogErrorHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeGraniteLoggingImplLogErrorHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteLoggingImplLogErrorHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteLoggingImplLogErrorHealthCheckInfoBuilder</returns>
        public ComAdobeGraniteLoggingImplLogErrorHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo left, ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo left, ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeGraniteLoggingImplLogErrorHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties _Properties;

            internal ComAdobeGraniteLoggingImplLogErrorHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteLoggingImplLogErrorHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteLoggingImplLogErrorHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteLoggingImplLogErrorHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteLoggingImplLogErrorHealthCheckInfoBuilder Properties(ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo</returns>
            public ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo(
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