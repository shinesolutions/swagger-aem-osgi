using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationImplReplicationReceiverImplProperties
    /// </summary>
    public sealed class ComDayCqReplicationImplReplicationReceiverImplProperties:  IEquatable<ComDayCqReplicationImplReplicationReceiverImplProperties>
    { 
        /// <summary>
        /// ReceiverTmpfileThreshold
        /// </summary>
        public ConfigNodePropertyInteger ReceiverTmpfileThreshold { get; private set; }

        /// <summary>
        /// ReceiverPackagesUseInstall
        /// </summary>
        public ConfigNodePropertyBoolean ReceiverPackagesUseInstall { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReplicationImplReplicationReceiverImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationImplReplicationReceiverImplProperties()
        {
        }

        private ComDayCqReplicationImplReplicationReceiverImplProperties(ConfigNodePropertyInteger ReceiverTmpfileThreshold, ConfigNodePropertyBoolean ReceiverPackagesUseInstall)
        {
            
            this.ReceiverTmpfileThreshold = ReceiverTmpfileThreshold;
            
            this.ReceiverPackagesUseInstall = ReceiverPackagesUseInstall;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationImplReplicationReceiverImplProperties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplReplicationReceiverImplPropertiesBuilder</returns>
        public static ComDayCqReplicationImplReplicationReceiverImplPropertiesBuilder Builder()
        {
            return new ComDayCqReplicationImplReplicationReceiverImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationImplReplicationReceiverImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplReplicationReceiverImplPropertiesBuilder</returns>
        public ComDayCqReplicationImplReplicationReceiverImplPropertiesBuilder With()
        {
            return Builder()
                .ReceiverTmpfileThreshold(ReceiverTmpfileThreshold)
                .ReceiverPackagesUseInstall(ReceiverPackagesUseInstall);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqReplicationImplReplicationReceiverImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationImplReplicationReceiverImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplReplicationReceiverImplProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationImplReplicationReceiverImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationImplReplicationReceiverImplProperties left, ComDayCqReplicationImplReplicationReceiverImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationImplReplicationReceiverImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplReplicationReceiverImplProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationImplReplicationReceiverImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationImplReplicationReceiverImplProperties left, ComDayCqReplicationImplReplicationReceiverImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationImplReplicationReceiverImplProperties.
        /// </summary>
        public sealed class ComDayCqReplicationImplReplicationReceiverImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ReceiverTmpfileThreshold;
            private ConfigNodePropertyBoolean _ReceiverPackagesUseInstall;

            internal ComDayCqReplicationImplReplicationReceiverImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplReplicationReceiverImplProperties.ReceiverTmpfileThreshold property.
            /// </summary>
            /// <param name="value">ReceiverTmpfileThreshold</param>
            public ComDayCqReplicationImplReplicationReceiverImplPropertiesBuilder ReceiverTmpfileThreshold(ConfigNodePropertyInteger value)
            {
                _ReceiverTmpfileThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplReplicationReceiverImplProperties.ReceiverPackagesUseInstall property.
            /// </summary>
            /// <param name="value">ReceiverPackagesUseInstall</param>
            public ComDayCqReplicationImplReplicationReceiverImplPropertiesBuilder ReceiverPackagesUseInstall(ConfigNodePropertyBoolean value)
            {
                _ReceiverPackagesUseInstall = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationImplReplicationReceiverImplProperties.
            /// </summary>
            /// <returns>ComDayCqReplicationImplReplicationReceiverImplProperties</returns>
            public ComDayCqReplicationImplReplicationReceiverImplProperties Build()
            {
                Validate();
                return new ComDayCqReplicationImplReplicationReceiverImplProperties(
                    ReceiverTmpfileThreshold: _ReceiverTmpfileThreshold,
                    ReceiverPackagesUseInstall: _ReceiverPackagesUseInstall
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}