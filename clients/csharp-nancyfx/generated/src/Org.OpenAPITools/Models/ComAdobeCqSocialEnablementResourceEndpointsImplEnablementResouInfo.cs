using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo
    /// </summary>
    public sealed class ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo:  IEquatable<ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo>
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
        public ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo()
        {
        }

        private ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo(string Pid, string Title, string Description, ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfoBuilder</returns>
        public static ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfoBuilder Builder()
        {
            return new ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfoBuilder</returns>
        public ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo left, ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo left, ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties _Properties;

            internal ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfoBuilder Properties(ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo</returns>
            public ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo(
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