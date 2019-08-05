using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties
    /// </summary>
    public sealed class OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties:  IEquatable<OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties>
    { 
        /// <summary>
        /// Name
        /// </summary>
        public ConfigNodePropertyString Name { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public ConfigNodePropertyString Description { get; private set; }

        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties()
        {
        }

        private OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties(ConfigNodePropertyString Name, ConfigNodePropertyString Description, ConfigNodePropertyBoolean Enabled)
        {
            
            this.Name = Name;
            
            this.Description = Description;
            
            this.Enabled = Enabled;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties.
        /// </summary>
        /// <returns>OrgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesBuilder</returns>
        public static OrgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesBuilder Builder()
        {
            return new OrgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesBuilder</returns>
        public OrgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Description(Description)
                .Enabled(Enabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties</param>
        /// <param name="right">Compared (OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties left, OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties</param>
        /// <param name="right">Compared (OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties left, OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties.
        /// </summary>
        public sealed class OrgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _Description;
            private ConfigNodePropertyBoolean _Enabled;

            internal OrgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesBuilder Description(ConfigNodePropertyString value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public OrgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties.
            /// </summary>
            /// <returns>OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties</returns>
            public OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties Build()
            {
                Validate();
                return new OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties(
                    Name: _Name,
                    Description: _Description,
                    Enabled: _Enabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}