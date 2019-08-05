using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo:  IEquatable<ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo>
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
        public ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo()
        {
        }

        private ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo(string Pid, string Title, string Description, ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfoBuilder</returns>
        public static ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfoBuilder</returns>
        public ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo left, ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo left, ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties _Properties;

            internal ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfoBuilder Properties(ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo</returns>
            public ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo(
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