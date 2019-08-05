using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingHcCoreImplScriptableHealthCheckProperties
    /// </summary>
    public sealed class OrgApacheSlingHcCoreImplScriptableHealthCheckProperties:  IEquatable<OrgApacheSlingHcCoreImplScriptableHealthCheckProperties>
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
        /// Expression
        /// </summary>
        public ConfigNodePropertyString Expression { get; private set; }

        /// <summary>
        /// LanguageExtension
        /// </summary>
        public ConfigNodePropertyString LanguageExtension { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingHcCoreImplScriptableHealthCheckProperties()
        {
        }

        private OrgApacheSlingHcCoreImplScriptableHealthCheckProperties(ConfigNodePropertyString HcName, ConfigNodePropertyArray HcTags, ConfigNodePropertyString HcMbeanName, ConfigNodePropertyString Expression, ConfigNodePropertyString LanguageExtension)
        {
            
            this.HcName = HcName;
            
            this.HcTags = HcTags;
            
            this.HcMbeanName = HcMbeanName;
            
            this.Expression = Expression;
            
            this.LanguageExtension = LanguageExtension;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplScriptableHealthCheckPropertiesBuilder</returns>
        public static OrgApacheSlingHcCoreImplScriptableHealthCheckPropertiesBuilder Builder()
        {
            return new OrgApacheSlingHcCoreImplScriptableHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingHcCoreImplScriptableHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplScriptableHealthCheckPropertiesBuilder</returns>
        public OrgApacheSlingHcCoreImplScriptableHealthCheckPropertiesBuilder With()
        {
            return Builder()
                .HcName(HcName)
                .HcTags(HcTags)
                .HcMbeanName(HcMbeanName)
                .Expression(Expression)
                .LanguageExtension(LanguageExtension);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingHcCoreImplScriptableHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplScriptableHealthCheckProperties</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplScriptableHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingHcCoreImplScriptableHealthCheckProperties left, OrgApacheSlingHcCoreImplScriptableHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplScriptableHealthCheckProperties</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplScriptableHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingHcCoreImplScriptableHealthCheckProperties left, OrgApacheSlingHcCoreImplScriptableHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.
        /// </summary>
        public sealed class OrgApacheSlingHcCoreImplScriptableHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyString _HcName;
            private ConfigNodePropertyArray _HcTags;
            private ConfigNodePropertyString _HcMbeanName;
            private ConfigNodePropertyString _Expression;
            private ConfigNodePropertyString _LanguageExtension;

            internal OrgApacheSlingHcCoreImplScriptableHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.HcName property.
            /// </summary>
            /// <param name="value">HcName</param>
            public OrgApacheSlingHcCoreImplScriptableHealthCheckPropertiesBuilder HcName(ConfigNodePropertyString value)
            {
                _HcName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public OrgApacheSlingHcCoreImplScriptableHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.HcMbeanName property.
            /// </summary>
            /// <param name="value">HcMbeanName</param>
            public OrgApacheSlingHcCoreImplScriptableHealthCheckPropertiesBuilder HcMbeanName(ConfigNodePropertyString value)
            {
                _HcMbeanName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.Expression property.
            /// </summary>
            /// <param name="value">Expression</param>
            public OrgApacheSlingHcCoreImplScriptableHealthCheckPropertiesBuilder Expression(ConfigNodePropertyString value)
            {
                _Expression = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.LanguageExtension property.
            /// </summary>
            /// <param name="value">LanguageExtension</param>
            public OrgApacheSlingHcCoreImplScriptableHealthCheckPropertiesBuilder LanguageExtension(ConfigNodePropertyString value)
            {
                _LanguageExtension = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.
            /// </summary>
            /// <returns>OrgApacheSlingHcCoreImplScriptableHealthCheckProperties</returns>
            public OrgApacheSlingHcCoreImplScriptableHealthCheckProperties Build()
            {
                Validate();
                return new OrgApacheSlingHcCoreImplScriptableHealthCheckProperties(
                    HcName: _HcName,
                    HcTags: _HcTags,
                    HcMbeanName: _HcMbeanName,
                    Expression: _Expression,
                    LanguageExtension: _LanguageExtension
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}