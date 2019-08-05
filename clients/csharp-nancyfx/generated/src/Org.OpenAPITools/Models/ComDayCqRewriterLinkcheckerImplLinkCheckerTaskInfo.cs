using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo
    /// </summary>
    public sealed class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo:  IEquatable<ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo>
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
        public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo()
        {
        }

        private ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo(string Pid, string Title, string Description, ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo.
        /// </summary>
        /// <returns>ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfoBuilder</returns>
        public static ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfoBuilder Builder()
        {
            return new ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfoBuilder</returns>
        public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfoBuilder With()
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

        public bool Equals(ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo</param>
        /// <param name="right">Compared (ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo left, ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo</param>
        /// <param name="right">Compared (ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo left, ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo.
        /// </summary>
        public sealed class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties _Properties;

            internal ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfoBuilder Properties(ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo.
            /// </summary>
            /// <returns>ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo</returns>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo Build()
            {
                Validate();
                return new ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo(
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