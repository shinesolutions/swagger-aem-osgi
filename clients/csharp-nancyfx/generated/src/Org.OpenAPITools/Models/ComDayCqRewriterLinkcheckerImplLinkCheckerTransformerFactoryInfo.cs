using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo
    /// </summary>
    public sealed class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo:  IEquatable<ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo>
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
        public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo()
        {
        }

        private ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo(string Pid, string Title, string Description, ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo.
        /// </summary>
        /// <returns>ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfoBuilder</returns>
        public static ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfoBuilder Builder()
        {
            return new ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfoBuilder</returns>
        public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfoBuilder With()
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

        public bool Equals(ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo</param>
        /// <param name="right">Compared (ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo left, ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo</param>
        /// <param name="right">Compared (ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo left, ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo.
        /// </summary>
        public sealed class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties _Properties;

            internal ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfoBuilder Properties(ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo.
            /// </summary>
            /// <returns>ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo</returns>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo Build()
            {
                Validate();
                return new ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo(
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