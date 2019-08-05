using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties
    /// </summary>
    public sealed class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties:  IEquatable<OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties>
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
        /// Seconds
        /// </summary>
        public ConfigNodePropertyString Seconds { get; private set; }

        /// <summary>
        /// ServiceName
        /// </summary>
        public ConfigNodePropertyString ServiceName { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties()
        {
        }

        private OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties(ConfigNodePropertyString Name, ConfigNodePropertyString Path, ConfigNodePropertyString Seconds, ConfigNodePropertyString ServiceName)
        {
            
            this.Name = Name;
            
            this.Path = Path;
            
            this.Seconds = Seconds;
            
            this.ServiceName = ServiceName;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesBuilder</returns>
        public static OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesBuilder Builder()
        {
            return new OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesBuilder</returns>
        public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Path(Path)
                .Seconds(Seconds)
                .ServiceName(ServiceName);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties left, OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties left, OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.
        /// </summary>
        public sealed class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesBuilder
        {
            private ConfigNodePropertyString _Name;
            private ConfigNodePropertyString _Path;
            private ConfigNodePropertyString _Seconds;
            private ConfigNodePropertyString _ServiceName;

            internal OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesBuilder Name(ConfigNodePropertyString value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesBuilder Path(ConfigNodePropertyString value)
            {
                _Path = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.Seconds property.
            /// </summary>
            /// <param name="value">Seconds</param>
            public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesBuilder Seconds(ConfigNodePropertyString value)
            {
                _Seconds = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.ServiceName property.
            /// </summary>
            /// <param name="value">ServiceName</param>
            public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesBuilder ServiceName(ConfigNodePropertyString value)
            {
                _ServiceName = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties</returns>
            public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties Build()
            {
                Validate();
                return new OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties(
                    Name: _Name,
                    Path: _Path,
                    Seconds: _Seconds,
                    ServiceName: _ServiceName
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}