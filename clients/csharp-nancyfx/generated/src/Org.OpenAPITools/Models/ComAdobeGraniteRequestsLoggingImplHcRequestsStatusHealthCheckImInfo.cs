using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo
    /// </summary>
    public sealed class ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo:  IEquatable<ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo>
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
        public ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo()
        {
        }

        private ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo(string Pid, string Title, string Description, ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoBuilder</returns>
        public static ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoBuilder Builder()
        {
            return new ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoBuilder</returns>
        public ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo left, ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo left, ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo.
        /// </summary>
        public sealed class ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties _Properties;

            internal ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoBuilder Properties(ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo</returns>
            public ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo Build()
            {
                Validate();
                return new ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo(
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