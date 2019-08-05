using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties
    /// </summary>
    public sealed class ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties:  IEquatable<ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties>
    { 
        /// <summary>
        /// ForwardRequests
        /// </summary>
        public ConfigNodePropertyBoolean ForwardRequests { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties()
        {
        }

        private ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties(ConfigNodePropertyBoolean ForwardRequests)
        {
            
            this.ForwardRequests = ForwardRequests;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplReplicationDistributionTransPropertiesBuilder</returns>
        public static ComAdobeGraniteDistributionCoreImplReplicationDistributionTransPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteDistributionCoreImplReplicationDistributionTransPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteDistributionCoreImplReplicationDistributionTransPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplReplicationDistributionTransPropertiesBuilder</returns>
        public ComAdobeGraniteDistributionCoreImplReplicationDistributionTransPropertiesBuilder With()
        {
            return Builder()
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

        public bool Equals(ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties left, ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties left, ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties.
        /// </summary>
        public sealed class ComAdobeGraniteDistributionCoreImplReplicationDistributionTransPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _ForwardRequests;

            internal ComAdobeGraniteDistributionCoreImplReplicationDistributionTransPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties.ForwardRequests property.
            /// </summary>
            /// <param name="value">ForwardRequests</param>
            public ComAdobeGraniteDistributionCoreImplReplicationDistributionTransPropertiesBuilder ForwardRequests(ConfigNodePropertyBoolean value)
            {
                _ForwardRequests = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties</returns>
            public ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties Build()
            {
                Validate();
                return new ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties(
                    ForwardRequests: _ForwardRequests
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}