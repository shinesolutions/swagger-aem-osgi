using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo
    /// </summary>
    public sealed class ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo:  IEquatable<ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo>
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
        public ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo()
        {
        }

        private ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo(string Pid, string Title, string Description, ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfoBuilder</returns>
        public static ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfoBuilder Builder()
        {
            return new ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfoBuilder</returns>
        public ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo left, ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo left, ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties _Properties;

            internal ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfoBuilder Properties(ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo</returns>
            public ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo(
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