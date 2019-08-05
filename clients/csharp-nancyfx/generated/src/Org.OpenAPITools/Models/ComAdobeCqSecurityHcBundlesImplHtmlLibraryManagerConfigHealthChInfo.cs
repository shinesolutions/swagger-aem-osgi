using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo
    /// </summary>
    public sealed class ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo:  IEquatable<ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo>
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
        public ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo()
        {
        }

        private ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo(string Pid, string Title, string Description, ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo.
        /// </summary>
        /// <returns>ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfoBuilder</returns>
        public static ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfoBuilder Builder()
        {
            return new ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfoBuilder</returns>
        public ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfoBuilder With()
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

        public bool Equals(ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo</param>
        /// <param name="right">Compared (ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo left, ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo</param>
        /// <param name="right">Compared (ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo left, ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo.
        /// </summary>
        public sealed class ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties _Properties;

            internal ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfoBuilder Properties(ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo.
            /// </summary>
            /// <returns>ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo</returns>
            public ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo Build()
            {
                Validate();
                return new ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo(
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