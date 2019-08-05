using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRepositoryServiceUserConfigurationInfo
    /// </summary>
    public sealed class ComAdobeGraniteRepositoryServiceUserConfigurationInfo:  IEquatable<ComAdobeGraniteRepositoryServiceUserConfigurationInfo>
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
        public ComAdobeGraniteRepositoryServiceUserConfigurationProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRepositoryServiceUserConfigurationInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRepositoryServiceUserConfigurationInfo()
        {
        }

        private ComAdobeGraniteRepositoryServiceUserConfigurationInfo(string Pid, string Title, string Description, ComAdobeGraniteRepositoryServiceUserConfigurationProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRepositoryServiceUserConfigurationInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryServiceUserConfigurationInfoBuilder</returns>
        public static ComAdobeGraniteRepositoryServiceUserConfigurationInfoBuilder Builder()
        {
            return new ComAdobeGraniteRepositoryServiceUserConfigurationInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRepositoryServiceUserConfigurationInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryServiceUserConfigurationInfoBuilder</returns>
        public ComAdobeGraniteRepositoryServiceUserConfigurationInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteRepositoryServiceUserConfigurationInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRepositoryServiceUserConfigurationInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryServiceUserConfigurationInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryServiceUserConfigurationInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRepositoryServiceUserConfigurationInfo left, ComAdobeGraniteRepositoryServiceUserConfigurationInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRepositoryServiceUserConfigurationInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryServiceUserConfigurationInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryServiceUserConfigurationInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRepositoryServiceUserConfigurationInfo left, ComAdobeGraniteRepositoryServiceUserConfigurationInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRepositoryServiceUserConfigurationInfo.
        /// </summary>
        public sealed class ComAdobeGraniteRepositoryServiceUserConfigurationInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteRepositoryServiceUserConfigurationProperties _Properties;

            internal ComAdobeGraniteRepositoryServiceUserConfigurationInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryServiceUserConfigurationInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteRepositoryServiceUserConfigurationInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryServiceUserConfigurationInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteRepositoryServiceUserConfigurationInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryServiceUserConfigurationInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteRepositoryServiceUserConfigurationInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryServiceUserConfigurationInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteRepositoryServiceUserConfigurationInfoBuilder Properties(ComAdobeGraniteRepositoryServiceUserConfigurationProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRepositoryServiceUserConfigurationInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteRepositoryServiceUserConfigurationInfo</returns>
            public ComAdobeGraniteRepositoryServiceUserConfigurationInfo Build()
            {
                Validate();
                return new ComAdobeGraniteRepositoryServiceUserConfigurationInfo(
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