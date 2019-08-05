using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties
    /// </summary>
    public sealed class ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties:  IEquatable<ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties>
    { 
        /// <summary>
        /// ReplicationContentUseFileStorage
        /// </summary>
        public ConfigNodePropertyBoolean ReplicationContentUseFileStorage { get; private set; }

        /// <summary>
        /// ReplicationContentMaxCommitAttempts
        /// </summary>
        public ConfigNodePropertyInteger ReplicationContentMaxCommitAttempts { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties()
        {
        }

        private ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties(ConfigNodePropertyBoolean ReplicationContentUseFileStorage, ConfigNodePropertyInteger ReplicationContentMaxCommitAttempts)
        {
            
            this.ReplicationContentUseFileStorage = ReplicationContentUseFileStorage;
            
            this.ReplicationContentMaxCommitAttempts = ReplicationContentMaxCommitAttempts;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplReplicationContentFactoryProviderImplPropertiesBuilder</returns>
        public static ComDayCqReplicationImplReplicationContentFactoryProviderImplPropertiesBuilder Builder()
        {
            return new ComDayCqReplicationImplReplicationContentFactoryProviderImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationImplReplicationContentFactoryProviderImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplReplicationContentFactoryProviderImplPropertiesBuilder</returns>
        public ComDayCqReplicationImplReplicationContentFactoryProviderImplPropertiesBuilder With()
        {
            return Builder()
                .ReplicationContentUseFileStorage(ReplicationContentUseFileStorage)
                .ReplicationContentMaxCommitAttempts(ReplicationContentMaxCommitAttempts);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties left, ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties</param>
        /// <param name="right">Compared (ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties left, ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties.
        /// </summary>
        public sealed class ComDayCqReplicationImplReplicationContentFactoryProviderImplPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _ReplicationContentUseFileStorage;
            private ConfigNodePropertyInteger _ReplicationContentMaxCommitAttempts;

            internal ComDayCqReplicationImplReplicationContentFactoryProviderImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties.ReplicationContentUseFileStorage property.
            /// </summary>
            /// <param name="value">ReplicationContentUseFileStorage</param>
            public ComDayCqReplicationImplReplicationContentFactoryProviderImplPropertiesBuilder ReplicationContentUseFileStorage(ConfigNodePropertyBoolean value)
            {
                _ReplicationContentUseFileStorage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties.ReplicationContentMaxCommitAttempts property.
            /// </summary>
            /// <param name="value">ReplicationContentMaxCommitAttempts</param>
            public ComDayCqReplicationImplReplicationContentFactoryProviderImplPropertiesBuilder ReplicationContentMaxCommitAttempts(ConfigNodePropertyInteger value)
            {
                _ReplicationContentMaxCommitAttempts = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties.
            /// </summary>
            /// <returns>ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties</returns>
            public ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties Build()
            {
                Validate();
                return new ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties(
                    ReplicationContentUseFileStorage: _ReplicationContentUseFileStorage,
                    ReplicationContentMaxCommitAttempts: _ReplicationContentMaxCommitAttempts
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}