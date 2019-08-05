using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamS7imagingImplIsImageServerComponentProperties
    /// </summary>
    public sealed class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties:  IEquatable<ComAdobeCqDamS7imagingImplIsImageServerComponentProperties>
    { 
        /// <summary>
        /// TcpPort
        /// </summary>
        public ConfigNodePropertyString TcpPort { get; private set; }

        /// <summary>
        /// AllowRemoteAccess
        /// </summary>
        public ConfigNodePropertyBoolean AllowRemoteAccess { get; private set; }

        /// <summary>
        /// MaxRenderRgnPixels
        /// </summary>
        public ConfigNodePropertyString MaxRenderRgnPixels { get; private set; }

        /// <summary>
        /// MaxMessageSize
        /// </summary>
        public ConfigNodePropertyString MaxMessageSize { get; private set; }

        /// <summary>
        /// RandomAccessUrlTimeout
        /// </summary>
        public ConfigNodePropertyInteger RandomAccessUrlTimeout { get; private set; }

        /// <summary>
        /// WorkerThreads
        /// </summary>
        public ConfigNodePropertyInteger WorkerThreads { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties()
        {
        }

        private ComAdobeCqDamS7imagingImplIsImageServerComponentProperties(ConfigNodePropertyString TcpPort, ConfigNodePropertyBoolean AllowRemoteAccess, ConfigNodePropertyString MaxRenderRgnPixels, ConfigNodePropertyString MaxMessageSize, ConfigNodePropertyInteger RandomAccessUrlTimeout, ConfigNodePropertyInteger WorkerThreads)
        {
            
            this.TcpPort = TcpPort;
            
            this.AllowRemoteAccess = AllowRemoteAccess;
            
            this.MaxRenderRgnPixels = MaxRenderRgnPixels;
            
            this.MaxMessageSize = MaxMessageSize;
            
            this.RandomAccessUrlTimeout = RandomAccessUrlTimeout;
            
            this.WorkerThreads = WorkerThreads;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.
        /// </summary>
        /// <returns>ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesBuilder</returns>
        public static ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesBuilder Builder()
        {
            return new ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesBuilder</returns>
        public ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesBuilder With()
        {
            return Builder()
                .TcpPort(TcpPort)
                .AllowRemoteAccess(AllowRemoteAccess)
                .MaxRenderRgnPixels(MaxRenderRgnPixels)
                .MaxMessageSize(MaxMessageSize)
                .RandomAccessUrlTimeout(RandomAccessUrlTimeout)
                .WorkerThreads(WorkerThreads);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqDamS7imagingImplIsImageServerComponentProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamS7imagingImplIsImageServerComponentProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamS7imagingImplIsImageServerComponentProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamS7imagingImplIsImageServerComponentProperties left, ComAdobeCqDamS7imagingImplIsImageServerComponentProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamS7imagingImplIsImageServerComponentProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamS7imagingImplIsImageServerComponentProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamS7imagingImplIsImageServerComponentProperties left, ComAdobeCqDamS7imagingImplIsImageServerComponentProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.
        /// </summary>
        public sealed class ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesBuilder
        {
            private ConfigNodePropertyString _TcpPort;
            private ConfigNodePropertyBoolean _AllowRemoteAccess;
            private ConfigNodePropertyString _MaxRenderRgnPixels;
            private ConfigNodePropertyString _MaxMessageSize;
            private ConfigNodePropertyInteger _RandomAccessUrlTimeout;
            private ConfigNodePropertyInteger _WorkerThreads;

            internal ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.TcpPort property.
            /// </summary>
            /// <param name="value">TcpPort</param>
            public ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesBuilder TcpPort(ConfigNodePropertyString value)
            {
                _TcpPort = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.AllowRemoteAccess property.
            /// </summary>
            /// <param name="value">AllowRemoteAccess</param>
            public ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesBuilder AllowRemoteAccess(ConfigNodePropertyBoolean value)
            {
                _AllowRemoteAccess = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.MaxRenderRgnPixels property.
            /// </summary>
            /// <param name="value">MaxRenderRgnPixels</param>
            public ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesBuilder MaxRenderRgnPixels(ConfigNodePropertyString value)
            {
                _MaxRenderRgnPixels = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.MaxMessageSize property.
            /// </summary>
            /// <param name="value">MaxMessageSize</param>
            public ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesBuilder MaxMessageSize(ConfigNodePropertyString value)
            {
                _MaxMessageSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.RandomAccessUrlTimeout property.
            /// </summary>
            /// <param name="value">RandomAccessUrlTimeout</param>
            public ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesBuilder RandomAccessUrlTimeout(ConfigNodePropertyInteger value)
            {
                _RandomAccessUrlTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.WorkerThreads property.
            /// </summary>
            /// <param name="value">WorkerThreads</param>
            public ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesBuilder WorkerThreads(ConfigNodePropertyInteger value)
            {
                _WorkerThreads = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.
            /// </summary>
            /// <returns>ComAdobeCqDamS7imagingImplIsImageServerComponentProperties</returns>
            public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties Build()
            {
                Validate();
                return new ComAdobeCqDamS7imagingImplIsImageServerComponentProperties(
                    TcpPort: _TcpPort,
                    AllowRemoteAccess: _AllowRemoteAccess,
                    MaxRenderRgnPixels: _MaxRenderRgnPixels,
                    MaxMessageSize: _MaxMessageSize,
                    RandomAccessUrlTimeout: _RandomAccessUrlTimeout,
                    WorkerThreads: _WorkerThreads
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}