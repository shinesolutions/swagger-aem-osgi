using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo
    /// </summary>
    public sealed class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo:  IEquatable<ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo>
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
        public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo()
        {
        }

        private ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo(string Pid, string Title, string Description, ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo.
        /// </summary>
        /// <returns>ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfoBuilder</returns>
        public static ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfoBuilder Builder()
        {
            return new ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfoBuilder</returns>
        public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfoBuilder With()
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

        public bool Equals(ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo</param>
        /// <param name="right">Compared (ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo left, ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo</param>
        /// <param name="right">Compared (ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo left, ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo.
        /// </summary>
        public sealed class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties _Properties;

            internal ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfoBuilder Properties(ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo.
            /// </summary>
            /// <returns>ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo</returns>
            public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo Build()
            {
                Validate();
                return new ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo(
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