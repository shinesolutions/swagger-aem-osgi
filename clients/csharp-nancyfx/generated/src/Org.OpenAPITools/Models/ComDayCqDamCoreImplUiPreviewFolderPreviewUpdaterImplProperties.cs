using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties:  IEquatable<ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties>
    { 
        /// <summary>
        /// CreatePreviewEnabled
        /// </summary>
        public ConfigNodePropertyBoolean CreatePreviewEnabled { get; private set; }

        /// <summary>
        /// UpdatePreviewEnabled
        /// </summary>
        public ConfigNodePropertyBoolean UpdatePreviewEnabled { get; private set; }

        /// <summary>
        /// QueueSize
        /// </summary>
        public ConfigNodePropertyInteger QueueSize { get; private set; }

        /// <summary>
        /// FolderPreviewRenditionRegex
        /// </summary>
        public ConfigNodePropertyString FolderPreviewRenditionRegex { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties()
        {
        }

        private ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties(ConfigNodePropertyBoolean CreatePreviewEnabled, ConfigNodePropertyBoolean UpdatePreviewEnabled, ConfigNodePropertyInteger QueueSize, ConfigNodePropertyString FolderPreviewRenditionRegex)
        {
            
            this.CreatePreviewEnabled = CreatePreviewEnabled;
            
            this.UpdatePreviewEnabled = UpdatePreviewEnabled;
            
            this.QueueSize = QueueSize;
            
            this.FolderPreviewRenditionRegex = FolderPreviewRenditionRegex;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesBuilder</returns>
        public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesBuilder With()
        {
            return Builder()
                .CreatePreviewEnabled(CreatePreviewEnabled)
                .UpdatePreviewEnabled(UpdatePreviewEnabled)
                .QueueSize(QueueSize)
                .FolderPreviewRenditionRegex(FolderPreviewRenditionRegex);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties left, ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties left, ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CreatePreviewEnabled;
            private ConfigNodePropertyBoolean _UpdatePreviewEnabled;
            private ConfigNodePropertyInteger _QueueSize;
            private ConfigNodePropertyString _FolderPreviewRenditionRegex;

            internal ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.CreatePreviewEnabled property.
            /// </summary>
            /// <param name="value">CreatePreviewEnabled</param>
            public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesBuilder CreatePreviewEnabled(ConfigNodePropertyBoolean value)
            {
                _CreatePreviewEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.UpdatePreviewEnabled property.
            /// </summary>
            /// <param name="value">UpdatePreviewEnabled</param>
            public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesBuilder UpdatePreviewEnabled(ConfigNodePropertyBoolean value)
            {
                _UpdatePreviewEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.QueueSize property.
            /// </summary>
            /// <param name="value">QueueSize</param>
            public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesBuilder QueueSize(ConfigNodePropertyInteger value)
            {
                _QueueSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.FolderPreviewRenditionRegex property.
            /// </summary>
            /// <param name="value">FolderPreviewRenditionRegex</param>
            public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesBuilder FolderPreviewRenditionRegex(ConfigNodePropertyString value)
            {
                _FolderPreviewRenditionRegex = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties</returns>
            public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties(
                    CreatePreviewEnabled: _CreatePreviewEnabled,
                    UpdatePreviewEnabled: _UpdatePreviewEnabled,
                    QueueSize: _QueueSize,
                    FolderPreviewRenditionRegex: _FolderPreviewRenditionRegex
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}