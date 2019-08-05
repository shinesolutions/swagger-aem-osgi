using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreProcessMetadataProcessorProcessProperties
    /// </summary>
    public sealed class ComDayCqDamCoreProcessMetadataProcessorProcessProperties:  IEquatable<ComDayCqDamCoreProcessMetadataProcessorProcessProperties>
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
        /// CqDamMetadataXssprotectedProperties
        /// </summary>
        public ConfigNodePropertyArray CqDamMetadataXssprotectedProperties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreProcessMetadataProcessorProcessProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreProcessMetadataProcessorProcessProperties()
        {
        }

        private ComDayCqDamCoreProcessMetadataProcessorProcessProperties(ConfigNodePropertyString ProcessLabel, ConfigNodePropertyBoolean CqDamEnableSha1, ConfigNodePropertyArray CqDamMetadataXssprotectedProperties)
        {
            
            this.ProcessLabel = ProcessLabel;
            
            this.CqDamEnableSha1 = CqDamEnableSha1;
            
            this.CqDamMetadataXssprotectedProperties = CqDamMetadataXssprotectedProperties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreProcessMetadataProcessorProcessProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreProcessMetadataProcessorProcessPropertiesBuilder</returns>
        public static ComDayCqDamCoreProcessMetadataProcessorProcessPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreProcessMetadataProcessorProcessPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreProcessMetadataProcessorProcessPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreProcessMetadataProcessorProcessPropertiesBuilder</returns>
        public ComDayCqDamCoreProcessMetadataProcessorProcessPropertiesBuilder With()
        {
            return Builder()
                .ProcessLabel(ProcessLabel)
                .CqDamEnableSha1(CqDamEnableSha1)
                .CqDamMetadataXssprotectedProperties(CqDamMetadataXssprotectedProperties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreProcessMetadataProcessorProcessProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreProcessMetadataProcessorProcessProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreProcessMetadataProcessorProcessProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreProcessMetadataProcessorProcessProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreProcessMetadataProcessorProcessProperties left, ComDayCqDamCoreProcessMetadataProcessorProcessProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreProcessMetadataProcessorProcessProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreProcessMetadataProcessorProcessProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreProcessMetadataProcessorProcessProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreProcessMetadataProcessorProcessProperties left, ComDayCqDamCoreProcessMetadataProcessorProcessProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreProcessMetadataProcessorProcessProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreProcessMetadataProcessorProcessPropertiesBuilder
        {
            private ConfigNodePropertyString _ProcessLabel;
            private ConfigNodePropertyBoolean _CqDamEnableSha1;
            private ConfigNodePropertyArray _CqDamMetadataXssprotectedProperties;

            internal ComDayCqDamCoreProcessMetadataProcessorProcessPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreProcessMetadataProcessorProcessProperties.ProcessLabel property.
            /// </summary>
            /// <param name="value">ProcessLabel</param>
            public ComDayCqDamCoreProcessMetadataProcessorProcessPropertiesBuilder ProcessLabel(ConfigNodePropertyString value)
            {
                _ProcessLabel = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreProcessMetadataProcessorProcessProperties.CqDamEnableSha1 property.
            /// </summary>
            /// <param name="value">CqDamEnableSha1</param>
            public ComDayCqDamCoreProcessMetadataProcessorProcessPropertiesBuilder CqDamEnableSha1(ConfigNodePropertyBoolean value)
            {
                _CqDamEnableSha1 = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreProcessMetadataProcessorProcessProperties.CqDamMetadataXssprotectedProperties property.
            /// </summary>
            /// <param name="value">CqDamMetadataXssprotectedProperties</param>
            public ComDayCqDamCoreProcessMetadataProcessorProcessPropertiesBuilder CqDamMetadataXssprotectedProperties(ConfigNodePropertyArray value)
            {
                _CqDamMetadataXssprotectedProperties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreProcessMetadataProcessorProcessProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreProcessMetadataProcessorProcessProperties</returns>
            public ComDayCqDamCoreProcessMetadataProcessorProcessProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreProcessMetadataProcessorProcessProperties(
                    ProcessLabel: _ProcessLabel,
                    CqDamEnableSha1: _CqDamEnableSha1,
                    CqDamMetadataXssprotectedProperties: _CqDamMetadataXssprotectedProperties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}