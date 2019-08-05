using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo
    /// </summary>
    public sealed class ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo:  IEquatable<ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo>
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
        public ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo()
        {
        }

        private ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo(string Pid, string Title, string Description, ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo.
        /// </summary>
        /// <returns>ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoBuilder</returns>
        public static ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoBuilder Builder()
        {
            return new ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoBuilder</returns>
        public ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoBuilder With()
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

        public bool Equals(ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo left, ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo left, ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo.
        /// </summary>
        public sealed class ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties _Properties;

            internal ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqDamS7imagingImplPsPlatformServerServletInfoBuilder Properties(ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo.
            /// </summary>
            /// <returns>ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo</returns>
            public ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo Build()
            {
                Validate();
                return new ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo(
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