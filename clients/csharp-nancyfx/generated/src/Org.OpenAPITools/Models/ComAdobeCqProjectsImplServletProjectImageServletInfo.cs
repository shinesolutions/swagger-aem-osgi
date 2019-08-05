using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqProjectsImplServletProjectImageServletInfo
    /// </summary>
    public sealed class ComAdobeCqProjectsImplServletProjectImageServletInfo:  IEquatable<ComAdobeCqProjectsImplServletProjectImageServletInfo>
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
        public ComAdobeCqProjectsImplServletProjectImageServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqProjectsImplServletProjectImageServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqProjectsImplServletProjectImageServletInfo()
        {
        }

        private ComAdobeCqProjectsImplServletProjectImageServletInfo(string Pid, string Title, string Description, ComAdobeCqProjectsImplServletProjectImageServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqProjectsImplServletProjectImageServletInfo.
        /// </summary>
        /// <returns>ComAdobeCqProjectsImplServletProjectImageServletInfoBuilder</returns>
        public static ComAdobeCqProjectsImplServletProjectImageServletInfoBuilder Builder()
        {
            return new ComAdobeCqProjectsImplServletProjectImageServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqProjectsImplServletProjectImageServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqProjectsImplServletProjectImageServletInfoBuilder</returns>
        public ComAdobeCqProjectsImplServletProjectImageServletInfoBuilder With()
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

        public bool Equals(ComAdobeCqProjectsImplServletProjectImageServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqProjectsImplServletProjectImageServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqProjectsImplServletProjectImageServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqProjectsImplServletProjectImageServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqProjectsImplServletProjectImageServletInfo left, ComAdobeCqProjectsImplServletProjectImageServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqProjectsImplServletProjectImageServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqProjectsImplServletProjectImageServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqProjectsImplServletProjectImageServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqProjectsImplServletProjectImageServletInfo left, ComAdobeCqProjectsImplServletProjectImageServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqProjectsImplServletProjectImageServletInfo.
        /// </summary>
        public sealed class ComAdobeCqProjectsImplServletProjectImageServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqProjectsImplServletProjectImageServletProperties _Properties;

            internal ComAdobeCqProjectsImplServletProjectImageServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqProjectsImplServletProjectImageServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqProjectsImplServletProjectImageServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqProjectsImplServletProjectImageServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqProjectsImplServletProjectImageServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqProjectsImplServletProjectImageServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqProjectsImplServletProjectImageServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqProjectsImplServletProjectImageServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqProjectsImplServletProjectImageServletInfoBuilder Properties(ComAdobeCqProjectsImplServletProjectImageServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqProjectsImplServletProjectImageServletInfo.
            /// </summary>
            /// <returns>ComAdobeCqProjectsImplServletProjectImageServletInfo</returns>
            public ComAdobeCqProjectsImplServletProjectImageServletInfo Build()
            {
                Validate();
                return new ComAdobeCqProjectsImplServletProjectImageServletInfo(
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