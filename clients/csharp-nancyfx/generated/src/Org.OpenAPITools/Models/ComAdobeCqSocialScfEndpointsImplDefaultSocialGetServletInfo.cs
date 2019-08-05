using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo
    /// </summary>
    public sealed class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo:  IEquatable<ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo>
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
        public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo()
        {
        }

        private ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo(string Pid, string Title, string Description, ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfoBuilder</returns>
        public static ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfoBuilder Builder()
        {
            return new ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfoBuilder</returns>
        public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo left, ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo left, ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties _Properties;

            internal ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfoBuilder Properties(ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo</returns>
            public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo(
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