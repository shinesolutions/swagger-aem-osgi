using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo
    /// </summary>
    public sealed class ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo:  IEquatable<ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo>
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
        public ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo()
        {
        }

        private ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo(string Pid, string Title, string Description, ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfoBuilder</returns>
        public static ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfoBuilder Builder()
        {
            return new ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfoBuilder</returns>
        public ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo left, ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo left, ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties _Properties;

            internal ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfoBuilder Properties(ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo</returns>
            public ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo(
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