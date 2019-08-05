using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo:  IEquatable<ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo>
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
        public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo()
        {
        }

        private ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo(string Pid, string Title, string Description, ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoBuilder</returns>
        public static ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoBuilder</returns>
        public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo left, ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo left, ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties _Properties;

            internal ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoBuilder Properties(ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo</returns>
            public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo(
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