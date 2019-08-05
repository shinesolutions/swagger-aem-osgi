using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties
    /// </summary>
    public sealed class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties:  IEquatable<ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties>
    { 
        /// <summary>
        /// Name
        /// </summary>
        public ConfigNodePropertyString Name { get; private set; }

        /// <summary>
        /// ServiceName
        /// </summary>
        public ConfigNodePropertyString ServiceName { get; private set; }

        /// <summary>
        /// UserId
        /// </summary>
        public ConfigNodePropertyString UserId { get; private set; }

        /// <summary>
        /// AccessTokenProviderTarget
        /// </summary>
        public ConfigNodePropertyString AccessTokenProviderTarget { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties()
        {
        }

        private ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties(ConfigNodePropertyString Name, ConfigNodePropertyString ServiceName, ConfigNodePropertyString UserId, ConfigNodePropertyString AccessTokenProviderTarget)
        {
            
            this.Name = Name;
            
            this.ServiceName = ServiceName;
            
            this.UserId = UserId;
            
            this.AccessTokenProviderTarget = AccessTokenProviderTarget;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesBuilder</returns>
        public static ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesBuilder</returns>
        public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .ServiceName(ServiceName)
                .UserId(UserId)
                .AccessTokenProviderTarget(AccessTokenProviderTarget);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties left, ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties left, ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.
        /// </summary>
        public sealed class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _ServiceName;
            private ConfigNodePropertyString _UserId;
            private ConfigNodePropertyString _AccessTokenProviderTarget;

            internal ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.ServiceName property.
            /// </summary>
            /// <param name="value">ServiceName</param>
            public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesBuilder ServiceName(ConfigNodePropertyString value)
            {
                _ServiceName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.UserId property.
            /// </summary>
            /// <param name="value">UserId</param>
            public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesBuilder UserId(ConfigNodePropertyString value)
            {
                _UserId = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.AccessTokenProviderTarget property.
            /// </summary>
            /// <param name="value">AccessTokenProviderTarget</param>
            public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesBuilder AccessTokenProviderTarget(ConfigNodePropertyString value)
            {
                _AccessTokenProviderTarget = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties</returns>
            public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties Build()
            {
                Validate();
                return new ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties(
                    Name: _Name,
                    ServiceName: _ServiceName,
                    UserId: _UserId,
                    AccessTokenProviderTarget: _AccessTokenProviderTarget
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}