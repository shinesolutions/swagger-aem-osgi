using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo:  IEquatable<ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo>
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
        public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo()
        {
        }

        private ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo(string Pid, string Title, string Description, ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfoBuilder</returns>
        public static ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfoBuilder</returns>
        public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo left, ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo left, ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties _Properties;

            internal ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfoBuilder Properties(ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo</returns>
            public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo(
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