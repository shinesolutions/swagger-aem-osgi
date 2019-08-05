using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo
    /// </summary>
    public sealed class ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo:  IEquatable<ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo>
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
        public ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo()
        {
        }

        private ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo(string Pid, string Title, string Description, ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.
        /// </summary>
        /// <returns>ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfoBuilder</returns>
        public static ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfoBuilder Builder()
        {
            return new ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfoBuilder</returns>
        public ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfoBuilder With()
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

        public bool Equals(ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo</param>
        /// <param name="right">Compared (ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo left, ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo</param>
        /// <param name="right">Compared (ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo left, ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.
        /// </summary>
        public sealed class ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties _Properties;

            internal ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfoBuilder Properties(ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.
            /// </summary>
            /// <returns>ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo</returns>
            public ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo Build()
            {
                Validate();
                return new ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo(
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