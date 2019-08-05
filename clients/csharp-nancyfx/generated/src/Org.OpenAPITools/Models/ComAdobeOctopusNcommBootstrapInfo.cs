using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeOctopusNcommBootstrapInfo
    /// </summary>
    public sealed class ComAdobeOctopusNcommBootstrapInfo:  IEquatable<ComAdobeOctopusNcommBootstrapInfo>
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
        public ComAdobeOctopusNcommBootstrapProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeOctopusNcommBootstrapInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeOctopusNcommBootstrapInfo()
        {
        }

        private ComAdobeOctopusNcommBootstrapInfo(string Pid, string Title, string Description, ComAdobeOctopusNcommBootstrapProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeOctopusNcommBootstrapInfo.
        /// </summary>
        /// <returns>ComAdobeOctopusNcommBootstrapInfoBuilder</returns>
        public static ComAdobeOctopusNcommBootstrapInfoBuilder Builder()
        {
            return new ComAdobeOctopusNcommBootstrapInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeOctopusNcommBootstrapInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeOctopusNcommBootstrapInfoBuilder</returns>
        public ComAdobeOctopusNcommBootstrapInfoBuilder With()
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

        public bool Equals(ComAdobeOctopusNcommBootstrapInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeOctopusNcommBootstrapInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeOctopusNcommBootstrapInfo</param>
        /// <param name="right">Compared (ComAdobeOctopusNcommBootstrapInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeOctopusNcommBootstrapInfo left, ComAdobeOctopusNcommBootstrapInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeOctopusNcommBootstrapInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeOctopusNcommBootstrapInfo</param>
        /// <param name="right">Compared (ComAdobeOctopusNcommBootstrapInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeOctopusNcommBootstrapInfo left, ComAdobeOctopusNcommBootstrapInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeOctopusNcommBootstrapInfo.
        /// </summary>
        public sealed class ComAdobeOctopusNcommBootstrapInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeOctopusNcommBootstrapProperties _Properties;

            internal ComAdobeOctopusNcommBootstrapInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeOctopusNcommBootstrapInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeOctopusNcommBootstrapInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeOctopusNcommBootstrapInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeOctopusNcommBootstrapInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeOctopusNcommBootstrapInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeOctopusNcommBootstrapInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeOctopusNcommBootstrapInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeOctopusNcommBootstrapInfoBuilder Properties(ComAdobeOctopusNcommBootstrapProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeOctopusNcommBootstrapInfo.
            /// </summary>
            /// <returns>ComAdobeOctopusNcommBootstrapInfo</returns>
            public ComAdobeOctopusNcommBootstrapInfo Build()
            {
                Validate();
                return new ComAdobeOctopusNcommBootstrapInfo(
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