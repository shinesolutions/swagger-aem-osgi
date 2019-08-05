using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreProcessExtractMetadataProcessProperties
    /// </summary>
    public sealed class ComDayCqDamCoreProcessExtractMetadataProcessProperties:  IEquatable<ComDayCqDamCoreProcessExtractMetadataProcessProperties>
    { 
        /// <summary>
        /// ProcessLabel
        /// </summary>
        public ConfigNodePropertyString ProcessLabel { get; private set; }

        /// <summary>
        /// CqDamEnableSha1
        /// </summary>
        public ConfigNodePropertyBoolean CqDamEnableSha1 { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreProcessExtractMetadataProcessProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreProcessExtractMetadataProcessProperties()
        {
        }

        private ComDayCqDamCoreProcessExtractMetadataProcessProperties(ConfigNodePropertyString ProcessLabel, ConfigNodePropertyBoolean CqDamEnableSha1)
        {
            
            this.ProcessLabel = ProcessLabel;
            
            this.CqDamEnableSha1 = CqDamEnableSha1;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreProcessExtractMetadataProcessProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreProcessExtractMetadataProcessPropertiesBuilder</returns>
        public static ComDayCqDamCoreProcessExtractMetadataProcessPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreProcessExtractMetadataProcessPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreProcessExtractMetadataProcessPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreProcessExtractMetadataProcessPropertiesBuilder</returns>
        public ComDayCqDamCoreProcessExtractMetadataProcessPropertiesBuilder With()
        {
            return Builder()
                .ProcessLabel(ProcessLabel)
                .CqDamEnableSha1(CqDamEnableSha1);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreProcessExtractMetadataProcessProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreProcessExtractMetadataProcessProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreProcessExtractMetadataProcessProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreProcessExtractMetadataProcessProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreProcessExtractMetadataProcessProperties left, ComDayCqDamCoreProcessExtractMetadataProcessProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreProcessExtractMetadataProcessProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreProcessExtractMetadataProcessProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreProcessExtractMetadataProcessProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreProcessExtractMetadataProcessProperties left, ComDayCqDamCoreProcessExtractMetadataProcessProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreProcessExtractMetadataProcessProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreProcessExtractMetadataProcessPropertiesBuilder
        {
            private ConfigNodePropertyString _ProcessLabel;
            private ConfigNodePropertyBoolean _CqDamEnableSha1;

            internal ComDayCqDamCoreProcessExtractMetadataProcessPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreProcessExtractMetadataProcessProperties.ProcessLabel property.
            /// </summary>
            /// <param name="value">ProcessLabel</param>
            public ComDayCqDamCoreProcessExtractMetadataProcessPropertiesBuilder ProcessLabel(ConfigNodePropertyString value)
            {
                _ProcessLabel = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreProcessExtractMetadataProcessProperties.CqDamEnableSha1 property.
            /// </summary>
            /// <param name="value">CqDamEnableSha1</param>
            public ComDayCqDamCoreProcessExtractMetadataProcessPropertiesBuilder CqDamEnableSha1(ConfigNodePropertyBoolean value)
            {
                _CqDamEnableSha1 = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreProcessExtractMetadataProcessProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreProcessExtractMetadataProcessProperties</returns>
            public ComDayCqDamCoreProcessExtractMetadataProcessProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreProcessExtractMetadataProcessProperties(
                    ProcessLabel: _ProcessLabel,
                    CqDamEnableSha1: _CqDamEnableSha1
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}