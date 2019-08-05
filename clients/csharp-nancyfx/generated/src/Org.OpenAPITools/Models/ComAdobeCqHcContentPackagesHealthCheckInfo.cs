using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqHcContentPackagesHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeCqHcContentPackagesHealthCheckInfo:  IEquatable<ComAdobeCqHcContentPackagesHealthCheckInfo>
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
        public ComAdobeCqHcContentPackagesHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqHcContentPackagesHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqHcContentPackagesHealthCheckInfo()
        {
        }

        private ComAdobeCqHcContentPackagesHealthCheckInfo(string Pid, string Title, string Description, ComAdobeCqHcContentPackagesHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqHcContentPackagesHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeCqHcContentPackagesHealthCheckInfoBuilder</returns>
        public static ComAdobeCqHcContentPackagesHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeCqHcContentPackagesHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqHcContentPackagesHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqHcContentPackagesHealthCheckInfoBuilder</returns>
        public ComAdobeCqHcContentPackagesHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeCqHcContentPackagesHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqHcContentPackagesHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqHcContentPackagesHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeCqHcContentPackagesHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqHcContentPackagesHealthCheckInfo left, ComAdobeCqHcContentPackagesHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqHcContentPackagesHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqHcContentPackagesHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeCqHcContentPackagesHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqHcContentPackagesHealthCheckInfo left, ComAdobeCqHcContentPackagesHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqHcContentPackagesHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeCqHcContentPackagesHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqHcContentPackagesHealthCheckProperties _Properties;

            internal ComAdobeCqHcContentPackagesHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqHcContentPackagesHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqHcContentPackagesHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqHcContentPackagesHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqHcContentPackagesHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqHcContentPackagesHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqHcContentPackagesHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqHcContentPackagesHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqHcContentPackagesHealthCheckInfoBuilder Properties(ComAdobeCqHcContentPackagesHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqHcContentPackagesHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeCqHcContentPackagesHealthCheckInfo</returns>
            public ComAdobeCqHcContentPackagesHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeCqHcContentPackagesHealthCheckInfo(
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