using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties
    /// </summary>
    public sealed class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties:  IEquatable<ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties>
    { 
        /// <summary>
        /// FlushAgents
        /// </summary>
        public ConfigNodePropertyArray FlushAgents { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties()
        {
        }

        private ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties(ConfigNodePropertyArray FlushAgents)
        {
            
            this.FlushAgents = FlushAgents;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.
        /// </summary>
        /// <returns>ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandlePropertiesBuilder</returns>
        public static ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandlePropertiesBuilder Builder()
        {
            return new ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandlePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandlePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandlePropertiesBuilder</returns>
        public ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandlePropertiesBuilder With()
        {
            return Builder()
                .FlushAgents(FlushAgents);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties</param>
        /// <param name="right">Compared (ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties left, ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties</param>
        /// <param name="right">Compared (ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties left, ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.
        /// </summary>
        public sealed class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandlePropertiesBuilder
        {
            private ConfigNodePropertyArray _FlushAgents;

            internal ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandlePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.FlushAgents property.
            /// </summary>
            /// <param name="value">FlushAgents</param>
            public ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandlePropertiesBuilder FlushAgents(ConfigNodePropertyArray value)
            {
                _FlushAgents = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.
            /// </summary>
            /// <returns>ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties</returns>
            public ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties Build()
            {
                Validate();
                return new ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties(
                    FlushAgents: _FlushAgents
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}