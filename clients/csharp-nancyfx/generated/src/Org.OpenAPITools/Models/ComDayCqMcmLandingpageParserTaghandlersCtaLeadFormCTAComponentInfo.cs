using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo
    /// </summary>
    public sealed class ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo:  IEquatable<ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo>
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
        public ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo()
        {
        }

        private ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo(string Pid, string Title, string Description, ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo.
        /// </summary>
        /// <returns>ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfoBuilder</returns>
        public static ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfoBuilder Builder()
        {
            return new ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfoBuilder</returns>
        public ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfoBuilder With()
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

        public bool Equals(ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo</param>
        /// <param name="right">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo left, ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo</param>
        /// <param name="right">Compared (ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo left, ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo.
        /// </summary>
        public sealed class ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties _Properties;

            internal ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfoBuilder Properties(ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo.
            /// </summary>
            /// <returns>ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo</returns>
            public ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo Build()
            {
                Validate();
                return new ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo(
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