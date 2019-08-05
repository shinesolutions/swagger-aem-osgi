using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo:  IEquatable<ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo>
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
        public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo()
        {
        }

        private ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo(string Pid, string Title, string Description, ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfoBuilder</returns>
        public static ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfoBuilder</returns>
        public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo left, ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo left, ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties _Properties;

            internal ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfoBuilder Properties(ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo</returns>
            public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo(
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