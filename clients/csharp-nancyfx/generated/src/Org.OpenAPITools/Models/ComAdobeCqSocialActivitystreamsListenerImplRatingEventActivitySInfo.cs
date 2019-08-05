using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo
    /// </summary>
    public sealed class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo:  IEquatable<ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo>
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
        public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo()
        {
        }

        private ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo(string Pid, string Title, string Description, ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfoBuilder</returns>
        public static ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfoBuilder Builder()
        {
            return new ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfoBuilder</returns>
        public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo left, ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo left, ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties _Properties;

            internal ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfoBuilder Properties(ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo</returns>
            public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo(
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