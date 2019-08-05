using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo
    /// </summary>
    public sealed class ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo:  IEquatable<ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo>
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
        public ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo()
        {
        }

        private ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo(string Pid, string Title, string Description, ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo.
        /// </summary>
        /// <returns>ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfoBuilder</returns>
        public static ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfoBuilder Builder()
        {
            return new ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfoBuilder</returns>
        public ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfoBuilder With()
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

        public bool Equals(ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo left, ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo left, ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo.
        /// </summary>
        public sealed class ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties _Properties;

            internal ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfoBuilder Properties(ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo.
            /// </summary>
            /// <returns>ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo</returns>
            public ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo Build()
            {
                Validate();
                return new ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo(
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