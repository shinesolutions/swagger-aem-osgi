using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteThreaddumpThreadDumpCollectorInfo
    /// </summary>
    public sealed class ComAdobeGraniteThreaddumpThreadDumpCollectorInfo:  IEquatable<ComAdobeGraniteThreaddumpThreadDumpCollectorInfo>
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
        public ComAdobeGraniteThreaddumpThreadDumpCollectorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteThreaddumpThreadDumpCollectorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteThreaddumpThreadDumpCollectorInfo()
        {
        }

        private ComAdobeGraniteThreaddumpThreadDumpCollectorInfo(string Pid, string Title, string Description, ComAdobeGraniteThreaddumpThreadDumpCollectorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteThreaddumpThreadDumpCollectorInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteThreaddumpThreadDumpCollectorInfoBuilder</returns>
        public static ComAdobeGraniteThreaddumpThreadDumpCollectorInfoBuilder Builder()
        {
            return new ComAdobeGraniteThreaddumpThreadDumpCollectorInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteThreaddumpThreadDumpCollectorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteThreaddumpThreadDumpCollectorInfoBuilder</returns>
        public ComAdobeGraniteThreaddumpThreadDumpCollectorInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteThreaddumpThreadDumpCollectorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteThreaddumpThreadDumpCollectorInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteThreaddumpThreadDumpCollectorInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteThreaddumpThreadDumpCollectorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteThreaddumpThreadDumpCollectorInfo left, ComAdobeGraniteThreaddumpThreadDumpCollectorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteThreaddumpThreadDumpCollectorInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteThreaddumpThreadDumpCollectorInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteThreaddumpThreadDumpCollectorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteThreaddumpThreadDumpCollectorInfo left, ComAdobeGraniteThreaddumpThreadDumpCollectorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteThreaddumpThreadDumpCollectorInfo.
        /// </summary>
        public sealed class ComAdobeGraniteThreaddumpThreadDumpCollectorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteThreaddumpThreadDumpCollectorProperties _Properties;

            internal ComAdobeGraniteThreaddumpThreadDumpCollectorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteThreaddumpThreadDumpCollectorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteThreaddumpThreadDumpCollectorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteThreaddumpThreadDumpCollectorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteThreaddumpThreadDumpCollectorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteThreaddumpThreadDumpCollectorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteThreaddumpThreadDumpCollectorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteThreaddumpThreadDumpCollectorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteThreaddumpThreadDumpCollectorInfoBuilder Properties(ComAdobeGraniteThreaddumpThreadDumpCollectorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteThreaddumpThreadDumpCollectorInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteThreaddumpThreadDumpCollectorInfo</returns>
            public ComAdobeGraniteThreaddumpThreadDumpCollectorInfo Build()
            {
                Validate();
                return new ComAdobeGraniteThreaddumpThreadDumpCollectorInfo(
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