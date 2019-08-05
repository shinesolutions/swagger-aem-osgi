using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo
    /// </summary>
    public sealed class ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo:  IEquatable<ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo>
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
        public ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo()
        {
        }

        private ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo(string Pid, string Title, string Description, ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo.
        /// </summary>
        /// <returns>ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfoBuilder</returns>
        public static ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfoBuilder Builder()
        {
            return new ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfoBuilder</returns>
        public ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfoBuilder With()
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

        public bool Equals(ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo left, ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo left, ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo.
        /// </summary>
        public sealed class ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties _Properties;

            internal ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfoBuilder Properties(ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo.
            /// </summary>
            /// <returns>ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo</returns>
            public ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo Build()
            {
                Validate();
                return new ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo(
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