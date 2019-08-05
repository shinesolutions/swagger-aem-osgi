using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingFeatureflagsFeatureProperties
    /// </summary>
    public sealed class OrgApacheSlingFeatureflagsFeatureProperties:  IEquatable<OrgApacheSlingFeatureflagsFeatureProperties>
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
        /// Use OrgApacheSlingFeatureflagsFeatureProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingFeatureflagsFeatureProperties()
        {
        }

        private OrgApacheSlingFeatureflagsFeatureProperties(ConfigNodePropertyString Name, ConfigNodePropertyString Description, ConfigNodePropertyBoolean Enabled)
        {
            
            this.Name = Name;
            
            this.Description = Description;
            
            this.Enabled = Enabled;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingFeatureflagsFeatureProperties.
        /// </summary>
        /// <returns>OrgApacheSlingFeatureflagsFeaturePropertiesBuilder</returns>
        public static OrgApacheSlingFeatureflagsFeaturePropertiesBuilder Builder()
        {
            return new OrgApacheSlingFeatureflagsFeaturePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingFeatureflagsFeaturePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingFeatureflagsFeaturePropertiesBuilder</returns>
        public OrgApacheSlingFeatureflagsFeaturePropertiesBuilder With()
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

        public bool Equals(OrgApacheSlingFeatureflagsFeatureProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingFeatureflagsFeatureProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingFeatureflagsFeatureProperties</param>
        /// <param name="right">Compared (OrgApacheSlingFeatureflagsFeatureProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingFeatureflagsFeatureProperties left, OrgApacheSlingFeatureflagsFeatureProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingFeatureflagsFeatureProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingFeatureflagsFeatureProperties</param>
        /// <param name="right">Compared (OrgApacheSlingFeatureflagsFeatureProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingFeatureflagsFeatureProperties left, OrgApacheSlingFeatureflagsFeatureProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingFeatureflagsFeatureProperties.
        /// </summary>
        public sealed class OrgApacheSlingFeatureflagsFeaturePropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _Description;
            private ConfigNodePropertyBoolean _Enabled;

            internal OrgApacheSlingFeatureflagsFeaturePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingFeatureflagsFeatureProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingFeatureflagsFeaturePropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingFeatureflagsFeatureProperties.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingFeatureflagsFeaturePropertiesBuilder Description(ConfigNodePropertyString value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingFeatureflagsFeatureProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public OrgApacheSlingFeatureflagsFeaturePropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingFeatureflagsFeatureProperties.
            /// </summary>
            /// <returns>OrgApacheSlingFeatureflagsFeatureProperties</returns>
            public OrgApacheSlingFeatureflagsFeatureProperties Build()
            {
                Validate();
                return new OrgApacheSlingFeatureflagsFeatureProperties(
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