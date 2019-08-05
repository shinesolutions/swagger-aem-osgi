using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo:  IEquatable<ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo>
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
        public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo()
        {
        }

        private ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo(string Pid, string Title, string Description, ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfoBuilder</returns>
        public static ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfoBuilder</returns>
        public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo left, ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo left, ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties _Properties;

            internal ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfoBuilder Properties(ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo</returns>
            public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo(
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