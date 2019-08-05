using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo:  IEquatable<ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo>
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
        public ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo()
        {
        }

        private ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo(string Pid, string Title, string Description, ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfoBuilder</returns>
        public static ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfoBuilder</returns>
        public ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo left, ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo left, ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties _Properties;

            internal ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfoBuilder Properties(ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo</returns>
            public ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo(
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