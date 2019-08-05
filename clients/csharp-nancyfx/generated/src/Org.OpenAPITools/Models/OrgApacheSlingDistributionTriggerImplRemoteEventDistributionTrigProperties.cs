using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties:  IEquatable<OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties>
    { 
        /// <summary>
        /// Name
        /// </summary>
        public ConfigNodePropertyString Name { get; private set; }

        /// <summary>
        /// Endpoint
        /// </summary>
        public ConfigNodePropertyString Endpoint { get; private set; }

        /// <summary>
        /// TransportSecretProviderTarget
        /// </summary>
        public ConfigNodePropertyString TransportSecretProviderTarget { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties()
        {
        }

        private OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties(ConfigNodePropertyString Name, ConfigNodePropertyString Endpoint, ConfigNodePropertyString TransportSecretProviderTarget)
        {
            
            this.Name = Name;
            
            this.Endpoint = Endpoint;
            
            this.TransportSecretProviderTarget = TransportSecretProviderTarget;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesBuilder</returns>
        public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Endpoint(Endpoint)
                .TransportSecretProviderTarget(TransportSecretProviderTarget);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties left, OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties left, OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _Endpoint;
            private ConfigNodePropertyString _TransportSecretProviderTarget;

            internal OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.Endpoint property.
            /// </summary>
            /// <param name="value">Endpoint</param>
            public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesBuilder Endpoint(ConfigNodePropertyString value)
            {
                _Endpoint = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.TransportSecretProviderTarget property.
            /// </summary>
            /// <param name="value">TransportSecretProviderTarget</param>
            public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesBuilder TransportSecretProviderTarget(ConfigNodePropertyString value)
            {
                _TransportSecretProviderTarget = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties</returns>
            public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties(
                    Name: _Name,
                    Endpoint: _Endpoint,
                    TransportSecretProviderTarget: _TransportSecretProviderTarget
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}