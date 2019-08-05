using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteLoggingImplLogAnalyserImplInfo
    /// </summary>
    public sealed class ComAdobeGraniteLoggingImplLogAnalyserImplInfo:  IEquatable<ComAdobeGraniteLoggingImplLogAnalyserImplInfo>
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
        public ComAdobeGraniteLoggingImplLogAnalyserImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteLoggingImplLogAnalyserImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteLoggingImplLogAnalyserImplInfo()
        {
        }

        private ComAdobeGraniteLoggingImplLogAnalyserImplInfo(string Pid, string Title, string Description, ComAdobeGraniteLoggingImplLogAnalyserImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteLoggingImplLogAnalyserImplInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteLoggingImplLogAnalyserImplInfoBuilder</returns>
        public static ComAdobeGraniteLoggingImplLogAnalyserImplInfoBuilder Builder()
        {
            return new ComAdobeGraniteLoggingImplLogAnalyserImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteLoggingImplLogAnalyserImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteLoggingImplLogAnalyserImplInfoBuilder</returns>
        public ComAdobeGraniteLoggingImplLogAnalyserImplInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteLoggingImplLogAnalyserImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteLoggingImplLogAnalyserImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteLoggingImplLogAnalyserImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteLoggingImplLogAnalyserImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteLoggingImplLogAnalyserImplInfo left, ComAdobeGraniteLoggingImplLogAnalyserImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteLoggingImplLogAnalyserImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteLoggingImplLogAnalyserImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteLoggingImplLogAnalyserImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteLoggingImplLogAnalyserImplInfo left, ComAdobeGraniteLoggingImplLogAnalyserImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteLoggingImplLogAnalyserImplInfo.
        /// </summary>
        public sealed class ComAdobeGraniteLoggingImplLogAnalyserImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteLoggingImplLogAnalyserImplProperties _Properties;

            internal ComAdobeGraniteLoggingImplLogAnalyserImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteLoggingImplLogAnalyserImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteLoggingImplLogAnalyserImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteLoggingImplLogAnalyserImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteLoggingImplLogAnalyserImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteLoggingImplLogAnalyserImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteLoggingImplLogAnalyserImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteLoggingImplLogAnalyserImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteLoggingImplLogAnalyserImplInfoBuilder Properties(ComAdobeGraniteLoggingImplLogAnalyserImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteLoggingImplLogAnalyserImplInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteLoggingImplLogAnalyserImplInfo</returns>
            public ComAdobeGraniteLoggingImplLogAnalyserImplInfo Build()
            {
                Validate();
                return new ComAdobeGraniteLoggingImplLogAnalyserImplInfo(
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