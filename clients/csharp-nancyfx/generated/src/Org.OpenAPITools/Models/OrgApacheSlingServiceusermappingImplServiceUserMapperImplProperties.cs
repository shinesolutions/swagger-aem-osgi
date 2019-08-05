using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties
    /// </summary>
    public sealed class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties:  IEquatable<OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties>
    { 
        /// <summary>
        /// UserMapping
        /// </summary>
        public ConfigNodePropertyArray UserMapping { get; private set; }

        /// <summary>
        /// UserDefault
        /// </summary>
        public ConfigNodePropertyString UserDefault { get; private set; }

        /// <summary>
        /// UserEnableDefaultMapping
        /// </summary>
        public ConfigNodePropertyBoolean UserEnableDefaultMapping { get; private set; }

        /// <summary>
        /// RequireValidation
        /// </summary>
        public ConfigNodePropertyBoolean RequireValidation { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties()
        {
        }

        private OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties(ConfigNodePropertyArray UserMapping, ConfigNodePropertyString UserDefault, ConfigNodePropertyBoolean UserEnableDefaultMapping, ConfigNodePropertyBoolean RequireValidation)
        {
            
            this.UserMapping = UserMapping;
            
            this.UserDefault = UserDefault;
            
            this.UserEnableDefaultMapping = UserEnableDefaultMapping;
            
            this.RequireValidation = RequireValidation;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.
        /// </summary>
        /// <returns>OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesBuilder</returns>
        public static OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesBuilder Builder()
        {
            return new OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesBuilder</returns>
        public OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesBuilder With()
        {
            return Builder()
                .UserMapping(UserMapping)
                .UserDefault(UserDefault)
                .UserEnableDefaultMapping(UserEnableDefaultMapping)
                .RequireValidation(RequireValidation);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties left, OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties left, OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.
        /// </summary>
        public sealed class OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _UserMapping;
            private ConfigNodePropertyString _UserDefault;
            private ConfigNodePropertyBoolean _UserEnableDefaultMapping;
            private ConfigNodePropertyBoolean _RequireValidation;

            internal OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.UserMapping property.
            /// </summary>
            /// <param name="value">UserMapping</param>
            public OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesBuilder UserMapping(ConfigNodePropertyArray value)
            {
                _UserMapping = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.UserDefault property.
            /// </summary>
            /// <param name="value">UserDefault</param>
            public OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesBuilder UserDefault(ConfigNodePropertyString value)
            {
                _UserDefault = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.UserEnableDefaultMapping property.
            /// </summary>
            /// <param name="value">UserEnableDefaultMapping</param>
            public OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesBuilder UserEnableDefaultMapping(ConfigNodePropertyBoolean value)
            {
                _UserEnableDefaultMapping = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.RequireValidation property.
            /// </summary>
            /// <param name="value">RequireValidation</param>
            public OrgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesBuilder RequireValidation(ConfigNodePropertyBoolean value)
            {
                _RequireValidation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.
            /// </summary>
            /// <returns>OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties</returns>
            public OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties Build()
            {
                Validate();
                return new OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties(
                    UserMapping: _UserMapping,
                    UserDefault: _UserDefault,
                    UserEnableDefaultMapping: _UserEnableDefaultMapping,
                    RequireValidation: _RequireValidation
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}