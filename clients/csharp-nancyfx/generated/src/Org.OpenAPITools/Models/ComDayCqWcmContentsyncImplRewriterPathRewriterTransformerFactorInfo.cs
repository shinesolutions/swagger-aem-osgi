using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo
    /// </summary>
    public sealed class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo:  IEquatable<ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo>
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
        public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo()
        {
        }

        private ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo(string Pid, string Title, string Description, ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo.
        /// </summary>
        /// <returns>ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfoBuilder</returns>
        public static ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfoBuilder Builder()
        {
            return new ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfoBuilder</returns>
        public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfoBuilder With()
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

        public bool Equals(ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo</param>
        /// <param name="right">Compared (ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo left, ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo</param>
        /// <param name="right">Compared (ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo left, ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo.
        /// </summary>
        public sealed class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties _Properties;

            internal ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfoBuilder Properties(ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo.
            /// </summary>
            /// <returns>ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo</returns>
            public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo Build()
            {
                Validate();
                return new ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo(
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