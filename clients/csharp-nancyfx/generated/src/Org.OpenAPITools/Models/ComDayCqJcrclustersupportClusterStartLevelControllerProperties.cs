using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqJcrclustersupportClusterStartLevelControllerProperties
    /// </summary>
    public sealed class ComDayCqJcrclustersupportClusterStartLevelControllerProperties:  IEquatable<ComDayCqJcrclustersupportClusterStartLevelControllerProperties>
    { 
        /// <summary>
        /// ClusterLevelEnable
        /// </summary>
        public ConfigNodePropertyBoolean ClusterLevelEnable { get; private set; }

        /// <summary>
        /// ClusterMasterLevel
        /// </summary>
        public ConfigNodePropertyInteger ClusterMasterLevel { get; private set; }

        /// <summary>
        /// ClusterSlaveLevel
        /// </summary>
        public ConfigNodePropertyInteger ClusterSlaveLevel { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqJcrclustersupportClusterStartLevelControllerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqJcrclustersupportClusterStartLevelControllerProperties()
        {
        }

        private ComDayCqJcrclustersupportClusterStartLevelControllerProperties(ConfigNodePropertyBoolean ClusterLevelEnable, ConfigNodePropertyInteger ClusterMasterLevel, ConfigNodePropertyInteger ClusterSlaveLevel)
        {
            
            this.ClusterLevelEnable = ClusterLevelEnable;
            
            this.ClusterMasterLevel = ClusterMasterLevel;
            
            this.ClusterSlaveLevel = ClusterSlaveLevel;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqJcrclustersupportClusterStartLevelControllerProperties.
        /// </summary>
        /// <returns>ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesBuilder</returns>
        public static ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesBuilder Builder()
        {
            return new ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesBuilder</returns>
        public ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesBuilder With()
        {
            return Builder()
                .ClusterLevelEnable(ClusterLevelEnable)
                .ClusterMasterLevel(ClusterMasterLevel)
                .ClusterSlaveLevel(ClusterSlaveLevel);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqJcrclustersupportClusterStartLevelControllerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqJcrclustersupportClusterStartLevelControllerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqJcrclustersupportClusterStartLevelControllerProperties</param>
        /// <param name="right">Compared (ComDayCqJcrclustersupportClusterStartLevelControllerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqJcrclustersupportClusterStartLevelControllerProperties left, ComDayCqJcrclustersupportClusterStartLevelControllerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqJcrclustersupportClusterStartLevelControllerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqJcrclustersupportClusterStartLevelControllerProperties</param>
        /// <param name="right">Compared (ComDayCqJcrclustersupportClusterStartLevelControllerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqJcrclustersupportClusterStartLevelControllerProperties left, ComDayCqJcrclustersupportClusterStartLevelControllerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqJcrclustersupportClusterStartLevelControllerProperties.
        /// </summary>
        public sealed class ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _ClusterLevelEnable;
            private ConfigNodePropertyInteger _ClusterMasterLevel;
            private ConfigNodePropertyInteger _ClusterSlaveLevel;

            internal ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqJcrclustersupportClusterStartLevelControllerProperties.ClusterLevelEnable property.
            /// </summary>
            /// <param name="value">ClusterLevelEnable</param>
            public ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesBuilder ClusterLevelEnable(ConfigNodePropertyBoolean value)
            {
                _ClusterLevelEnable = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqJcrclustersupportClusterStartLevelControllerProperties.ClusterMasterLevel property.
            /// </summary>
            /// <param name="value">ClusterMasterLevel</param>
            public ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesBuilder ClusterMasterLevel(ConfigNodePropertyInteger value)
            {
                _ClusterMasterLevel = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqJcrclustersupportClusterStartLevelControllerProperties.ClusterSlaveLevel property.
            /// </summary>
            /// <param name="value">ClusterSlaveLevel</param>
            public ComDayCqJcrclustersupportClusterStartLevelControllerPropertiesBuilder ClusterSlaveLevel(ConfigNodePropertyInteger value)
            {
                _ClusterSlaveLevel = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqJcrclustersupportClusterStartLevelControllerProperties.
            /// </summary>
            /// <returns>ComDayCqJcrclustersupportClusterStartLevelControllerProperties</returns>
            public ComDayCqJcrclustersupportClusterStartLevelControllerProperties Build()
            {
                Validate();
                return new ComDayCqJcrclustersupportClusterStartLevelControllerProperties(
                    ClusterLevelEnable: _ClusterLevelEnable,
                    ClusterMasterLevel: _ClusterMasterLevel,
                    ClusterSlaveLevel: _ClusterSlaveLevel
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}