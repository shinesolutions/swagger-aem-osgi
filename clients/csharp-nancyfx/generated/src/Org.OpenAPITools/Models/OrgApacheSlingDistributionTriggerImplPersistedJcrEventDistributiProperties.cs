using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties:  IEquatable<OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties>
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
        /// ServiceName
        /// </summary>
        public ConfigNodePropertyString ServiceName { get; private set; }

        /// <summary>
        /// NuggetsPath
        /// </summary>
        public ConfigNodePropertyString NuggetsPath { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties()
        {
        }

        private OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties(ConfigNodePropertyString Name, ConfigNodePropertyString Path, ConfigNodePropertyString ServiceName, ConfigNodePropertyString NuggetsPath)
        {
            
            this.Name = Name;
            
            this.Path = Path;
            
            this.ServiceName = ServiceName;
            
            this.NuggetsPath = NuggetsPath;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesBuilder</returns>
        public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Path(Path)
                .ServiceName(ServiceName)
                .NuggetsPath(NuggetsPath);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties left, OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties left, OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _Path;
            private ConfigNodePropertyString _ServiceName;
            private ConfigNodePropertyString _NuggetsPath;

            internal OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesBuilder Path(ConfigNodePropertyString value)
            {
                _Path = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.ServiceName property.
            /// </summary>
            /// <param name="value">ServiceName</param>
            public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesBuilder ServiceName(ConfigNodePropertyString value)
            {
                _ServiceName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.NuggetsPath property.
            /// </summary>
            /// <param name="value">NuggetsPath</param>
            public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesBuilder NuggetsPath(ConfigNodePropertyString value)
            {
                _NuggetsPath = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties</returns>
            public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties(
                    Name: _Name,
                    Path: _Path,
                    ServiceName: _ServiceName,
                    NuggetsPath: _NuggetsPath
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}