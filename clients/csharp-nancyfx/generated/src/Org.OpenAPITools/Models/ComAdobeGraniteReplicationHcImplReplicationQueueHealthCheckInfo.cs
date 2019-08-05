using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo
    /// </summary>
    public sealed class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo:  IEquatable<ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo>
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
        public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo()
        {
        }

        private ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo(string Pid, string Title, string Description, ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfoBuilder</returns>
        public static ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfoBuilder Builder()
        {
            return new ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfoBuilder</returns>
        public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo left, ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo left, ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo.
        /// </summary>
        public sealed class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties _Properties;

            internal ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfoBuilder Properties(ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo</returns>
            public ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo Build()
            {
                Validate();
                return new ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo(
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