using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo:  IEquatable<ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo>
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
        public ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo()
        {
        }

        private ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo(string Pid, string Title, string Description, ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfoBuilder</returns>
        public static ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfoBuilder</returns>
        public ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo left, ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo left, ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties _Properties;

            internal ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfoBuilder Properties(ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo</returns>
            public ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo(
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