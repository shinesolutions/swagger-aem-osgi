using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo:  IEquatable<ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo>
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
        public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo()
        {
        }

        private ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo(string Pid, string Title, string Description, ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfoBuilder</returns>
        public static ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfoBuilder</returns>
        public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo left, ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo left, ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties _Properties;

            internal ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfoBuilder Properties(ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo</returns>
            public ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo(
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