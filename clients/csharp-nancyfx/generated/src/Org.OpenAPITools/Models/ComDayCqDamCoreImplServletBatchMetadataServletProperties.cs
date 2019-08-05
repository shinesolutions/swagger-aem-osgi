using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletBatchMetadataServletProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletBatchMetadataServletProperties:  IEquatable<ComDayCqDamCoreImplServletBatchMetadataServletProperties>
    { 
        /// <summary>
        /// CqDamBatchMetadataAssetDefault
        /// </summary>
        public ConfigNodePropertyArray CqDamBatchMetadataAssetDefault { get; private set; }

        /// <summary>
        /// CqDamBatchMetadataCollectionDefault
        /// </summary>
        public ConfigNodePropertyArray CqDamBatchMetadataCollectionDefault { get; private set; }

        /// <summary>
        /// CqDamBatchMetadataMaxresources
        /// </summary>
        public ConfigNodePropertyInteger CqDamBatchMetadataMaxresources { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletBatchMetadataServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletBatchMetadataServletProperties()
        {
        }

        private ComDayCqDamCoreImplServletBatchMetadataServletProperties(ConfigNodePropertyArray CqDamBatchMetadataAssetDefault, ConfigNodePropertyArray CqDamBatchMetadataCollectionDefault, ConfigNodePropertyInteger CqDamBatchMetadataMaxresources)
        {
            
            this.CqDamBatchMetadataAssetDefault = CqDamBatchMetadataAssetDefault;
            
            this.CqDamBatchMetadataCollectionDefault = CqDamBatchMetadataCollectionDefault;
            
            this.CqDamBatchMetadataMaxresources = CqDamBatchMetadataMaxresources;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletBatchMetadataServletProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletBatchMetadataServletPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplServletBatchMetadataServletPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletBatchMetadataServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletBatchMetadataServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletBatchMetadataServletPropertiesBuilder</returns>
        public ComDayCqDamCoreImplServletBatchMetadataServletPropertiesBuilder With()
        {
            return Builder()
                .CqDamBatchMetadataAssetDefault(CqDamBatchMetadataAssetDefault)
                .CqDamBatchMetadataCollectionDefault(CqDamBatchMetadataCollectionDefault)
                .CqDamBatchMetadataMaxresources(CqDamBatchMetadataMaxresources);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplServletBatchMetadataServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletBatchMetadataServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletBatchMetadataServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletBatchMetadataServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletBatchMetadataServletProperties left, ComDayCqDamCoreImplServletBatchMetadataServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletBatchMetadataServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletBatchMetadataServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletBatchMetadataServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletBatchMetadataServletProperties left, ComDayCqDamCoreImplServletBatchMetadataServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletBatchMetadataServletProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletBatchMetadataServletPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqDamBatchMetadataAssetDefault;
            private ConfigNodePropertyArray _CqDamBatchMetadataCollectionDefault;
            private ConfigNodePropertyInteger _CqDamBatchMetadataMaxresources;

            internal ComDayCqDamCoreImplServletBatchMetadataServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletBatchMetadataServletProperties.CqDamBatchMetadataAssetDefault property.
            /// </summary>
            /// <param name="value">CqDamBatchMetadataAssetDefault</param>
            public ComDayCqDamCoreImplServletBatchMetadataServletPropertiesBuilder CqDamBatchMetadataAssetDefault(ConfigNodePropertyArray value)
            {
                _CqDamBatchMetadataAssetDefault = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletBatchMetadataServletProperties.CqDamBatchMetadataCollectionDefault property.
            /// </summary>
            /// <param name="value">CqDamBatchMetadataCollectionDefault</param>
            public ComDayCqDamCoreImplServletBatchMetadataServletPropertiesBuilder CqDamBatchMetadataCollectionDefault(ConfigNodePropertyArray value)
            {
                _CqDamBatchMetadataCollectionDefault = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletBatchMetadataServletProperties.CqDamBatchMetadataMaxresources property.
            /// </summary>
            /// <param name="value">CqDamBatchMetadataMaxresources</param>
            public ComDayCqDamCoreImplServletBatchMetadataServletPropertiesBuilder CqDamBatchMetadataMaxresources(ConfigNodePropertyInteger value)
            {
                _CqDamBatchMetadataMaxresources = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletBatchMetadataServletProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletBatchMetadataServletProperties</returns>
            public ComDayCqDamCoreImplServletBatchMetadataServletProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletBatchMetadataServletProperties(
                    CqDamBatchMetadataAssetDefault: _CqDamBatchMetadataAssetDefault,
                    CqDamBatchMetadataCollectionDefault: _CqDamBatchMetadataCollectionDefault,
                    CqDamBatchMetadataMaxresources: _CqDamBatchMetadataMaxresources
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}