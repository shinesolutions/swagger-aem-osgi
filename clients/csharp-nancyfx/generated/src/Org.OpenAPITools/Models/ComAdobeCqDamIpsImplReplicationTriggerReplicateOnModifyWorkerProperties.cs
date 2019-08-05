using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties
    /// </summary>
    public sealed class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties:  IEquatable<ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties>
    { 
        /// <summary>
        /// DmreplicateonmodifyEnabled
        /// </summary>
        public ConfigNodePropertyBoolean DmreplicateonmodifyEnabled { get; private set; }

        /// <summary>
        /// DmreplicateonmodifyForcesyncdeletes
        /// </summary>
        public ConfigNodePropertyBoolean DmreplicateonmodifyForcesyncdeletes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties()
        {
        }

        private ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties(ConfigNodePropertyBoolean DmreplicateonmodifyEnabled, ConfigNodePropertyBoolean DmreplicateonmodifyForcesyncdeletes)
        {
            
            this.DmreplicateonmodifyEnabled = DmreplicateonmodifyEnabled;
            
            this.DmreplicateonmodifyForcesyncdeletes = DmreplicateonmodifyForcesyncdeletes;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.
        /// </summary>
        /// <returns>ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesBuilder</returns>
        public static ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesBuilder Builder()
        {
            return new ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesBuilder</returns>
        public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesBuilder With()
        {
            return Builder()
                .DmreplicateonmodifyEnabled(DmreplicateonmodifyEnabled)
                .DmreplicateonmodifyForcesyncdeletes(DmreplicateonmodifyForcesyncdeletes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties left, ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties left, ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.
        /// </summary>
        public sealed class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _DmreplicateonmodifyEnabled;
            private ConfigNodePropertyBoolean _DmreplicateonmodifyForcesyncdeletes;

            internal ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.DmreplicateonmodifyEnabled property.
            /// </summary>
            /// <param name="value">DmreplicateonmodifyEnabled</param>
            public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesBuilder DmreplicateonmodifyEnabled(ConfigNodePropertyBoolean value)
            {
                _DmreplicateonmodifyEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.DmreplicateonmodifyForcesyncdeletes property.
            /// </summary>
            /// <param name="value">DmreplicateonmodifyForcesyncdeletes</param>
            public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesBuilder DmreplicateonmodifyForcesyncdeletes(ConfigNodePropertyBoolean value)
            {
                _DmreplicateonmodifyForcesyncdeletes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.
            /// </summary>
            /// <returns>ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties</returns>
            public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties Build()
            {
                Validate();
                return new ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties(
                    DmreplicateonmodifyEnabled: _DmreplicateonmodifyEnabled,
                    DmreplicateonmodifyForcesyncdeletes: _DmreplicateonmodifyForcesyncdeletes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}