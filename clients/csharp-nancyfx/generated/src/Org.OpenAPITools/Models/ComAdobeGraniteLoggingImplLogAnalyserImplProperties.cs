using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteLoggingImplLogAnalyserImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteLoggingImplLogAnalyserImplProperties:  IEquatable<ComAdobeGraniteLoggingImplLogAnalyserImplProperties>
    { 
        /// <summary>
        /// MessagesQueueSize
        /// </summary>
        public ConfigNodePropertyInteger MessagesQueueSize { get; private set; }

        /// <summary>
        /// LoggerConfig
        /// </summary>
        public ConfigNodePropertyArray LoggerConfig { get; private set; }

        /// <summary>
        /// MessagesSize
        /// </summary>
        public ConfigNodePropertyInteger MessagesSize { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteLoggingImplLogAnalyserImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteLoggingImplLogAnalyserImplProperties()
        {
        }

        private ComAdobeGraniteLoggingImplLogAnalyserImplProperties(ConfigNodePropertyInteger MessagesQueueSize, ConfigNodePropertyArray LoggerConfig, ConfigNodePropertyInteger MessagesSize)
        {
            
            this.MessagesQueueSize = MessagesQueueSize;
            
            this.LoggerConfig = LoggerConfig;
            
            this.MessagesSize = MessagesSize;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteLoggingImplLogAnalyserImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteLoggingImplLogAnalyserImplPropertiesBuilder</returns>
        public static ComAdobeGraniteLoggingImplLogAnalyserImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteLoggingImplLogAnalyserImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteLoggingImplLogAnalyserImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteLoggingImplLogAnalyserImplPropertiesBuilder</returns>
        public ComAdobeGraniteLoggingImplLogAnalyserImplPropertiesBuilder With()
        {
            return Builder()
                .MessagesQueueSize(MessagesQueueSize)
                .LoggerConfig(LoggerConfig)
                .MessagesSize(MessagesSize);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteLoggingImplLogAnalyserImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteLoggingImplLogAnalyserImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteLoggingImplLogAnalyserImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteLoggingImplLogAnalyserImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteLoggingImplLogAnalyserImplProperties left, ComAdobeGraniteLoggingImplLogAnalyserImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteLoggingImplLogAnalyserImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteLoggingImplLogAnalyserImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteLoggingImplLogAnalyserImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteLoggingImplLogAnalyserImplProperties left, ComAdobeGraniteLoggingImplLogAnalyserImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteLoggingImplLogAnalyserImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteLoggingImplLogAnalyserImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _MessagesQueueSize;
            private ConfigNodePropertyArray _LoggerConfig;
            private ConfigNodePropertyInteger _MessagesSize;

            internal ComAdobeGraniteLoggingImplLogAnalyserImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteLoggingImplLogAnalyserImplProperties.MessagesQueueSize property.
            /// </summary>
            /// <param name="value">MessagesQueueSize</param>
            public ComAdobeGraniteLoggingImplLogAnalyserImplPropertiesBuilder MessagesQueueSize(ConfigNodePropertyInteger value)
            {
                _MessagesQueueSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteLoggingImplLogAnalyserImplProperties.LoggerConfig property.
            /// </summary>
            /// <param name="value">LoggerConfig</param>
            public ComAdobeGraniteLoggingImplLogAnalyserImplPropertiesBuilder LoggerConfig(ConfigNodePropertyArray value)
            {
                _LoggerConfig = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteLoggingImplLogAnalyserImplProperties.MessagesSize property.
            /// </summary>
            /// <param name="value">MessagesSize</param>
            public ComAdobeGraniteLoggingImplLogAnalyserImplPropertiesBuilder MessagesSize(ConfigNodePropertyInteger value)
            {
                _MessagesSize = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteLoggingImplLogAnalyserImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteLoggingImplLogAnalyserImplProperties</returns>
            public ComAdobeGraniteLoggingImplLogAnalyserImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteLoggingImplLogAnalyserImplProperties(
                    MessagesQueueSize: _MessagesQueueSize,
                    LoggerConfig: _LoggerConfig,
                    MessagesSize: _MessagesSize
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}