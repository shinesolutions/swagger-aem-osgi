using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties
    /// </summary>
    public sealed class ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties:  IEquatable<ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties>
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
        /// Use ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties()
        {
        }

        private ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties(ConfigNodePropertyString ProcessLabel, ConfigNodePropertyBoolean CqDamEnableSha1)
        {
            
            this.ProcessLabel = ProcessLabel;
            
            this.CqDamEnableSha1 = CqDamEnableSha1;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreProcessExifToolExtractMetadataProcessPropertiesBuilder</returns>
        public static ComDayCqDamCoreProcessExifToolExtractMetadataProcessPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreProcessExifToolExtractMetadataProcessPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreProcessExifToolExtractMetadataProcessPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreProcessExifToolExtractMetadataProcessPropertiesBuilder</returns>
        public ComDayCqDamCoreProcessExifToolExtractMetadataProcessPropertiesBuilder With()
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

        public bool Equals(ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties left, ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties left, ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreProcessExifToolExtractMetadataProcessPropertiesBuilder
        {
            private ConfigNodePropertyString _ProcessLabel;
            private ConfigNodePropertyBoolean _CqDamEnableSha1;

            internal ComDayCqDamCoreProcessExifToolExtractMetadataProcessPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties.ProcessLabel property.
            /// </summary>
            /// <param name="value">ProcessLabel</param>
            public ComDayCqDamCoreProcessExifToolExtractMetadataProcessPropertiesBuilder ProcessLabel(ConfigNodePropertyString value)
            {
                _ProcessLabel = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties.CqDamEnableSha1 property.
            /// </summary>
            /// <param name="value">CqDamEnableSha1</param>
            public ComDayCqDamCoreProcessExifToolExtractMetadataProcessPropertiesBuilder CqDamEnableSha1(ConfigNodePropertyBoolean value)
            {
                _CqDamEnableSha1 = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties</returns>
            public ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties(
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