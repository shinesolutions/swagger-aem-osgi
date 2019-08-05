using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties:  IEquatable<OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties>
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
        /// IgnoredPathsPatterns
        /// </summary>
        public ConfigNodePropertyArray IgnoredPathsPatterns { get; private set; }

        /// <summary>
        /// ServiceName
        /// </summary>
        public ConfigNodePropertyString ServiceName { get; private set; }

        /// <summary>
        /// Deep
        /// </summary>
        public ConfigNodePropertyBoolean Deep { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties()
        {
        }

        private OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties(ConfigNodePropertyString Name, ConfigNodePropertyString Path, ConfigNodePropertyArray IgnoredPathsPatterns, ConfigNodePropertyString ServiceName, ConfigNodePropertyBoolean Deep)
        {
            
            this.Name = Name;
            
            this.Path = Path;
            
            this.IgnoredPathsPatterns = IgnoredPathsPatterns;
            
            this.ServiceName = ServiceName;
            
            this.Deep = Deep;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesBuilder</returns>
        public static OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesBuilder</returns>
        public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Path(Path)
                .IgnoredPathsPatterns(IgnoredPathsPatterns)
                .ServiceName(ServiceName)
                .Deep(Deep);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties left, OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties left, OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _Path;
            private ConfigNodePropertyArray _IgnoredPathsPatterns;
            private ConfigNodePropertyString _ServiceName;
            private ConfigNodePropertyBoolean _Deep;

            internal OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesBuilder Path(ConfigNodePropertyString value)
            {
                _Path = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.IgnoredPathsPatterns property.
            /// </summary>
            /// <param name="value">IgnoredPathsPatterns</param>
            public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesBuilder IgnoredPathsPatterns(ConfigNodePropertyArray value)
            {
                _IgnoredPathsPatterns = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.ServiceName property.
            /// </summary>
            /// <param name="value">ServiceName</param>
            public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesBuilder ServiceName(ConfigNodePropertyString value)
            {
                _ServiceName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.Deep property.
            /// </summary>
            /// <param name="value">Deep</param>
            public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesBuilder Deep(ConfigNodePropertyBoolean value)
            {
                _Deep = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties</returns>
            public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties(
                    Name: _Name,
                    Path: _Path,
                    IgnoredPathsPatterns: _IgnoredPathsPatterns,
                    ServiceName: _ServiceName,
                    Deep: _Deep
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}