using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo
    /// </summary>
    public sealed class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo:  IEquatable<ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo>
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
        public ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo()
        {
        }

        private ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo(string Pid, string Title, string Description, ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfoBuilder</returns>
        public static ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfoBuilder Builder()
        {
            return new ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfoBuilder</returns>
        public ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo left, ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo left, ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo.
        /// </summary>
        public sealed class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties _Properties;

            internal ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfoBuilder Properties(ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo</returns>
            public ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo Build()
            {
                Validate();
                return new ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo(
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