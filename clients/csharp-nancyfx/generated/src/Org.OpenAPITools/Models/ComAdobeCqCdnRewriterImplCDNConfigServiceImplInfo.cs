using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo
    /// </summary>
    public sealed class ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo:  IEquatable<ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo>
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
        public ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo()
        {
        }

        private ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo(string Pid, string Title, string Description, ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfoBuilder</returns>
        public static ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfoBuilder Builder()
        {
            return new ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfoBuilder</returns>
        public ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo left, ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo left, ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo.
        /// </summary>
        public sealed class ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties _Properties;

            internal ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfoBuilder Properties(ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo</returns>
            public ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo Build()
            {
                Validate();
                return new ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo(
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