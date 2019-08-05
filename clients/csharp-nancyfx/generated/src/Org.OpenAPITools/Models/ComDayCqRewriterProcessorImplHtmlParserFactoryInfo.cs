using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqRewriterProcessorImplHtmlParserFactoryInfo
    /// </summary>
    public sealed class ComDayCqRewriterProcessorImplHtmlParserFactoryInfo:  IEquatable<ComDayCqRewriterProcessorImplHtmlParserFactoryInfo>
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
        public ComDayCqRewriterProcessorImplHtmlParserFactoryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqRewriterProcessorImplHtmlParserFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqRewriterProcessorImplHtmlParserFactoryInfo()
        {
        }

        private ComDayCqRewriterProcessorImplHtmlParserFactoryInfo(string Pid, string Title, string Description, ComDayCqRewriterProcessorImplHtmlParserFactoryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqRewriterProcessorImplHtmlParserFactoryInfo.
        /// </summary>
        /// <returns>ComDayCqRewriterProcessorImplHtmlParserFactoryInfoBuilder</returns>
        public static ComDayCqRewriterProcessorImplHtmlParserFactoryInfoBuilder Builder()
        {
            return new ComDayCqRewriterProcessorImplHtmlParserFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqRewriterProcessorImplHtmlParserFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqRewriterProcessorImplHtmlParserFactoryInfoBuilder</returns>
        public ComDayCqRewriterProcessorImplHtmlParserFactoryInfoBuilder With()
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

        public bool Equals(ComDayCqRewriterProcessorImplHtmlParserFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqRewriterProcessorImplHtmlParserFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqRewriterProcessorImplHtmlParserFactoryInfo</param>
        /// <param name="right">Compared (ComDayCqRewriterProcessorImplHtmlParserFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqRewriterProcessorImplHtmlParserFactoryInfo left, ComDayCqRewriterProcessorImplHtmlParserFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqRewriterProcessorImplHtmlParserFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqRewriterProcessorImplHtmlParserFactoryInfo</param>
        /// <param name="right">Compared (ComDayCqRewriterProcessorImplHtmlParserFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqRewriterProcessorImplHtmlParserFactoryInfo left, ComDayCqRewriterProcessorImplHtmlParserFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqRewriterProcessorImplHtmlParserFactoryInfo.
        /// </summary>
        public sealed class ComDayCqRewriterProcessorImplHtmlParserFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqRewriterProcessorImplHtmlParserFactoryProperties _Properties;

            internal ComDayCqRewriterProcessorImplHtmlParserFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterProcessorImplHtmlParserFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqRewriterProcessorImplHtmlParserFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterProcessorImplHtmlParserFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqRewriterProcessorImplHtmlParserFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterProcessorImplHtmlParserFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqRewriterProcessorImplHtmlParserFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterProcessorImplHtmlParserFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqRewriterProcessorImplHtmlParserFactoryInfoBuilder Properties(ComDayCqRewriterProcessorImplHtmlParserFactoryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqRewriterProcessorImplHtmlParserFactoryInfo.
            /// </summary>
            /// <returns>ComDayCqRewriterProcessorImplHtmlParserFactoryInfo</returns>
            public ComDayCqRewriterProcessorImplHtmlParserFactoryInfo Build()
            {
                Validate();
                return new ComDayCqRewriterProcessorImplHtmlParserFactoryInfo(
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