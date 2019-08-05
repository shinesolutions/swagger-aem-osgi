using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties:  IEquatable<OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties>
    { 
        /// <summary>
        /// Name
        /// </summary>
        public ConfigNodePropertyString Name { get; private set; }

        /// <summary>
        /// Path
        /// </summary>
        public ConfigNodePropertyString Path { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties()
        {
        }

        private OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties(ConfigNodePropertyString Name, ConfigNodePropertyString Path)
        {
            
            this.Name = Name;
            
            this.Path = Path;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplDistributionEventDistributePropertiesBuilder</returns>
        public static OrgApacheSlingDistributionTriggerImplDistributionEventDistributePropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionTriggerImplDistributionEventDistributePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionTriggerImplDistributionEventDistributePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplDistributionEventDistributePropertiesBuilder</returns>
        public OrgApacheSlingDistributionTriggerImplDistributionEventDistributePropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Path(Path);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties left, OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties left, OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionTriggerImplDistributionEventDistributePropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _Path;

            internal OrgApacheSlingDistributionTriggerImplDistributionEventDistributePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionTriggerImplDistributionEventDistributePropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public OrgApacheSlingDistributionTriggerImplDistributionEventDistributePropertiesBuilder Path(ConfigNodePropertyString value)
            {
                _Path = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties</returns>
            public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties(
                    Name: _Name,
                    Path: _Path
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}