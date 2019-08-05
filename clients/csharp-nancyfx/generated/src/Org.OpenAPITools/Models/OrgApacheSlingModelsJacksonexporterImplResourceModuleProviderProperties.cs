using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties
    /// </summary>
    public sealed class OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties:  IEquatable<OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties>
    { 
        /// <summary>
        /// MaxRecursionLevels
        /// </summary>
        public ConfigNodePropertyInteger MaxRecursionLevels { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties()
        {
        }

        private OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties(ConfigNodePropertyInteger MaxRecursionLevels)
        {
            
            this.MaxRecursionLevels = MaxRecursionLevels;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties.
        /// </summary>
        /// <returns>OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderPropertiesBuilder</returns>
        public static OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderPropertiesBuilder Builder()
        {
            return new OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderPropertiesBuilder</returns>
        public OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderPropertiesBuilder With()
        {
            return Builder()
                .MaxRecursionLevels(MaxRecursionLevels);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties</param>
        /// <param name="right">Compared (OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties left, OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties</param>
        /// <param name="right">Compared (OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties left, OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties.
        /// </summary>
        public sealed class OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderPropertiesBuilder
        {
            private ConfigNodePropertyInteger _MaxRecursionLevels;

            internal OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties.MaxRecursionLevels property.
            /// </summary>
            /// <param name="value">MaxRecursionLevels</param>
            public OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderPropertiesBuilder MaxRecursionLevels(ConfigNodePropertyInteger value)
            {
                _MaxRecursionLevels = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties.
            /// </summary>
            /// <returns>OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties</returns>
            public OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties Build()
            {
                Validate();
                return new OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties(
                    MaxRecursionLevels: _MaxRecursionLevels
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}