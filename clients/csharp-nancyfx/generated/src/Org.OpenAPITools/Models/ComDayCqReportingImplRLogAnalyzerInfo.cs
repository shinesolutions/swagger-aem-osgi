using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReportingImplRLogAnalyzerInfo
    /// </summary>
    public sealed class ComDayCqReportingImplRLogAnalyzerInfo:  IEquatable<ComDayCqReportingImplRLogAnalyzerInfo>
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
        public ComDayCqReportingImplRLogAnalyzerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReportingImplRLogAnalyzerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReportingImplRLogAnalyzerInfo()
        {
        }

        private ComDayCqReportingImplRLogAnalyzerInfo(string Pid, string Title, string Description, ComDayCqReportingImplRLogAnalyzerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReportingImplRLogAnalyzerInfo.
        /// </summary>
        /// <returns>ComDayCqReportingImplRLogAnalyzerInfoBuilder</returns>
        public static ComDayCqReportingImplRLogAnalyzerInfoBuilder Builder()
        {
            return new ComDayCqReportingImplRLogAnalyzerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReportingImplRLogAnalyzerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReportingImplRLogAnalyzerInfoBuilder</returns>
        public ComDayCqReportingImplRLogAnalyzerInfoBuilder With()
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

        public bool Equals(ComDayCqReportingImplRLogAnalyzerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReportingImplRLogAnalyzerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReportingImplRLogAnalyzerInfo</param>
        /// <param name="right">Compared (ComDayCqReportingImplRLogAnalyzerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReportingImplRLogAnalyzerInfo left, ComDayCqReportingImplRLogAnalyzerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReportingImplRLogAnalyzerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReportingImplRLogAnalyzerInfo</param>
        /// <param name="right">Compared (ComDayCqReportingImplRLogAnalyzerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReportingImplRLogAnalyzerInfo left, ComDayCqReportingImplRLogAnalyzerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReportingImplRLogAnalyzerInfo.
        /// </summary>
        public sealed class ComDayCqReportingImplRLogAnalyzerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqReportingImplRLogAnalyzerProperties _Properties;

            internal ComDayCqReportingImplRLogAnalyzerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplRLogAnalyzerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqReportingImplRLogAnalyzerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplRLogAnalyzerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqReportingImplRLogAnalyzerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplRLogAnalyzerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqReportingImplRLogAnalyzerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReportingImplRLogAnalyzerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqReportingImplRLogAnalyzerInfoBuilder Properties(ComDayCqReportingImplRLogAnalyzerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReportingImplRLogAnalyzerInfo.
            /// </summary>
            /// <returns>ComDayCqReportingImplRLogAnalyzerInfo</returns>
            public ComDayCqReportingImplRLogAnalyzerInfo Build()
            {
                Validate();
                return new ComDayCqReportingImplRLogAnalyzerInfo(
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