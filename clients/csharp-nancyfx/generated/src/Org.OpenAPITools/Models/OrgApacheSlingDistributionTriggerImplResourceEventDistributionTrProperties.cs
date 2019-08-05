using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties:  IEquatable<OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties>
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
        /// Use OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties()
        {
        }

        private OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties(ConfigNodePropertyString Name, ConfigNodePropertyString Path)
        {
            
            this.Name = Name;
            
            this.Path = Path;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrPropertiesBuilder</returns>
        public OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrPropertiesBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties left, OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties left, OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _Path;

            internal OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrPropertiesBuilder Path(ConfigNodePropertyString value)
            {
                _Path = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties</returns>
            public OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties(
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