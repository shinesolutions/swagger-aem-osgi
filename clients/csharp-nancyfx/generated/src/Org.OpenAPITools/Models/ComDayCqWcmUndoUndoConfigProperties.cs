using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmUndoUndoConfigProperties
    /// </summary>
    public sealed class ComDayCqWcmUndoUndoConfigProperties:  IEquatable<ComDayCqWcmUndoUndoConfigProperties>
    { 
        /// <summary>
        /// CqWcmUndoEnabled
        /// </summary>
        public ConfigNodePropertyBoolean CqWcmUndoEnabled { get; private set; }

        /// <summary>
        /// CqWcmUndoPath
        /// </summary>
        public ConfigNodePropertyString CqWcmUndoPath { get; private set; }

        /// <summary>
        /// CqWcmUndoValidity
        /// </summary>
        public ConfigNodePropertyInteger CqWcmUndoValidity { get; private set; }

        /// <summary>
        /// CqWcmUndoSteps
        /// </summary>
        public ConfigNodePropertyInteger CqWcmUndoSteps { get; private set; }

        /// <summary>
        /// CqWcmUndoPersistence
        /// </summary>
        public ConfigNodePropertyString CqWcmUndoPersistence { get; private set; }

        /// <summary>
        /// CqWcmUndoPersistenceMode
        /// </summary>
        public ConfigNodePropertyBoolean CqWcmUndoPersistenceMode { get; private set; }

        /// <summary>
        /// CqWcmUndoMarkermode
        /// </summary>
        public ConfigNodePropertyString CqWcmUndoMarkermode { get; private set; }

        /// <summary>
        /// CqWcmUndoWhitelist
        /// </summary>
        public ConfigNodePropertyArray CqWcmUndoWhitelist { get; private set; }

        /// <summary>
        /// CqWcmUndoBlacklist
        /// </summary>
        public ConfigNodePropertyArray CqWcmUndoBlacklist { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmUndoUndoConfigProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmUndoUndoConfigProperties()
        {
        }

        private ComDayCqWcmUndoUndoConfigProperties(ConfigNodePropertyBoolean CqWcmUndoEnabled, ConfigNodePropertyString CqWcmUndoPath, ConfigNodePropertyInteger CqWcmUndoValidity, ConfigNodePropertyInteger CqWcmUndoSteps, ConfigNodePropertyString CqWcmUndoPersistence, ConfigNodePropertyBoolean CqWcmUndoPersistenceMode, ConfigNodePropertyString CqWcmUndoMarkermode, ConfigNodePropertyArray CqWcmUndoWhitelist, ConfigNodePropertyArray CqWcmUndoBlacklist)
        {
            
            this.CqWcmUndoEnabled = CqWcmUndoEnabled;
            
            this.CqWcmUndoPath = CqWcmUndoPath;
            
            this.CqWcmUndoValidity = CqWcmUndoValidity;
            
            this.CqWcmUndoSteps = CqWcmUndoSteps;
            
            this.CqWcmUndoPersistence = CqWcmUndoPersistence;
            
            this.CqWcmUndoPersistenceMode = CqWcmUndoPersistenceMode;
            
            this.CqWcmUndoMarkermode = CqWcmUndoMarkermode;
            
            this.CqWcmUndoWhitelist = CqWcmUndoWhitelist;
            
            this.CqWcmUndoBlacklist = CqWcmUndoBlacklist;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmUndoUndoConfigProperties.
        /// </summary>
        /// <returns>ComDayCqWcmUndoUndoConfigPropertiesBuilder</returns>
        public static ComDayCqWcmUndoUndoConfigPropertiesBuilder Builder()
        {
            return new ComDayCqWcmUndoUndoConfigPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmUndoUndoConfigPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmUndoUndoConfigPropertiesBuilder</returns>
        public ComDayCqWcmUndoUndoConfigPropertiesBuilder With()
        {
            return Builder()
                .CqWcmUndoEnabled(CqWcmUndoEnabled)
                .CqWcmUndoPath(CqWcmUndoPath)
                .CqWcmUndoValidity(CqWcmUndoValidity)
                .CqWcmUndoSteps(CqWcmUndoSteps)
                .CqWcmUndoPersistence(CqWcmUndoPersistence)
                .CqWcmUndoPersistenceMode(CqWcmUndoPersistenceMode)
                .CqWcmUndoMarkermode(CqWcmUndoMarkermode)
                .CqWcmUndoWhitelist(CqWcmUndoWhitelist)
                .CqWcmUndoBlacklist(CqWcmUndoBlacklist);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmUndoUndoConfigProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmUndoUndoConfigProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmUndoUndoConfigProperties</param>
        /// <param name="right">Compared (ComDayCqWcmUndoUndoConfigProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmUndoUndoConfigProperties left, ComDayCqWcmUndoUndoConfigProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmUndoUndoConfigProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmUndoUndoConfigProperties</param>
        /// <param name="right">Compared (ComDayCqWcmUndoUndoConfigProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmUndoUndoConfigProperties left, ComDayCqWcmUndoUndoConfigProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmUndoUndoConfigProperties.
        /// </summary>
        public sealed class ComDayCqWcmUndoUndoConfigPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqWcmUndoEnabled;
            private ConfigNodePropertyString _CqWcmUndoPath;
            private ConfigNodePropertyInteger _CqWcmUndoValidity;
            private ConfigNodePropertyInteger _CqWcmUndoSteps;
            private ConfigNodePropertyString _CqWcmUndoPersistence;
            private ConfigNodePropertyBoolean _CqWcmUndoPersistenceMode;
            private ConfigNodePropertyString _CqWcmUndoMarkermode;
            private ConfigNodePropertyArray _CqWcmUndoWhitelist;
            private ConfigNodePropertyArray _CqWcmUndoBlacklist;

            internal ComDayCqWcmUndoUndoConfigPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmUndoUndoConfigProperties.CqWcmUndoEnabled property.
            /// </summary>
            /// <param name="value">CqWcmUndoEnabled</param>
            public ComDayCqWcmUndoUndoConfigPropertiesBuilder CqWcmUndoEnabled(ConfigNodePropertyBoolean value)
            {
                _CqWcmUndoEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmUndoUndoConfigProperties.CqWcmUndoPath property.
            /// </summary>
            /// <param name="value">CqWcmUndoPath</param>
            public ComDayCqWcmUndoUndoConfigPropertiesBuilder CqWcmUndoPath(ConfigNodePropertyString value)
            {
                _CqWcmUndoPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmUndoUndoConfigProperties.CqWcmUndoValidity property.
            /// </summary>
            /// <param name="value">CqWcmUndoValidity</param>
            public ComDayCqWcmUndoUndoConfigPropertiesBuilder CqWcmUndoValidity(ConfigNodePropertyInteger value)
            {
                _CqWcmUndoValidity = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmUndoUndoConfigProperties.CqWcmUndoSteps property.
            /// </summary>
            /// <param name="value">CqWcmUndoSteps</param>
            public ComDayCqWcmUndoUndoConfigPropertiesBuilder CqWcmUndoSteps(ConfigNodePropertyInteger value)
            {
                _CqWcmUndoSteps = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmUndoUndoConfigProperties.CqWcmUndoPersistence property.
            /// </summary>
            /// <param name="value">CqWcmUndoPersistence</param>
            public ComDayCqWcmUndoUndoConfigPropertiesBuilder CqWcmUndoPersistence(ConfigNodePropertyString value)
            {
                _CqWcmUndoPersistence = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmUndoUndoConfigProperties.CqWcmUndoPersistenceMode property.
            /// </summary>
            /// <param name="value">CqWcmUndoPersistenceMode</param>
            public ComDayCqWcmUndoUndoConfigPropertiesBuilder CqWcmUndoPersistenceMode(ConfigNodePropertyBoolean value)
            {
                _CqWcmUndoPersistenceMode = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmUndoUndoConfigProperties.CqWcmUndoMarkermode property.
            /// </summary>
            /// <param name="value">CqWcmUndoMarkermode</param>
            public ComDayCqWcmUndoUndoConfigPropertiesBuilder CqWcmUndoMarkermode(ConfigNodePropertyString value)
            {
                _CqWcmUndoMarkermode = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmUndoUndoConfigProperties.CqWcmUndoWhitelist property.
            /// </summary>
            /// <param name="value">CqWcmUndoWhitelist</param>
            public ComDayCqWcmUndoUndoConfigPropertiesBuilder CqWcmUndoWhitelist(ConfigNodePropertyArray value)
            {
                _CqWcmUndoWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmUndoUndoConfigProperties.CqWcmUndoBlacklist property.
            /// </summary>
            /// <param name="value">CqWcmUndoBlacklist</param>
            public ComDayCqWcmUndoUndoConfigPropertiesBuilder CqWcmUndoBlacklist(ConfigNodePropertyArray value)
            {
                _CqWcmUndoBlacklist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmUndoUndoConfigProperties.
            /// </summary>
            /// <returns>ComDayCqWcmUndoUndoConfigProperties</returns>
            public ComDayCqWcmUndoUndoConfigProperties Build()
            {
                Validate();
                return new ComDayCqWcmUndoUndoConfigProperties(
                    CqWcmUndoEnabled: _CqWcmUndoEnabled,
                    CqWcmUndoPath: _CqWcmUndoPath,
                    CqWcmUndoValidity: _CqWcmUndoValidity,
                    CqWcmUndoSteps: _CqWcmUndoSteps,
                    CqWcmUndoPersistence: _CqWcmUndoPersistence,
                    CqWcmUndoPersistenceMode: _CqWcmUndoPersistenceMode,
                    CqWcmUndoMarkermode: _CqWcmUndoMarkermode,
                    CqWcmUndoWhitelist: _CqWcmUndoWhitelist,
                    CqWcmUndoBlacklist: _CqWcmUndoBlacklist
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}