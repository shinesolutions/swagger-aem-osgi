using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties:  IEquatable<OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties>
    { 
        /// <summary>
        /// Name
        /// </summary>
        public ConfigNodePropertyString Name { get; private set; }

        /// <summary>
        /// Username
        /// </summary>
        public ConfigNodePropertyString Username { get; private set; }

        /// <summary>
        /// Password
        /// </summary>
        public ConfigNodePropertyString Password { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties()
        {
        }

        private OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties(ConfigNodePropertyString Name, ConfigNodePropertyString Username, ConfigNodePropertyString Password)
        {
            
            this.Name = Name;
            
            this.Username = Username;
            
            this.Password = Password;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesBuilder</returns>
        public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Username(Username)
                .Password(Password);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties left, OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties left, OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _Username;
            private ConfigNodePropertyString _Password;

            internal OrgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.Username property.
            /// </summary>
            /// <param name="value">Username</param>
            public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesBuilder Username(ConfigNodePropertyString value)
            {
                _Username = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.Password property.
            /// </summary>
            /// <param name="value">Password</param>
            public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesBuilder Password(ConfigNodePropertyString value)
            {
                _Password = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties</returns>
            public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties(
                    Name: _Name,
                    Username: _Username,
                    Password: _Password
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}