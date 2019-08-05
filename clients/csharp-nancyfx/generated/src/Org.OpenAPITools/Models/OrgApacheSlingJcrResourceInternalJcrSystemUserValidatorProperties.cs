using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties
    /// </summary>
    public sealed class OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties:  IEquatable<OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties>
    { 
        /// <summary>
        /// AllowOnlySystemUser
        /// </summary>
        public ConfigNodePropertyBoolean AllowOnlySystemUser { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties()
        {
        }

        private OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties(ConfigNodePropertyBoolean AllowOnlySystemUser)
        {
            
            this.AllowOnlySystemUser = AllowOnlySystemUser;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertiesBuilder</returns>
        public static OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertiesBuilder Builder()
        {
            return new OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertiesBuilder</returns>
        public OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertiesBuilder With()
        {
            return Builder()
                .AllowOnlySystemUser(AllowOnlySystemUser);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties left, OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties left, OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties.
        /// </summary>
        public sealed class OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _AllowOnlySystemUser;

            internal OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties.AllowOnlySystemUser property.
            /// </summary>
            /// <param name="value">AllowOnlySystemUser</param>
            public OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertiesBuilder AllowOnlySystemUser(ConfigNodePropertyBoolean value)
            {
                _AllowOnlySystemUser = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties.
            /// </summary>
            /// <returns>OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties</returns>
            public OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties Build()
            {
                Validate();
                return new OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties(
                    AllowOnlySystemUser: _AllowOnlySystemUser
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}