using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties
    /// </summary>
    public sealed class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties:  IEquatable<OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties>
    { 
        /// <summary>
        /// HcName
        /// </summary>
        public ConfigNodePropertyString HcName { get; private set; }

        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }

        /// <summary>
        /// HcMbeanName
        /// </summary>
        public ConfigNodePropertyString HcMbeanName { get; private set; }

        /// <summary>
        /// MbeanName
        /// </summary>
        public ConfigNodePropertyString MbeanName { get; private set; }

        /// <summary>
        /// AttributeName
        /// </summary>
        public ConfigNodePropertyString AttributeName { get; private set; }

        /// <summary>
        /// AttributeValueConstraint
        /// </summary>
        public ConfigNodePropertyString AttributeValueConstraint { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties()
        {
        }

        private OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties(ConfigNodePropertyString HcName, ConfigNodePropertyArray HcTags, ConfigNodePropertyString HcMbeanName, ConfigNodePropertyString MbeanName, ConfigNodePropertyString AttributeName, ConfigNodePropertyString AttributeValueConstraint)
        {
            
            this.HcName = HcName;
            
            this.HcTags = HcTags;
            
            this.HcMbeanName = HcMbeanName;
            
            this.MbeanName = MbeanName;
            
            this.AttributeName = AttributeName;
            
            this.AttributeValueConstraint = AttributeValueConstraint;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesBuilder</returns>
        public static OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesBuilder Builder()
        {
            return new OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesBuilder</returns>
        public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesBuilder With()
        {
            return Builder()
                .HcName(HcName)
                .HcTags(HcTags)
                .HcMbeanName(HcMbeanName)
                .MbeanName(MbeanName)
                .AttributeName(AttributeName)
                .AttributeValueConstraint(AttributeValueConstraint);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties left, OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties left, OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.
        /// </summary>
        public sealed class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyString _HcName;
            private ConfigNodePropertyArray _HcTags;
            private ConfigNodePropertyString _HcMbeanName;
            private ConfigNodePropertyString _MbeanName;
            private ConfigNodePropertyString _AttributeName;
            private ConfigNodePropertyString _AttributeValueConstraint;

            internal OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.HcName property.
            /// </summary>
            /// <param name="value">HcName</param>
            public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesBuilder HcName(ConfigNodePropertyString value)
            {
                _HcName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.HcMbeanName property.
            /// </summary>
            /// <param name="value">HcMbeanName</param>
            public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesBuilder HcMbeanName(ConfigNodePropertyString value)
            {
                _HcMbeanName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.MbeanName property.
            /// </summary>
            /// <param name="value">MbeanName</param>
            public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesBuilder MbeanName(ConfigNodePropertyString value)
            {
                _MbeanName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.AttributeName property.
            /// </summary>
            /// <param name="value">AttributeName</param>
            public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesBuilder AttributeName(ConfigNodePropertyString value)
            {
                _AttributeName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.AttributeValueConstraint property.
            /// </summary>
            /// <param name="value">AttributeValueConstraint</param>
            public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesBuilder AttributeValueConstraint(ConfigNodePropertyString value)
            {
                _AttributeValueConstraint = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.
            /// </summary>
            /// <returns>OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties</returns>
            public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties Build()
            {
                Validate();
                return new OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties(
                    HcName: _HcName,
                    HcTags: _HcTags,
                    HcMbeanName: _HcMbeanName,
                    MbeanName: _MbeanName,
                    AttributeName: _AttributeName,
                    AttributeValueConstraint: _AttributeValueConstraint
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}