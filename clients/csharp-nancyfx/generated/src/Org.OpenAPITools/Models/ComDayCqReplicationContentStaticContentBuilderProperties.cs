using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationContentStaticContentBuilderProperties
    /// </summary>
    public sealed class ComDayCqReplicationContentStaticContentBuilderProperties:  IEquatable<ComDayCqReplicationContentStaticContentBuilderProperties>
    { 
        /// <summary>
        /// Host
        /// </summary>
        public ConfigNodePropertyString Host { get; private set; }

        /// <summary>
        /// Port
        /// </summary>
        public ConfigNodePropertyInteger Port { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReplicationContentStaticContentBuilderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationContentStaticContentBuilderProperties()
        {
        }

        private ComDayCqReplicationContentStaticContentBuilderProperties(ConfigNodePropertyString Host, ConfigNodePropertyInteger Port)
        {
            
            this.Host = Host;
            
            this.Port = Port;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationContentStaticContentBuilderProperties.
        /// </summary>
        /// <returns>ComDayCqReplicationContentStaticContentBuilderPropertiesBuilder</returns>
        public static ComDayCqReplicationContentStaticContentBuilderPropertiesBuilder Builder()
        {
            return new ComDayCqReplicationContentStaticContentBuilderPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationContentStaticContentBuilderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationContentStaticContentBuilderPropertiesBuilder</returns>
        public ComDayCqReplicationContentStaticContentBuilderPropertiesBuilder With()
        {
            return Builder()
                .Host(Host)
                .Port(Port);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqReplicationContentStaticContentBuilderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationContentStaticContentBuilderProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationContentStaticContentBuilderProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationContentStaticContentBuilderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationContentStaticContentBuilderProperties left, ComDayCqReplicationContentStaticContentBuilderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationContentStaticContentBuilderProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationContentStaticContentBuilderProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationContentStaticContentBuilderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationContentStaticContentBuilderProperties left, ComDayCqReplicationContentStaticContentBuilderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationContentStaticContentBuilderProperties.
        /// </summary>
        public sealed class ComDayCqReplicationContentStaticContentBuilderPropertiesBuilder
        {
            private ConfigNodePropertyString _Host;
            private ConfigNodePropertyInteger _Port;

            internal ComDayCqReplicationContentStaticContentBuilderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationContentStaticContentBuilderProperties.Host property.
            /// </summary>
            /// <param name="value">Host</param>
            public ComDayCqReplicationContentStaticContentBuilderPropertiesBuilder Host(ConfigNodePropertyString value)
            {
                _Host = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationContentStaticContentBuilderProperties.Port property.
            /// </summary>
            /// <param name="value">Port</param>
            public ComDayCqReplicationContentStaticContentBuilderPropertiesBuilder Port(ConfigNodePropertyInteger value)
            {
                _Port = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationContentStaticContentBuilderProperties.
            /// </summary>
            /// <returns>ComDayCqReplicationContentStaticContentBuilderProperties</returns>
            public ComDayCqReplicationContentStaticContentBuilderProperties Build()
            {
                Validate();
                return new ComDayCqReplicationContentStaticContentBuilderProperties(
                    Host: _Host,
                    Port: _Port
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}