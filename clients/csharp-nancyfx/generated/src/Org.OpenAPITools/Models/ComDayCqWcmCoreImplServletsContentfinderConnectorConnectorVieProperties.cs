using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties:  IEquatable<ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties>
    { 
        /// <summary>
        /// ItemResourceTypes
        /// </summary>
        public ConfigNodePropertyArray ItemResourceTypes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties()
        {
        }

        private ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties(ConfigNodePropertyArray ItemResourceTypes)
        {
            
            this.ItemResourceTypes = ItemResourceTypes;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViePropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViePropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViePropertiesBuilder</returns>
        public ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViePropertiesBuilder With()
        {
            return Builder()
                .ItemResourceTypes(ItemResourceTypes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties left, ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties left, ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViePropertiesBuilder
        {
            private ConfigNodePropertyArray _ItemResourceTypes;

            internal ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties.ItemResourceTypes property.
            /// </summary>
            /// <param name="value">ItemResourceTypes</param>
            public ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViePropertiesBuilder ItemResourceTypes(ConfigNodePropertyArray value)
            {
                _ItemResourceTypes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties</returns>
            public ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties(
                    ItemResourceTypes: _ItemResourceTypes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}