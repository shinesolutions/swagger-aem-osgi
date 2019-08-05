using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo
    /// </summary>
    public sealed class ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo:  IEquatable<ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo>
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
        public ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo()
        {
        }

        private ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo(string Pid, string Title, string Description, ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo.
        /// </summary>
        /// <returns>ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfoBuilder</returns>
        public static ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfoBuilder Builder()
        {
            return new ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfoBuilder</returns>
        public ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfoBuilder With()
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

        public bool Equals(ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo</param>
        /// <param name="right">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo left, ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo</param>
        /// <param name="right">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo left, ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo.
        /// </summary>
        public sealed class ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties _Properties;

            internal ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfoBuilder Properties(ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo.
            /// </summary>
            /// <returns>ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo</returns>
            public ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo Build()
            {
                Validate();
                return new ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo(
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