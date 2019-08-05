using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingStartupfilterImplStartupFilterImplProperties
    /// </summary>
    public sealed class OrgApacheSlingStartupfilterImplStartupFilterImplProperties:  IEquatable<OrgApacheSlingStartupfilterImplStartupFilterImplProperties>
    { 
        /// <summary>
        /// ActiveByDefault
        /// </summary>
        public ConfigNodePropertyBoolean ActiveByDefault { get; private set; }

        /// <summary>
        /// DefaultMessage
        /// </summary>
        public ConfigNodePropertyString DefaultMessage { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingStartupfilterImplStartupFilterImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingStartupfilterImplStartupFilterImplProperties()
        {
        }

        private OrgApacheSlingStartupfilterImplStartupFilterImplProperties(ConfigNodePropertyBoolean ActiveByDefault, ConfigNodePropertyString DefaultMessage)
        {
            
            this.ActiveByDefault = ActiveByDefault;
            
            this.DefaultMessage = DefaultMessage;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingStartupfilterImplStartupFilterImplProperties.
        /// </summary>
        /// <returns>OrgApacheSlingStartupfilterImplStartupFilterImplPropertiesBuilder</returns>
        public static OrgApacheSlingStartupfilterImplStartupFilterImplPropertiesBuilder Builder()
        {
            return new OrgApacheSlingStartupfilterImplStartupFilterImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingStartupfilterImplStartupFilterImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingStartupfilterImplStartupFilterImplPropertiesBuilder</returns>
        public OrgApacheSlingStartupfilterImplStartupFilterImplPropertiesBuilder With()
        {
            return Builder()
                .ActiveByDefault(ActiveByDefault)
                .DefaultMessage(DefaultMessage);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingStartupfilterImplStartupFilterImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingStartupfilterImplStartupFilterImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingStartupfilterImplStartupFilterImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingStartupfilterImplStartupFilterImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingStartupfilterImplStartupFilterImplProperties left, OrgApacheSlingStartupfilterImplStartupFilterImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingStartupfilterImplStartupFilterImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingStartupfilterImplStartupFilterImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingStartupfilterImplStartupFilterImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingStartupfilterImplStartupFilterImplProperties left, OrgApacheSlingStartupfilterImplStartupFilterImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingStartupfilterImplStartupFilterImplProperties.
        /// </summary>
        public sealed class OrgApacheSlingStartupfilterImplStartupFilterImplPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _ActiveByDefault;
            private ConfigNodePropertyString _DefaultMessage;

            internal OrgApacheSlingStartupfilterImplStartupFilterImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingStartupfilterImplStartupFilterImplProperties.ActiveByDefault property.
            /// </summary>
            /// <param name="value">ActiveByDefault</param>
            public OrgApacheSlingStartupfilterImplStartupFilterImplPropertiesBuilder ActiveByDefault(ConfigNodePropertyBoolean value)
            {
                _ActiveByDefault = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingStartupfilterImplStartupFilterImplProperties.DefaultMessage property.
            /// </summary>
            /// <param name="value">DefaultMessage</param>
            public OrgApacheSlingStartupfilterImplStartupFilterImplPropertiesBuilder DefaultMessage(ConfigNodePropertyString value)
            {
                _DefaultMessage = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingStartupfilterImplStartupFilterImplProperties.
            /// </summary>
            /// <returns>OrgApacheSlingStartupfilterImplStartupFilterImplProperties</returns>
            public OrgApacheSlingStartupfilterImplStartupFilterImplProperties Build()
            {
                Validate();
                return new OrgApacheSlingStartupfilterImplStartupFilterImplProperties(
                    ActiveByDefault: _ActiveByDefault,
                    DefaultMessage: _DefaultMessage
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}