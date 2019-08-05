using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletAssetXMPSearchServletProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletAssetXMPSearchServletProperties:  IEquatable<ComDayCqDamCoreImplServletAssetXMPSearchServletProperties>
    { 
        /// <summary>
        /// CqDamBatchIndesignMaxassets
        /// </summary>
        public ConfigNodePropertyInteger CqDamBatchIndesignMaxassets { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletAssetXMPSearchServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletAssetXMPSearchServletProperties()
        {
        }

        private ComDayCqDamCoreImplServletAssetXMPSearchServletProperties(ConfigNodePropertyInteger CqDamBatchIndesignMaxassets)
        {
            
            this.CqDamBatchIndesignMaxassets = CqDamBatchIndesignMaxassets;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletAssetXMPSearchServletProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletAssetXMPSearchServletPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplServletAssetXMPSearchServletPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletAssetXMPSearchServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletAssetXMPSearchServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletAssetXMPSearchServletPropertiesBuilder</returns>
        public ComDayCqDamCoreImplServletAssetXMPSearchServletPropertiesBuilder With()
        {
            return Builder()
                .CqDamBatchIndesignMaxassets(CqDamBatchIndesignMaxassets);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplServletAssetXMPSearchServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletAssetXMPSearchServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletAssetXMPSearchServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletAssetXMPSearchServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletAssetXMPSearchServletProperties left, ComDayCqDamCoreImplServletAssetXMPSearchServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletAssetXMPSearchServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletAssetXMPSearchServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletAssetXMPSearchServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletAssetXMPSearchServletProperties left, ComDayCqDamCoreImplServletAssetXMPSearchServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletAssetXMPSearchServletProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletAssetXMPSearchServletPropertiesBuilder
        {
            private ConfigNodePropertyInteger _CqDamBatchIndesignMaxassets;

            internal ComDayCqDamCoreImplServletAssetXMPSearchServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletAssetXMPSearchServletProperties.CqDamBatchIndesignMaxassets property.
            /// </summary>
            /// <param name="value">CqDamBatchIndesignMaxassets</param>
            public ComDayCqDamCoreImplServletAssetXMPSearchServletPropertiesBuilder CqDamBatchIndesignMaxassets(ConfigNodePropertyInteger value)
            {
                _CqDamBatchIndesignMaxassets = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletAssetXMPSearchServletProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletAssetXMPSearchServletProperties</returns>
            public ComDayCqDamCoreImplServletAssetXMPSearchServletProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletAssetXMPSearchServletProperties(
                    CqDamBatchIndesignMaxassets: _CqDamBatchIndesignMaxassets
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}