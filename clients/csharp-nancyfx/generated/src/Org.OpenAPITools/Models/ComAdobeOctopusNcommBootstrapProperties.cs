using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeOctopusNcommBootstrapProperties
    /// </summary>
    public sealed class ComAdobeOctopusNcommBootstrapProperties:  IEquatable<ComAdobeOctopusNcommBootstrapProperties>
    { 
        /// <summary>
        /// MaxConnections
        /// </summary>
        public ConfigNodePropertyInteger MaxConnections { get; private set; }

        /// <summary>
        /// MaxRequests
        /// </summary>
        public ConfigNodePropertyInteger MaxRequests { get; private set; }

        /// <summary>
        /// RequestTimeout
        /// </summary>
        public ConfigNodePropertyInteger RequestTimeout { get; private set; }

        /// <summary>
        /// RequestRetries
        /// </summary>
        public ConfigNodePropertyInteger RequestRetries { get; private set; }

        /// <summary>
        /// LaunchTimeout
        /// </summary>
        public ConfigNodePropertyInteger LaunchTimeout { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeOctopusNcommBootstrapProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeOctopusNcommBootstrapProperties()
        {
        }

        private ComAdobeOctopusNcommBootstrapProperties(ConfigNodePropertyInteger MaxConnections, ConfigNodePropertyInteger MaxRequests, ConfigNodePropertyInteger RequestTimeout, ConfigNodePropertyInteger RequestRetries, ConfigNodePropertyInteger LaunchTimeout)
        {
            
            this.MaxConnections = MaxConnections;
            
            this.MaxRequests = MaxRequests;
            
            this.RequestTimeout = RequestTimeout;
            
            this.RequestRetries = RequestRetries;
            
            this.LaunchTimeout = LaunchTimeout;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeOctopusNcommBootstrapProperties.
        /// </summary>
        /// <returns>ComAdobeOctopusNcommBootstrapPropertiesBuilder</returns>
        public static ComAdobeOctopusNcommBootstrapPropertiesBuilder Builder()
        {
            return new ComAdobeOctopusNcommBootstrapPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeOctopusNcommBootstrapPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeOctopusNcommBootstrapPropertiesBuilder</returns>
        public ComAdobeOctopusNcommBootstrapPropertiesBuilder With()
        {
            return Builder()
                .MaxConnections(MaxConnections)
                .MaxRequests(MaxRequests)
                .RequestTimeout(RequestTimeout)
                .RequestRetries(RequestRetries)
                .LaunchTimeout(LaunchTimeout);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeOctopusNcommBootstrapProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeOctopusNcommBootstrapProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeOctopusNcommBootstrapProperties</param>
        /// <param name="right">Compared (ComAdobeOctopusNcommBootstrapProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeOctopusNcommBootstrapProperties left, ComAdobeOctopusNcommBootstrapProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeOctopusNcommBootstrapProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeOctopusNcommBootstrapProperties</param>
        /// <param name="right">Compared (ComAdobeOctopusNcommBootstrapProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeOctopusNcommBootstrapProperties left, ComAdobeOctopusNcommBootstrapProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeOctopusNcommBootstrapProperties.
        /// </summary>
        public sealed class ComAdobeOctopusNcommBootstrapPropertiesBuilder
        {
            private ConfigNodePropertyInteger _MaxConnections;
            private ConfigNodePropertyInteger _MaxRequests;
            private ConfigNodePropertyInteger _RequestTimeout;
            private ConfigNodePropertyInteger _RequestRetries;
            private ConfigNodePropertyInteger _LaunchTimeout;

            internal ComAdobeOctopusNcommBootstrapPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeOctopusNcommBootstrapProperties.MaxConnections property.
            /// </summary>
            /// <param name="value">MaxConnections</param>
            public ComAdobeOctopusNcommBootstrapPropertiesBuilder MaxConnections(ConfigNodePropertyInteger value)
            {
                _MaxConnections = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeOctopusNcommBootstrapProperties.MaxRequests property.
            /// </summary>
            /// <param name="value">MaxRequests</param>
            public ComAdobeOctopusNcommBootstrapPropertiesBuilder MaxRequests(ConfigNodePropertyInteger value)
            {
                _MaxRequests = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeOctopusNcommBootstrapProperties.RequestTimeout property.
            /// </summary>
            /// <param name="value">RequestTimeout</param>
            public ComAdobeOctopusNcommBootstrapPropertiesBuilder RequestTimeout(ConfigNodePropertyInteger value)
            {
                _RequestTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeOctopusNcommBootstrapProperties.RequestRetries property.
            /// </summary>
            /// <param name="value">RequestRetries</param>
            public ComAdobeOctopusNcommBootstrapPropertiesBuilder RequestRetries(ConfigNodePropertyInteger value)
            {
                _RequestRetries = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeOctopusNcommBootstrapProperties.LaunchTimeout property.
            /// </summary>
            /// <param name="value">LaunchTimeout</param>
            public ComAdobeOctopusNcommBootstrapPropertiesBuilder LaunchTimeout(ConfigNodePropertyInteger value)
            {
                _LaunchTimeout = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeOctopusNcommBootstrapProperties.
            /// </summary>
            /// <returns>ComAdobeOctopusNcommBootstrapProperties</returns>
            public ComAdobeOctopusNcommBootstrapProperties Build()
            {
                Validate();
                return new ComAdobeOctopusNcommBootstrapProperties(
                    MaxConnections: _MaxConnections,
                    MaxRequests: _MaxRequests,
                    RequestTimeout: _RequestTimeout,
                    RequestRetries: _RequestRetries,
                    LaunchTimeout: _LaunchTimeout
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}