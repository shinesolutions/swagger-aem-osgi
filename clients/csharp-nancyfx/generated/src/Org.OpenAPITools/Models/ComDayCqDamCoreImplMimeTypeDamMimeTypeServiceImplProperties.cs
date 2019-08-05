using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties:  IEquatable<ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties>
    { 
        /// <summary>
        /// CqDamDetectAssetMimeFromContent
        /// </summary>
        public ConfigNodePropertyBoolean CqDamDetectAssetMimeFromContent { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties()
        {
        }

        private ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties(ConfigNodePropertyBoolean CqDamDetectAssetMimeFromContent)
        {
            
            this.CqDamDetectAssetMimeFromContent = CqDamDetectAssetMimeFromContent;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplPropertiesBuilder</returns>
        public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplPropertiesBuilder With()
        {
            return Builder()
                .CqDamDetectAssetMimeFromContent(CqDamDetectAssetMimeFromContent);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties left, ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties left, ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqDamDetectAssetMimeFromContent;

            internal ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties.CqDamDetectAssetMimeFromContent property.
            /// </summary>
            /// <param name="value">CqDamDetectAssetMimeFromContent</param>
            public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplPropertiesBuilder CqDamDetectAssetMimeFromContent(ConfigNodePropertyBoolean value)
            {
                _CqDamDetectAssetMimeFromContent = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties</returns>
            public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties(
                    CqDamDetectAssetMimeFromContent: _CqDamDetectAssetMimeFromContent
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}