using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties
    /// </summary>
    public sealed class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties:  IEquatable<ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties>
    { 
        /// <summary>
        /// ProviderName
        /// </summary>
        public ConfigNodePropertyString ProviderName { get; private set; }

        /// <summary>
        /// ForwardRequests
        /// </summary>
        public ConfigNodePropertyBoolean ForwardRequests { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties()
        {
        }

        private ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties(ConfigNodePropertyString ProviderName, ConfigNodePropertyBoolean ForwardRequests)
        {
            
            this.ProviderName = ProviderName;
            
            this.ForwardRequests = ForwardRequests;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesBuilder</returns>
        public static ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesBuilder</returns>
        public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesBuilder With()
        {
            return Builder()
                .ProviderName(ProviderName)
                .ForwardRequests(ForwardRequests);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties left, ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties left, ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.
        /// </summary>
        public sealed class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesBuilder
        {
            private ConfigNodePropertyString _ProviderName;
            private ConfigNodePropertyBoolean _ForwardRequests;

            internal ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.ProviderName property.
            /// </summary>
            /// <param name="value">ProviderName</param>
            public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesBuilder ProviderName(ConfigNodePropertyString value)
            {
                _ProviderName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.ForwardRequests property.
            /// </summary>
            /// <param name="value">ForwardRequests</param>
            public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesBuilder ForwardRequests(ConfigNodePropertyBoolean value)
            {
                _ForwardRequests = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties</returns>
            public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties Build()
            {
                Validate();
                return new ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties(
                    ProviderName: _ProviderName,
                    ForwardRequests: _ForwardRequests
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}