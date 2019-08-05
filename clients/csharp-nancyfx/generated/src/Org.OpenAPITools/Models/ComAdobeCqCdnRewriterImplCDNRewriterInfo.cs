using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCdnRewriterImplCDNRewriterInfo
    /// </summary>
    public sealed class ComAdobeCqCdnRewriterImplCDNRewriterInfo:  IEquatable<ComAdobeCqCdnRewriterImplCDNRewriterInfo>
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
        public ComAdobeCqCdnRewriterImplCDNRewriterProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCdnRewriterImplCDNRewriterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCdnRewriterImplCDNRewriterInfo()
        {
        }

        private ComAdobeCqCdnRewriterImplCDNRewriterInfo(string Pid, string Title, string Description, ComAdobeCqCdnRewriterImplCDNRewriterProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCdnRewriterImplCDNRewriterInfo.
        /// </summary>
        /// <returns>ComAdobeCqCdnRewriterImplCDNRewriterInfoBuilder</returns>
        public static ComAdobeCqCdnRewriterImplCDNRewriterInfoBuilder Builder()
        {
            return new ComAdobeCqCdnRewriterImplCDNRewriterInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCdnRewriterImplCDNRewriterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCdnRewriterImplCDNRewriterInfoBuilder</returns>
        public ComAdobeCqCdnRewriterImplCDNRewriterInfoBuilder With()
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

        public bool Equals(ComAdobeCqCdnRewriterImplCDNRewriterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCdnRewriterImplCDNRewriterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCdnRewriterImplCDNRewriterInfo</param>
        /// <param name="right">Compared (ComAdobeCqCdnRewriterImplCDNRewriterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCdnRewriterImplCDNRewriterInfo left, ComAdobeCqCdnRewriterImplCDNRewriterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCdnRewriterImplCDNRewriterInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCdnRewriterImplCDNRewriterInfo</param>
        /// <param name="right">Compared (ComAdobeCqCdnRewriterImplCDNRewriterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCdnRewriterImplCDNRewriterInfo left, ComAdobeCqCdnRewriterImplCDNRewriterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCdnRewriterImplCDNRewriterInfo.
        /// </summary>
        public sealed class ComAdobeCqCdnRewriterImplCDNRewriterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqCdnRewriterImplCDNRewriterProperties _Properties;

            internal ComAdobeCqCdnRewriterImplCDNRewriterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplCDNRewriterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqCdnRewriterImplCDNRewriterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplCDNRewriterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqCdnRewriterImplCDNRewriterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplCDNRewriterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqCdnRewriterImplCDNRewriterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplCDNRewriterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqCdnRewriterImplCDNRewriterInfoBuilder Properties(ComAdobeCqCdnRewriterImplCDNRewriterProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCdnRewriterImplCDNRewriterInfo.
            /// </summary>
            /// <returns>ComAdobeCqCdnRewriterImplCDNRewriterInfo</returns>
            public ComAdobeCqCdnRewriterImplCDNRewriterInfo Build()
            {
                Validate();
                return new ComAdobeCqCdnRewriterImplCDNRewriterInfo(
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