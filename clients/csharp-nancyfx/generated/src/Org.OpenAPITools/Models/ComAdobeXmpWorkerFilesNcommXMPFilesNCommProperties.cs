using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties
    /// </summary>
    public sealed class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties:  IEquatable<ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties>
    { 
        /// <summary>
        /// MaxConnections
        /// </summary>
        public ConfigNodePropertyString MaxConnections { get; private set; }

        /// <summary>
        /// MaxRequests
        /// </summary>
        public ConfigNodePropertyString MaxRequests { get; private set; }

        /// <summary>
        /// RequestTimeout
        /// </summary>
        public ConfigNodePropertyString RequestTimeout { get; private set; }

        /// <summary>
        /// LogDir
        /// </summary>
        public ConfigNodePropertyString LogDir { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties()
        {
        }

        private ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties(ConfigNodePropertyString MaxConnections, ConfigNodePropertyString MaxRequests, ConfigNodePropertyString RequestTimeout, ConfigNodePropertyString LogDir)
        {
            
            this.MaxConnections = MaxConnections;
            
            this.MaxRequests = MaxRequests;
            
            this.RequestTimeout = RequestTimeout;
            
            this.LogDir = LogDir;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.
        /// </summary>
        /// <returns>ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesBuilder</returns>
        public static ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesBuilder Builder()
        {
            return new ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesBuilder</returns>
        public ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesBuilder With()
        {
            return Builder()
                .MaxConnections(MaxConnections)
                .MaxRequests(MaxRequests)
                .RequestTimeout(RequestTimeout)
                .LogDir(LogDir);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties</param>
        /// <param name="right">Compared (ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties left, ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties</param>
        /// <param name="right">Compared (ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties left, ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.
        /// </summary>
        public sealed class ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesBuilder
        {
            private ConfigNodePropertyString _MaxConnections;
            private ConfigNodePropertyString _MaxRequests;
            private ConfigNodePropertyString _RequestTimeout;
            private ConfigNodePropertyString _LogDir;

            internal ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.MaxConnections property.
            /// </summary>
            /// <param name="value">MaxConnections</param>
            public ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesBuilder MaxConnections(ConfigNodePropertyString value)
            {
                _MaxConnections = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.MaxRequests property.
            /// </summary>
            /// <param name="value">MaxRequests</param>
            public ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesBuilder MaxRequests(ConfigNodePropertyString value)
            {
                _MaxRequests = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.RequestTimeout property.
            /// </summary>
            /// <param name="value">RequestTimeout</param>
            public ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesBuilder RequestTimeout(ConfigNodePropertyString value)
            {
                _RequestTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.LogDir property.
            /// </summary>
            /// <param name="value">LogDir</param>
            public ComAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesBuilder LogDir(ConfigNodePropertyString value)
            {
                _LogDir = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.
            /// </summary>
            /// <returns>ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties</returns>
            public ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties Build()
            {
                Validate();
                return new ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties(
                    MaxConnections: _MaxConnections,
                    MaxRequests: _MaxRequests,
                    RequestTimeout: _RequestTimeout,
                    LogDir: _LogDir
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}