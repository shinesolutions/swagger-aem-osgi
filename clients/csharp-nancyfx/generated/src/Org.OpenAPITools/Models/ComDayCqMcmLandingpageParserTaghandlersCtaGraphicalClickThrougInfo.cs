using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo
    /// </summary>
    public sealed class ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo:  IEquatable<ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo>
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
        public ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo()
        {
        }

        private ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo(string Pid, string Title, string Description, ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo.
        /// </summary>
        /// <returns>ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfoBuilder</returns>
        public static ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfoBuilder Builder()
        {
            return new ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfoBuilder</returns>
        public ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfoBuilder With()
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

        public bool Equals(ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo</param>
        /// <param name="right">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo left, ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo</param>
        /// <param name="right">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo left, ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo.
        /// </summary>
        public sealed class ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties _Properties;

            internal ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfoBuilder Properties(ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo.
            /// </summary>
            /// <returns>ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo</returns>
            public ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo Build()
            {
                Validate();
                return new ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo(
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