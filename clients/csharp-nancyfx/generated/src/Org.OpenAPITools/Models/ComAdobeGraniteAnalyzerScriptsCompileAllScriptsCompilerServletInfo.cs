using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo
    /// </summary>
    public sealed class ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo:  IEquatable<ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo>
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
        public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties Properties { get; private set; }

        /// <summary>
        /// BundleLocation
        /// </summary>
        public string BundleLocation { get; private set; }

        /// <summary>
        /// ServiceLocation
        /// </summary>
        public string ServiceLocation { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo()
        {
        }

        private ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo(string Pid, string Title, string Description, ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfoBuilder</returns>
        public static ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfoBuilder Builder()
        {
            return new ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfoBuilder</returns>
        public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties)
                .BundleLocation(BundleLocation)
                .ServiceLocation(ServiceLocation);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo left, ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo left, ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfoBuilder Properties(ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo</returns>
            public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties,
                    BundleLocation: _BundleLocation,
                    ServiceLocation: _ServiceLocation
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}