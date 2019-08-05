using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo:  IEquatable<ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo>
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
        public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo()
        {
        }

        private ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo(string Pid, string Title, string Description, ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfoBuilder</returns>
        public static ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfoBuilder</returns>
        public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo left, ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo left, ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties _Properties;

            internal ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfoBuilder Properties(ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo</returns>
            public ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo(
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