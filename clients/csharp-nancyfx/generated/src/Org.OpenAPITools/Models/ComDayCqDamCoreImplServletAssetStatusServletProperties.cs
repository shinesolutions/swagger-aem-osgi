using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletAssetStatusServletProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletAssetStatusServletProperties:  IEquatable<ComDayCqDamCoreImplServletAssetStatusServletProperties>
    { 
        /// <summary>
        /// CqDamBatchStatusMaxassets
        /// </summary>
        public ConfigNodePropertyInteger CqDamBatchStatusMaxassets { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletAssetStatusServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletAssetStatusServletProperties()
        {
        }

        private ComDayCqDamCoreImplServletAssetStatusServletProperties(ConfigNodePropertyInteger CqDamBatchStatusMaxassets)
        {
            
            this.CqDamBatchStatusMaxassets = CqDamBatchStatusMaxassets;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletAssetStatusServletProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletAssetStatusServletPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplServletAssetStatusServletPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletAssetStatusServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletAssetStatusServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletAssetStatusServletPropertiesBuilder</returns>
        public ComDayCqDamCoreImplServletAssetStatusServletPropertiesBuilder With()
        {
            return Builder()
                .CqDamBatchStatusMaxassets(CqDamBatchStatusMaxassets);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplServletAssetStatusServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletAssetStatusServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletAssetStatusServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletAssetStatusServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletAssetStatusServletProperties left, ComDayCqDamCoreImplServletAssetStatusServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletAssetStatusServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletAssetStatusServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletAssetStatusServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletAssetStatusServletProperties left, ComDayCqDamCoreImplServletAssetStatusServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletAssetStatusServletProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletAssetStatusServletPropertiesBuilder
        {
            private ConfigNodePropertyInteger _CqDamBatchStatusMaxassets;

            internal ComDayCqDamCoreImplServletAssetStatusServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletAssetStatusServletProperties.CqDamBatchStatusMaxassets property.
            /// </summary>
            /// <param name="value">CqDamBatchStatusMaxassets</param>
            public ComDayCqDamCoreImplServletAssetStatusServletPropertiesBuilder CqDamBatchStatusMaxassets(ConfigNodePropertyInteger value)
            {
                _CqDamBatchStatusMaxassets = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletAssetStatusServletProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletAssetStatusServletProperties</returns>
            public ComDayCqDamCoreImplServletAssetStatusServletProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletAssetStatusServletProperties(
                    CqDamBatchStatusMaxassets: _CqDamBatchStatusMaxassets
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}